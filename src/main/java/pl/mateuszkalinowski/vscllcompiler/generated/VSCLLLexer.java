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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\7\20j\n\20\f\20\16\20m\13\20\3\20\3\20\3\21"+
		"\3\21\7\21s\n\21\f\21\16\21v\13\21\3\22\6\22y\n\22\r\22\16\22z\3\22\3"+
		"\22\3\22\6\22\u0080\n\22\r\22\16\22\u0081\3\22\5\22\u0085\n\22\3\23\6"+
		"\23\u0088\n\23\r\23\16\23\u0089\3\23\3\23\7\23\u008e\n\23\f\23\16\23\u0091"+
		"\13\23\3\23\3\23\3\23\6\23\u0096\n\23\r\23\16\23\u0097\3\23\3\23\7\23"+
		"\u009c\n\23\f\23\16\23\u009f\13\23\3\23\5\23\u00a2\n\23\3\24\5\24\u00a5"+
		"\n\24\3\24\3\24\3\25\6\25\u00aa\n\25\r\25\16\25\u00ab\3\25\3\25\3\26\3"+
		"\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\6\4\2$$^^\4\2C\\c|\5\2\62"+
		";C\\c|\4\2\13\13\"\"\2\u00bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r"+
		";\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23E\3\2\2\2\25K\3\2\2\2\27M\3\2\2\2"+
		"\31Q\3\2\2\2\33X\3\2\2\2\35^\3\2\2\2\37g\3\2\2\2!p\3\2\2\2#\u0084\3\2"+
		"\2\2%\u00a1\3\2\2\2\'\u00a4\3\2\2\2)\u00a9\3\2\2\2+\u00af\3\2\2\2-.\7"+
		",\2\2.\4\3\2\2\2/\60\7\61\2\2\60\6\3\2\2\2\61\62\7-\2\2\62\b\3\2\2\2\63"+
		"\64\7/\2\2\64\n\3\2\2\2\65\66\7r\2\2\66\67\7t\2\2\678\7k\2\289\7p\2\2"+
		"9:\7v\2\2:\f\3\2\2\2;<\7*\2\2<\16\3\2\2\2=>\7+\2\2>\20\3\2\2\2?@\7u\2"+
		"\2@A\7e\2\2AB\7c\2\2BC\7p\2\2CD\7k\2\2D\22\3\2\2\2EF\7u\2\2FG\7e\2\2G"+
		"H\7c\2\2HI\7p\2\2IJ\7f\2\2J\24\3\2\2\2KL\7?\2\2L\26\3\2\2\2MN\7k\2\2N"+
		"O\7p\2\2OP\7v\2\2P\30\3\2\2\2QR\7f\2\2RS\7q\2\2ST\7w\2\2TU\7d\2\2UV\7"+
		"n\2\2VW\7g\2\2W\32\3\2\2\2XY\7*\2\2YZ\7k\2\2Z[\7p\2\2[\\\7v\2\2\\]\7+"+
		"\2\2]\34\3\2\2\2^_\7*\2\2_`\7f\2\2`a\7q\2\2ab\7w\2\2bc\7d\2\2cd\7n\2\2"+
		"de\7g\2\2ef\7+\2\2f\36\3\2\2\2gk\7$\2\2hj\n\2\2\2ih\3\2\2\2jm\3\2\2\2"+
		"ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7$\2\2o \3\2\2\2pt\t\3\2\2"+
		"qs\t\4\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\"\3\2\2\2vt\3\2\2"+
		"\2wy\4\62;\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0085\3\2\2\2|}"+
		"\7*\2\2}\177\7/\2\2~\u0080\4\62;\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\7+\2"+
		"\2\u0084x\3\2\2\2\u0084|\3\2\2\2\u0085$\3\2\2\2\u0086\u0088\4\62;\2\u0087"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008f\7\60\2\2\u008c\u008e\4\62;\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u00a2\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7*\2\2\u0093"+
		"\u0095\7/\2\2\u0094\u0096\4\62;\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009d\7\60\2\2\u009a\u009c\4\62;\2\u009b\u009a\3\2\2\2\u009c\u009f\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a2\7+\2\2\u00a1\u0087\3\2\2\2\u00a1\u0092\3\2"+
		"\2\2\u00a2&\3\2\2\2\u00a3\u00a5\7\17\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\f\2\2\u00a7(\3\2\2\2\u00a8"+
		"\u00aa\t\5\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\25\2\2\u00ae"+
		"*\3\2\2\2\u00af\u00b0\7=\2\2\u00b0,\3\2\2\2\17\2ktz\u0081\u0084\u0089"+
		"\u008f\u0097\u009d\u00a1\u00a4\u00ab\3\3\25\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}