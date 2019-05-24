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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, TOINT=28, TODOUBLE=29, STRING=30, CHARACTER=31, 
		ID=32, INT=33, DOUBLE=34, NEWLINE=35, WS=36, SC=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "TOINT", "TODOUBLE", "STRING", "CHARACTER", "ID", "INT", 
			"DOUBLE", "NEWLINE", "WS", "SC"
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
		case 35:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0110\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\7\37\u00bf\n\37\f\37\16\37\u00c2\13\37\3\37\3\37\3 \3 \3 \3 "+
		"\3 \3 \3 \3 \5 \u00ce\n \3!\3!\7!\u00d2\n!\f!\16!\u00d5\13!\3\"\6\"\u00d8"+
		"\n\"\r\"\16\"\u00d9\3\"\3\"\3\"\6\"\u00df\n\"\r\"\16\"\u00e0\3\"\5\"\u00e4"+
		"\n\"\3#\6#\u00e7\n#\r#\16#\u00e8\3#\3#\7#\u00ed\n#\f#\16#\u00f0\13#\3"+
		"#\3#\3#\6#\u00f5\n#\r#\16#\u00f6\3#\3#\7#\u00fb\n#\f#\16#\u00fe\13#\3"+
		"#\5#\u0101\n#\3$\5$\u0104\n$\3$\3$\3%\6%\u0109\n%\r%\16%\u010a\3%\3%\3"+
		"&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\6\4\2$$^^\4\2C\\c|\5\2\62;C\\c|\4\2"+
		"\13\13\"\"\2\u011c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2"+
		"\2\2\tS\3\2\2\2\13U\3\2\2\2\rX\3\2\2\2\17_\3\2\2\2\21e\3\2\2\2\23g\3\2"+
		"\2\2\25i\3\2\2\2\27k\3\2\2\2\31n\3\2\2\2\33p\3\2\2\2\35r\3\2\2\2\37t\3"+
		"\2\2\2!v\3\2\2\2#|\3\2\2\2%\u0083\3\2\2\2\'\u0089\3\2\2\2)\u008f\3\2\2"+
		"\2+\u0092\3\2\2\2-\u0094\3\2\2\2/\u0098\3\2\2\2\61\u009f\3\2\2\2\63\u00a4"+
		"\3\2\2\2\65\u00a9\3\2\2\2\67\u00ab\3\2\2\29\u00ad\3\2\2\2;\u00b3\3\2\2"+
		"\2=\u00bc\3\2\2\2?\u00cd\3\2\2\2A\u00cf\3\2\2\2C\u00e3\3\2\2\2E\u0100"+
		"\3\2\2\2G\u0103\3\2\2\2I\u0108\3\2\2\2K\u010e\3\2\2\2MN\7*\2\2N\4\3\2"+
		"\2\2OP\7+\2\2P\6\3\2\2\2QR\7}\2\2R\b\3\2\2\2ST\7\177\2\2T\n\3\2\2\2UV"+
		"\7k\2\2VW\7h\2\2W\f\3\2\2\2XY\7t\2\2YZ\7g\2\2Z[\7v\2\2[\\\7w\2\2\\]\7"+
		"t\2\2]^\7p\2\2^\16\3\2\2\2_`\7y\2\2`a\7j\2\2ab\7k\2\2bc\7n\2\2cd\7g\2"+
		"\2d\20\3\2\2\2ef\7.\2\2f\22\3\2\2\2gh\7>\2\2h\24\3\2\2\2ij\7@\2\2j\26"+
		"\3\2\2\2kl\7?\2\2lm\7?\2\2m\30\3\2\2\2no\7,\2\2o\32\3\2\2\2pq\7\61\2\2"+
		"q\34\3\2\2\2rs\7-\2\2s\36\3\2\2\2tu\7/\2\2u \3\2\2\2vw\7r\2\2wx\7t\2\2"+
		"xy\7k\2\2yz\7p\2\2z{\7v\2\2{\"\3\2\2\2|}\7r\2\2}~\7t\2\2~\177\7k\2\2\177"+
		"\u0080\7p\2\2\u0080\u0081\7v\2\2\u0081\u0082\7u\2\2\u0082$\3\2\2\2\u0083"+
		"\u0084\7u\2\2\u0084\u0085\7e\2\2\u0085\u0086\7c\2\2\u0086\u0087\7p\2\2"+
		"\u0087\u0088\7k\2\2\u0088&\3\2\2\2\u0089\u008a\7u\2\2\u008a\u008b\7e\2"+
		"\2\u008b\u008c\7c\2\2\u008c\u008d\7p\2\2\u008d\u008e\7f\2\2\u008e(\3\2"+
		"\2\2\u008f\u0090\7]\2\2\u0090\u0091\7_\2\2\u0091*\3\2\2\2\u0092\u0093"+
		"\7?\2\2\u0093,\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\u0097"+
		"\7v\2\2\u0097.\3\2\2\2\u0098\u0099\7f\2\2\u0099\u009a\7q\2\2\u009a\u009b"+
		"\7w\2\2\u009b\u009c\7d\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e"+
		"\60\3\2\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7c\2\2\u00a2"+
		"\u00a3\7t\2\2\u00a3\62\3\2\2\2\u00a4\u00a5\7x\2\2\u00a5\u00a6\7q\2\2\u00a6"+
		"\u00a7\7k\2\2\u00a7\u00a8\7f\2\2\u00a8\64\3\2\2\2\u00a9\u00aa\7]\2\2\u00aa"+
		"\66\3\2\2\2\u00ab\u00ac\7_\2\2\u00ac8\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7+\2\2"+
		"\u00b2:\3\2\2\2\u00b3\u00b4\7*\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6\7q\2"+
		"\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7d\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba"+
		"\7g\2\2\u00ba\u00bb\7+\2\2\u00bb<\3\2\2\2\u00bc\u00c0\7$\2\2\u00bd\u00bf"+
		"\n\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7$"+
		"\2\2\u00c4>\3\2\2\2\u00c5\u00c6\7)\2\2\u00c6\u00c7\13\2\2\2\u00c7\u00ce"+
		"\7)\2\2\u00c8\u00c9\7)\2\2\u00c9\u00ca\7^\2\2\u00ca\u00cb\13\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\7)\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c8\3\2"+
		"\2\2\u00ce@\3\2\2\2\u00cf\u00d3\t\3\2\2\u00d0\u00d2\t\4\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"B\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\4\62;\2\u00d7\u00d6\3\2\2\2"+
		"\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e4"+
		"\3\2\2\2\u00db\u00dc\7*\2\2\u00dc\u00de\7/\2\2\u00dd\u00df\4\62;\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\7+\2\2\u00e3\u00d7\3\2\2\2\u00e3"+
		"\u00db\3\2\2\2\u00e4D\3\2\2\2\u00e5\u00e7\4\62;\2\u00e6\u00e5\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00ee\7\60\2\2\u00eb\u00ed\4\62;\2\u00ec\u00eb\3\2\2\2"+
		"\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u0101"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7*\2\2\u00f2\u00f4\7/\2\2\u00f3"+
		"\u00f5\4\62;\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fc\7\60\2\2\u00f9"+
		"\u00fb\4\62;\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0101\7+\2\2\u0100\u00e6\3\2\2\2\u0100\u00f1\3\2\2\2\u0101F\3\2\2\2\u0102"+
		"\u0104\7\17\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0106\7\f\2\2\u0106H\3\2\2\2\u0107\u0109\t\5\2\2\u0108\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\b%\2\2\u010dJ\3\2\2\2\u010e\u010f\7=\2\2\u010f"+
		"L\3\2\2\2\20\2\u00c0\u00cd\u00d3\u00d9\u00e0\u00e3\u00e8\u00ee\u00f6\u00fc"+
		"\u0100\u0103\u010a\3\3%\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}