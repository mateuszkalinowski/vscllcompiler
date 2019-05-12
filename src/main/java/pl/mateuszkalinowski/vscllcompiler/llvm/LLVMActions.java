package pl.mateuszkalinowski.vscllcompiler.llvm;

import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLBaseListener;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLParser;

import java.util.HashMap;

public class LLVMActions extends VSCLLBaseListener {

    HashMap<String, String> memory = new HashMap<String, String>();
    String value;

    @Override
    public void exitAssign(VSCLLParser.AssignContext ctx) {
       String tmp = ctx.STRING().getText();
       tmp = tmp.substring(1, tmp.length()-1);
       memory.put(ctx.ID().getText(), tmp);
    }

    @Override
    public void exitProg(VSCLLParser.ProgContext ctx) {
       System.out.println( LLVMGenerator.generate() );
    }

    @Override
    public void exitValue(VSCLLParser.ValueContext ctx) {
       if( ctx.ID() != null ){
          value = memory.get(ctx.ID().getText());
       }
       if( ctx.STRING() != null ){
          String tmp = ctx.STRING().getText();
          value = tmp.substring(1, tmp.length()-1);
       }
    }

    @Override
    public void exitPrint(VSCLLParser.PrintContext ctx) {
       LLVMGenerator.print(value);
    }

}
