package pl.mateuszkalinowski.vscllcompiler.llvm;

import pl.mateuszkalinowski.vscllcompiler.entities.FunctionInfo;
import pl.mateuszkalinowski.vscllcompiler.entities.Table;
import pl.mateuszkalinowski.vscllcompiler.entities.StackValue;
import pl.mateuszkalinowski.vscllcompiler.entities.VariableInfo;
import pl.mateuszkalinowski.vscllcompiler.enums.ComparisonType;
import pl.mateuszkalinowski.vscllcompiler.enums.VariableType;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLBaseListener;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLParser;

import java.util.*;


public class LLVMActions extends VSCLLBaseListener {

    private Stack<StackValue> stack = new Stack<>();
    private Stack<String> labels = new Stack<>();

    private HashMap<String, VariableInfo> variables = new HashMap<>();
    private HashMap<String, Table> tables = new HashMap<>();

    private int labelCounter = 0;

    private String currentScope = "global";
    private VariableType currentType = null;

    private ArrayList<StackValue> functionParams = new ArrayList<>();

    private HashMap<String, FunctionInfo> functions = new HashMap<>();

    /*

          ETAP I - TYPY, ZMIENNE, ODCZYT/ZAPIS Z KONSOLI

     */

    @Override
    public void exitDeclaration_variable(VSCLLParser.Declaration_variableContext ctx) {
        String id = ctx.ID().getText();

        if (isAlreadyDefined(id, currentScope)) {
            error(ctx.getStart().getLine(), String.format("Variable '%s' already defined", ctx.ID().getText()));
            return;
        }
        if (!currentScope.equals("global")) {
            if (ctx.var().getText().equals("int")) {
                LLVMGenerator.declare_i32_local();
                LLVMGenerator.assign_i32("%" + (LLVMGenerator.reg - 1) + "", "0");
                variables.put(id, new VariableInfo(VariableType.INT, "%" + (LLVMGenerator.reg - 1) + "", currentScope));
            } else if (ctx.var().getText().equals("double")) {
                LLVMGenerator.declare_double_local();
                LLVMGenerator.assign_double("%" + (LLVMGenerator.reg - 1) + "", "0.0");
                variables.put(id, new VariableInfo(VariableType.DOUBLE, "%" + (LLVMGenerator.reg - 1) + "", currentScope));
            }
        } else {
            if (ctx.var().getText().equals("int")) {
                LLVMGenerator.declare_i32_global(id, "0");
                variables.put(id, new VariableInfo(VariableType.INT, "@" + id, currentScope));
            } else if (ctx.var().getText().equals("double")) {
                LLVMGenerator.declare_double_global(id, "0");
                variables.put(id, new VariableInfo(VariableType.DOUBLE, "@" + id, currentScope));
            }
        }
    }

    @Override
    public void exitDeclaration_text_pointer(VSCLLParser.Declaration_text_pointerContext ctx) {
        error(ctx.getStart().getLine(), "You must provide size, or initialize the variable");
    }

    @Override
    public void exitDeclaration_array(VSCLLParser.Declaration_arrayContext ctx) {
        String size = ctx.index().INT().getText();
        String id = ctx.ID().getText();

        if (isAlreadyDefined(id, currentScope)) {
            error(ctx.getStart().getLine(), String.format("Variable '%s' already defined", ctx.ID().getText()));
            return;
        }

        if (ctx.var().getText().equals("int")) {
            LLVMGenerator.declare_i32_array_local(size);
            tables.put(id, new Table(size, VariableType.INT, "%" + (LLVMGenerator.reg - 1) + "", currentScope));
        }
        if (ctx.var().getText().equals("double")) {
            LLVMGenerator.declare_double_array_local(size);
            tables.put(id, new Table(size, VariableType.DOUBLE, "%" + (LLVMGenerator.reg - 1) + "", currentScope));
        }
    }

    @Override
    public void exitDeclaration_with_initialization_variable(VSCLLParser.Declaration_with_initialization_variableContext ctx) {
        String variableName = ctx.ID().getText();
        if (isAlreadyDefined(variableName, currentScope)) {
            error(ctx.getStart().getLine(), String.format("Variable '%s' already defined", ctx.ID().getText()));
            return;
        }

        if (!currentScope.equals("global")) {
            if (ctx.var().getText().equals("int")) {
                LLVMGenerator.declare_i32_local();
                LLVMGenerator.assign_i32("%" + (LLVMGenerator.reg - 1) + "", "0");
                variables.put(variableName, new VariableInfo(VariableType.INT, "%" + (LLVMGenerator.reg - 1) + "", currentScope));
            } else if (ctx.var().getText().equals("double")) {
                LLVMGenerator.declare_double_local();
                LLVMGenerator.assign_double("%" + (LLVMGenerator.reg - 1) + "", "0.0");
                variables.put(variableName, new VariableInfo(VariableType.DOUBLE, "%" + (LLVMGenerator.reg - 1) + "", currentScope));
            }


            StackValue v = stack.pop();
            String ID = getVariable(variableName).address;

            if (isKnownVariable(ID)) {
                VariableType variableType = getVariable(variableName).variableType;

                if (variableType.equals(VariableType.INT)) {
                    if (v.type.equals(VariableType.INT)) {
                        if (isKnownVariable(v.name)) {
                            LLVMGenerator.load_i32(v.name);
                            LLVMGenerator.assign_i32(ID, "%" + (LLVMGenerator.reg - 1));
                        } else {
                            LLVMGenerator.assign_i32(ID, v.name);
                        }
                    } else {
                        error(ctx.getStart().getLine(), "assign type mismatch");
                    }
                }
                if (variableType.equals(VariableType.DOUBLE)) {
                    if (v.type.equals(VariableType.DOUBLE)) {
                        if (isKnownVariable(v.name)) {
                            LLVMGenerator.load_double(v.name);
                            LLVMGenerator.assign_double(ID, "%" + (LLVMGenerator.reg - 1));
                        } else {
                            LLVMGenerator.assign_double(ID, v.name);
                        }
                    } else {
                        error(ctx.getStart().getLine(), "assign type mismatch");
                    }
                }

            } else {
                error(ctx.getStart().getLine(), String.format("Variable '%s' doesn't exists", ID));
            }

        } else {

            StackValue v = stack.pop();


            if (ctx.var().getText().equals("int")) {
                if (v.type.equals(VariableType.INT)) {
                    LLVMGenerator.declare_i32_global(variableName, v.name);
                    variables.put(variableName, new VariableInfo(VariableType.INT, "@" + variableName, currentScope));
                } else {
                    error(ctx.getStart().getLine(), "Mismatch types in assign");
                }
            } else if (ctx.var().getText().equals("double")) {
                if (v.type.equals(VariableType.DOUBLE)) {
                    LLVMGenerator.declare_double_global(variableName, v.name);
                    variables.put(variableName, new VariableInfo(VariableType.DOUBLE, "@" + variableName, currentScope));
                } else {
                    error(ctx.getStart().getLine(), "Mismatch types in assign");
                }
            }
        }


    }

    @Override
    public void exitDeclaration_with_initialization_text_pointer(VSCLLParser.Declaration_with_initialization_text_pointerContext ctx) {

        if (currentScope.equals("global"))
            error(ctx.getStart().getLine(), "Expression cannot be used in global context");


        if (variables.containsKey(ctx.ID().getText()) || tables.containsKey(ctx.ID().getText())) {
            error(ctx.getStart().getLine(), String.format("Variable, '%s' already exists", ctx.ID().getText()));
        } else {

            LLVMGenerator.declare_text_pointer_local();
            String text = ctx.STRING().getText();
            text = text.substring(1, text.length() - 1);
            LLVMGenerator.assign_text_pointer(text);
            variables.put(ctx.ID().getText(), new VariableInfo(VariableType.TEXT_POINTER, "%" + (LLVMGenerator.reg - 1), currentScope));

        }

    }


    @Override
    public void exitExpression_id(VSCLLParser.Expression_idContext ctx) {

        if (currentScope.equals("global"))
            error(ctx.getStart().getLine(), "Expression cannot be used in global context");

        if (variables.containsKey(ctx.getText())) {
            stack.push(new StackValue(getVariable(ctx.getText()).address, getVariable(ctx.getText()).variableType));
        } else {
            if (tables.containsKey(ctx.getText())) {
                error(ctx.getStart().getLine(), "Table in this context must have an index");
            } else {
                error(ctx.getStart().getLine(), String.format("Variable '%s' doesn't exist", ctx.getText()));
            }
        }

    }

    @Override
    public void exitExpression_double(VSCLLParser.Expression_doubleContext ctx) {
        String number = ctx.getText();
        if (number.startsWith("(") && number.endsWith(")"))
            number = number.substring(1, number.length() - 1);
        stack.push(new StackValue(number, VariableType.DOUBLE));
    }

    @Override
    public void exitExpression_int(VSCLLParser.Expression_intContext ctx) {
        String number = ctx.getText();
        if (number.startsWith("(") && number.endsWith(")"))
            number = number.substring(1, number.length() - 1);
        stack.push(new StackValue(number, VariableType.INT));
    }

    @Override
    public void exitExpression_to_double(VSCLLParser.Expression_to_doubleContext ctx) {
        if (currentScope.equals("global"))
            error(ctx.getStart().getLine(), "Expression cannot be used in global context");
        StackValue value = stack.pop();
        if (isKnownVariable(value.name)) {
            LLVMGenerator.load_i32(value.name);
            LLVMGenerator.sitofp("%" + (LLVMGenerator.reg - 1));
        } else {
            LLVMGenerator.sitofp(value.name);
        }
        stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.DOUBLE));
    }

    @Override
    public void exitExpression_to_int(VSCLLParser.Expression_to_intContext ctx) {
        if (currentScope.equals("global"))
            error(ctx.getStart().getLine(), "Expression cannot be used in global context");
        StackValue value = stack.pop();
        if (isKnownVariable(value.name)) {
            LLVMGenerator.load_double(value.name);
            LLVMGenerator.fptosi("%" + (LLVMGenerator.reg - 1));
        } else {
            LLVMGenerator.fptosi(value.name);
        }
        stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.INT));
    }

    @Override
    public void exitExpression_index(VSCLLParser.Expression_indexContext ctx) {
        if (currentScope.equals("global"))
            error(ctx.getStart().getLine(), "Expression cannot be used in global context");
        String id = ctx.ID().getText();
        String index = ctx.index().getText();
        index = index.substring(1, index.length() - 1);

        if (tables.containsKey(id)) {
            Table table = tables.get(id);
            if (table.type.equals(VariableType.INT)) {
                LLVMGenerator.load_i32_array(table.address, index, table.size);
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.INT));
            }
            if (table.type.equals(VariableType.DOUBLE)) {
                LLVMGenerator.load_double_array(table.address, index, table.size);
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.DOUBLE));
            }
        } else {
            error(ctx.getStart().getLine(), String.format("Table '%s' doesn't exists", id));
        }
    }

    @Override
    public void exitExpression_character(VSCLLParser.Expression_characterContext ctx) {
        String text = ctx.CHARACTER().getText();
        text = text.substring(1, text.length() - 1);
        if (text.length() == 1) {
            char ch = text.charAt(0);
            stack.push(new StackValue((int) ch + "", VariableType.INT));
        } else if (text.length() == 2 && text.charAt(0) == '\\') {
            if (text.charAt(1) == '0') {
                stack.push(new StackValue(0 + "", VariableType.INT));
            }
        }


    }

    @Override
    public void exitExpression_function_call(VSCLLParser.Expression_function_callContext ctx) {

        if (currentScope.equals("global"))
            error(ctx.getStart().getLine(), "Expression cannot be used in global context");


        VariableType variableType = functions.get(ctx.function_call().ID().getText()).functionType;
        stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), variableType));
    }

    @Override
    public void exitAdd(VSCLLParser.AddContext ctx) {

        if (currentScope.equals("global"))
            error(ctx.getStart().getLine(), "Expression cannot be used in global context");


        StackValue v1 = stack.pop();
        StackValue v2 = stack.pop();
        if (v1.type.equals(VariableType.INT)) {
            if (isKnownVariable(v1.name)) {
                LLVMGenerator.load_i32(v1.name);
                v1.name = "%" + (LLVMGenerator.reg - 1);
            }
        } else if (v1.type.equals(VariableType.DOUBLE)) {
            if (isKnownVariable(v1.name)) {
                LLVMGenerator.load_double(v1.name);
                v1.name = "%" + (LLVMGenerator.reg - 1);
            }
        }


        if (v2.type.equals(VariableType.INT)) {
            if (isKnownVariable(v2.name)) {
                LLVMGenerator.load_i32(v2.name);
                v2.name = "%" + (LLVMGenerator.reg - 1);
            }
        } else if (v2.type.equals(VariableType.DOUBLE)) {
            if (isKnownVariable(v2.name)) {
                LLVMGenerator.load_double(v2.name);
                v2.name = "%" + (LLVMGenerator.reg - 1);
            }
        }


        if (v1.type.equals(v2.type)) {

            if (v1.type == VariableType.INT) {
                LLVMGenerator.add_i32(v1.name, v2.name);
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.INT));
            }
            if (v1.type == VariableType.DOUBLE) {
                LLVMGenerator.add_double(v1.name, v2.name);
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.DOUBLE));
            }
        } else {
            error(ctx.getStart().getLine(), "add type mismatch");
        }
    }

    @Override
    public void exitSubtract(VSCLLParser.SubtractContext ctx) {

        if (currentScope.equals("global"))
            error(ctx.getStart().getLine(), "Expression cannot be used in global context");


        StackValue v1 = stack.pop();
        StackValue v2 = stack.pop();

        if (v1.type.equals(VariableType.INT)) {
            if (isKnownVariable(v1.name)) {
                LLVMGenerator.load_i32(v1.name);
                v1.name = "%" + (LLVMGenerator.reg - 1);
            }
        } else if (v1.type.equals(VariableType.DOUBLE)) {
            if (isKnownVariable(v1.name)) {
                LLVMGenerator.load_double(v1.name);
                v1.name = "%" + (LLVMGenerator.reg - 1);
            }
        }


        if (v2.type.equals(VariableType.INT)) {
            if (isKnownVariable(v2.name)) {
                LLVMGenerator.load_i32(v2.name);
                v2.name = "%" + (LLVMGenerator.reg - 1);
            }
        } else if (v2.type.equals(VariableType.DOUBLE)) {
            if (isKnownVariable(v2.name)) {
                LLVMGenerator.load_double(v2.name);
                v2.name = "%" + (LLVMGenerator.reg - 1);
            }
        }

        if (v1.type == v2.type) {

            if (v1.type == VariableType.INT) {
                LLVMGenerator.sub_i32(v2.name, v1.name);
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.INT));
            }
            if (v1.type == VariableType.DOUBLE) {
                LLVMGenerator.sub_double(v2.name, v1.name);
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.DOUBLE));
            }
        } else {
            error(ctx.getStart().getLine(), "subtract type mismatch");
        }
    }

    @Override
    public void exitMultiplicate(VSCLLParser.MultiplicateContext ctx) {

        if (currentScope.equals("global"))
            error(ctx.getStart().getLine(), "Expression cannot be used in global context");


        StackValue v1 = stack.pop();
        StackValue v2 = stack.pop();

        if (v1.type.equals(VariableType.INT)) {
            if (isKnownVariable(v1.name)) {
                LLVMGenerator.load_i32(v1.name);
                v1.name = "%" + (LLVMGenerator.reg - 1);
            }
        } else if (v1.type.equals(VariableType.DOUBLE)) {
            if (isKnownVariable(v1.name)) {
                LLVMGenerator.load_double(v1.name);
                v1.name = "%" + (LLVMGenerator.reg - 1);
            }
        }


        if (v2.type.equals(VariableType.INT)) {
            if (isKnownVariable(v2.name)) {
                LLVMGenerator.load_i32(v2.name);
                v2.name = "%" + (LLVMGenerator.reg - 1);
            }
        } else if (v2.type.equals(VariableType.DOUBLE)) {
            if (isKnownVariable(v2.name)) {
                LLVMGenerator.load_double(v2.name);
                v2.name = "%" + (LLVMGenerator.reg - 1);
            }
        }

        if (v1.type == v2.type) {

            if (v1.type == VariableType.INT) {
                LLVMGenerator.mult_i32(v1.name, v2.name);
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.INT));
            }
            if (v1.type == VariableType.DOUBLE) {
                LLVMGenerator.mult_double(v1.name, v2.name);
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.DOUBLE));
            }
        } else {
            error(ctx.getStart().getLine(), "mult type mismatch");
        }
    }

    @Override
    public void exitAssing_variable(VSCLLParser.Assing_variableContext ctx) {
        if (currentScope.equals("global"))
            error(ctx.getStart().getLine(), "Expression cannot be used in global context");

        String variableName = ctx.ID().getText();
        if (getVariable(variableName) == null)
            error(ctx.getStart().getLine(), String.format("Variable '%s' not defined", variableName));
        String ID = getVariable(variableName).address;
        StackValue v = stack.pop();

        if (isKnownVariable(ID)) {
            VariableType variableType = getVariable(variableName).variableType;

            if (variableType.equals(VariableType.INT)) {
                if (v.type.equals(VariableType.INT)) {
                    if (isKnownVariable(v.name)) {
                        LLVMGenerator.load_i32(v.name);
                        LLVMGenerator.assign_i32(ID, "%" + (LLVMGenerator.reg - 1));
                    } else {
                        LLVMGenerator.assign_i32(ID, v.name);
                    }
                } else {
                    error(ctx.getStart().getLine(), "assign type mismatch");
                }
            }
            if (variableType.equals(VariableType.DOUBLE)) {
                if (v.type.equals(VariableType.DOUBLE)) {
                    if (isKnownVariable(v.name)) {
                        LLVMGenerator.load_double(v.name);
                        LLVMGenerator.assign_double(ID, "%" + (LLVMGenerator.reg - 1));
                    } else {
                        LLVMGenerator.assign_double(ID, v.name);
                    }
                } else {
                    error(ctx.getStart().getLine(), "assign type mismatch");
                }
            }

        } else {
            error(ctx.getStart().getLine(), String.format("Variable '%s' doesn't exists", ID));
        }

    }

    @Override
    public void exitAssing_to_array(VSCLLParser.Assing_to_arrayContext ctx) {
        if (currentScope.equals("global"))
            error(ctx.getStart().getLine(), "Expression cannot be used in global context");
        String name = ctx.ID().getText();
        String index = ctx.index().getText();

        index = index.substring(1, index.length() - 1);

        if (index.startsWith("(") && index.endsWith(")"))
            index = index.substring(1, index.length() - 1);

        StackValue value = stack.pop();

        if (tables.containsKey(name)) {
            Table table = tables.get(name);

            int intIndex = Integer.valueOf(index);
            int intSize = Integer.valueOf(table.size);


            if (intIndex < 0) {
                intIndex = intSize + intIndex;
            }


            if (intIndex >= intSize || intIndex < 0) {
                error(ctx.getStart().getLine(), String.format("Bad index '%s', array is only '%s' long", intIndex + "", intSize + ""));
            }

            if (table.type.equals(value.type)) {
                if (table.type.equals(VariableType.INT)) {
                    LLVMGenerator.assign_i32_array(table.address, intIndex + "", value.name, table.size);
                }
                if (table.type.equals(VariableType.DOUBLE)) {
                    LLVMGenerator.assign_double_array(table.address, intIndex + "", value.name, table.size);
                }

            } else {
                error(ctx.getStart().getLine(), "Assign type mismatch");
            }
        } else {
            error(ctx.getStart().getLine(), String.format("Table '%s' doesn't exists", name));
        }

    }

    @Override
    public void exitPrint_expression(VSCLLParser.Print_expressionContext ctx) {
        StackValue currentValue = stack.pop();
        if (currentValue.type.equals(VariableType.INT)) {

            if (isKnownVariable(currentValue.name)) {
                LLVMGenerator.print_i32(currentValue.name, true);
            } else {
                LLVMGenerator.print_i32(currentValue.name, false);
            }
        } else if (currentValue.type.equals(VariableType.DOUBLE)) {

            if (isKnownVariable(currentValue.name)) {
                LLVMGenerator.print_double(currentValue.name, true);
            } else {
                LLVMGenerator.print_double(currentValue.name, false);
            }
        } else {
            error(ctx.getStart().getLine(), "Unsupported value type");
        }
    }

    @Override
    public void exitPrints_id(VSCLLParser.Prints_idContext ctx) {
        String id = ctx.ID().getText();
        if (tables.containsKey(id)) {
            LLVMGenerator.print_char_array(tables.get(id).address, tables.get(id).size);
        } else if (variables.containsKey(id)) {
            VariableType variableType = getVariable(id).variableType;
            if (variableType.equals(VariableType.INT)) {
                LLVMGenerator.print_i32_as_char(getVariable(id).address, true);
            } else if (variableType.equals(VariableType.TEXT_POINTER)) {
                LLVMGenerator.print_text_pointer(getVariable(id).address);
            } else
                error(ctx.getStart().getLine(), "Can only display int or char");
        } else {
            error(ctx.getStart().getLine(), String.format("Variable '%s' doesn't exist", id));
        }
    }

    @Override
    public void exitPrints_id_index(VSCLLParser.Prints_id_indexContext ctx) {
        String id = ctx.ID().getText();
        if (tables.containsKey(id)) {

            Table table = tables.get(id);


            String index = ctx.index().getText();

            index = index.substring(1, index.length() - 1);

            if (index.startsWith("(") && index.endsWith(")"))
                index = index.substring(1, index.length() - 1);

            int intIndex = Integer.valueOf(index);
            int intSize = Integer.valueOf(table.size);


            if (intIndex < 0) {
                intIndex = intSize + intIndex;
            }


            if (intIndex >= intSize || intIndex < 0) {
                error(ctx.getStart().getLine(), String.format("Bad index '%s', array is only '%s' long", intIndex + "", intSize + ""));
            }

            LLVMGenerator.print_i8_table_element(table.address, table.size, intIndex + "");

        } else {
            error(ctx.getStart().getLine(), String.format("Array '%s' doesn't exist", id));
        }

    }

    @Override
    public void exitPrints_string(VSCLLParser.Prints_stringContext ctx) {
        String text = ctx.STRING().getText();
        text = text.substring(1, text.length() - 1);
        LLVMGenerator.print_static_string(text);
    }

    @Override
    public void exitScani_id(VSCLLParser.Scani_idContext ctx) {
        String id = ctx.ID().getText();
        if (variables.containsKey(id)) {
            String address = getVariable(id).address;
            LLVMGenerator.scan_i32(address);
        } else {
            error(ctx.getStart().getLine(), String.format("Variable '%s' doesn't exist", id));
        }
    }

    @Override
    public void exitScani_array(VSCLLParser.Scani_arrayContext ctx) {
        String id = ctx.ID().getText();
        String index = ctx.index().getText();

        index = index.substring(1, index.length() - 1);

        if (index.startsWith("(") && index.endsWith(")"))
            index = index.substring(1, index.length() - 1);

        if (tables.containsKey(id)) {
            Table table = tables.get(id);

            int intIndex = Integer.valueOf(index);
            int intSize = Integer.valueOf(table.size);


            if (intIndex < 0) {
                intIndex = intSize + intIndex;
            }


            if (intIndex >= intSize || intIndex < 0) {
                error(ctx.getStart().getLine(), String.format("Bad index '%s', array is only '%s' long", intIndex + "", intSize + ""));
            }

            if (table.type.equals(VariableType.INT)) {
                LLVMGenerator.scan_i32_array(table.address, intIndex + "", table.size);
            } else {
                error(ctx.getStart().getLine(), "Scani used for array of doubles");
            }
        } else {
            error(ctx.getStart().getLine(), String.format("Table '%s' doesn't exists", id));
        }
    }

    @Override
    public void exitScand_id(VSCLLParser.Scand_idContext ctx) {
        String id = ctx.ID().getText();
        if (variables.containsKey(id)) {
            String address = getVariable(id).address;
            LLVMGenerator.scan_double(address);
        } else {
            error(ctx.getStart().getLine(), String.format("Variable '%s' doesn't exist", id));
        }
    }

    @Override
    public void exitScand_array(VSCLLParser.Scand_arrayContext ctx) {
        String id = ctx.ID().getText();
        String index = ctx.index().getText();

        index = index.substring(1, index.length() - 1);

        if (index.startsWith("(") && index.endsWith(")"))
            index = index.substring(1, index.length() - 1);

        if (tables.containsKey(id)) {
            Table table = tables.get(id);

            int intIndex = Integer.valueOf(index);
            int intSize = Integer.valueOf(table.size);


            if (intIndex < 0) {
                intIndex = intSize + intIndex;
            }


            if (intIndex >= intSize || intIndex < 0) {
                error(ctx.getStart().getLine(), String.format("Bad index '%s', array is only '%s' long", intIndex + "", intSize + ""));
            }

            if (table.type.equals(VariableType.DOUBLE)) {
                LLVMGenerator.scan_double_array(table.address, intIndex + "", table.size);
            } else {
                error(ctx.getStart().getLine(), "Scani used for array of ints");
            }
        } else {
            error(ctx.getStart().getLine(), String.format("Table '%s' doesn't exists", id));
        }
    }

    /*

            ETAP II - FUNKCJE, BLOKI, INSTRUKCJE WARUNKOWE, PĘTLE

     */


    @Override
    public void exitCondition_equal(VSCLLParser.Condition_equalContext ctx) {
        exitCondition(ctx.getStart().getLine(), ComparisonType.EQUAL);
    }

    @Override
    public void exitCondition_less_than(VSCLLParser.Condition_less_thanContext ctx) {
        exitCondition(ctx.getStart().getLine(), ComparisonType.LESS_THAN);
    }

    @Override
    public void exitCondition_greater_than(VSCLLParser.Condition_greater_thanContext ctx) {
        exitCondition(ctx.getStart().getLine(), ComparisonType.GREATER_THAN);
    }

    private void exitCondition(int lineNumber, ComparisonType comparisonType) {
        StackValue v2 = stack.pop();
        StackValue v1 = stack.pop();

        if (v1.type.equals(VariableType.INT)) {
            if (isKnownVariable(v1.name)) {
                LLVMGenerator.load_i32(v1.name);
                v1.name = "%" + (LLVMGenerator.reg - 1);
            }
        } else if (v1.type.equals(VariableType.DOUBLE)) {
            if (isKnownVariable(v1.name)) {
                LLVMGenerator.load_double(v1.name);
                v1.name = "%" + (LLVMGenerator.reg - 1);
            }
        }

        if (v2.type.equals(VariableType.INT)) {
            if (isKnownVariable(v2.name)) {
                LLVMGenerator.load_i32(v2.name);
                v2.name = "%" + (LLVMGenerator.reg - 1);
            }
        } else if (v2.type.equals(VariableType.DOUBLE)) {
            if (isKnownVariable(v2.name)) {
                LLVMGenerator.load_double(v2.name);
                v2.name = "%" + (LLVMGenerator.reg - 1);
            }
        }

        if (v1.type.equals(v2.type)) {

            if (v1.type == VariableType.INT) {
                if (comparisonType.equals(ComparisonType.EQUAL)) {
                    LLVMGenerator.compare_equal_i32(v1.name, v2.name);
                } else if (comparisonType.equals(ComparisonType.LESS_THAN)) {
                    LLVMGenerator.compare_less_than_i32(v1.name, v2.name);
                } else if (comparisonType.equals(ComparisonType.GREATER_THAN)) {
                    LLVMGenerator.compare_greater_than_i32(v1.name, v2.name);
                }
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.BOOLEAN));
            }
            if (v1.type == VariableType.DOUBLE) {
                if (comparisonType.equals(ComparisonType.EQUAL)) {
                    LLVMGenerator.compare_equal_double(v1.name, v2.name);
                } else if (comparisonType.equals(ComparisonType.LESS_THAN)) {
                    LLVMGenerator.compare_less_than_double(v1.name, v2.name);
                } else if (comparisonType.equals(ComparisonType.GREATER_THAN)) {
                    LLVMGenerator.compare_greater_than_double(v1.name, v2.name);
                }
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.BOOLEAN));
            }
        } else {
            error(lineNumber, "comparison type mismatch");
        }
    }


    @Override
    public void enterIf_block(VSCLLParser.If_blockContext ctx) {

        String labelStart = "L" + labelCounter;
        labelCounter++;
        String labelEnd = "L" + labelCounter;
        labelCounter++;

        LLVMGenerator.conditional_jump(labelStart, labelEnd);
        LLVMGenerator.label(labelStart);
        labels.push(labelEnd);
    }

    @Override
    public void exitIf_block(VSCLLParser.If_blockContext ctx) {
        String label = labels.pop();
        LLVMGenerator.static_jump(label);
        LLVMGenerator.label(label);
    }

    @Override
    public void enterWhile_statement(VSCLLParser.While_statementContext ctx) {
        String label = "L" + labelCounter;
        labelCounter++;
        labels.push(label);
        LLVMGenerator.static_jump(label);
        LLVMGenerator.label(label);
    }

    @Override
    public void enterWhile_block(VSCLLParser.While_blockContext ctx) {
        String labelStart = "L" + labelCounter;
        labelCounter++;
        String labelEnd = "L" + labelCounter;
        labelCounter++;

        LLVMGenerator.conditional_jump(labelStart, labelEnd);
        LLVMGenerator.label(labelStart);
        labels.push(labelEnd);
    }

    @Override
    public void exitWhile_block(VSCLLParser.While_blockContext ctx) {
        String end = labels.pop();
        String back = labels.pop();

        LLVMGenerator.static_jump(back);
        LLVMGenerator.label(end);
    }

    /*


            FUNKCJE


     */

    @Override
    public void exitFunction_parameter(VSCLLParser.Function_parameterContext ctx) {
        try {
            if (ctx.var().getText().equals("int")) {
                functionParams.add(new StackValue(ctx.ID().getText(), VariableType.INT));
            }
            if (ctx.var().getText().equals("double")) {
                functionParams.add(new StackValue(ctx.ID().getText(), VariableType.DOUBLE));
            }
        } catch (Exception ignored) {

        }

    }

    @Override
    public void enterFunction(VSCLLParser.FunctionContext ctx) {
        switch (ctx.function_type().getText()) {
            case "int":
                currentType = VariableType.INT;
                break;
            case "double":
                currentType = VariableType.DOUBLE;
                break;
            case "void":
                currentType = VariableType.VOID;
                break;
        }

        currentScope = ctx.ID().getText();

        functions.put(currentScope, new FunctionInfo(currentType));

    }

    @Override
    public void enterFunction_block(VSCLLParser.Function_blockContext ctx) {
        String type = "";
        StringBuilder params = new StringBuilder();
        String name = currentScope;
        if (currentType.equals(VariableType.INT)) {
            type = "i32";
        } else if (currentType.equals(VariableType.DOUBLE)) {
            type = "double";
        }


        for (StackValue stackValue : functionParams) {
            if (stackValue.type.equals(VariableType.INT))
                params.append("i32, ");
            else if (stackValue.type.equals(VariableType.DOUBLE))
                params.append("double, ");
            functions.get(currentScope).parametersTypes.add(0, stackValue.type);
        }
        params = new StringBuilder(params.toString().trim());

        if (params.toString().endsWith(","))
            params = new StringBuilder(params.substring(0, params.length() - 1));

        LLVMGenerator.defineFunction(type, name, params.toString(), functionParams.size());

        int counter = 0;
        for (StackValue stackValue : functionParams) {
            if (stackValue.type.equals(VariableType.INT)) {
                LLVMGenerator.declare_i32_local();
                if (isAlreadyDefined(stackValue.name, currentScope)) {
                    error(ctx.getStart().getLine(), "Duplicate parameters names");
                }
                variables.put(stackValue.name, new VariableInfo(VariableType.INT, "%" + (LLVMGenerator.reg - 1), currentScope));
                LLVMGenerator.assign_i32(getVariable(stackValue.name).address, "%" + counter++);
            }
        }

        functionParams.clear();
    }

    @Override
    public void exitReturn_statement(VSCLLParser.Return_statementContext ctx) {
        if (ctx.expression() == null) {
            LLVMGenerator.return_statement("void", "");
        } else {
            StackValue stackValue = stack.pop();
            String type = "";

            if (currentType.equals(VariableType.INT))
                type = "i32";
            else if (currentType.equals(VariableType.DOUBLE))
                type = "double";

            if (stackValue.type.equals(VariableType.INT)) {
                if (isKnownVariable(stackValue.name)) {
                    LLVMGenerator.load_i32(stackValue.name);
                    stackValue.name = "%" + (LLVMGenerator.reg - 1);
                }
            } else if (stackValue.type.equals(VariableType.DOUBLE)) {
                if (isKnownVariable(stackValue.name)) {
                    LLVMGenerator.load_double(stackValue.name);
                    stackValue.name = "%" + (LLVMGenerator.reg - 1);
                }
            }

            LLVMGenerator.return_statement(type, stackValue.name);
        }
    }

    @Override
    public void exitFunction_block(VSCLLParser.Function_blockContext ctx) {
        LLVMGenerator.closeFunction();
    }

    @Override
    public void exitFunction(VSCLLParser.FunctionContext ctx) {
        currentScope = "global";
        currentType = null;
    }

    @Override
    public void exitExpressions_list(VSCLLParser.Expressions_listContext ctx) {
        functionParams.clear();
        while (!stack.isEmpty()) {
            StackValue stackValue = stack.pop();
            functionParams.add(stackValue);
        }
    }

    @Override
    public void exitFunction_call(VSCLLParser.Function_callContext ctx) {
        String functionName = ctx.ID().getText();
        if(!functions.containsKey(functionName))
            error(ctx.getStart().getLine(),String.format("Function '%s' doesn't exists",functionName));
        String type = "";
        if (functionParams.size() == functions.get(functionName).parametersTypes.size()) {
            StringBuilder params = new StringBuilder();
            for (int i = functionParams.size() - 1; i >= 0; i--) {
                StackValue sv = functionParams.get(i);

                if (sv.type.equals(VariableType.INT))
                    type = "i32";
                else if (sv.type.equals(VariableType.DOUBLE))
                    type = "double";

                params.append(type).append(" ").append(sv.name).append(", ");
            }
            params = new StringBuilder(params.toString().trim());
            if (params.toString().endsWith(","))
                params = new StringBuilder(params.substring(0, params.length() - 1));

            if (functions.get(functionName).functionType.equals(VariableType.INT))
                type = "i32";
            else if (functions.get(functionName).functionType.equals(VariableType.DOUBLE))
                type = "double";

            LLVMGenerator.callFunction(functionName, params.toString(), type);
        } else {
            error(ctx.getStart().getLine(), "Incorrect number of parameters in a function call");
        }

    }

    /*

            FINALIZACJA I FUNKCJE POMOCNICZE

     */


    @Override
    public void enterProg(VSCLLParser.ProgContext ctx) {
        currentScope = "global";
    }

    @Override
    public void exitProg(VSCLLParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }


    private void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }

    private boolean isKnownVariable(String toCheck) {
        for (VariableInfo variableInfo : variables.values()) {
            if (variableInfo.address.equals(toCheck) && (variableInfo.scope.equals(currentScope) || variableInfo.scope.equals("global")))
                return true;
        }
        return false;
    }


    /**
     * Checks if variable is defined in current scope
     *
     * @param name  Variable name
     * @param scope Scope to check
     * @return Boolean if variable is already defined in a current scope
     */
    private boolean isAlreadyDefined(String name, String scope) {
        if (tables.containsKey(name)) {
            Table table = tables.get(name);
            return table.scope.equals(scope);
        } else if (variables.containsKey(name)) {
            VariableInfo variableInfo = variables.get(name);
            return variableInfo.scope.equals(scope);
        }
        return false;
    }

    /**
     * Get's variable from scope of the function, or global scope (in that order). Returs null if variable doesn't
     * exist
     *
     * @param id Variable name
     * @return VariableInfo object of proper variable
     */
    private VariableInfo getVariable(String id) {
        VariableInfo backup = null;
        for (String s : variables.keySet()) {
            if (s.equals(id)) {
                if (variables.get(s).scope.equals(currentScope))
                    return variables.get(s);
                else if (variables.get(s).scope.equals("global"))
                    backup = variables.get(s);
            }
        }
        return backup;

    }

}
