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
		T__24=25, T__25=26, T__26=27, TOINT=28, TODOUBLE=29, STRING=30, CHARACTER=31, 
		ID=32, INT=33, DOUBLE=34, NEWLINE=35, WS=36, SC=37;
	public static final int
		RULE_prog = 0, RULE_if_block = 1, RULE_while_block = 2, RULE_function_block = 3, 
		RULE_stat = 4, RULE_function = 5, RULE_if_statement = 6, RULE_return_statement = 7, 
		RULE_while_statement = 8, RULE_function_parameters = 9, RULE_function_parameter = 10, 
		RULE_condition = 11, RULE_expression = 12, RULE_print = 13, RULE_prints = 14, 
		RULE_scani = 15, RULE_scand = 16, RULE_declaration = 17, RULE_declaration_with_initialization = 18, 
		RULE_assign = 19, RULE_var = 20, RULE_function_type = 21, RULE_text_pointer = 22, 
		RULE_index = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "if_block", "while_block", "function_block", "stat", "function", 
			"if_statement", "return_statement", "while_statement", "function_parameters", 
			"function_parameter", "condition", "expression", "print", "prints", "scani", 
			"scand", "declaration", "declaration_with_initialization", "assign", 
			"var", "function_type", "text_pointer", "index"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'if'", "'return'", "'while'", "','", 
			"'<'", "'>'", "'=='", "'*'", "'/'", "'+'", "'-'", "'print'", "'prints'", 
			"'scani'", "'scand'", "'[]'", "'='", "'int'", "'double'", "'char'", "'void'", 
			"'['", "']'", "'(int)'", "'(double)'", null, null, null, null, null, 
			null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TOINT", "TODOUBLE", "STRING", "CHARACTER", "ID", 
			"INT", "DOUBLE", "NEWLINE", "WS", "SC"
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__24))) != 0)) {
					{
					setState(48);
					function();
					}
				}

				setState(51);
				match(NEWLINE);
				}
				}
				setState(56);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
					{
					setState(57);
					stat();
					}
				}

				setState(60);
				match(NEWLINE);
				}
				}
				setState(65);
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
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
					{
					setState(66);
					stat();
					}
				}

				setState(69);
				match(NEWLINE);
				}
				}
				setState(74);
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

	public static class Function_blockContext extends ParserRuleContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode SC() { return getToken(VSCLLParser.SC, 0); }
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
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitFunction_block(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID))) != 0)) {
					{
					setState(75);
					stat();
					}
				}

				setState(78);
				match(NEWLINE);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			return_statement();
			setState(85);
			match(SC);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(86);
				match(NEWLINE);
				}
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
		enterRule(_localctx, 8, RULE_stat);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				print();
				setState(90);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				prints();
				setState(93);
				match(SC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				scani();
				setState(96);
				match(SC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				scand();
				setState(99);
				match(SC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				declaration();
				setState(102);
				match(SC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				declaration_with_initialization();
				setState(105);
				match(SC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				assign();
				setState(108);
				match(SC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(110);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(111);
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

	public static class FunctionContext extends ParserRuleContext {
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			function_type();
			setState(115);
			match(ID);
			setState(116);
			match(T__0);
			setState(117);
			function_parameters();
			setState(118);
			match(T__1);
			setState(119);
			match(T__2);
			setState(120);
			function_block();
			setState(121);
			match(T__3);
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
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__4);
			setState(124);
			match(T__0);
			setState(125);
			condition();
			setState(126);
			match(T__1);
			setState(127);
			match(T__2);
			setState(128);
			if_block();
			setState(129);
			match(T__3);
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

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__5);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOINT) | (1L << TODOUBLE) | (1L << CHARACTER) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				setState(132);
				expression(0);
				}
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
		enterRule(_localctx, 16, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__6);
			setState(136);
			match(T__0);
			setState(137);
			condition();
			setState(138);
			match(T__1);
			setState(139);
			match(T__2);
			setState(140);
			while_block();
			setState(141);
			match(T__3);
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

	public static class Function_parametersContext extends ParserRuleContext {
		public Function_parameterContext function_parameter() {
			return getRuleContext(Function_parameterContext.class,0);
		}
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitFunction_parameters(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_parameters);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				function_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				function_parameter();
				setState(145);
				match(T__7);
				setState(146);
				function_parameters();
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

	public static class Function_parameterContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public Function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterFunction_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitFunction_parameter(this);
		}
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_parameter);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				var();
				setState(151);
				match(ID);
				}
				break;
			case T__1:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 22, RULE_condition);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Condition_less_thanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				expression(0);
				setState(157);
				match(T__8);
				setState(158);
				expression(0);
				}
				break;
			case 2:
				_localctx = new Condition_greater_thanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				expression(0);
				setState(161);
				match(T__9);
				setState(162);
				expression(0);
				}
				break;
			case 3:
				_localctx = new Condition_equalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				expression(0);
				setState(165);
				match(T__10);
				setState(166);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new Expression_to_doubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				match(TODOUBLE);
				setState(172);
				expression(11);
				}
				break;
			case 2:
				{
				_localctx = new Expression_to_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(TOINT);
				setState(174);
				expression(10);
				}
				break;
			case 3:
				{
				_localctx = new Expression_indexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(ID);
				setState(176);
				index();
				}
				break;
			case 4:
				{
				_localctx = new Expression_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new Expression_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new Expression_doubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(DOUBLE);
				}
				break;
			case 7:
				{
				_localctx = new Expression_characterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(CHARACTER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicateContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(184);
						match(T__11);
						setState(185);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(187);
						match(T__12);
						setState(188);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(190);
						match(T__13);
						setState(191);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new SubtractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(193);
						match(T__14);
						setState(194);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 26, RULE_print);
		try {
			_localctx = new Print_expressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__15);
			setState(201);
			match(T__0);
			setState(202);
			expression(0);
			setState(203);
			match(T__1);
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
		enterRule(_localctx, 28, RULE_prints);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Prints_stringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__16);
				setState(206);
				match(T__0);
				setState(207);
				match(STRING);
				setState(208);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new Prints_idContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__16);
				setState(210);
				match(T__0);
				setState(211);
				match(ID);
				setState(212);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new Prints_id_indexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__16);
				setState(214);
				match(T__0);
				setState(215);
				match(ID);
				setState(216);
				index();
				setState(217);
				match(T__1);
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
		enterRule(_localctx, 30, RULE_scani);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new Scani_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(T__17);
				setState(222);
				match(T__0);
				setState(223);
				match(ID);
				setState(224);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new Scani_arrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__17);
				setState(226);
				match(T__0);
				setState(227);
				match(ID);
				setState(228);
				index();
				setState(229);
				match(T__1);
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
		enterRule(_localctx, 32, RULE_scand);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Scand_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T__18);
				setState(234);
				match(T__0);
				setState(235);
				match(ID);
				setState(236);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new Scand_arrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(T__18);
				setState(238);
				match(T__0);
				setState(239);
				match(ID);
				setState(240);
				index();
				setState(241);
				match(T__1);
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
		enterRule(_localctx, 34, RULE_declaration);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new Declaration_variableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				var();
				setState(246);
				match(ID);
				}
				break;
			case 2:
				_localctx = new Declaration_text_pointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				text_pointer();
				setState(249);
				match(ID);
				setState(250);
				match(T__19);
				}
				break;
			case 3:
				_localctx = new Declaration_arrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				var();
				setState(253);
				match(ID);
				setState(254);
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
		enterRule(_localctx, 36, RULE_declaration_with_initialization);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Declaration_with_initialization_variableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				var();
				setState(259);
				match(ID);
				setState(260);
				match(T__20);
				setState(261);
				expression(0);
				}
				break;
			case 2:
				_localctx = new Declaration_with_initialization_text_pointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				text_pointer();
				setState(264);
				match(ID);
				setState(265);
				match(T__19);
				setState(266);
				match(T__20);
				setState(267);
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
		enterRule(_localctx, 38, RULE_assign);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new Assing_variableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(ID);
				setState(272);
				match(T__20);
				setState(273);
				expression(0);
				}
				break;
			case 2:
				_localctx = new Assing_text_pointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(ID);
				setState(275);
				match(T__20);
				setState(276);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new Assing_to_arrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(ID);
				setState(278);
				index();
				setState(279);
				match(T__20);
				setState(280);
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
		enterRule(_localctx, 40, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class Function_typeContext extends ParserRuleContext {
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterFunction_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitFunction_type(this);
		}
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__24))) != 0)) ) {
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
		enterRule(_localctx, 44, RULE_text_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
		enterRule(_localctx, 46, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__25);
			setState(291);
			match(INT);
			setState(292);
			match(T__26);
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\3\5\3=\n\3\3\3\7\3@\n"+
		"\3\f\3\16\3C\13\3\3\4\5\4F\n\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\5\5\5O\n"+
		"\5\3\5\7\5R\n\5\f\5\16\5U\13\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6s\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\5\t\u0088\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\f\3\f\3\f\3\f\5\f\u009d\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b8\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c6\n\16\f\16"+
		"\16\16\u00c9\13\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00de\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ea\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f6\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0103\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0110\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011d\n\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\2\3\32\32\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\2\4\3\2\30\32\4\2\30\31\33\33\2\u0139\28\3"+
		"\2\2\2\4A\3\2\2\2\6J\3\2\2\2\bS\3\2\2\2\nr\3\2\2\2\ft\3\2\2\2\16}\3\2"+
		"\2\2\20\u0085\3\2\2\2\22\u0089\3\2\2\2\24\u0096\3\2\2\2\26\u009c\3\2\2"+
		"\2\30\u00aa\3\2\2\2\32\u00b7\3\2\2\2\34\u00ca\3\2\2\2\36\u00dd\3\2\2\2"+
		" \u00e9\3\2\2\2\"\u00f5\3\2\2\2$\u0102\3\2\2\2&\u010f\3\2\2\2(\u011c\3"+
		"\2\2\2*\u011e\3\2\2\2,\u0120\3\2\2\2.\u0122\3\2\2\2\60\u0124\3\2\2\2\62"+
		"\64\5\f\7\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\67\7%\2\2\66"+
		"\63\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2\2\2:8\3\2\2\2;=\5"+
		"\n\6\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>@\7%\2\2?<\3\2\2\2@C\3\2\2\2A?\3"+
		"\2\2\2AB\3\2\2\2B\5\3\2\2\2CA\3\2\2\2DF\5\n\6\2ED\3\2\2\2EF\3\2\2\2FG"+
		"\3\2\2\2GI\7%\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\7\3\2\2\2L"+
		"J\3\2\2\2MO\5\n\6\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\7%\2\2QN\3\2\2\2R"+
		"U\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\5\20\t\2WY\7\'\2\2"+
		"XZ\7%\2\2YX\3\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[\\\5\34\17\2\\]\7\'\2\2]s\3\2"+
		"\2\2^_\5\36\20\2_`\7\'\2\2`s\3\2\2\2ab\5 \21\2bc\7\'\2\2cs\3\2\2\2de\5"+
		"\"\22\2ef\7\'\2\2fs\3\2\2\2gh\5$\23\2hi\7\'\2\2is\3\2\2\2jk\5&\24\2kl"+
		"\7\'\2\2ls\3\2\2\2mn\5(\25\2no\7\'\2\2os\3\2\2\2ps\5\16\b\2qs\5\22\n\2"+
		"r[\3\2\2\2r^\3\2\2\2ra\3\2\2\2rd\3\2\2\2rg\3\2\2\2rj\3\2\2\2rm\3\2\2\2"+
		"rp\3\2\2\2rq\3\2\2\2s\13\3\2\2\2tu\5,\27\2uv\7\"\2\2vw\7\3\2\2wx\5\24"+
		"\13\2xy\7\4\2\2yz\7\5\2\2z{\5\b\5\2{|\7\6\2\2|\r\3\2\2\2}~\7\7\2\2~\177"+
		"\7\3\2\2\177\u0080\5\30\r\2\u0080\u0081\7\4\2\2\u0081\u0082\7\5\2\2\u0082"+
		"\u0083\5\4\3\2\u0083\u0084\7\6\2\2\u0084\17\3\2\2\2\u0085\u0087\7\b\2"+
		"\2\u0086\u0088\5\32\16\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\21\3\2\2\2\u0089\u008a\7\t\2\2\u008a\u008b\7\3\2\2\u008b\u008c\5\30\r"+
		"\2\u008c\u008d\7\4\2\2\u008d\u008e\7\5\2\2\u008e\u008f\5\6\4\2\u008f\u0090"+
		"\7\6\2\2\u0090\23\3\2\2\2\u0091\u0097\5\26\f\2\u0092\u0093\5\26\f\2\u0093"+
		"\u0094\7\n\2\2\u0094\u0095\5\24\13\2\u0095\u0097\3\2\2\2\u0096\u0091\3"+
		"\2\2\2\u0096\u0092\3\2\2\2\u0097\25\3\2\2\2\u0098\u0099\5*\26\2\u0099"+
		"\u009a\7\"\2\2\u009a\u009d\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u0098\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\27\3\2\2\2\u009e\u009f\5\32\16\2\u009f"+
		"\u00a0\7\13\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00ab\3\2\2\2\u00a2\u00a3"+
		"\5\32\16\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\5\32\16\2\u00a5\u00ab\3\2\2"+
		"\2\u00a6\u00a7\5\32\16\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9\5\32\16\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u009e\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a6\3\2"+
		"\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\b\16\1\2\u00ad\u00ae\7\37\2\2\u00ae"+
		"\u00b8\5\32\16\r\u00af\u00b0\7\36\2\2\u00b0\u00b8\5\32\16\f\u00b1\u00b2"+
		"\7\"\2\2\u00b2\u00b8\5\60\31\2\u00b3\u00b8\7\"\2\2\u00b4\u00b8\7#\2\2"+
		"\u00b5\u00b8\7$\2\2\u00b6\u00b8\7!\2\2\u00b7\u00ac\3\2\2\2\u00b7\u00af"+
		"\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00c7\3\2\2\2\u00b9\u00ba\f\13"+
		"\2\2\u00ba\u00bb\7\16\2\2\u00bb\u00c6\5\32\16\f\u00bc\u00bd\f\n\2\2\u00bd"+
		"\u00be\7\17\2\2\u00be\u00c6\5\32\16\13\u00bf\u00c0\f\t\2\2\u00c0\u00c1"+
		"\7\20\2\2\u00c1\u00c6\5\32\16\n\u00c2\u00c3\f\b\2\2\u00c3\u00c4\7\21\2"+
		"\2\u00c4\u00c6\5\32\16\t\u00c5\u00b9\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5"+
		"\u00bf\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\33\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb"+
		"\7\22\2\2\u00cb\u00cc\7\3\2\2\u00cc\u00cd\5\32\16\2\u00cd\u00ce\7\4\2"+
		"\2\u00ce\35\3\2\2\2\u00cf\u00d0\7\23\2\2\u00d0\u00d1\7\3\2\2\u00d1\u00d2"+
		"\7 \2\2\u00d2\u00de\7\4\2\2\u00d3\u00d4\7\23\2\2\u00d4\u00d5\7\3\2\2\u00d5"+
		"\u00d6\7\"\2\2\u00d6\u00de\7\4\2\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\7"+
		"\3\2\2\u00d9\u00da\7\"\2\2\u00da\u00db\5\60\31\2\u00db\u00dc\7\4\2\2\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00cf\3\2\2\2\u00dd\u00d3\3\2\2\2\u00dd\u00d7\3\2"+
		"\2\2\u00de\37\3\2\2\2\u00df\u00e0\7\24\2\2\u00e0\u00e1\7\3\2\2\u00e1\u00e2"+
		"\7\"\2\2\u00e2\u00ea\7\4\2\2\u00e3\u00e4\7\24\2\2\u00e4\u00e5\7\3\2\2"+
		"\u00e5\u00e6\7\"\2\2\u00e6\u00e7\5\60\31\2\u00e7\u00e8\7\4\2\2\u00e8\u00ea"+
		"\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e3\3\2\2\2\u00ea!\3\2\2\2\u00eb"+
		"\u00ec\7\25\2\2\u00ec\u00ed\7\3\2\2\u00ed\u00ee\7\"\2\2\u00ee\u00f6\7"+
		"\4\2\2\u00ef\u00f0\7\25\2\2\u00f0\u00f1\7\3\2\2\u00f1\u00f2\7\"\2\2\u00f2"+
		"\u00f3\5\60\31\2\u00f3\u00f4\7\4\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00eb\3"+
		"\2\2\2\u00f5\u00ef\3\2\2\2\u00f6#\3\2\2\2\u00f7\u00f8\5*\26\2\u00f8\u00f9"+
		"\7\"\2\2\u00f9\u0103\3\2\2\2\u00fa\u00fb\5.\30\2\u00fb\u00fc\7\"\2\2\u00fc"+
		"\u00fd\7\26\2\2\u00fd\u0103\3\2\2\2\u00fe\u00ff\5*\26\2\u00ff\u0100\7"+
		"\"\2\2\u0100\u0101\5\60\31\2\u0101\u0103\3\2\2\2\u0102\u00f7\3\2\2\2\u0102"+
		"\u00fa\3\2\2\2\u0102\u00fe\3\2\2\2\u0103%\3\2\2\2\u0104\u0105\5*\26\2"+
		"\u0105\u0106\7\"\2\2\u0106\u0107\7\27\2\2\u0107\u0108\5\32\16\2\u0108"+
		"\u0110\3\2\2\2\u0109\u010a\5.\30\2\u010a\u010b\7\"\2\2\u010b\u010c\7\26"+
		"\2\2\u010c\u010d\7\27\2\2\u010d\u010e\7 \2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u0104\3\2\2\2\u010f\u0109\3\2\2\2\u0110\'\3\2\2\2\u0111\u0112\7\"\2\2"+
		"\u0112\u0113\7\27\2\2\u0113\u011d\5\32\16\2\u0114\u0115\7\"\2\2\u0115"+
		"\u0116\7\27\2\2\u0116\u011d\7 \2\2\u0117\u0118\7\"\2\2\u0118\u0119\5\60"+
		"\31\2\u0119\u011a\7\27\2\2\u011a\u011b\5\32\16\2\u011b\u011d\3\2\2\2\u011c"+
		"\u0111\3\2\2\2\u011c\u0114\3\2\2\2\u011c\u0117\3\2\2\2\u011d)\3\2\2\2"+
		"\u011e\u011f\t\2\2\2\u011f+\3\2\2\2\u0120\u0121\t\3\2\2\u0121-\3\2\2\2"+
		"\u0122\u0123\7\32\2\2\u0123/\3\2\2\2\u0124\u0125\7\34\2\2\u0125\u0126"+
		"\7#\2\2\u0126\u0127\7\35\2\2\u0127\61\3\2\2\2\31\638<AEJNSYr\u0087\u0096"+
		"\u009c\u00aa\u00b7\u00c5\u00c7\u00dd\u00e9\u00f5\u0102\u010f\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}