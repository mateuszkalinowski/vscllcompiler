package pl.mateuszkalinowski.vscllcompiler.llvm;

import org.antlr.v4.runtime.tree.TerminalNode;
import pl.mateuszkalinowski.vscllcompiler.entities.Value;
import pl.mateuszkalinowski.vscllcompiler.enums.VariableType;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLBaseListener;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLParser;

import java.util.HashMap;
import java.util.Stack;


public class LLVMActions extends VSCLLBaseListener {

    Stack<Value> stack = new Stack<>();
    HashMap<String, VariableType> variables = new HashMap<>();


    @Override
    public void exitDeclaration(VSCLLParser.DeclarationContext ctx) {

        if (variables.keySet().contains(ctx.ID().getText())) {
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
        } else if (ctx.var().getText().equals("string")) {
            variables.put(ctx.ID().getText(), VariableType.EMPTY_STRING);
        }

    }




    @Override
    public void exitExpresion_id(VSCLLParser.Expresion_idContext ctx) {
        stack.push(new Value("%" + ctx.getText(), variables.get(ctx.getText())));
    }

    @Override
    public void exitExpresion_double(VSCLLParser.Expresion_doubleContext ctx) {
        stack.push(new Value(ctx.getText(), VariableType.DOUBLE));
    }

    @Override
    public void exitExpresion_int(VSCLLParser.Expresion_intContext ctx) {
        stack.push(new Value(ctx.getText(), VariableType.INT));
    }

    @Override
    public void exitAdd(VSCLLParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {

            if(isKnownVariable(v1.name)) {
                LLVMGenerator.load_i32(v1.name);
                v1.name = "%" + (LLVMGenerator.reg - 1);
            }

            if(isKnownVariable(v2.name)) {
                LLVMGenerator.load_i32(v2.name);
                v2.name = "%" + (LLVMGenerator.reg - 1);
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
    public void exitMultiplicate(VSCLLParser.MultiplicateContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VariableType.INT ){
                LLVMGenerator.mult_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VariableType.INT) );
            }
            if( v1.type == VariableType.DOUBLE ){
                LLVMGenerator.mult_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VariableType.DOUBLE) );
            }
        } else {
            error(ctx.getStart().getLine(), "mult type mismatch");
        }
    }

    @Override
    public void exitAssign(VSCLLParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();

        if( v.type == VariableType.INT ){


            if(isKnownVariable(v.name)) {
                LLVMGenerator.load_i32(v.name);
                LLVMGenerator.assign_i32(ID, "%" + (LLVMGenerator.reg - 1));
            }
            else {
                LLVMGenerator.assign_i32(ID, v.name);
            }
        }
        if( v.type == VariableType.DOUBLE ){


            if(isKnownVariable(v.name)) {
                LLVMGenerator.load_double(v.name);
                LLVMGenerator.assign_double(ID, "%" + (LLVMGenerator.reg - 1));
            }
            else {
                LLVMGenerator.assign_double(ID, v.name);
            }

        }
    }


    @Override
    public void exitPrint(VSCLLParser.PrintContext ctx) {
        Value currentValue = stack.pop();
        if(currentValue.type.equals(VariableType.INT)) {

            if(variables.keySet().contains(currentValue.name.replaceFirst("%",""))) {
                LLVMGenerator.print_i32(currentValue.name);
            }
            else {
                LLVMGenerator.assign_i32("tmpi",currentValue.name);
                LLVMGenerator.print_i32("%tmpi");
            }
        }
        else if(currentValue.type.equals(VariableType.DOUBLE)) {

            if(variables.keySet().contains(currentValue.name.replaceFirst("%",""))) {
                LLVMGenerator.print_double(currentValue.name);
            }
            else {
                LLVMGenerator.assign_double("tmpd",currentValue.name);
                LLVMGenerator.print_double("%tmpd");
            }
        }
    }

    @Override
    public void exitProg(VSCLLParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }


    void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }

    private boolean isKnownVariable(String toCheck) {
        if(toCheck.startsWith("%"))
            toCheck = toCheck.substring(1);
        if(variables.keySet().contains(toCheck))
            return true;
        return false;
    }


}
