package pl.mateuszkalinowski.vscllcompiler;// Intro to ANTLR+LLVM
// sawickib, 2014-04-26

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLLexer;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLParser;
import pl.mateuszkalinowski.vscllcompiler.llvm.LLVMActions;


public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream(args[0]);

        VSCLLLexer lexer = new VSCLLLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VSCLLParser parser = new VSCLLParser(tokens);

        ParseTree tree = parser.prog();

        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);

    }
}
