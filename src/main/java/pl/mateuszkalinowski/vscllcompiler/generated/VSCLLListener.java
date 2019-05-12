// Generated from /Users/mateusz/Projects/vscllcompiler/src/main/resources/grammar/VSCLL.g4 by ANTLR 4.7.2
package pl.mateuszkalinowski.vscllcompiler.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VSCLLParser}.
 */
public interface VSCLLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(VSCLLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(VSCLLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link VSCLLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(VSCLLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link VSCLLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(VSCLLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link VSCLLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(VSCLLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link VSCLLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(VSCLLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(VSCLLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(VSCLLParser.ValueContext ctx);
}