// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/Ex1/Ejercicio1_2/EJ2Parser.g4 by ANTLR 4.13.2
package Ejercicio1_2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EJ2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASIGNAR=1, MOSTRAR=2, SI=3, SI_NO=4, TERMINAR=5, MIENTRAS=6, HACER=7, 
		ROMPER=8, CONTINUAR=9, MARCA_COND=10, FLECHA=11, FIN_LINEA=12, IGUAL=13, 
		DISTINTO=14, MENOR_IGUAL=15, MAYOR_IGUAL=16, MENOR=17, MAYOR=18, AND=19, 
		OR=20, NOT=21, SUMA=22, RESTA=23, ASIGNACION=24, MULT=25, DIV=26, PAREN_ABRE=27, 
		PAREN_CIERRA=28, VERDADERO=29, FALSO=30, INT=31, FLOAT=32, STRING=33, 
		ID=34, COMENTARIO=35, ESPACIO=36;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_declaracion = 2, RULE_asignacion = 3, 
		RULE_impresion = 4, RULE_bucle = 5, RULE_control_bucle = 6, RULE_condicional = 7, 
		RULE_bloque = 8, RULE_condicion = 9, RULE_bool_o = 10, RULE_bool_y = 11, 
		RULE_bool_no = 12, RULE_comparacion = 13, RULE_booleano = 14, RULE_operador_relacional = 15, 
		RULE_expresion = 16, RULE_termino = 17, RULE_factor = 18, RULE_atomo = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "declaracion", "asignacion", "impresion", "bucle", 
			"control_bucle", "condicional", "bloque", "condicion", "bool_o", "bool_y", 
			"bool_no", "comparacion", "booleano", "operador_relacional", "expresion", 
			"termino", "factor", "atomo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'asignar'", "'mostrar'", "'si'", "'no'", "'terminar'", "'mientras'", 
			"'hacer'", "'romper'", "'continuar'", "'???'", "'->'", "';P'", "'=='", 
			"'!='", "'<='", "'>='", "'<'", "'>'", "'and'", "'or'", "'not'", "'+'", 
			"'-'", "'='", "'*'", "'/'", "'('", "')'", "'verdadero'", "'falso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASIGNAR", "MOSTRAR", "SI", "SI_NO", "TERMINAR", "MIENTRAS", "HACER", 
			"ROMPER", "CONTINUAR", "MARCA_COND", "FLECHA", "FIN_LINEA", "IGUAL", 
			"DISTINTO", "MENOR_IGUAL", "MAYOR_IGUAL", "MENOR", "MAYOR", "AND", "OR", 
			"NOT", "SUMA", "RESTA", "ASIGNACION", "MULT", "DIV", "PAREN_ABRE", "PAREN_CIERRA", 
			"VERDADERO", "FALSO", "INT", "FLOAT", "STRING", "ID", "COMENTARIO", "ESPACIO"
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
	public String getGrammarFileName() { return "EJ2Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EJ2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EJ2Parser.EOF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33967571782L) != 0)) {
				{
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(40);
					sentencia();
					}
					break;
				case 2:
					{
					setState(41);
					condicional();
					}
					break;
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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
	public static class SentenciaContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public BucleContext bucle() {
			return getRuleContext(BucleContext.class,0);
		}
		public Control_bucleContext control_bucle() {
			return getRuleContext(Control_bucleContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGNAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				declaracion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				asignacion();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				impresion();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				bucle();
				}
				break;
			case ROMPER:
			case CONTINUAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				control_bucle();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode ASIGNAR() { return getToken(EJ2Parser.ASIGNAR, 0); }
		public TerminalNode ID() { return getToken(EJ2Parser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(EJ2Parser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode FIN_LINEA() { return getToken(EJ2Parser.FIN_LINEA, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ASIGNAR);
			setState(57);
			match(ID);
			setState(58);
			match(ASIGNACION);
			setState(59);
			expresion();
			setState(60);
			match(FIN_LINEA);
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EJ2Parser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(EJ2Parser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode FIN_LINEA() { return getToken(EJ2Parser.FIN_LINEA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ID);
			setState(63);
			match(ASIGNACION);
			setState(64);
			expresion();
			setState(65);
			match(FIN_LINEA);
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
	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(EJ2Parser.MOSTRAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode FIN_LINEA() { return getToken(EJ2Parser.FIN_LINEA, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(MOSTRAR);
			setState(68);
			expresion();
			setState(69);
			match(FIN_LINEA);
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
	public static class BucleContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(EJ2Parser.MIENTRAS, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode HACER() { return getToken(EJ2Parser.HACER, 0); }
		public TerminalNode FLECHA() { return getToken(EJ2Parser.FLECHA, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode TERMINAR() { return getToken(EJ2Parser.TERMINAR, 0); }
		public BucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitBucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitBucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(MIENTRAS);
			setState(72);
			condicion();
			setState(73);
			match(HACER);
			setState(74);
			match(FLECHA);
			setState(75);
			bloque();
			setState(76);
			match(TERMINAR);
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
	public static class Control_bucleContext extends ParserRuleContext {
		public TerminalNode ROMPER() { return getToken(EJ2Parser.ROMPER, 0); }
		public TerminalNode FIN_LINEA() { return getToken(EJ2Parser.FIN_LINEA, 0); }
		public TerminalNode CONTINUAR() { return getToken(EJ2Parser.CONTINUAR, 0); }
		public Control_bucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterControl_bucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitControl_bucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitControl_bucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_bucleContext control_bucle() throws RecognitionException {
		Control_bucleContext _localctx = new Control_bucleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_control_bucle);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROMPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(ROMPER);
				setState(79);
				match(FIN_LINEA);
				}
				break;
			case CONTINUAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(CONTINUAR);
				setState(81);
				match(FIN_LINEA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode MARCA_COND() { return getToken(EJ2Parser.MARCA_COND, 0); }
		public TerminalNode SI() { return getToken(EJ2Parser.SI, 0); }
		public List<TerminalNode> FLECHA() { return getTokens(EJ2Parser.FLECHA); }
		public TerminalNode FLECHA(int i) {
			return getToken(EJ2Parser.FLECHA, i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode TERMINAR() { return getToken(EJ2Parser.TERMINAR, 0); }
		public TerminalNode SI_NO() { return getToken(EJ2Parser.SI_NO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			condicion();
			setState(85);
			match(MARCA_COND);
			setState(86);
			match(SI);
			setState(87);
			match(FLECHA);
			setState(88);
			bloque();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI_NO) {
				{
				setState(89);
				match(SI_NO);
				setState(90);
				match(FLECHA);
				setState(91);
				bloque();
				}
			}

			setState(94);
			match(TERMINAR);
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
	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33967571782L) != 0)) {
				{
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(96);
					sentencia();
					}
					break;
				case 2:
					{
					setState(97);
					condicional();
					}
					break;
				}
				}
				setState(102);
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
	public static class CondicionContext extends ParserRuleContext {
		public Bool_oContext bool_o() {
			return getRuleContext(Bool_oContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			bool_o();
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
	public static class Bool_oContext extends ParserRuleContext {
		public List<Bool_yContext> bool_y() {
			return getRuleContexts(Bool_yContext.class);
		}
		public Bool_yContext bool_y(int i) {
			return getRuleContext(Bool_yContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(EJ2Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(EJ2Parser.OR, i);
		}
		public Bool_oContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterBool_o(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitBool_o(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitBool_o(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_oContext bool_o() throws RecognitionException {
		Bool_oContext _localctx = new Bool_oContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bool_o);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			bool_y();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(106);
				match(OR);
				setState(107);
				bool_y();
				}
				}
				setState(112);
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
	public static class Bool_yContext extends ParserRuleContext {
		public List<Bool_noContext> bool_no() {
			return getRuleContexts(Bool_noContext.class);
		}
		public Bool_noContext bool_no(int i) {
			return getRuleContext(Bool_noContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(EJ2Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(EJ2Parser.AND, i);
		}
		public Bool_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterBool_y(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitBool_y(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitBool_y(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_yContext bool_y() throws RecognitionException {
		Bool_yContext _localctx = new Bool_yContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			bool_no();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(114);
				match(AND);
				setState(115);
				bool_no();
				}
				}
				setState(120);
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
	public static class Bool_noContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(EJ2Parser.NOT, 0); }
		public Bool_noContext bool_no() {
			return getRuleContext(Bool_noContext.class,0);
		}
		public TerminalNode PAREN_ABRE() { return getToken(EJ2Parser.PAREN_ABRE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAREN_CIERRA() { return getToken(EJ2Parser.PAREN_CIERRA, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public Bool_noContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_no; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterBool_no(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitBool_no(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitBool_no(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_noContext bool_no() throws RecognitionException {
		Bool_noContext _localctx = new Bool_noContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_no);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(NOT);
				setState(122);
				bool_no();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(PAREN_ABRE);
				setState(124);
				condicion();
				setState(125);
				match(PAREN_CIERRA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				comparacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				booleano();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			expresion();
			setState(132);
			operador_relacional();
			setState(133);
			expresion();
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
	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode VERDADERO() { return getToken(EJ2Parser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(EJ2Parser.FALSO, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==VERDADERO || _la==FALSO) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operador_relacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(EJ2Parser.IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(EJ2Parser.DISTINTO, 0); }
		public TerminalNode MENOR() { return getToken(EJ2Parser.MENOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(EJ2Parser.MENOR_IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(EJ2Parser.MAYOR, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(EJ2Parser.MAYOR_IGUAL, 0); }
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitOperador_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitOperador_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> SUMA() { return getTokens(EJ2Parser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(EJ2Parser.SUMA, i);
		}
		public List<TerminalNode> RESTA() { return getTokens(EJ2Parser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(EJ2Parser.RESTA, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			termino();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==RESTA) {
				{
				{
				setState(140);
				_la = _input.LA(1);
				if ( !(_la==SUMA || _la==RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(141);
				termino();
				}
				}
				setState(146);
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
	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(EJ2Parser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(EJ2Parser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(EJ2Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(EJ2Parser.DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			factor();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(148);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				factor();
				}
				}
				setState(154);
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode RESTA() { return getToken(EJ2Parser.RESTA, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PAREN_ABRE() { return getToken(EJ2Parser.PAREN_ABRE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CIERRA() { return getToken(EJ2Parser.PAREN_CIERRA, 0); }
		public AtomoContext atomo() {
			return getRuleContext(AtomoContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESTA:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(RESTA);
				setState(156);
				factor();
				}
				break;
			case PAREN_ABRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(PAREN_ABRE);
				setState(158);
				expresion();
				setState(159);
				match(PAREN_CIERRA);
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				atomo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(EJ2Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(EJ2Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EJ2Parser.STRING, 0); }
		public TerminalNode ID() { return getToken(EJ2Parser.ID, 0); }
		public AtomoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).enterAtomo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ2ParserListener ) ((EJ2ParserListener)listener).exitAtomo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ2ParserVisitor ) return ((EJ2ParserVisitor<? extends T>)visitor).visitAtomo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomoContext atomo() throws RecognitionException {
		AtomoContext _localctx = new AtomoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_atomo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
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
		"\u0004\u0001$\u00a7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0005\u0000+\b\u0000"+
		"\n\u0000\f\u0000.\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006S\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"]\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bc\b\b\n\b\f\b"+
		"f\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\nm\b\n\n\n\f\np\t"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bu\b\u000b\n\u000b\f"+
		"\u000bx\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0082\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u008f\b\u0010\n\u0010\f\u0010\u0092\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u0097\b\u0011\n\u0011\f\u0011\u009a\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00a3\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0005\u0001\u0000\u001d\u001e"+
		"\u0001\u0000\r\u0012\u0001\u0000\u0016\u0017\u0001\u0000\u0019\u001a\u0001"+
		"\u0000\u001f\"\u00a5\u0000,\u0001\u0000\u0000\u0000\u00026\u0001\u0000"+
		"\u0000\u0000\u00048\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000"+
		"\bC\u0001\u0000\u0000\u0000\nG\u0001\u0000\u0000\u0000\fR\u0001\u0000"+
		"\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000"+
		"\u0012g\u0001\u0000\u0000\u0000\u0014i\u0001\u0000\u0000\u0000\u0016q"+
		"\u0001\u0000\u0000\u0000\u0018\u0081\u0001\u0000\u0000\u0000\u001a\u0083"+
		"\u0001\u0000\u0000\u0000\u001c\u0087\u0001\u0000\u0000\u0000\u001e\u0089"+
		"\u0001\u0000\u0000\u0000 \u008b\u0001\u0000\u0000\u0000\"\u0093\u0001"+
		"\u0000\u0000\u0000$\u00a2\u0001\u0000\u0000\u0000&\u00a4\u0001\u0000\u0000"+
		"\u0000(+\u0003\u0002\u0001\u0000)+\u0003\u000e\u0007\u0000*(\u0001\u0000"+
		"\u0000\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000/0\u0005\u0000\u0000\u00010\u0001\u0001\u0000"+
		"\u0000\u000017\u0003\u0004\u0002\u000027\u0003\u0006\u0003\u000037\u0003"+
		"\b\u0004\u000047\u0003\n\u0005\u000057\u0003\f\u0006\u000061\u0001\u0000"+
		"\u0000\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000065\u0001\u0000\u0000\u00007\u0003\u0001\u0000\u0000"+
		"\u000089\u0005\u0001\u0000\u00009:\u0005\"\u0000\u0000:;\u0005\u0018\u0000"+
		"\u0000;<\u0003 \u0010\u0000<=\u0005\f\u0000\u0000=\u0005\u0001\u0000\u0000"+
		"\u0000>?\u0005\"\u0000\u0000?@\u0005\u0018\u0000\u0000@A\u0003 \u0010"+
		"\u0000AB\u0005\f\u0000\u0000B\u0007\u0001\u0000\u0000\u0000CD\u0005\u0002"+
		"\u0000\u0000DE\u0003 \u0010\u0000EF\u0005\f\u0000\u0000F\t\u0001\u0000"+
		"\u0000\u0000GH\u0005\u0006\u0000\u0000HI\u0003\u0012\t\u0000IJ\u0005\u0007"+
		"\u0000\u0000JK\u0005\u000b\u0000\u0000KL\u0003\u0010\b\u0000LM\u0005\u0005"+
		"\u0000\u0000M\u000b\u0001\u0000\u0000\u0000NO\u0005\b\u0000\u0000OS\u0005"+
		"\f\u0000\u0000PQ\u0005\t\u0000\u0000QS\u0005\f\u0000\u0000RN\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000S\r\u0001\u0000\u0000\u0000TU\u0003"+
		"\u0012\t\u0000UV\u0005\n\u0000\u0000VW\u0005\u0003\u0000\u0000WX\u0005"+
		"\u000b\u0000\u0000X\\\u0003\u0010\b\u0000YZ\u0005\u0004\u0000\u0000Z["+
		"\u0005\u000b\u0000\u0000[]\u0003\u0010\b\u0000\\Y\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0005\u0005\u0000"+
		"\u0000_\u000f\u0001\u0000\u0000\u0000`c\u0003\u0002\u0001\u0000ac\u0003"+
		"\u000e\u0007\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000e\u0011\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0003"+
		"\u0014\n\u0000h\u0013\u0001\u0000\u0000\u0000in\u0003\u0016\u000b\u0000"+
		"jk\u0005\u0014\u0000\u0000km\u0003\u0016\u000b\u0000lj\u0001\u0000\u0000"+
		"\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000o\u0015\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qv\u0003\u0018\f\u0000rs\u0005\u0013\u0000\u0000su\u0003\u0018\f\u0000"+
		"tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000w\u0017\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000yz\u0005\u0015\u0000\u0000z\u0082\u0003\u0018\f\u0000"+
		"{|\u0005\u001b\u0000\u0000|}\u0003\u0012\t\u0000}~\u0005\u001c\u0000\u0000"+
		"~\u0082\u0001\u0000\u0000\u0000\u007f\u0082\u0003\u001a\r\u0000\u0080"+
		"\u0082\u0003\u001c\u000e\u0000\u0081y\u0001\u0000\u0000\u0000\u0081{\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0019\u0001\u0000\u0000\u0000\u0083\u0084\u0003"+
		" \u0010\u0000\u0084\u0085\u0003\u001e\u000f\u0000\u0085\u0086\u0003 \u0010"+
		"\u0000\u0086\u001b\u0001\u0000\u0000\u0000\u0087\u0088\u0007\u0000\u0000"+
		"\u0000\u0088\u001d\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0001\u0000"+
		"\u0000\u008a\u001f\u0001\u0000\u0000\u0000\u008b\u0090\u0003\"\u0011\u0000"+
		"\u008c\u008d\u0007\u0002\u0000\u0000\u008d\u008f\u0003\"\u0011\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"!\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0098"+
		"\u0003$\u0012\u0000\u0094\u0095\u0007\u0003\u0000\u0000\u0095\u0097\u0003"+
		"$\u0012\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099#\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005\u0017\u0000\u0000\u009c\u00a3\u0003$\u0012\u0000"+
		"\u009d\u009e\u0005\u001b\u0000\u0000\u009e\u009f\u0003 \u0010\u0000\u009f"+
		"\u00a0\u0005\u001c\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a3\u0003&\u0013\u0000\u00a2\u009b\u0001\u0000\u0000\u0000\u00a2\u009d"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3%\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0007\u0004\u0000\u0000\u00a5\'\u0001\u0000"+
		"\u0000\u0000\r*,6R\\bdnv\u0081\u0090\u0098\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}