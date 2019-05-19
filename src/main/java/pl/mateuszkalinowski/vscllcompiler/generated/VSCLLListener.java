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
	 * Enter a parse tree produced by the {@code print_expression}
	 * labeled alternative in {@link VSCLLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expression(VSCLLParser.Print_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_expression}
	 * labeled alternative in {@link VSCLLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expression(VSCLLParser.Print_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_string}
	 * labeled alternative in {@link VSCLLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint_string(VSCLLParser.Print_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_string}
	 * labeled alternative in {@link VSCLLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint_string(VSCLLParser.Print_stringContext ctx);
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
	 * Enter a parse tree produced by {@link VSCLLParser#scand}.
	 * @param ctx the parse tree
	 */
	void enterScand(VSCLLParser.ScandContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#scand}.
	 * @param ctx the parse tree
	 */
	void exitScand(VSCLLParser.ScandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_variable}
	 * labeled alternative in {@link VSCLLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_variable(VSCLLParser.Declaration_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_variable}
	 * labeled alternative in {@link VSCLLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_variable(VSCLLParser.Declaration_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_text_pointer}
	 * labeled alternative in {@link VSCLLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_text_pointer(VSCLLParser.Declaration_text_pointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_text_pointer}
	 * labeled alternative in {@link VSCLLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_text_pointer(VSCLLParser.Declaration_text_pointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_with_initialization_variable}
	 * labeled alternative in {@link VSCLLParser#declaration_with_initialization}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_with_initialization_variable(VSCLLParser.Declaration_with_initialization_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_with_initialization_variable}
	 * labeled alternative in {@link VSCLLParser#declaration_with_initialization}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_with_initialization_variable(VSCLLParser.Declaration_with_initialization_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_with_initialization_text_pointer}
	 * labeled alternative in {@link VSCLLParser#declaration_with_initialization}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_with_initialization_text_pointer(VSCLLParser.Declaration_with_initialization_text_pointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_with_initialization_text_pointer}
	 * labeled alternative in {@link VSCLLParser#declaration_with_initialization}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_with_initialization_text_pointer(VSCLLParser.Declaration_with_initialization_text_pointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assing_variable}
	 * labeled alternative in {@link VSCLLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssing_variable(VSCLLParser.Assing_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assing_variable}
	 * labeled alternative in {@link VSCLLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssing_variable(VSCLLParser.Assing_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assing_text_pointer}
	 * labeled alternative in {@link VSCLLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssing_text_pointer(VSCLLParser.Assing_text_pointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assing_text_pointer}
	 * labeled alternative in {@link VSCLLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssing_text_pointer(VSCLLParser.Assing_text_pointerContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link VSCLLParser#text_pointer}.
	 * @param ctx the parse tree
	 */
	void enterText_pointer(VSCLLParser.Text_pointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSCLLParser#text_pointer}.
	 * @param ctx the parse tree
	 */
	void exitText_pointer(VSCLLParser.Text_pointerContext ctx);
}