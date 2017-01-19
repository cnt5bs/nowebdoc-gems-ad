// Generated from NowebDocGemsAd.g4 by ANTLR 4.6
package nowebDocGems.gram;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NowebDocGemsAdParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DELIM=1, DEF=2, MACRO=3, NL=4, LINE=5;
	public static final int
		RULE_spec = 0, RULE_frag = 1, RULE_definition = 2, RULE_macro = 3, RULE_rawcode = 4, 
		RULE_text = 5;
	public static final String[] ruleNames = {
		"spec", "frag", "definition", "macro", "rawcode", "text"
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

	@Override
	public String getGrammarFileName() { return "NowebDocGemsAd.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NowebDocGemsAdParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SpecContext extends ParserRuleContext {
		public List<FragContext> frag() {
			return getRuleContexts(FragContext.class);
		}
		public FragContext frag(int i) {
			return getRuleContext(FragContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsAdListener ) ((NowebDocGemsAdListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsAdListener ) ((NowebDocGemsAdListener)listener).exitSpec(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DELIM) | (1L << DEF) | (1L << MACRO) | (1L << NL) | (1L << LINE))) != 0)) {
				{
				setState(14);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(12);
					frag();
					}
					break;
				case 2:
					{
					setState(13);
					text();
					}
					break;
				}
				}
				setState(18);
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

	public static class FragContext extends ParserRuleContext {
		public List<TerminalNode> DELIM() { return getTokens(NowebDocGemsAdParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(NowebDocGemsAdParser.DELIM, i);
		}
		public List<TerminalNode> NL() { return getTokens(NowebDocGemsAdParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NowebDocGemsAdParser.NL, i);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public List<RawcodeContext> rawcode() {
			return getRuleContexts(RawcodeContext.class);
		}
		public RawcodeContext rawcode(int i) {
			return getRuleContext(RawcodeContext.class,i);
		}
		public FragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsAdListener ) ((NowebDocGemsAdListener)listener).enterFrag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsAdListener ) ((NowebDocGemsAdListener)listener).exitFrag(this);
		}
	}

	public final FragContext frag() throws RecognitionException {
		FragContext _localctx = new FragContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_frag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(DELIM);
			setState(20);
			match(NL);
			setState(21);
			definition();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MACRO) | (1L << NL) | (1L << LINE))) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MACRO:
					{
					setState(22);
					macro();
					}
					break;
				case NL:
				case LINE:
					{
					setState(23);
					rawcode();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(DELIM);
			setState(30);
			match(NL);
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

	public static class DefinitionContext extends ParserRuleContext {
		public Token def;
		public TerminalNode NL() { return getToken(NowebDocGemsAdParser.NL, 0); }
		public TerminalNode DEF() { return getToken(NowebDocGemsAdParser.DEF, 0); }
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsAdListener ) ((NowebDocGemsAdListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsAdListener ) ((NowebDocGemsAdListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((DefinitionContext)_localctx).def = match(DEF);
			setState(33);
			match(NL);
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

	public static class MacroContext extends ParserRuleContext {
		public Token mac;
		public TerminalNode NL() { return getToken(NowebDocGemsAdParser.NL, 0); }
		public TerminalNode MACRO() { return getToken(NowebDocGemsAdParser.MACRO, 0); }
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsAdListener ) ((NowebDocGemsAdListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsAdListener ) ((NowebDocGemsAdListener)listener).exitMacro(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_macro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			((MacroContext)_localctx).mac = match(MACRO);
			setState(36);
			match(NL);
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

	public static class RawcodeContext extends ParserRuleContext {
		public Token lin;
		public TerminalNode NL() { return getToken(NowebDocGemsAdParser.NL, 0); }
		public TerminalNode LINE() { return getToken(NowebDocGemsAdParser.LINE, 0); }
		public RawcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsAdListener ) ((NowebDocGemsAdListener)listener).enterRawcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsAdListener ) ((NowebDocGemsAdListener)listener).exitRawcode(this);
		}
	}

	public final RawcodeContext rawcode() throws RecognitionException {
		RawcodeContext _localctx = new RawcodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rawcode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE) {
				{
				setState(38);
				((RawcodeContext)_localctx).lin = match(LINE);
				}
			}

			setState(41);
			match(NL);
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(NowebDocGemsAdParser.NL, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsAdListener ) ((NowebDocGemsAdListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NowebDocGemsAdListener ) ((NowebDocGemsAdListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(43);
					matchWildcard();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(49);
			match(NL);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\5\6*\n\6\3\6\3\6\3\7\7\7/\n\7\f\7\16\7\62\13\7\3"+
		"\7\3\7\3\7\3\60\2\b\2\4\6\b\n\f\2\2\65\2\22\3\2\2\2\4\25\3\2\2\2\6\"\3"+
		"\2\2\2\b%\3\2\2\2\n)\3\2\2\2\f\60\3\2\2\2\16\21\5\4\3\2\17\21\5\f\7\2"+
		"\20\16\3\2\2\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2"+
		"\23\3\3\2\2\2\24\22\3\2\2\2\25\26\7\3\2\2\26\27\7\6\2\2\27\34\5\6\4\2"+
		"\30\33\5\b\5\2\31\33\5\n\6\2\32\30\3\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2"+
		"\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\3\2\2 "+
		"!\7\6\2\2!\5\3\2\2\2\"#\7\4\2\2#$\7\6\2\2$\7\3\2\2\2%&\7\5\2\2&\'\7\6"+
		"\2\2\'\t\3\2\2\2(*\7\7\2\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\6\2\2,\13"+
		"\3\2\2\2-/\13\2\2\2.-\3\2\2\2/\62\3\2\2\2\60\61\3\2\2\2\60.\3\2\2\2\61"+
		"\63\3\2\2\2\62\60\3\2\2\2\63\64\7\6\2\2\64\r\3\2\2\2\b\20\22\32\34)\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}