package pl.mateuszkalinowski.vscllcompiler.llvm;

import pl.mateuszkalinowski.vscllcompiler.entities.Table;
import pl.mateuszkalinowski.vscllcompiler.entities.StackValue;
import pl.mateuszkalinowski.vscllcompiler.entities.VariableInfo;
import pl.mateuszkalinowski.vscllcompiler.enums.ComparisonType;
import pl.mateuszkalinowski.vscllcompiler.enums.VariableType;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLBaseListener;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLParser;

import java.util.HashMap;
import java.util.Stack;


public class LLVMActions extends VSCLLBaseListener {

    private Stack<StackValue> stack = new Stack<>();
    private Stack<String> labels = new Stack<>();

    private HashMap<String, VariableInfo> variables = new HashMap<>();
    private HashMap<String, Table> tables = new HashMap<>();

    private HashMap<String, String> variablesAddresses = new HashMap<>();

    int labelCounter = 0;

    String currentScope = "main";


    /*

          ETAP I - TYPY, ZMIENNE, ODCZYT/ZAPIS Z KONSOLI

     */

    @Override
    public void exitDeclaration_variable(VSCLLParser.Declaration_variableContext ctx) {
        if (variables.keySet().contains(ctx.ID().getText()) || tables.containsKey(ctx.ID().getText())) {
            error(ctx.getStart().getLine(), String.format("Variable '%s' already defined", ctx.ID().getText()));
        }

        if (ctx.var().getText().equals("int")) {
            LLVMGenerator.declare_i32_local();
            LLVMGenerator.assign_i32((LLVMGenerator.reg-1)+"", "0");
            variables.put(ctx.ID().getText(), new VariableInfo(VariableType.INT,(LLVMGenerator.reg-1)+"",currentScope));
        } else if (ctx.var().getText().equals("double")) {
            LLVMGenerator.declare_double_local();
            LLVMGenerator.assign_double((LLVMGenerator.reg-1)+"", "0.0");
            variables.put(ctx.ID().getText(),new VariableInfo(VariableType.DOUBLE,(LLVMGenerator.reg-1)+"",currentScope));
        } else if (ctx.var().getText().equals("char")) {
            LLVMGenerator.declare_i8_local();
            LLVMGenerator.assign_i8((LLVMGenerator.reg-1)+"", "0");
            variables.put(ctx.ID().getText(), new VariableInfo(VariableType.CHAR,(LLVMGenerator.reg-1)+"",currentScope));
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



        if(isAlreadyDefined(id,currentScope)) {
            error(ctx.getStart().getLine(), String.format("Variable '%s' already defined", ctx.ID().getText()));
            return;
        }

        if (ctx.var().getText().equals("int")) {
            LLVMGenerator.declare_i32_array_local(id, size);
            tables.put(id, new Table(size, VariableType.INT));
        }
        if (ctx.var().getText().equals("double")) {
            LLVMGenerator.declare_double_array_local(id, size);
            tables.put(id, new Table(size, VariableType.DOUBLE));
        }
        if (ctx.var().getText().equals("char")) {
            LLVMGenerator.declare_char_array_local(id, size);
            tables.put(id, new Table(size, VariableType.CHAR));
        }
    }

    @Override
    public void exitDeclaration_with_initialization_variable(VSCLLParser.Declaration_with_initialization_variableContext ctx) {
        if (variables.keySet().contains(ctx.ID().getText()) || tables.containsKey(ctx.ID().getText())) {
            error(ctx.getStart().getLine(), String.format("Variable '%s' already defined", ctx.ID().getText()));
        }


        if (ctx.var().getText().equals("int")) {
            LLVMGenerator.declare_i32(ctx.ID().getText());
            LLVMGenerator.assign_i32(ctx.ID().getText(), "0");
            variables.put(ctx.ID().getText(), VariableType.INT);
        } else if (ctx.var().getText().equals("double")) {
            LLVMGenerator.declare_double(ctx.ID().getText());
            LLVMGenerator.assign_double(ctx.ID().getText(), "0.0");
            variables.put(ctx.ID().getText(), VariableType.DOUBLE);
        } else if (ctx.var().getText().equals("char")) {
            LLVMGenerator.declare_i8(ctx.ID().getText());
            LLVMGenerator.assign_i8(ctx.ID().getText(), "0");
            variables.put(ctx.ID().getText(), VariableType.CHAR);
        }

        String ID = ctx.ID().getText();
        StackValue v = stack.pop();

        if (variables.containsKey(ID)) {
            VariableType variableType = variables.get(ID);

            if (variableType.equals(VariableType.INT)) {
                if (v.type.equals(VariableType.INT)) {
                    if (isKnownVariable(v.name)) {
                        LLVMGenerator.load_i32(v.name);
                        LLVMGenerator.assign_i32(ID, "%" + (LLVMGenerator.reg - 1));
                    } else {
                        LLVMGenerator.assign_i32(ID, v.name);
                    }
                }
                else {
                    error(ctx.getStart().getLine(),"assign type mismatch");
                }
            }
            if (variableType.equals(VariableType.DOUBLE)) {
                if(v.type.equals(VariableType.DOUBLE)) {
                    if (isKnownVariable(v.name)) {
                        LLVMGenerator.load_double(v.name);
                        LLVMGenerator.assign_double(ID, "%" + (LLVMGenerator.reg - 1));
                    } else {
                        LLVMGenerator.assign_double(ID, v.name);
                    }
                }
                else {
                    error(ctx.getStart().getLine(),"assign type mismatch");
                }
            }
            if (variableType.equals(VariableType.CHAR)) {
                if(v.type.equals(VariableType.CHAR)) {
                    if (isKnownVariable(v.name)) {
                        LLVMGenerator.load_i8(v.name);
                        LLVMGenerator.assign_i8(ID, "%" + (LLVMGenerator.reg - 1));
                    } else {
                        LLVMGenerator.assign_i8(ID, v.name);
                    }
                } else if(v.type.equals(VariableType.INT) && !isKnownVariable(v.name)) {
                    LLVMGenerator.assign_i8(ID, v.name);
                }
                else {
                    error(ctx.getStart().getLine(),"assign type mismatch");
                }
            }

        } else {
            error(ctx.getStart().getLine(), String.format("Variable '%s' doesn't exists", ID));
        }
    }

    @Override
    public void exitDeclaration_with_initialization_text_pointer(VSCLLParser.Declaration_with_initialization_text_pointerContext ctx) {
        if (variables.containsKey(ctx.ID().getText()) || tables.containsKey(ctx.ID().getText())) {
            error(ctx.getStart().getLine(), String.format("Variable, '%s' already exists", ctx.ID().getText()));
        } else {
            LLVMGenerator.declare_text_pointer(ctx.ID().getText());
            String text = ctx.STRING().getText();
            text = text.substring(1, text.length() - 1);
            LLVMGenerator.assign_text_pointer(ctx.ID().getText(), text);
            variables.put(ctx.ID().getText(), VariableType.TEXT_POINTER);
        }


    }


    @Override
    public void exitExpression_id(VSCLLParser.Expression_idContext ctx) {

        if (variables.containsKey(ctx.getText())) {
            stack.push(new StackValue("%" + ctx.getText(), variables.get(ctx.getText()).variableType));
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
        String id = ctx.ID().getText();
        String index = ctx.index().getText();
        index = index.substring(1, index.length() - 1);

        if (tables.containsKey(id)) {
            Table table = tables.get(id);
            if (table.type.equals(VariableType.INT)) {
                LLVMGenerator.load_i32_array(id, index, table.size);
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.INT));
            }
            if (table.type.equals(VariableType.CHAR)) {
                LLVMGenerator.load_i8_array(id, index, table.size);
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.CHAR));
            }
            if (table.type.equals(VariableType.DOUBLE)) {
                LLVMGenerator.load_double_array(id, index, table.size);
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
            stack.push(new StackValue((int) ch + "", VariableType.CHAR));
        } else if (text.length() == 2 && text.charAt(0) == '\\') {
            if (text.charAt(1) == '0') {
                stack.push(new StackValue(0 + "", VariableType.CHAR));
            }
        }


    }

    @Override
    public void exitAdd(VSCLLParser.AddContext ctx) {
        StackValue v1 = stack.pop();
        StackValue v2 = stack.pop();
        if (v1.type.equals(VariableType.CHAR)) {
            if (isKnownVariable(v1.name)) {
                LLVMGenerator.load_i8(v1.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v1.name = "%" + (LLVMGenerator.reg - 1);
                v1.type = VariableType.INT;
            } else if (v1.name.startsWith("%")) {
                //LLVMGenerator.load_i8(v1.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v1.name = "%" + (LLVMGenerator.reg - 1);
                v1.type = VariableType.INT;
            } else {
                v1.type = VariableType.INT;
            }
        } else if (v1.type.equals(VariableType.INT)) {
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


        if (v2.type.equals(VariableType.CHAR)) {
            if (isKnownVariable(v2.name)) {
                LLVMGenerator.load_i8(v2.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v2.name = "%" + (LLVMGenerator.reg - 1);
                v2.type = VariableType.INT;
            } else if (v2.name.startsWith("%")) {
                //   LLVMGenerator.load_i8(v2.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v2.name = "%" + (LLVMGenerator.reg - 1);
                v2.type = VariableType.INT;
            } else {
                v2.type = VariableType.INT;
            }
        } else if (v2.type.equals(VariableType.INT)) {
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

            if (v1.type == VariableType.INT || v1.type.equals(VariableType.CHAR)) {
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
        StackValue v1 = stack.pop();
        StackValue v2 = stack.pop();

        if (v1.type.equals(VariableType.CHAR)) {
            if (isKnownVariable(v1.name)) {
                LLVMGenerator.load_i8(v1.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v1.name = "%" + (LLVMGenerator.reg - 1);
                v1.type = VariableType.INT;
            } else if (v1.name.startsWith("%")) {
                //LLVMGenerator.load_i8(v1.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v1.name = "%" + (LLVMGenerator.reg - 1);
                v1.type = VariableType.INT;
            } else {
                v1.type = VariableType.INT;
            }
        } else if (v1.type.equals(VariableType.INT)) {
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


        if (v2.type.equals(VariableType.CHAR)) {
            if (isKnownVariable(v2.name)) {
                LLVMGenerator.load_i8(v2.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v2.name = "%" + (LLVMGenerator.reg - 1);
                v2.type = VariableType.INT;
            } else if (v2.name.startsWith("%")) {
                //   LLVMGenerator.load_i8(v2.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v2.name = "%" + (LLVMGenerator.reg - 1);
                v2.type = VariableType.INT;
            } else {
                v2.type = VariableType.INT;
            }
        } else if (v2.type.equals(VariableType.INT)) {
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

            if (v1.type == VariableType.INT || v1.type.equals(VariableType.CHAR)) {
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
        StackValue v1 = stack.pop();
        StackValue v2 = stack.pop();

        if (v1.type.equals(VariableType.CHAR)) {
            if (isKnownVariable(v1.name)) {
                LLVMGenerator.load_i8(v1.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v1.name = "%" + (LLVMGenerator.reg - 1);
                v1.type = VariableType.INT;
            } else if (v1.name.startsWith("%")) {
                //LLVMGenerator.load_i8(v1.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v1.name = "%" + (LLVMGenerator.reg - 1);
                v1.type = VariableType.INT;
            } else {
                v1.type = VariableType.INT;
            }
        } else if (v1.type.equals(VariableType.INT)) {
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


        if (v2.type.equals(VariableType.CHAR)) {
            if (isKnownVariable(v2.name)) {
                LLVMGenerator.load_i8(v2.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v2.name = "%" + (LLVMGenerator.reg - 1);
                v2.type = VariableType.INT;
            } else if (v2.name.startsWith("%")) {
                //   LLVMGenerator.load_i8(v2.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v2.name = "%" + (LLVMGenerator.reg - 1);
                v2.type = VariableType.INT;
            } else {
                v2.type = VariableType.INT;
            }
        } else if (v2.type.equals(VariableType.INT)) {
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

            if (v1.type == VariableType.INT || v1.type.equals(VariableType.CHAR)) {
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
        String ID = ctx.ID().getText();
        StackValue v = stack.pop();

        if (variables.containsKey(ID)) {
            VariableType variableType = variables.get(ID).variableType;

            if (variableType.equals(VariableType.INT)) {
                if (v.type.equals(VariableType.INT)) {
                    if (isKnownVariable(v.name)) {
                        LLVMGenerator.load_i32(v.name);
                        LLVMGenerator.assign_i32(ID, "%" + (LLVMGenerator.reg - 1));
                    } else {
                        LLVMGenerator.assign_i32(ID, v.name);
                    }
                }
                else {
                    error(ctx.getStart().getLine(),"assign type mismatch");
                }
            }
            if (variableType.equals(VariableType.DOUBLE)) {
                if(v.type.equals(VariableType.DOUBLE)) {
                    if (isKnownVariable(v.name)) {
                        LLVMGenerator.load_double(v.name);
                        LLVMGenerator.assign_double(ID, "%" + (LLVMGenerator.reg - 1));
                    } else {
                        LLVMGenerator.assign_double(ID, v.name);
                    }
                }
                else {
                    error(ctx.getStart().getLine(),"assign type mismatch");
                }
            }
            if (variableType.equals(VariableType.CHAR)) {
                if(v.type.equals(VariableType.CHAR)) {
                    if (isKnownVariable(v.name)) {
                        LLVMGenerator.load_i8(v.name);
                        LLVMGenerator.assign_i8(ID, "%" + (LLVMGenerator.reg - 1));
                    } else {
                        LLVMGenerator.assign_i8(ID, v.name);
                    }
                } else if(v.type.equals(VariableType.INT) && !isKnownVariable(v.name)) {
                    LLVMGenerator.assign_i8(ID, v.name);
                }
                else {
                    error(ctx.getStart().getLine(),"assign type mismatch");
                }
            }

        } else {
            error(ctx.getStart().getLine(), String.format("Variable '%s' doesn't exists", ID));
        }

    }

    @Override
    public void exitAssing_text_pointer(VSCLLParser.Assing_text_pointerContext ctx) {
        String text = ctx.STRING().getText();
        text = text.substring(1, text.length() - 1);
        LLVMGenerator.assign_text_pointer(ctx.ID().getText(), text);
        variables.put(ctx.ID().getText(), VariableType.TEXT_POINTER);
    }

    @Override
    public void exitAssing_to_array(VSCLLParser.Assing_to_arrayContext ctx) {
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

            if (table.type.equals(value.type) || (table.type.equals(VariableType.CHAR) && value.type.equals(VariableType.INT))) {
                if (table.type.equals(VariableType.INT)) {
                    LLVMGenerator.assign_i32_array(name, intIndex + "", value.name, table.size);
                }
                if (table.type.equals(VariableType.DOUBLE)) {
                    LLVMGenerator.assign_double_array(name, intIndex + "", value.name, table.size);
                }
                if (table.type.equals(VariableType.CHAR)) {
                    LLVMGenerator.assign_char_array(name, intIndex + "", value.name, table.size);
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

            if (variables.keySet().contains(currentValue.name.replaceFirst("%", ""))) {
                LLVMGenerator.print_i32(currentValue.name);
            } else {
                LLVMGenerator.assign_i32("tmpi", currentValue.name);
                LLVMGenerator.print_i32("%tmpi");
            }
        } else if (currentValue.type.equals(VariableType.DOUBLE)) {

            if (variables.keySet().contains(currentValue.name.replaceFirst("%", ""))) {
                LLVMGenerator.print_double(currentValue.name);
            } else {
                LLVMGenerator.assign_double("tmpd", currentValue.name);
                LLVMGenerator.print_double("%tmpd");
            }
        } else if (currentValue.type.equals(VariableType.CHAR)) {
            if (variables.keySet().contains(currentValue.name.replaceFirst("%", ""))) {
                LLVMGenerator.print_i8(currentValue.name);
            } else {
                LLVMGenerator.assign_i8("tmp8", currentValue.name);
                LLVMGenerator.print_i8("%tmp8");
            }

        } else {
            error(ctx.getStart().getLine(), "Unsupported value type");
        }
    }

    @Override
    public void exitPrints_id(VSCLLParser.Prints_idContext ctx) {
        String id = ctx.ID().getText();
        if (tables.containsKey(id)) {
            LLVMGenerator.print_char_array(id, tables.get(id).size);
        } else if (variables.containsKey(id)) {
            VariableType variableType = variables.get(id).variableType;
            if(variableType.equals(VariableType.CHAR)) {
                LLVMGenerator.print_i8_as_char("%" + id);
            }
            else if(variableType.equals(VariableType.INT)) {
                LLVMGenerator.print_i32_as_char("%" + id);
            } else if(variableType.equals(VariableType.TEXT_POINTER)) {
                LLVMGenerator.print_text_pointer("%"+id);
            }
            else
                error(ctx.getStart().getLine(), "Can only display int or char");
        }
        else {
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

            LLVMGenerator.print_i8_table_element(id, table.size, intIndex + "");

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
        LLVMGenerator.scan_i32("%" + ctx.ID().getText());
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
                LLVMGenerator.scan_i32_array(id, intIndex + "", table.size);
            } else {
                error(ctx.getStart().getLine(), "Scani used for array of doubles");
            }
        } else {
            error(ctx.getStart().getLine(), String.format("Table '%s' doesn't exists", id));
        }
    }

    @Override
    public void exitScand_id(VSCLLParser.Scand_idContext ctx) {
        LLVMGenerator.scan_double("%" + ctx.ID().getText());
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
                LLVMGenerator.scan_double_array(id, intIndex + "", table.size);
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
        exitCondition(ctx.getStart().getLine(),ComparisonType.EQUAL);
    }

    @Override
    public void exitCondition_less_than(VSCLLParser.Condition_less_thanContext ctx) {
        exitCondition(ctx.getStart().getLine(),ComparisonType.LESS_THAN);
    }

    @Override
    public void exitCondition_greater_than(VSCLLParser.Condition_greater_thanContext ctx) {
        exitCondition(ctx.getStart().getLine(),ComparisonType.GREATER_THAN);
    }

    public void exitCondition(int lineNumber, ComparisonType comparisonType) {
        StackValue v2 = stack.pop();
        StackValue v1 = stack.pop();

        if (v1.type.equals(VariableType.CHAR)) {
            if (isKnownVariable(v1.name)) {
                LLVMGenerator.load_i8(v1.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v1.name = "%" + (LLVMGenerator.reg - 1);
                v1.type = VariableType.INT;
            } else if (v1.name.startsWith("%")) {
                //LLVMGenerator.load_i8(v1.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v1.name = "%" + (LLVMGenerator.reg - 1);
                v1.type = VariableType.INT;
            } else {
                v1.type = VariableType.INT;
            }
        } else if (v1.type.equals(VariableType.INT)) {
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


        if (v2.type.equals(VariableType.CHAR)) {
            if (isKnownVariable(v2.name)) {
                LLVMGenerator.load_i8(v2.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v2.name = "%" + (LLVMGenerator.reg - 1);
                v2.type = VariableType.INT;
            } else if (v2.name.startsWith("%")) {
                //   LLVMGenerator.load_i8(v2.name);
                LLVMGenerator.i8toi32("%" + (LLVMGenerator.reg - 1));
                v2.name = "%" + (LLVMGenerator.reg - 1);
                v2.type = VariableType.INT;
            } else {
                v2.type = VariableType.INT;
            }
        } else if (v2.type.equals(VariableType.INT)) {
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
                if(comparisonType.equals(ComparisonType.EQUAL)) {
                    LLVMGenerator.compare_equal_i32(v1.name, v2.name);
                }
                else if(comparisonType.equals(ComparisonType.LESS_THAN)) {
                    LLVMGenerator.compare_less_than_i32(v1.name, v2.name);
                }
                else if(comparisonType.equals(ComparisonType.GREATER_THAN)) {
                    LLVMGenerator.compare_greater_than_i32(v1.name, v2.name);
                }
                stack.push(new StackValue("%" + (LLVMGenerator.reg - 1), VariableType.BOOLEAN));
            }
            if (v1.type == VariableType.DOUBLE) {
                if(comparisonType.equals(ComparisonType.EQUAL)) {
                    LLVMGenerator.compare_equal_double(v1.name, v2.name);
                }
                else if(comparisonType.equals(ComparisonType.LESS_THAN)) {
                    LLVMGenerator.compare_less_than_double(v1.name, v2.name);
                }
                else if(comparisonType.equals(ComparisonType.GREATER_THAN)) {
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

        LLVMGenerator.conditional_jump(labelStart,labelEnd);
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

        LLVMGenerator.conditional_jump(labelStart,labelEnd);
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

            FINALIZACJA I FUNKCJE POMOCNICZE

     */


    @Override
    public void enterProg(VSCLLParser.ProgContext ctx) {
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
        if (toCheck.startsWith("%"))
            toCheck = toCheck.substring(1);
        return variables.keySet().contains(toCheck);
    }

    public boolean isAlreadyDefined(String name, String scope) {
        if(tables.containsKey(name)) {
            Table table = tables.get(name);
            if(table.scope.equals(scope))
                return true;
        }
        else if (variables.containsKey(name)) {
            VariableInfo variableInfo = variables.get(variables);
            if(variableInfo.scope.equals(scope))
                return true;
        }
        return false;
    }

}
