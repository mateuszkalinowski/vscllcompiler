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
		T__9=10, T__10=11, T__11=12, TOINT=13, TODOUBLE=14, STRING=15, ID=16, 
		INT=17, DOUBLE=18, NEWLINE=19, WS=20, SC=21;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expresion = 2, RULE_print = 3, RULE_scani = 4, 
		RULE_scand = 5, RULE_declaration = 6, RULE_declaration_with_initialization = 7, 
		RULE_assign = 8, RULE_var = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expresion", "print", "scani", "scand", "declaration", 
			"declaration_with_initialization", "assign", "var"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'print'", "'('", "')'", "'scani'", 
			"'scand'", "'='", "'int'", "'double'", "'(int)'", "'(double)'", null, 
			null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "TOINT", "TODOUBLE", "STRING", "ID", "INT", "DOUBLE", "NEWLINE", 
			"WS", "SC"
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
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0)) {
					{
					setState(20);
					stat();
					}
				}

				setState(23);
				match(NEWLINE);
				}
				}
				setState(28);
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
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				print();
				setState(30);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				scani();
				setState(33);
				match(SC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				scand();
				setState(36);
				match(SC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				declaration();
				setState(39);
				match(SC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				declaration_with_initialization();
				setState(42);
				match(SC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(44);
				assign();
				setState(45);
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

	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public AddContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitAdd(this);
		}
	}
	public static class Expresion_idContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public Expresion_idContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpresion_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpresion_id(this);
		}
	}
	public static class Expresion_to_doubleContext extends ExpresionContext {
		public TerminalNode TODOUBLE() { return getToken(VSCLLParser.TODOUBLE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Expresion_to_doubleContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpresion_to_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpresion_to_double(this);
		}
	}
	public static class Expresion_to_intContext extends ExpresionContext {
		public TerminalNode TOINT() { return getToken(VSCLLParser.TOINT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Expresion_to_intContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpresion_to_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpresion_to_int(this);
		}
	}
	public static class Expresion_doubleContext extends ExpresionContext {
		public TerminalNode DOUBLE() { return getToken(VSCLLParser.DOUBLE, 0); }
		public Expresion_doubleContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpresion_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpresion_double(this);
		}
	}
	public static class Expresion_intContext extends ExpresionContext {
		public TerminalNode INT() { return getToken(VSCLLParser.INT, 0); }
		public Expresion_intContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterExpresion_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitExpresion_int(this);
		}
	}
	public static class SubtractContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public SubtractContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitSubtract(this);
		}
	}
	public static class DivideContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public DivideContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitDivide(this);
		}
	}
	public static class MultiplicateContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public MultiplicateContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterMultiplicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitMultiplicate(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new Expresion_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(50);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new Expresion_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(INT);
				}
				break;
			case DOUBLE:
				{
				_localctx = new Expresion_doubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(DOUBLE);
				}
				break;
			case TOINT:
				{
				_localctx = new Expresion_to_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(TOINT);
				setState(54);
				expresion(2);
				}
				break;
			case TODOUBLE:
				{
				_localctx = new Expresion_to_doubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(TODOUBLE);
				setState(56);
				expresion(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicateContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(59);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(60);
						match(T__0);
						setState(61);
						expresion(10);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(62);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(63);
						match(T__1);
						setState(64);
						expresion(9);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(65);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(66);
						match(T__2);
						setState(67);
						expresion(8);
						}
						break;
					case 4:
						{
						_localctx = new SubtractContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(68);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(69);
						match(T__3);
						setState(70);
						expresion(7);
						}
						break;
					}
					} 
				}
				setState(75);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Print_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__4);
				setState(77);
				match(T__5);
				setState(78);
				expresion(0);
				setState(79);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new Print_stringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__4);
				setState(82);
				match(T__5);
				setState(83);
				match(STRING);
				setState(84);
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
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public ScaniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scani; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterScani(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitScani(this);
		}
	}

	public final ScaniContext scani() throws RecognitionException {
		ScaniContext _localctx = new ScaniContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scani);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__7);
			setState(88);
			match(T__5);
			setState(89);
			match(ID);
			setState(90);
			match(T__6);
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
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public ScandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterScand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitScand(this);
		}
	}

	public final ScandContext scand() throws RecognitionException {
		ScandContext _localctx = new ScandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__8);
			setState(93);
			match(T__5);
			setState(94);
			match(ID);
			setState(95);
			match(T__6);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			var();
			setState(98);
			match(ID);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Declaration_with_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_with_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterDeclaration_with_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitDeclaration_with_initialization(this);
		}
	}

	public final Declaration_with_initializationContext declaration_with_initialization() throws RecognitionException {
		Declaration_with_initializationContext _localctx = new Declaration_with_initializationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration_with_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			var();
			setState(101);
			match(ID);
			setState(102);
			match(T__9);
			setState(103);
			expresion(0);
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
		public TerminalNode ID() { return getToken(VSCLLParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VSCLLListener ) ((VSCLLListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ID);
			setState(106);
			match(T__9);
			setState(107);
			expresion(0);
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
			setState(109);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\5\2\30\n\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5X\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\2\3\6\f\2\4\6\b\n\f\16\20"+
		"\22\24\2\3\3\2\r\16\2w\2\34\3\2\2\2\4\61\3\2\2\2\6;\3\2\2\2\bW\3\2\2\2"+
		"\nY\3\2\2\2\f^\3\2\2\2\16c\3\2\2\2\20f\3\2\2\2\22k\3\2\2\2\24o\3\2\2\2"+
		"\26\30\5\4\3\2\27\26\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\33\7\25\2"+
		"\2\32\27\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\3\3\2\2"+
		"\2\36\34\3\2\2\2\37 \5\b\5\2 !\7\27\2\2!\62\3\2\2\2\"#\5\n\6\2#$\7\27"+
		"\2\2$\62\3\2\2\2%&\5\f\7\2&\'\7\27\2\2\'\62\3\2\2\2()\5\16\b\2)*\7\27"+
		"\2\2*\62\3\2\2\2+,\5\20\t\2,-\7\27\2\2-\62\3\2\2\2./\5\22\n\2/\60\7\27"+
		"\2\2\60\62\3\2\2\2\61\37\3\2\2\2\61\"\3\2\2\2\61%\3\2\2\2\61(\3\2\2\2"+
		"\61+\3\2\2\2\61.\3\2\2\2\62\5\3\2\2\2\63\64\b\4\1\2\64<\7\22\2\2\65<\7"+
		"\23\2\2\66<\7\24\2\2\678\7\17\2\28<\5\6\4\49:\7\20\2\2:<\5\6\4\3;\63\3"+
		"\2\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;9\3\2\2\2<K\3\2\2\2=>\f\13"+
		"\2\2>?\7\3\2\2?J\5\6\4\f@A\f\n\2\2AB\7\4\2\2BJ\5\6\4\13CD\f\t\2\2DE\7"+
		"\5\2\2EJ\5\6\4\nFG\f\b\2\2GH\7\6\2\2HJ\5\6\4\tI=\3\2\2\2I@\3\2\2\2IC\3"+
		"\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\7\3\2\2\2MK\3\2\2\2NO"+
		"\7\7\2\2OP\7\b\2\2PQ\5\6\4\2QR\7\t\2\2RX\3\2\2\2ST\7\7\2\2TU\7\b\2\2U"+
		"V\7\21\2\2VX\7\t\2\2WN\3\2\2\2WS\3\2\2\2X\t\3\2\2\2YZ\7\n\2\2Z[\7\b\2"+
		"\2[\\\7\22\2\2\\]\7\t\2\2]\13\3\2\2\2^_\7\13\2\2_`\7\b\2\2`a\7\22\2\2"+
		"ab\7\t\2\2b\r\3\2\2\2cd\5\24\13\2de\7\22\2\2e\17\3\2\2\2fg\5\24\13\2g"+
		"h\7\22\2\2hi\7\f\2\2ij\5\6\4\2j\21\3\2\2\2kl\7\22\2\2lm\7\f\2\2mn\5\6"+
		"\4\2n\23\3\2\2\2op\t\2\2\2p\25\3\2\2\2\t\27\34\61;IKW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}