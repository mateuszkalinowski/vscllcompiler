// Generated from /Users/mateusz/Projects/vscllcompiler/src/main/resources/grammar/VSCLL.g4 by ANTLR 4.7.2
package pl.mateuszkalinowski.vscllcompiler.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VSCLLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		TOINT=25, TODOUBLE=26, STRING=27, CHARACTER=28, ID=29, INT=30, DOUBLE=31, 
		NEWLINE=32, WS=33, SC=34;
	public static final int
		RULE_prog = 0, RULE_if_block = 1, RULE_while_block = 2, RULE_stat = 3, 
		RULE_if_statement = 4, RULE_while_statement = 5, RULE_condition = 6, RULE_expression = 7, 
		RULE_print = 8, RULE_prints = 9, RULE_scani = 10, RULE_scand = 11, RULE_declaration = 12, 
		RULE_declaration_with_initialization = 13, RULE_assign = 14, RULE_var = 15, 
		RULE_text_pointer = 16, RULE_index = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "if_block", "while_block", "stat", "if_statement", "while_statement", 
			"condition", "expression", "print", "prints", "scani", "scand", "declaration", 
			"declaration_with_initialization", "assign", "var", "text_pointer", "index"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'('", "')'", "'{'", "'}'", "'while'", "'<'", "'>'", "'=='", 
			"'*'", "'/'", "'+'", "'-'", "'print'", "'prints'", "'scani'", "'scand'", 
			"'[]'", "'='", "'int'", "'double'", "'char'", "'['", "']'", "'(int)'", 
			"'(double)'", null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "TOINT", "TODOUBLE", "STRING", "CHARACTER", "ID", "INT", "DOUBLE", 
			"NEWLINE", "WS", "SC"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VSCLL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VSCLLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(VSCLLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VSCLLParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
					{
					setState(36);
					stat();
					}
				}

				setState(39);
				match(NEWLINE);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_blockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(VSCLLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VSCLLParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitIf_block(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
					{
					setState(45);
					stat();
					}
				}

				setState(48);
				match(NEWLINE);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_blockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(VSCLLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VSCLLParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterWhile_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitWhile_block(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_while_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
					{
					setState(54);
					stat();
					}
				}

				setState(57);
				match(NEWLINE);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode SC() { return getToken(VSCLLParser.SC, 0); }
		public PrintsContext prints() {
			return getRuleContext(PrintsContext.class,0);
		}
		public ScaniContext scani() {
			return getRuleContext(ScaniContext.class,0);
		}
		public ScandContext scand() {
			return getRuleContext(ScandContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Declaration_with_initializationContext declaration_with_initialization() {
			return getRuleContext(Declaration_with_initializationContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				print();
				setState(64);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				prints();
				setState(67);
				match(SC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				scani();
				setState(70);
				match(SC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				scand();
				setState(73);
				match(SC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				declaration();
				setState(76);
				match(SC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				declaration_with_initialization();
				setState(79);
				match(SC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				assign();
				setState(82);
				match(SC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				while_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__0);
			setState(89);
			match(T__1);
			setState(90);
			condition();
			setState(91);
			match(T__2);
			setState(92);
			match(T__3);
			setState(93);
			if_block();
			setState(94);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__5);
			setState(97);
			match(T__1);
			setState(98);
			condition();
			setState(99);
			match(T__2);
			setState(100);
			match(T__3);
			setState(101);
			while_block();
			setState(102);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Condition_less_thanContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Condition_less_thanContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterCondition_less_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitCondition_less_than(this);
		}
	}
	public static class Condition_greater_thanContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Condition_greater_thanContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterCondition_greater_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitCondition_greater_than(this);
		}
	}
	public static class Condition_equalContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Condition_equalContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterCondition_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitCondition_equal(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Condition_less_thanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				expression(0);
				setState(105);
				match(T__6);
				setState(106);
				expression(0);
				}
				break;
			case 2:
				_localctx = new Condition_greater_thanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				expression(0);
				setState(109);
				match(T__7);
				setState(110);
				expression(0);
				}
				break;
			case 3:
				_localctx = new Condition_equalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				expression(0);
				setState(113);
				match(T__8);
				setState(114);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitAdd(this);
		}
	}
	public static class Expression_characterContext extends ExpressionContext {
		public TerminalNode CHARACTER() { return getToken(VSCLLParser.CHARACTER, 0); }
		public Expression_characterContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpression_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpression_character(this);
		}
	}
	public static class Expression_intContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(VSCLLParser.INT, 0); }
		public Expression_intContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpression_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpression_int(this);
		}
	}
	public static class SubtractContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubtractContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitSubtract(this);
		}
	}
	public static class Expression_to_doubleContext extends ExpressionContext {
		public TerminalNode TODOUBLE() { return getToken(VSCLLParser.TODOUBLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_to_doubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpression_to_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpression_to_double(this);
		}
	}
	public static class DivideContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivideContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitDivide(this);
		}
	}
	public static class Expression_to_intContext extends ExpressionContext {
		public TerminalNode TOINT() { return getToken(VSCLLParser.TOINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_to_intContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpression_to_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpression_to_int(this);
		}
	}
	public static class Expression_indexContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Expression_indexContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpression_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpression_index(this);
		}
	}
	public static class Expression_idContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public Expression_idContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpression_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpression_id(this);
		}
	}
	public static class Expression_doubleContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(VSCLLParser.DOUBLE, 0); }
		public Expression_doubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpression_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpression_double(this);
		}
	}
	public static class MultiplicateContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterMultiplicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitMultiplicate(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new Expression_to_doubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				match(TODOUBLE);
				setState(120);
				expression(11);
				}
				break;
			case 2:
				{
				_localctx = new Expression_to_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(TOINT);
				setState(122);
				expression(10);
				}
				break;
			case 3:
				{
				_localctx = new Expression_indexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(ID);
				setState(124);
				index();
				}
				break;
			case 4:
				{
				_localctx = new Expression_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new Expression_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new Expression_doubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(DOUBLE);
				}
				break;
			case 7:
				{
				_localctx = new Expression_characterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(CHARACTER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicateContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(132);
						match(T__9);
						setState(133);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(135);
						match(T__10);
						setState(136);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(138);
						match(T__11);
						setState(139);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new SubtractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(141);
						match(T__12);
						setState(142);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Print_expressionContext extends PrintContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_expressionContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterPrint_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitPrint_expression(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		try {
			_localctx = new Print_expressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__13);
			setState(149);
			match(T__1);
			setState(150);
			expression(0);
			setState(151);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintsContext extends ParserRuleContext {
		public PrintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prints; }
	 
		public PrintsContext() { }
		public void copyFrom(PrintsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Prints_stringContext extends PrintsContext {
		public TerminalNode STRING() { return getToken(VSCLLParser.STRING, 0); }
		public Prints_stringContext(PrintsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterPrints_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitPrints_string(this);
		}
	}
	public static class Prints_idContext extends PrintsContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public Prints_idContext(PrintsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterPrints_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitPrints_id(this);
		}
	}
	public static class Prints_id_indexContext extends PrintsContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Prints_id_indexContext(PrintsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterPrints_id_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitPrints_id_index(this);
		}
	}

	public final PrintsContext prints() throws RecognitionException {
		PrintsContext _localctx = new PrintsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prints);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Prints_stringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__14);
				setState(154);
				match(T__1);
				setState(155);
				match(STRING);
				setState(156);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new Prints_idContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__14);
				setState(158);
				match(T__1);
				setState(159);
				match(ID);
				setState(160);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new Prints_id_indexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(T__14);
				setState(162);
				match(T__1);
				setState(163);
				match(ID);
				setState(164);
				index();
				setState(165);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaniContext extends ParserRuleContext {
		public ScaniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scani; }
	 
		public ScaniContext() { }
		public void copyFrom(ScaniContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Scani_idContext extends ScaniContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public Scani_idContext(ScaniContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterScani_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitScani_id(this);
		}
	}
	public static class Scani_arrayContext extends ScaniContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Scani_arrayContext(ScaniContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterScani_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitScani_array(this);
		}
	}

	public final ScaniContext scani() throws RecognitionException {
		ScaniContext _localctx = new ScaniContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_scani);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Scani_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__15);
				setState(170);
				match(T__1);
				setState(171);
				match(ID);
				setState(172);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new Scani_arrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__15);
				setState(174);
				match(T__1);
				setState(175);
				match(ID);
				setState(176);
				index();
				setState(177);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScandContext extends ParserRuleContext {
		public ScandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scand; }
	 
		public ScandContext() { }
		public void copyFrom(ScandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Scand_idContext extends ScandContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public Scand_idContext(ScandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterScand_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitScand_id(this);
		}
	}
	public static class Scand_arrayContext extends ScandContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Scand_arrayContext(ScandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterScand_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitScand_array(this);
		}
	}

	public final ScandContext scand() throws RecognitionException {
		ScandContext _localctx = new ScandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_scand);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Scand_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__16);
				setState(182);
				match(T__1);
				setState(183);
				match(ID);
				setState(184);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new Scand_arrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(T__16);
				setState(186);
				match(T__1);
				setState(187);
				match(ID);
				setState(188);
				index();
				setState(189);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declaration_variableContext extends DeclarationContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public Declaration_variableContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterDeclaration_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitDeclaration_variable(this);
		}
	}
	public static class Declaration_text_pointerContext extends DeclarationContext {
		public Text_pointerContext text_pointer() {
			return getRuleContext(Text_pointerContext.class,0);
		}
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public Declaration_text_pointerContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterDeclaration_text_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitDeclaration_text_pointer(this);
		}
	}
	public static class Declaration_arrayContext extends DeclarationContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Declaration_arrayContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterDeclaration_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitDeclaration_array(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Declaration_variableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				var();
				setState(194);
				match(ID);
				}
				break;
			case 2:
				_localctx = new Declaration_text_pointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				text_pointer();
				setState(197);
				match(ID);
				setState(198);
				match(T__17);
				}
				break;
			case 3:
				_localctx = new Declaration_arrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				var();
				setState(201);
				match(ID);
				setState(202);
				index();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_with_initializationContext extends ParserRuleContext {
		public Declaration_with_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_with_initialization; }
	 
		public Declaration_with_initializationContext() { }
		public void copyFrom(Declaration_with_initializationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declaration_with_initialization_variableContext extends Declaration_with_initializationContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Declaration_with_initialization_variableContext(Declaration_with_initializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterDeclaration_with_initialization_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitDeclaration_with_initialization_variable(this);
		}
	}
	public static class Declaration_with_initialization_text_pointerContext extends Declaration_with_initializationContext {
		public Text_pointerContext text_pointer() {
			return getRuleContext(Text_pointerContext.class,0);
		}
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public TerminalNode STRING() { return getToken(VSCLLParser.STRING, 0); }
		public Declaration_with_initialization_text_pointerContext(Declaration_with_initializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterDeclaration_with_initialization_text_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitDeclaration_with_initialization_text_pointer(this);
		}
	}

	public final Declaration_with_initializationContext declaration_with_initialization() throws RecognitionException {
		Declaration_with_initializationContext _localctx = new Declaration_with_initializationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration_with_initialization);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new Declaration_with_initialization_variableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				var();
				setState(207);
				match(ID);
				setState(208);
				match(T__18);
				setState(209);
				expression(0);
				}
				break;
			case 2:
				_localctx = new Declaration_with_initialization_text_pointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				text_pointer();
				setState(212);
				match(ID);
				setState(213);
				match(T__17);
				setState(214);
				match(T__18);
				setState(215);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assing_variableContext extends AssignContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assing_variableContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterAssing_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitAssing_variable(this);
		}
	}
	public static class Assing_to_arrayContext extends AssignContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assing_to_arrayContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterAssing_to_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitAssing_to_array(this);
		}
	}
	public static class Assing_text_pointerContext extends AssignContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public TerminalNode STRING() { return getToken(VSCLLParser.STRING, 0); }
		public Assing_text_pointerContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterAssing_text_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitAssing_text_pointer(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assign);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Assing_variableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(ID);
				setState(220);
				match(T__18);
				setState(221);
				expression(0);
				}
				break;
			case 2:
				_localctx = new Assing_text_pointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(ID);
				setState(223);
				match(T__18);
				setState(224);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new Assing_to_arrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(ID);
				setState(226);
				index();
				setState(227);
				match(T__18);
				setState(228);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Text_pointerContext extends ParserRuleContext {
		public Text_pointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterText_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitText_pointer(this);
		}
	}

	public final Text_pointerContext text_pointer() throws RecognitionException {
		Text_pointerContext _localctx = new Text_pointerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_text_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(VSCLLParser.INT, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__22);
			setState(237);
			match(INT);
			setState(238);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\5\2(\n\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\3\5\3\61\n\3\3\3"+
		"\7\3\64\n\3\f\3\16\3\67\13\3\3\4\5\4:\n\4\3\4\7\4=\n\4\f\4\16\4@\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bw\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0092\n\t\f\t\16"+
		"\t\u0095\13\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00aa\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00b6\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00c2\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00cf\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00dc\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00e9\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\2\3"+
		"\20\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2\26\30\2\u0103"+
		"\2,\3\2\2\2\4\65\3\2\2\2\6>\3\2\2\2\bX\3\2\2\2\nZ\3\2\2\2\fb\3\2\2\2\16"+
		"v\3\2\2\2\20\u0083\3\2\2\2\22\u0096\3\2\2\2\24\u00a9\3\2\2\2\26\u00b5"+
		"\3\2\2\2\30\u00c1\3\2\2\2\32\u00ce\3\2\2\2\34\u00db\3\2\2\2\36\u00e8\3"+
		"\2\2\2 \u00ea\3\2\2\2\"\u00ec\3\2\2\2$\u00ee\3\2\2\2&(\5\b\5\2\'&\3\2"+
		"\2\2\'(\3\2\2\2()\3\2\2\2)+\7\"\2\2*\'\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3"+
		"\2\2\2-\3\3\2\2\2.,\3\2\2\2/\61\5\b\5\2\60/\3\2\2\2\60\61\3\2\2\2\61\62"+
		"\3\2\2\2\62\64\7\"\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66"+
		"\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\28:\5\b\5\298\3\2\2\29:\3\2\2\2:;\3"+
		"\2\2\2;=\7\"\2\2<9\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\7\3\2\2\2@>"+
		"\3\2\2\2AB\5\22\n\2BC\7$\2\2CY\3\2\2\2DE\5\24\13\2EF\7$\2\2FY\3\2\2\2"+
		"GH\5\26\f\2HI\7$\2\2IY\3\2\2\2JK\5\30\r\2KL\7$\2\2LY\3\2\2\2MN\5\32\16"+
		"\2NO\7$\2\2OY\3\2\2\2PQ\5\34\17\2QR\7$\2\2RY\3\2\2\2ST\5\36\20\2TU\7$"+
		"\2\2UY\3\2\2\2VY\5\n\6\2WY\5\f\7\2XA\3\2\2\2XD\3\2\2\2XG\3\2\2\2XJ\3\2"+
		"\2\2XM\3\2\2\2XP\3\2\2\2XS\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\t\3\2\2\2Z[\7"+
		"\3\2\2[\\\7\4\2\2\\]\5\16\b\2]^\7\5\2\2^_\7\6\2\2_`\5\4\3\2`a\7\7\2\2"+
		"a\13\3\2\2\2bc\7\b\2\2cd\7\4\2\2de\5\16\b\2ef\7\5\2\2fg\7\6\2\2gh\5\6"+
		"\4\2hi\7\7\2\2i\r\3\2\2\2jk\5\20\t\2kl\7\t\2\2lm\5\20\t\2mw\3\2\2\2no"+
		"\5\20\t\2op\7\n\2\2pq\5\20\t\2qw\3\2\2\2rs\5\20\t\2st\7\13\2\2tu\5\20"+
		"\t\2uw\3\2\2\2vj\3\2\2\2vn\3\2\2\2vr\3\2\2\2w\17\3\2\2\2xy\b\t\1\2yz\7"+
		"\34\2\2z\u0084\5\20\t\r{|\7\33\2\2|\u0084\5\20\t\f}~\7\37\2\2~\u0084\5"+
		"$\23\2\177\u0084\7\37\2\2\u0080\u0084\7 \2\2\u0081\u0084\7!\2\2\u0082"+
		"\u0084\7\36\2\2\u0083x\3\2\2\2\u0083{\3\2\2\2\u0083}\3\2\2\2\u0083\177"+
		"\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0093\3\2\2\2\u0085\u0086\f\13\2\2\u0086\u0087\7\f\2\2\u0087\u0092\5"+
		"\20\t\f\u0088\u0089\f\n\2\2\u0089\u008a\7\r\2\2\u008a\u0092\5\20\t\13"+
		"\u008b\u008c\f\t\2\2\u008c\u008d\7\16\2\2\u008d\u0092\5\20\t\n\u008e\u008f"+
		"\f\b\2\2\u008f\u0090\7\17\2\2\u0090\u0092\5\20\t\t\u0091\u0085\3\2\2\2"+
		"\u0091\u0088\3\2\2\2\u0091\u008b\3\2\2\2\u0091\u008e\3\2\2\2\u0092\u0095"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\21\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0097\7\20\2\2\u0097\u0098\7\4\2\2\u0098\u0099\5"+
		"\20\t\2\u0099\u009a\7\5\2\2\u009a\23\3\2\2\2\u009b\u009c\7\21\2\2\u009c"+
		"\u009d\7\4\2\2\u009d\u009e\7\35\2\2\u009e\u00aa\7\5\2\2\u009f\u00a0\7"+
		"\21\2\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\7\37\2\2\u00a2\u00aa\7\5\2\2\u00a3"+
		"\u00a4\7\21\2\2\u00a4\u00a5\7\4\2\2\u00a5\u00a6\7\37\2\2\u00a6\u00a7\5"+
		"$\23\2\u00a7\u00a8\7\5\2\2\u00a8\u00aa\3\2\2\2\u00a9\u009b\3\2\2\2\u00a9"+
		"\u009f\3\2\2\2\u00a9\u00a3\3\2\2\2\u00aa\25\3\2\2\2\u00ab\u00ac\7\22\2"+
		"\2\u00ac\u00ad\7\4\2\2\u00ad\u00ae\7\37\2\2\u00ae\u00b6\7\5\2\2\u00af"+
		"\u00b0\7\22\2\2\u00b0\u00b1\7\4\2\2\u00b1\u00b2\7\37\2\2\u00b2\u00b3\5"+
		"$\23\2\u00b3\u00b4\7\5\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5"+
		"\u00af\3\2\2\2\u00b6\27\3\2\2\2\u00b7\u00b8\7\23\2\2\u00b8\u00b9\7\4\2"+
		"\2\u00b9\u00ba\7\37\2\2\u00ba\u00c2\7\5\2\2\u00bb\u00bc\7\23\2\2\u00bc"+
		"\u00bd\7\4\2\2\u00bd\u00be\7\37\2\2\u00be\u00bf\5$\23\2\u00bf\u00c0\7"+
		"\5\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c2"+
		"\31\3\2\2\2\u00c3\u00c4\5 \21\2\u00c4\u00c5\7\37\2\2\u00c5\u00cf\3\2\2"+
		"\2\u00c6\u00c7\5\"\22\2\u00c7\u00c8\7\37\2\2\u00c8\u00c9\7\24\2\2\u00c9"+
		"\u00cf\3\2\2\2\u00ca\u00cb\5 \21\2\u00cb\u00cc\7\37\2\2\u00cc\u00cd\5"+
		"$\23\2\u00cd\u00cf\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce"+
		"\u00ca\3\2\2\2\u00cf\33\3\2\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\7\37\2"+
		"\2\u00d2\u00d3\7\25\2\2\u00d3\u00d4\5\20\t\2\u00d4\u00dc\3\2\2\2\u00d5"+
		"\u00d6\5\"\22\2\u00d6\u00d7\7\37\2\2\u00d7\u00d8\7\24\2\2\u00d8\u00d9"+
		"\7\25\2\2\u00d9\u00da\7\35\2\2\u00da\u00dc\3\2\2\2\u00db\u00d0\3\2\2\2"+
		"\u00db\u00d5\3\2\2\2\u00dc\35\3\2\2\2\u00dd\u00de\7\37\2\2\u00de\u00df"+
		"\7\25\2\2\u00df\u00e9\5\20\t\2\u00e0\u00e1\7\37\2\2\u00e1\u00e2\7\25\2"+
		"\2\u00e2\u00e9\7\35\2\2\u00e3\u00e4\7\37\2\2\u00e4\u00e5\5$\23\2\u00e5"+
		"\u00e6\7\25\2\2\u00e6\u00e7\5\20\t\2\u00e7\u00e9\3\2\2\2\u00e8\u00dd\3"+
		"\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9\37\3\2\2\2\u00ea"+
		"\u00eb\t\2\2\2\u00eb!\3\2\2\2\u00ec\u00ed\7\30\2\2\u00ed#\3\2\2\2\u00ee"+
		"\u00ef\7\31\2\2\u00ef\u00f0\7 \2\2\u00f0\u00f1\7\32\2\2\u00f1%\3\2\2\2"+
		"\23\',\60\659>Xv\u0083\u0091\u0093\u00a9\u00b5\u00c1\u00ce\u00db\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}