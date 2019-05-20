package pl.mateuszkalinowski.vscllcompiler;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pl.mateuszkalinowski.vscllcompiler.exceptions.PreprocessorException;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLLexer;
import pl.mateuszkalinowski.vscllcompiler.generated.VSCLLParser;
import pl.mateuszkalinowski.vscllcompiler.llvm.LLVMActions;
import pl.mateuszkalinowski.vscllcompiler.preprocessor.Preprocessor;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {



        if(args.length == 0 ) {
            System.out.println("Provide file to compile");
            return;
        }

        File checkIfExist = new File(args[0]);
        if(checkIfExist.exists() && !checkIfExist.isDirectory()) {
            try {
                String pathToFileAfterPreprocessing = Preprocessor.preprocessor(args[0]);

                ANTLRFileStream input = new ANTLRFileStream(pathToFileAfterPreprocessing);

                VSCLLLexer lexer = new VSCLLLexer(input);

                CommonTokenStream tokens = new CommonTokenStream(lexer);
                VSCLLParser parser = new VSCLLParser(tokens);

                ParseTree tree = parser.prog();

                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(new LLVMActions(), tree);
            } catch (PreprocessorException e) {
                System.out.println(String.format("Preproccesor Exception: %s",e.getMessage()));
            }
        }
        else {
            System.out.println(String.format("File '%s' doesn't exist",args[0]));
        }


    }
}
