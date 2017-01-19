// Generated from Param.g4 by ANTLR 4.6
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
public class ParamLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TEXTO=7, DIGITO=8, LETRA=9, 
		WS=10, ErroIsolado=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TEXTO", "DIGITO", "LETRA", 
		"WS", "ErroIsolado"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'--config'", "'-R'", "'-h'", "'--help'", "'-v'", "'--version'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "TEXTO", "DIGITO", "LETRA", 
		"WS", "ErroIsolado"
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


	public ParamLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Param.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rQ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\6\bA\n\b\r\b\16\bB\3\t\3\t\3\n\3\n\3\13\6"+
		"\13J\n\13\r\13\16\13K\3\13\3\13\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\3\2\6\4\2//\61\61\3\2\62;\6\2C\\aac|\u0082"+
		"\u0101\5\2\13\f\17\17\"\"U\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\"\3\2\2\2\7%\3\2\2\2\t(\3\2\2"+
		"\2\13/\3\2\2\2\r\62\3\2\2\2\17@\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2\25I\3"+
		"\2\2\2\27O\3\2\2\2\31\32\7/\2\2\32\33\7/\2\2\33\34\7e\2\2\34\35\7q\2\2"+
		"\35\36\7p\2\2\36\37\7h\2\2\37 \7k\2\2 !\7i\2\2!\4\3\2\2\2\"#\7/\2\2#$"+
		"\7T\2\2$\6\3\2\2\2%&\7/\2\2&\'\7j\2\2\'\b\3\2\2\2()\7/\2\2)*\7/\2\2*+"+
		"\7j\2\2+,\7g\2\2,-\7n\2\2-.\7r\2\2.\n\3\2\2\2/\60\7/\2\2\60\61\7x\2\2"+
		"\61\f\3\2\2\2\62\63\7/\2\2\63\64\7/\2\2\64\65\7x\2\2\65\66\7g\2\2\66\67"+
		"\7t\2\2\678\7u\2\289\7k\2\29:\7q\2\2:;\7p\2\2;\16\3\2\2\2<A\7\60\2\2="+
		"A\5\23\n\2>A\5\21\t\2?A\t\2\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2"+
		"\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\20\3\2\2\2DE\t\3\2\2E\22\3\2\2\2FG\t"+
		"\4\2\2G\24\3\2\2\2HJ\t\5\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L"+
		"M\3\2\2\2MN\b\13\2\2N\26\3\2\2\2OP\13\2\2\2P\30\3\2\2\2\6\2@BK\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}