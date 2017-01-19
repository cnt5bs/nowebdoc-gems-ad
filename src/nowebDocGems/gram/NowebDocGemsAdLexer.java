// Generated from NowebDocGemsAd.g4 by ANTLR 4.6
package nowebDocGems.gram;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NowebDocGemsAdLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DELIM=1, DEF=2, MACRO=3, NL=4, LINE=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DELIM", "DEF", "MACRO", "NL", "LINE", "SP"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DELIM", "DEF", "MACRO", "NL", "LINE"
	};
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


	public NowebDocGemsAdLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NowebDocGemsAd.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7J\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\7\4\60\n\4\f\4\16\4\63"+
		"\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5\3\5"+
		"\3\6\6\6E\n\6\r\6\16\6F\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\2\3\2\5\3"+
		"\2//\4\2\f\f\17\17\4\2\13\13\"\"N\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\3\17\3\2\2\2\5 \3\2\2\2\7\61\3\2\2\2\tA\3\2"+
		"\2\2\13D\3\2\2\2\rH\3\2\2\2\17\20\7/\2\2\20\21\7/\2\2\21\22\7/\2\2\22"+
		"\23\7/\2\2\23\27\3\2\2\2\24\26\t\2\2\2\25\24\3\2\2\2\26\31\3\2\2\2\27"+
		"\25\3\2\2\2\27\30\3\2\2\2\30\35\3\2\2\2\31\27\3\2\2\2\32\34\5\r\7\2\33"+
		"\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\4\3\2\2\2\37"+
		"\35\3\2\2\2 !\7>\2\2!\"\7>\2\2\"#\3\2\2\2#$\5\13\6\2$%\7@\2\2%&\7@\2\2"+
		"&\'\7?\2\2\'+\3\2\2\2(*\5\r\7\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2"+
		"\2,\6\3\2\2\2-+\3\2\2\2.\60\5\r\7\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2"+
		"\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7>\2\2\65\66\7>\2\2"+
		"\66\67\3\2\2\2\678\5\13\6\289\7@\2\29:\7@\2\2:>\3\2\2\2;=\5\r\7\2<;\3"+
		"\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\b\3\2\2\2@>\3\2\2\2AB\t\3\2\2B\n"+
		"\3\2\2\2CE\n\3\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\f\3\2\2\2"+
		"HI\t\4\2\2I\16\3\2\2\2\t\2\27\35+\61>F\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}