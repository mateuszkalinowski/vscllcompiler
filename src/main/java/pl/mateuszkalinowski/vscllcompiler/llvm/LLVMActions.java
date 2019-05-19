package pl.mateuszkalinowski.vscllcompiler.llvm;

import pl.mateuszkalinowski.vscllcompiler.entities.Table;
import pl.mateuszkalinowski.vscllcompiler.entities.Value;
import pl.mateuszkalinowski.vscllcompiler.enums.VariableType;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLBaseListener;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLParser;

import java.util.HashMap;
import java.util.Stack;


public class LLVMActions extends VSCLLBaseListener {

    private Stack<Value> stack = new Stack<>();
    private HashMap<String, VariableType> variables = new HashMap<>();
    private HashMap<String, Table> tables = new HashMap<>();

    @Override
    public void exitDeclaration_variable(VSCLLParser.Declaration_variableContext ctx) {
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
        }
    }

    @Override
    public void exitDeclaration_text_pointer(VSCLLParser.Declaration_text_pointerContext ctx) {
        error(ctx.getStart().getLine(),"It must have provided size, or be initialized");
    }

    @Override
    public void exitDeclaration_array(VSCLLParser.Declaration_arrayContext ctx) {
        String size = ctx.index().INT().getText();
        String id = ctx.ID().getText();

        if(tables.containsKey(id) || variables.containsKey(id)) {
            error(ctx.getStart().getLine(), String.format("Variable '%s' already defined", ctx.ID().getText()));
            return;
        }

        if (ctx.var().getText().equals("int")) {
            LLVMGenerator.declare_i32_array(id, size);
            tables.put(id, new Table(size, VariableType.INT));
        }
        if (ctx.var().getText().equals("double")) {
            LLVMGenerator.declare_double_array(id, size);
            tables.put(id, new Table(size, VariableType.DOUBLE));
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
        }


        String ID = ctx.ID().getText();
        Value v = stack.pop();

        if (v.type == VariableType.INT) {

            if (isKnownVariable(v.name)) {
                LLVMGenerator.load_i32(v.name);
                LLVMGenerator.assign_i32(ID, "%" + (LLVMGenerator.reg - 1));
            } else {
                LLVMGenerator.assign_i32(ID, v.name);
            }
        }
        if (v.type == VariableType.DOUBLE) {


            if (isKnownVariable(v.name)) {
                LLVMGenerator.load_double(v.name);
                LLVMGenerator.assign_double(ID, "%" + (LLVMGenerator.reg - 1));
            } else {
                LLVMGenerator.assign_double(ID, v.name);
            }

        }
    }

    @Override
    public void exitDeclaration_with_initialization_text_pointer(VSCLLParser.Declaration_with_initialization_text_pointerContext ctx) {
        LLVMGenerator.declare_text_pointer(ctx.ID().getText());
        String text = ctx.STRING().getText();
        text = text.substring(1, text.length() - 1);
        LLVMGenerator.assign_text_pointer(ctx.ID().getText(), text);
        variables.put(ctx.ID().getText(), VariableType.TEXT_POINTER);

    }

    @Override
    public void exitExpresion_id(VSCLLParser.Expresion_idContext ctx) {

        if (variables.containsKey(ctx.getText())) {
            stack.push(new Value("%" + ctx.getText(), variables.get(ctx.getText())));
        } else {
            error(ctx.getStart().getLine(), String.format("Variable '%s' doesn't exist", ctx.getText()));
        }

    }

    @Override
    public void exitExpresion_double(VSCLLParser.Expresion_doubleContext ctx) {
        String number = ctx.getText();
        if (number.startsWith("(") && number.endsWith(")"))
            number = number.substring(1, number.length() - 1);
        stack.push(new Value(number, VariableType.DOUBLE));
    }

    @Override
    public void exitExpresion_int(VSCLLParser.Expresion_intContext ctx) {
        String number = ctx.getText();
        if (number.startsWith("(") && number.endsWith(")"))
            number = number.substring(1, number.length() - 1);
        stack.push(new Value(number, VariableType.INT));
    }

    @Override
    public void exitExpresion_to_double(VSCLLParser.Expresion_to_doubleContext ctx) {
        Value value = stack.pop();
        if (isKnownVariable(value.name)) {
            LLVMGenerator.load_i32(value.name);
            LLVMGenerator.sitofp("%" + (LLVMGenerator.reg - 1));
        } else {
            LLVMGenerator.sitofp(value.name);
        }
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VariableType.DOUBLE));
    }

    @Override
    public void exitExpresion_to_int(VSCLLParser.Expresion_to_intContext ctx) {
        Value value = stack.pop();
        if (isKnownVariable(value.name)) {
            LLVMGenerator.load_double(value.name);
            LLVMGenerator.fptosi("%" + (LLVMGenerator.reg - 1));
        } else {
            LLVMGenerator.fptosi(value.name);
        }
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VariableType.INT));
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
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VariableType.INT));
            }
            if (table.type.equals(VariableType.DOUBLE)) {
                LLVMGenerator.load_double_array(id, index, table.size);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VariableType.DOUBLE));
            }
        } else {
            error(ctx.getStart().getLine(), String.format("Table '%s' doesn't exists", id));
        }
    }

    @Override
    public void exitAdd(VSCLLParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {

            if (v1.type == VariableType.INT) {

                if (isKnownVariable(v1.name)) {
                    LLVMGenerator.load_i32(v1.name);
                    v1.name = "%" + (LLVMGenerator.reg - 1);
                }

                if (isKnownVariable(v2.name)) {
                    LLVMGenerator.load_i32(v2.name);
                    v2.name = "%" + (LLVMGenerator.reg - 1);
                }
            } else if (v1.type == VariableType.DOUBLE) {
                if (isKnownVariable(v1.name)) {
                    LLVMGenerator.load_double(v1.name);
                    v1.name = "%" + (LLVMGenerator.reg - 1);
                }

                if (isKnownVariable(v2.name)) {
                    LLVMGenerator.load_double(v2.name);
                    v2.name = "%" + (LLVMGenerator.reg - 1);
                }
            }


            if (v1.type == VariableType.INT) {
                LLVMGenerator.add_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VariableType.INT));
            }
            if (v1.type == VariableType.DOUBLE) {
                LLVMGenerator.add_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VariableType.DOUBLE));
            }
        } else {
            error(ctx.getStart().getLine(), "add type mismatch");
        }
    }

    @Override
    public void exitSubtract(VSCLLParser.SubtractContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {

            if (v1.type == VariableType.INT) {

                if (isKnownVariable(v1.name)) {
                    LLVMGenerator.load_i32(v1.name);
                    v1.name = "%" + (LLVMGenerator.reg - 1);
                }

                if (isKnownVariable(v2.name)) {
                    LLVMGenerator.load_i32(v2.name);
                    v2.name = "%" + (LLVMGenerator.reg - 1);
                }
            } else if (v1.type == VariableType.DOUBLE) {
                if (isKnownVariable(v1.name)) {
                    LLVMGenerator.load_double(v1.name);
                    v1.name = "%" + (LLVMGenerator.reg - 1);
                }

                if (isKnownVariable(v2.name)) {
                    LLVMGenerator.load_double(v2.name);
                    v2.name = "%" + (LLVMGenerator.reg - 1);
                }
            }


            if (v1.type == VariableType.INT) {
                LLVMGenerator.sub_i32(v2.name, v1.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VariableType.INT));
            }
            if (v1.type == VariableType.DOUBLE) {
                LLVMGenerator.sub_double(v2.name, v1.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VariableType.DOUBLE));
            }
        } else {
            error(ctx.getStart().getLine(), "subtract type mismatch");
        }
    }

    @Override
    public void exitMultiplicate(VSCLLParser.MultiplicateContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {

            if (v1.type == VariableType.INT) {

                if (isKnownVariable(v1.name)) {
                    LLVMGenerator.load_i32(v1.name);
                    v1.name = "%" + (LLVMGenerator.reg - 1);
                }

                if (isKnownVariable(v2.name)) {
                    LLVMGenerator.load_i32(v2.name);
                    v2.name = "%" + (LLVMGenerator.reg - 1);
                }
            } else if (v1.type == VariableType.DOUBLE) {
                if (isKnownVariable(v1.name)) {
                    LLVMGenerator.load_double(v1.name);
                    v1.name = "%" + (LLVMGenerator.reg - 1);
                }

                if (isKnownVariable(v2.name)) {
                    LLVMGenerator.load_double(v2.name);
                    v2.name = "%" + (LLVMGenerator.reg - 1);
                }
            }

            if (v1.type == VariableType.INT) {
                LLVMGenerator.mult_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VariableType.INT));
            }
            if (v1.type == VariableType.DOUBLE) {
                LLVMGenerator.mult_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VariableType.DOUBLE));
            }
        } else {
            error(ctx.getStart().getLine(), "mult type mismatch");
        }
    }

    @Override
    public void exitAssing_variable(VSCLLParser.Assing_variableContext ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();

        if (v.type == VariableType.INT) {


            if (isKnownVariable(v.name)) {
                LLVMGenerator.load_i32(v.name);
                LLVMGenerator.assign_i32(ID, "%" + (LLVMGenerator.reg - 1));
            } else {
                LLVMGenerator.assign_i32(ID, v.name);
            }
        }
        if (v.type == VariableType.DOUBLE) {


            if (isKnownVariable(v.name)) {
                LLVMGenerator.load_double(v.name);
                LLVMGenerator.assign_double(ID, "%" + (LLVMGenerator.reg - 1));
            } else {
                LLVMGenerator.assign_double(ID, v.name);
            }

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

        Value value = stack.pop();

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
                    LLVMGenerator.assign_i32_array(name, intIndex + "", value.name, table.size);
                }
                if (table.type.equals(VariableType.DOUBLE)) {
                    LLVMGenerator.assign_double_array(name, intIndex + "", value.name, table.size);
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
        Value currentValue = stack.pop();
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
        } else if (currentValue.type.equals(VariableType.TEXT_POINTER)) {
            LLVMGenerator.print_text_pointer(currentValue.name);
        }
    }

    @Override
    public void exitPrint_string(VSCLLParser.Print_stringContext ctx) {
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


}
