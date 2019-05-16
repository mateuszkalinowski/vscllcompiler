// Generated from /Users/mateusz/Projects/vscllcompiler/src/main/resources/grammar/VSCLL.g4 by ANTLR 4.7.2
package pl.mateuszkalinowski.vscllcompiler.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VSCLLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, TOINT=13, TODOUBLE=14, STRING=15, ID=16, 
		INT=17, DOUBLE=18, NEWLINE=19, WS=20, SC=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "TOINT", "TODOUBLE", "STRING", "ID", "INT", 
			"DOUBLE", "NEWLINE", "WS", "SC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'print'", "'('", "')'", "'scani'", 
			"'='", "'int'", "'double'", "'string'", "'(int)'", "'(double)'", null, 
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


	public VSCLLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VSCLL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 19:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\7\20k\n\20\f\20\16\20n\13\20\3\20\3\20"+
		"\3\21\3\21\7\21t\n\21\f\21\16\21w\13\21\3\22\6\22z\n\22\r\22\16\22{\3"+
		"\23\6\23\177\n\23\r\23\16\23\u0080\3\23\3\23\7\23\u0085\n\23\f\23\16\23"+
		"\u0088\13\23\3\24\5\24\u008b\n\24\3\24\3\24\3\25\6\25\u0090\n\25\r\25"+
		"\16\25\u0091\3\25\3\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"\3\2\6\4\2$$^^\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2\u009d\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2"+
		"\2\t\63\3\2\2\2\13\65\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23E\3"+
		"\2\2\2\25G\3\2\2\2\27K\3\2\2\2\31R\3\2\2\2\33Y\3\2\2\2\35_\3\2\2\2\37"+
		"h\3\2\2\2!q\3\2\2\2#y\3\2\2\2%~\3\2\2\2\'\u008a\3\2\2\2)\u008f\3\2\2\2"+
		"+\u0095\3\2\2\2-.\7,\2\2.\4\3\2\2\2/\60\7\61\2\2\60\6\3\2\2\2\61\62\7"+
		"-\2\2\62\b\3\2\2\2\63\64\7/\2\2\64\n\3\2\2\2\65\66\7r\2\2\66\67\7t\2\2"+
		"\678\7k\2\289\7p\2\29:\7v\2\2:\f\3\2\2\2;<\7*\2\2<\16\3\2\2\2=>\7+\2\2"+
		">\20\3\2\2\2?@\7u\2\2@A\7e\2\2AB\7c\2\2BC\7p\2\2CD\7k\2\2D\22\3\2\2\2"+
		"EF\7?\2\2F\24\3\2\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2J\26\3\2\2\2KL\7f\2\2"+
		"LM\7q\2\2MN\7w\2\2NO\7d\2\2OP\7n\2\2PQ\7g\2\2Q\30\3\2\2\2RS\7u\2\2ST\7"+
		"v\2\2TU\7t\2\2UV\7k\2\2VW\7p\2\2WX\7i\2\2X\32\3\2\2\2YZ\7*\2\2Z[\7k\2"+
		"\2[\\\7p\2\2\\]\7v\2\2]^\7+\2\2^\34\3\2\2\2_`\7*\2\2`a\7f\2\2ab\7q\2\2"+
		"bc\7w\2\2cd\7d\2\2de\7n\2\2ef\7g\2\2fg\7+\2\2g\36\3\2\2\2hl\7$\2\2ik\n"+
		"\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7"+
		"$\2\2p \3\2\2\2qu\t\3\2\2rt\t\4\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3"+
		"\2\2\2v\"\3\2\2\2wu\3\2\2\2xz\4\62;\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|"+
		"\3\2\2\2|$\3\2\2\2}\177\4\62;\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0086\7\60\2\2\u0083"+
		"\u0085\4\62;\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087&\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b"+
		"\7\17\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2"+
		"\u008c\u008d\7\f\2\2\u008d(\3\2\2\2\u008e\u0090\t\5\2\2\u008f\u008e\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\b\25\2\2\u0094*\3\2\2\2\u0095\u0096\7=\2\2"+
		"\u0096,\3\2\2\2\n\2lu{\u0080\u0086\u008a\u0091\3\3\25\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}