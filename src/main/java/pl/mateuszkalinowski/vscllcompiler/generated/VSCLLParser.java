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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TOINT=16, TODOUBLE=17, 
		STRING=18, ID=19, INT=20, DOUBLE=21, NEWLINE=22, WS=23, SC=24;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expression = 2, RULE_print = 3, RULE_scani = 4, 
		RULE_scand = 5, RULE_declaration = 6, RULE_declaration_with_initialization = 7, 
		RULE_assign = 8, RULE_var = 9, RULE_text_pointer = 10, RULE_index = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expression", "print", "scani", "scand", "declaration", 
			"declaration_with_initialization", "assign", "var", "text_pointer", "index"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'print'", "'('", "')'", "'scani'", 
			"'scand'", "'='", "'int'", "'double'", "'char*'", "'['", "']'", "'(int)'", 
			"'(double)'", null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TOINT", "TODOUBLE", "STRING", "ID", "INT", "DOUBLE", 
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
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << ID))) != 0)) {
					{
					setState(24);
					stat();
					}
				}

				setState(27);
				match(NEWLINE);
				}
				}
				setState(32);
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
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				print();
				setState(34);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				scani();
				setState(37);
				match(SC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				scand();
				setState(40);
				match(SC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				declaration();
				setState(43);
				match(SC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				declaration_with_initialization();
				setState(46);
				match(SC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				assign();
				setState(49);
				match(SC);
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
	public static class Expresion_idContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public Expresion_idContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpresion_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpresion_id(this);
		}
	}
	public static class Expresion_to_doubleContext extends ExpressionContext {
		public TerminalNode TODOUBLE() { return getToken(VSCLLParser.TODOUBLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expresion_to_doubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpresion_to_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpresion_to_double(this);
		}
	}
	public static class Expresion_to_intContext extends ExpressionContext {
		public TerminalNode TOINT() { return getToken(VSCLLParser.TOINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expresion_to_intContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpresion_to_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpresion_to_int(this);
		}
	}
	public static class Expresion_doubleContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(VSCLLParser.DOUBLE, 0); }
		public Expresion_doubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpresion_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpresion_double(this);
		}
	}
	public static class Expresion_intContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(VSCLLParser.INT, 0); }
		public Expresion_intContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpresion_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpresion_int(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new Expression_indexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				match(ID);
				setState(55);
				index();
				}
				break;
			case 2:
				{
				_localctx = new Expresion_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new Expresion_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(INT);
				}
				break;
			case 4:
				{
				_localctx = new Expresion_doubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(DOUBLE);
				}
				break;
			case 5:
				{
				_localctx = new Expresion_to_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(TOINT);
				setState(60);
				expression(2);
				}
				break;
			case 6:
				{
				_localctx = new Expresion_to_doubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(TODOUBLE);
				setState(62);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicateContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(66);
						match(T__0);
						setState(67);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(69);
						match(T__1);
						setState(70);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(72);
						match(T__2);
						setState(73);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new SubtractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(75);
						match(T__3);
						setState(76);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class Print_stringContext extends PrintContext {
		public TerminalNode STRING() { return getToken(VSCLLParser.STRING, 0); }
		public Print_stringContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterPrint_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitPrint_string(this);
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
		enterRule(_localctx, 6, RULE_print);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Print_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__4);
				setState(83);
				match(T__5);
				setState(84);
				expression(0);
				setState(85);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new Print_stringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__4);
				setState(88);
				match(T__5);
				setState(89);
				match(STRING);
				setState(90);
				match(T__6);
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
		enterRule(_localctx, 8, RULE_scani);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Scani_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__7);
				setState(94);
				match(T__5);
				setState(95);
				match(ID);
				setState(96);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new Scani_arrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__7);
				setState(98);
				match(T__5);
				setState(99);
				match(ID);
				setState(100);
				index();
				setState(101);
				match(T__6);
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
		enterRule(_localctx, 10, RULE_scand);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Scand_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__8);
				setState(106);
				match(T__5);
				setState(107);
				match(ID);
				setState(108);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new Scand_arrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__8);
				setState(110);
				match(T__5);
				setState(111);
				match(ID);
				setState(112);
				index();
				setState(113);
				match(T__6);
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
		enterRule(_localctx, 12, RULE_declaration);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new Declaration_variableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				var();
				setState(118);
				match(ID);
				}
				break;
			case 2:
				_localctx = new Declaration_text_pointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				text_pointer();
				setState(121);
				match(ID);
				}
				break;
			case 3:
				_localctx = new Declaration_arrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				var();
				setState(124);
				match(ID);
				setState(125);
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
		enterRule(_localctx, 14, RULE_declaration_with_initialization);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
				_localctx = new Declaration_with_initialization_variableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				var();
				setState(130);
				match(ID);
				setState(131);
				match(T__9);
				setState(132);
				expression(0);
				}
				break;
			case T__12:
				_localctx = new Declaration_with_initialization_text_pointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				text_pointer();
				setState(135);
				match(ID);
				setState(136);
				match(T__9);
				setState(137);
				match(STRING);
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
		enterRule(_localctx, 16, RULE_assign);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Assing_variableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(ID);
				setState(142);
				match(T__9);
				setState(143);
				expression(0);
				}
				break;
			case 2:
				_localctx = new Assing_text_pointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(ID);
				setState(145);
				match(T__9);
				setState(146);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new Assing_to_arrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(ID);
				setState(148);
				index();
				setState(149);
				match(T__9);
				setState(150);
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
		enterRule(_localctx, 18, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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
		enterRule(_localctx, 20, RULE_text_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__12);
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
		enterRule(_localctx, 22, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__13);
			setState(159);
			match(INT);
			setState(160);
			match(T__14);
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
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00a5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4P\n\4\f\4\16\4S\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7v\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u009b\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\2\3\6\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\r\16\2\u00b0\2 \3\2\2\2\4\65\3"+
		"\2\2\2\6A\3\2\2\2\b]\3\2\2\2\ni\3\2\2\2\fu\3\2\2\2\16\u0081\3\2\2\2\20"+
		"\u008d\3\2\2\2\22\u009a\3\2\2\2\24\u009c\3\2\2\2\26\u009e\3\2\2\2\30\u00a0"+
		"\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\37"+
		"\7\30\2\2\36\33\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\3\3\2\2\2"+
		"\" \3\2\2\2#$\5\b\5\2$%\7\32\2\2%\66\3\2\2\2&\'\5\n\6\2\'(\7\32\2\2(\66"+
		"\3\2\2\2)*\5\f\7\2*+\7\32\2\2+\66\3\2\2\2,-\5\16\b\2-.\7\32\2\2.\66\3"+
		"\2\2\2/\60\5\20\t\2\60\61\7\32\2\2\61\66\3\2\2\2\62\63\5\22\n\2\63\64"+
		"\7\32\2\2\64\66\3\2\2\2\65#\3\2\2\2\65&\3\2\2\2\65)\3\2\2\2\65,\3\2\2"+
		"\2\65/\3\2\2\2\65\62\3\2\2\2\66\5\3\2\2\2\678\b\4\1\289\7\25\2\29B\5\30"+
		"\r\2:B\7\25\2\2;B\7\26\2\2<B\7\27\2\2=>\7\22\2\2>B\5\6\4\4?@\7\23\2\2"+
		"@B\5\6\4\3A\67\3\2\2\2A:\3\2\2\2A;\3\2\2\2A<\3\2\2\2A=\3\2\2\2A?\3\2\2"+
		"\2BQ\3\2\2\2CD\f\f\2\2DE\7\3\2\2EP\5\6\4\rFG\f\13\2\2GH\7\4\2\2HP\5\6"+
		"\4\fIJ\f\n\2\2JK\7\5\2\2KP\5\6\4\13LM\f\t\2\2MN\7\6\2\2NP\5\6\4\nOC\3"+
		"\2\2\2OF\3\2\2\2OI\3\2\2\2OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\7"+
		"\3\2\2\2SQ\3\2\2\2TU\7\7\2\2UV\7\b\2\2VW\5\6\4\2WX\7\t\2\2X^\3\2\2\2Y"+
		"Z\7\7\2\2Z[\7\b\2\2[\\\7\24\2\2\\^\7\t\2\2]T\3\2\2\2]Y\3\2\2\2^\t\3\2"+
		"\2\2_`\7\n\2\2`a\7\b\2\2ab\7\25\2\2bj\7\t\2\2cd\7\n\2\2de\7\b\2\2ef\7"+
		"\25\2\2fg\5\30\r\2gh\7\t\2\2hj\3\2\2\2i_\3\2\2\2ic\3\2\2\2j\13\3\2\2\2"+
		"kl\7\13\2\2lm\7\b\2\2mn\7\25\2\2nv\7\t\2\2op\7\13\2\2pq\7\b\2\2qr\7\25"+
		"\2\2rs\5\30\r\2st\7\t\2\2tv\3\2\2\2uk\3\2\2\2uo\3\2\2\2v\r\3\2\2\2wx\5"+
		"\24\13\2xy\7\25\2\2y\u0082\3\2\2\2z{\5\26\f\2{|\7\25\2\2|\u0082\3\2\2"+
		"\2}~\5\24\13\2~\177\7\25\2\2\177\u0080\5\30\r\2\u0080\u0082\3\2\2\2\u0081"+
		"w\3\2\2\2\u0081z\3\2\2\2\u0081}\3\2\2\2\u0082\17\3\2\2\2\u0083\u0084\5"+
		"\24\13\2\u0084\u0085\7\25\2\2\u0085\u0086\7\f\2\2\u0086\u0087\5\6\4\2"+
		"\u0087\u008e\3\2\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7\25\2\2\u008a\u008b"+
		"\7\f\2\2\u008b\u008c\7\24\2\2\u008c\u008e\3\2\2\2\u008d\u0083\3\2\2\2"+
		"\u008d\u0088\3\2\2\2\u008e\21\3\2\2\2\u008f\u0090\7\25\2\2\u0090\u0091"+
		"\7\f\2\2\u0091\u009b\5\6\4\2\u0092\u0093\7\25\2\2\u0093\u0094\7\f\2\2"+
		"\u0094\u009b\7\24\2\2\u0095\u0096\7\25\2\2\u0096\u0097\5\30\r\2\u0097"+
		"\u0098\7\f\2\2\u0098\u0099\5\6\4\2\u0099\u009b\3\2\2\2\u009a\u008f\3\2"+
		"\2\2\u009a\u0092\3\2\2\2\u009a\u0095\3\2\2\2\u009b\23\3\2\2\2\u009c\u009d"+
		"\t\2\2\2\u009d\25\3\2\2\2\u009e\u009f\7\17\2\2\u009f\27\3\2\2\2\u00a0"+
		"\u00a1\7\20\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00a3\7\21\2\2\u00a3\31\3\2"+
		"\2\2\16\33 \65AOQ]iu\u0081\u008d\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}