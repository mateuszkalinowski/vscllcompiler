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
	 * Enter a parse tree produced by {@link VSCLLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(VSCLLParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(VSCLLParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAdd(VSCLLParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAdd(VSCLLParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expresion_id}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_id(VSCLLParser.Expresion_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresion_id}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_id(VSCLLParser.Expresion_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expresion_to_double}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_to_double(VSCLLParser.Expresion_to_doubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresion_to_double}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_to_double(VSCLLParser.Expresion_to_doubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expresion_to_int}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_to_int(VSCLLParser.Expresion_to_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresion_to_int}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_to_int(VSCLLParser.Expresion_to_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expresion_double}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_double(VSCLLParser.Expresion_doubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresion_double}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_double(VSCLLParser.Expresion_doubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expresion_int}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_int(VSCLLParser.Expresion_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresion_int}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_int(VSCLLParser.Expresion_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expresion_string}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_string(VSCLLParser.Expresion_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresion_string}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_string(VSCLLParser.Expresion_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(VSCLLParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(VSCLLParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divide}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterDivide(VSCLLParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitDivide(VSCLLParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicate}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicate(VSCLLParser.MultiplicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicate}
	 * labeled alternative in {@link VSCLLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicate(VSCLLParser.MultiplicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(VSCLLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(VSCLLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#scani}.
	 * @param ctx the parse tree
	 */
	void enterScani(VSCLLParser.ScaniContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#scani}.
	 * @param ctx the parse tree
	 */
	void exitScani(VSCLLParser.ScaniContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(VSCLLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(VSCLLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#declaration_with_initialization}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_with_initialization(VSCLLParser.Declaration_with_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#declaration_with_initialization}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_with_initialization(VSCLLParser.Declaration_with_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(VSCLLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(VSCLLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(VSCLLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(VSCLLParser.VarContext ctx);
}