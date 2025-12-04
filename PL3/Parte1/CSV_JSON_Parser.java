// Generated from CSV_JSON_Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CSV_JSON_Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXTO=1, STRING=2, SEPARADOR=3, SALTO_DE_LINEA=4, ESPACIO=5;
	public static final int
		RULE_archivo = 0, RULE_filas = 1, RULE_fila = 2, RULE_campo = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"archivo", "filas", "fila", "campo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXTO", "STRING", "SEPARADOR", "SALTO_DE_LINEA", "ESPACIO"
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
	public String getGrammarFileName() { return "CSV_JSON_Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSV_JSON_Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArchivoContext extends ParserRuleContext {
		public FilasContext filas() {
			return getRuleContext(FilasContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CSV_JSON_Parser.EOF, 0); }
		public ArchivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_archivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSV_JSON_ParserListener ) ((CSV_JSON_ParserListener)listener).enterArchivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSV_JSON_ParserListener ) ((CSV_JSON_ParserListener)listener).exitArchivo(this);
		}
	}

	public final ArchivoContext archivo() throws RecognitionException {
		ArchivoContext _localctx = new ArchivoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_archivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			filas();
			setState(9);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FilasContext extends ParserRuleContext {
		public List<FilaContext> fila() {
			return getRuleContexts(FilaContext.class);
		}
		public FilaContext fila(int i) {
			return getRuleContext(FilaContext.class,i);
		}
		public List<TerminalNode> SALTO_DE_LINEA() { return getTokens(CSV_JSON_Parser.SALTO_DE_LINEA); }
		public TerminalNode SALTO_DE_LINEA(int i) {
			return getToken(CSV_JSON_Parser.SALTO_DE_LINEA, i);
		}
		public FilasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSV_JSON_ParserListener ) ((CSV_JSON_ParserListener)listener).enterFilas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSV_JSON_ParserListener ) ((CSV_JSON_ParserListener)listener).exitFilas(this);
		}
	}

	public final FilasContext filas() throws RecognitionException {
		FilasContext _localctx = new FilasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_filas);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			fila();
			setState(16);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(12);
					match(SALTO_DE_LINEA);
					setState(13);
					fila();
					}
					} 
				}
				setState(18);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SALTO_DE_LINEA) {
				{
				setState(19);
				match(SALTO_DE_LINEA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FilaContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<TerminalNode> SEPARADOR() { return getTokens(CSV_JSON_Parser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(CSV_JSON_Parser.SEPARADOR, i);
		}
		public FilaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fila; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSV_JSON_ParserListener ) ((CSV_JSON_ParserListener)listener).enterFila(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSV_JSON_ParserListener ) ((CSV_JSON_ParserListener)listener).exitFila(this);
		}
	}

	public final FilaContext fila() throws RecognitionException {
		FilaContext _localctx = new FilaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fila);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTO || _la==STRING) {
				{
				setState(22);
				campo();
				}
			}

			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR) {
				{
				{
				setState(25);
				match(SEPARADOR);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEXTO || _la==STRING) {
					{
					setState(26);
					campo();
					}
				}

				}
				}
				setState(33);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CampoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(CSV_JSON_Parser.TEXTO, 0); }
		public TerminalNode STRING() { return getToken(CSV_JSON_Parser.STRING, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSV_JSON_ParserListener ) ((CSV_JSON_ParserListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSV_JSON_ParserListener ) ((CSV_JSON_ParserListener)listener).exitCampo(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_campo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==TEXTO || _la==STRING) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0005%\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u000f\b\u0001\n"+
		"\u0001\f\u0001\u0012\t\u0001\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001"+
		"\u0002\u0003\u0002\u0018\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001c"+
		"\b\u0002\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0001\u0001\u0000\u0001\u0002%\u0000\b\u0001\u0000\u0000\u0000\u0002"+
		"\u000b\u0001\u0000\u0000\u0000\u0004\u0017\u0001\u0000\u0000\u0000\u0006"+
		"\"\u0001\u0000\u0000\u0000\b\t\u0003\u0002\u0001\u0000\t\n\u0005\u0000"+
		"\u0000\u0001\n\u0001\u0001\u0000\u0000\u0000\u000b\u0010\u0003\u0004\u0002"+
		"\u0000\f\r\u0005\u0004\u0000\u0000\r\u000f\u0003\u0004\u0002\u0000\u000e"+
		"\f\u0001\u0000\u0000\u0000\u000f\u0012\u0001\u0000\u0000\u0000\u0010\u000e"+
		"\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0014"+
		"\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0013\u0015"+
		"\u0005\u0004\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0001\u0000\u0000\u0000\u0015\u0003\u0001\u0000\u0000\u0000\u0016\u0018"+
		"\u0003\u0006\u0003\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0001\u0000\u0000\u0000\u0018\u001f\u0001\u0000\u0000\u0000\u0019\u001b"+
		"\u0005\u0003\u0000\u0000\u001a\u001c\u0003\u0006\u0003\u0000\u001b\u001a"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e"+
		"\u0001\u0000\u0000\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001e!\u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 \u0005\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"\"#\u0007\u0000\u0000\u0000#\u0007\u0001\u0000\u0000\u0000\u0005\u0010"+
		"\u0014\u0017\u001b\u001f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}