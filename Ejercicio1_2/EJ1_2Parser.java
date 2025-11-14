// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/Ex1/Ejercicio1_2/EJ1_2Parser.g4 by ANTLR 4.13.2
package Ejercicio1_2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EJ1_2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASIGNAR=1, MOSTRAR=2, SI=3, SI_NO=4, TERMINAR=5, MIENTRAS=6, HACER=7, 
		PARA=8, DESDE=9, HASTA=10, PASO=11, ROMPER=12, CONTINUAR=13, MARCA_COND=14, 
		FLECHA=15, FIN_LINEA=16, IGUAL=17, DISTINTO=18, MENOR_IGUAL=19, MAYOR_IGUAL=20, 
		MENOR=21, MAYOR=22, AND=23, OR=24, NOT=25, SUMA=26, RESTA=27, ASIGNACION=28, 
		MULT=29, DIV=30, PAREN_ABRE=31, PAREN_CIERRA=32, VERDADERO=33, FALSO=34, 
		INT=35, FLOAT=36, STRING=37, ID=38, COMENTARIO=39, ESPACIO=40;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_declaracion = 2, RULE_asignacion = 3, 
		RULE_impresion = 4, RULE_bucle = 5, RULE_bucle_mientras = 6, RULE_bucle_para = 7, 
		RULE_control_bucle = 8, RULE_condicional = 9, RULE_bloque = 10, RULE_condicion = 11, 
		RULE_bool_o = 12, RULE_bool_y = 13, RULE_bool_no = 14, RULE_comparacion = 15, 
		RULE_booleano = 16, RULE_operador_relacional = 17, RULE_expresion = 18, 
		RULE_termino = 19, RULE_factor = 20, RULE_atomo = 21, RULE_expr_general = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "declaracion", "asignacion", "impresion", "bucle", 
			"bucle_mientras", "bucle_para", "control_bucle", "condicional", "bloque", 
			"condicion", "bool_o", "bool_y", "bool_no", "comparacion", "booleano", 
			"operador_relacional", "expresion", "termino", "factor", "atomo", "expr_general"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'asignar'", "'mostrar'", "'si'", "'no'", "'terminar'", "'mientras'", 
			"'hacer'", "'para'", "'desde'", "'hasta'", "'paso'", "'romper'", "'continuar'", 
			"'???'", "'->'", "';P'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", 
			"'and'", "'or'", "'not'", "'+'", "'-'", "'='", "'*'", "'/'", "'('", "')'", 
			"'verdadero'", "'falso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASIGNAR", "MOSTRAR", "SI", "SI_NO", "TERMINAR", "MIENTRAS", "HACER", 
			"PARA", "DESDE", "HASTA", "PASO", "ROMPER", "CONTINUAR", "MARCA_COND", 
			"FLECHA", "FIN_LINEA", "IGUAL", "DISTINTO", "MENOR_IGUAL", "MAYOR_IGUAL", 
			"MENOR", "MAYOR", "AND", "OR", "NOT", "SUMA", "RESTA", "ASIGNACION", 
			"MULT", "DIV", "PAREN_ABRE", "PAREN_CIERRA", "VERDADERO", "FALSO", "INT", 
			"FLOAT", "STRING", "ID", "COMENTARIO", "ESPACIO"
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
	public String getGrammarFileName() { return "EJ1_2Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EJ1_2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EJ1_2Parser.EOF, 0); }
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
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitPrograma(this);
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 543481147718L) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(46);
					sentencia();
					}
					break;
				case 2:
					{
					setState(47);
					condicional();
					}
					break;
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
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
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGNAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				declaracion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				asignacion();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				impresion();
				}
				break;
			case MIENTRAS:
			case PARA:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				bucle();
				}
				break;
			case ROMPER:
			case CONTINUAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
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
		public TerminalNode ASIGNAR() { return getToken(EJ1_2Parser.ASIGNAR, 0); }
		public TerminalNode ID() { return getToken(EJ1_2Parser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(EJ1_2Parser.ASIGNACION, 0); }
		public Expr_generalContext expr_general() {
			return getRuleContext(Expr_generalContext.class,0);
		}
		public TerminalNode FIN_LINEA() { return getToken(EJ1_2Parser.FIN_LINEA, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ASIGNAR);
			setState(63);
			match(ID);
			setState(64);
			match(ASIGNACION);
			setState(65);
			expr_general();
			setState(66);
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
		public TerminalNode ID() { return getToken(EJ1_2Parser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(EJ1_2Parser.ASIGNACION, 0); }
		public Expr_generalContext expr_general() {
			return getRuleContext(Expr_generalContext.class,0);
		}
		public TerminalNode FIN_LINEA() { return getToken(EJ1_2Parser.FIN_LINEA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(69);
			match(ASIGNACION);
			setState(70);
			expr_general();
			setState(71);
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
		public TerminalNode MOSTRAR() { return getToken(EJ1_2Parser.MOSTRAR, 0); }
		public Expr_generalContext expr_general() {
			return getRuleContext(Expr_generalContext.class,0);
		}
		public TerminalNode FIN_LINEA() { return getToken(EJ1_2Parser.FIN_LINEA, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(MOSTRAR);
			setState(74);
			expr_general();
			setState(75);
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
		public Bucle_mientrasContext bucle_mientras() {
			return getRuleContext(Bucle_mientrasContext.class,0);
		}
		public Bucle_paraContext bucle_para() {
			return getRuleContext(Bucle_paraContext.class,0);
		}
		public BucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitBucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitBucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bucle);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIENTRAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				bucle_mientras();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				bucle_para();
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
	public static class Bucle_mientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(EJ1_2Parser.MIENTRAS, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode HACER() { return getToken(EJ1_2Parser.HACER, 0); }
		public TerminalNode FLECHA() { return getToken(EJ1_2Parser.FLECHA, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode TERMINAR() { return getToken(EJ1_2Parser.TERMINAR, 0); }
		public Bucle_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterBucle_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitBucle_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitBucle_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bucle_mientrasContext bucle_mientras() throws RecognitionException {
		Bucle_mientrasContext _localctx = new Bucle_mientrasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bucle_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(MIENTRAS);
			setState(82);
			condicion();
			setState(83);
			match(HACER);
			setState(84);
			match(FLECHA);
			setState(85);
			bloque();
			setState(86);
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
	public static class Bucle_paraContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(EJ1_2Parser.PARA, 0); }
		public TerminalNode ID() { return getToken(EJ1_2Parser.ID, 0); }
		public TerminalNode DESDE() { return getToken(EJ1_2Parser.DESDE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode HASTA() { return getToken(EJ1_2Parser.HASTA, 0); }
		public TerminalNode HACER() { return getToken(EJ1_2Parser.HACER, 0); }
		public TerminalNode FLECHA() { return getToken(EJ1_2Parser.FLECHA, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode TERMINAR() { return getToken(EJ1_2Parser.TERMINAR, 0); }
		public TerminalNode PASO() { return getToken(EJ1_2Parser.PASO, 0); }
		public Bucle_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterBucle_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitBucle_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitBucle_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bucle_paraContext bucle_para() throws RecognitionException {
		Bucle_paraContext _localctx = new Bucle_paraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bucle_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PARA);
			setState(89);
			match(ID);
			setState(90);
			match(DESDE);
			setState(91);
			expresion();
			setState(92);
			match(HASTA);
			setState(93);
			expresion();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASO) {
				{
				setState(94);
				match(PASO);
				setState(95);
				expresion();
				}
			}

			setState(98);
			match(HACER);
			setState(99);
			match(FLECHA);
			setState(100);
			bloque();
			setState(101);
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
		public TerminalNode ROMPER() { return getToken(EJ1_2Parser.ROMPER, 0); }
		public TerminalNode FIN_LINEA() { return getToken(EJ1_2Parser.FIN_LINEA, 0); }
		public TerminalNode CONTINUAR() { return getToken(EJ1_2Parser.CONTINUAR, 0); }
		public Control_bucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterControl_bucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitControl_bucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitControl_bucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_bucleContext control_bucle() throws RecognitionException {
		Control_bucleContext _localctx = new Control_bucleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_control_bucle);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROMPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(ROMPER);
				setState(104);
				match(FIN_LINEA);
				}
				break;
			case CONTINUAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(CONTINUAR);
				setState(106);
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
		public TerminalNode MARCA_COND() { return getToken(EJ1_2Parser.MARCA_COND, 0); }
		public TerminalNode SI() { return getToken(EJ1_2Parser.SI, 0); }
		public List<TerminalNode> FLECHA() { return getTokens(EJ1_2Parser.FLECHA); }
		public TerminalNode FLECHA(int i) {
			return getToken(EJ1_2Parser.FLECHA, i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode TERMINAR() { return getToken(EJ1_2Parser.TERMINAR, 0); }
		public TerminalNode SI_NO() { return getToken(EJ1_2Parser.SI_NO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			condicion();
			setState(110);
			match(MARCA_COND);
			setState(111);
			match(SI);
			setState(112);
			match(FLECHA);
			setState(113);
			bloque();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI_NO) {
				{
				setState(114);
				match(SI_NO);
				setState(115);
				match(FLECHA);
				setState(116);
				bloque();
				}
			}

			setState(119);
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
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 543481147718L) != 0)) {
				{
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(121);
					sentencia();
					}
					break;
				case 2:
					{
					setState(122);
					condicional();
					}
					break;
				}
				}
				setState(127);
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
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		public List<TerminalNode> OR() { return getTokens(EJ1_2Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(EJ1_2Parser.OR, i);
		}
		public Bool_oContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterBool_o(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitBool_o(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitBool_o(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_oContext bool_o() throws RecognitionException {
		Bool_oContext _localctx = new Bool_oContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_o);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			bool_y();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(131);
				match(OR);
				setState(132);
				bool_y();
				}
				}
				setState(137);
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
		public List<TerminalNode> AND() { return getTokens(EJ1_2Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(EJ1_2Parser.AND, i);
		}
		public Bool_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterBool_y(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitBool_y(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitBool_y(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_yContext bool_y() throws RecognitionException {
		Bool_yContext _localctx = new Bool_yContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			bool_no();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(139);
				match(AND);
				setState(140);
				bool_no();
				}
				}
				setState(145);
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
		public TerminalNode NOT() { return getToken(EJ1_2Parser.NOT, 0); }
		public Bool_noContext bool_no() {
			return getRuleContext(Bool_noContext.class,0);
		}
		public TerminalNode PAREN_ABRE() { return getToken(EJ1_2Parser.PAREN_ABRE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAREN_CIERRA() { return getToken(EJ1_2Parser.PAREN_CIERRA, 0); }
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
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterBool_no(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitBool_no(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitBool_no(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_noContext bool_no() throws RecognitionException {
		Bool_noContext _localctx = new Bool_noContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool_no);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(NOT);
				setState(147);
				bool_no();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(PAREN_ABRE);
				setState(149);
				condicion();
				setState(150);
				match(PAREN_CIERRA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				comparacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
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
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			expresion();
			setState(157);
			operador_relacional();
			setState(158);
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
		public TerminalNode VERDADERO() { return getToken(EJ1_2Parser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(EJ1_2Parser.FALSO, 0); }
		public TerminalNode ID() { return getToken(EJ1_2Parser.ID, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 300647710720L) != 0)) ) {
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
		public TerminalNode IGUAL() { return getToken(EJ1_2Parser.IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(EJ1_2Parser.DISTINTO, 0); }
		public TerminalNode MENOR() { return getToken(EJ1_2Parser.MENOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(EJ1_2Parser.MENOR_IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(EJ1_2Parser.MAYOR, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(EJ1_2Parser.MAYOR_IGUAL, 0); }
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitOperador_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitOperador_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8257536L) != 0)) ) {
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
		public List<TerminalNode> SUMA() { return getTokens(EJ1_2Parser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(EJ1_2Parser.SUMA, i);
		}
		public List<TerminalNode> RESTA() { return getTokens(EJ1_2Parser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(EJ1_2Parser.RESTA, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(164);
			termino();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==RESTA) {
				{
				{
				setState(165);
				_la = _input.LA(1);
				if ( !(_la==SUMA || _la==RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(166);
				termino();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(EJ1_2Parser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(EJ1_2Parser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(EJ1_2Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(EJ1_2Parser.DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			factor();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				factor();
				}
				}
				setState(179);
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
		public TerminalNode RESTA() { return getToken(EJ1_2Parser.RESTA, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PAREN_ABRE() { return getToken(EJ1_2Parser.PAREN_ABRE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CIERRA() { return getToken(EJ1_2Parser.PAREN_CIERRA, 0); }
		public AtomoContext atomo() {
			return getRuleContext(AtomoContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESTA:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(RESTA);
				setState(181);
				factor();
				}
				break;
			case PAREN_ABRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(PAREN_ABRE);
				setState(183);
				expresion();
				setState(184);
				match(PAREN_CIERRA);
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
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
		public TerminalNode INT() { return getToken(EJ1_2Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(EJ1_2Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EJ1_2Parser.STRING, 0); }
		public TerminalNode ID() { return getToken(EJ1_2Parser.ID, 0); }
		public AtomoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterAtomo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitAtomo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitAtomo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomoContext atomo() throws RecognitionException {
		AtomoContext _localctx = new AtomoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atomo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
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
	public static class Expr_generalContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public Expr_generalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_general; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).enterExpr_general(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ1_2ParserListener ) ((EJ1_2ParserListener)listener).exitExpr_general(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ1_2ParserVisitor ) return ((EJ1_2ParserVisitor<? extends T>)visitor).visitExpr_general(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_generalContext expr_general() throws RecognitionException {
		Expr_generalContext _localctx = new Expr_generalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_general);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				condicion();
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

	public static final String _serializedATN =
		"\u0004\u0001(\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0005\u00001\b\u0000"+
		"\n\u0000\f\u00004\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005P\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007a\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bl\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\tv\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005"+
		"\n|\b\n\n\n\f\n\u007f\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0086\b\f\n\f\f\f\u0089\t\f\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u008e\b\r\n\r\f\r\u0091\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009b"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u00a8\b\u0012\n\u0012\f\u0012\u00ab\t\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00b0\b\u0013\n\u0013\f\u0013\u00b3\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00bc\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u00c2\b\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,\u0000\u0005\u0002\u0000!\"&&\u0001\u0000\u0011\u0016\u0001\u0000"+
		"\u001a\u001b\u0001\u0000\u001d\u001e\u0001\u0000#&\u00c2\u00002\u0001"+
		"\u0000\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000"+
		"\u0000\u0006D\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nO\u0001"+
		"\u0000\u0000\u0000\fQ\u0001\u0000\u0000\u0000\u000eX\u0001\u0000\u0000"+
		"\u0000\u0010k\u0001\u0000\u0000\u0000\u0012m\u0001\u0000\u0000\u0000\u0014"+
		"}\u0001\u0000\u0000\u0000\u0016\u0080\u0001\u0000\u0000\u0000\u0018\u0082"+
		"\u0001\u0000\u0000\u0000\u001a\u008a\u0001\u0000\u0000\u0000\u001c\u009a"+
		"\u0001\u0000\u0000\u0000\u001e\u009c\u0001\u0000\u0000\u0000 \u00a0\u0001"+
		"\u0000\u0000\u0000\"\u00a2\u0001\u0000\u0000\u0000$\u00a4\u0001\u0000"+
		"\u0000\u0000&\u00ac\u0001\u0000\u0000\u0000(\u00bb\u0001\u0000\u0000\u0000"+
		"*\u00bd\u0001\u0000\u0000\u0000,\u00c1\u0001\u0000\u0000\u0000.1\u0003"+
		"\u0002\u0001\u0000/1\u0003\u0012\t\u00000.\u0001\u0000\u0000\u00000/\u0001"+
		"\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000056\u0005\u0000\u0000\u00016\u0001\u0001\u0000\u0000\u00007=\u0003"+
		"\u0004\u0002\u00008=\u0003\u0006\u0003\u00009=\u0003\b\u0004\u0000:=\u0003"+
		"\n\u0005\u0000;=\u0003\u0010\b\u0000<7\u0001\u0000\u0000\u0000<8\u0001"+
		"\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<;\u0001\u0000\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>?\u0005\u0001"+
		"\u0000\u0000?@\u0005&\u0000\u0000@A\u0005\u001c\u0000\u0000AB\u0003,\u0016"+
		"\u0000BC\u0005\u0010\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005"+
		"&\u0000\u0000EF\u0005\u001c\u0000\u0000FG\u0003,\u0016\u0000GH\u0005\u0010"+
		"\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u0002\u0000\u0000"+
		"JK\u0003,\u0016\u0000KL\u0005\u0010\u0000\u0000L\t\u0001\u0000\u0000\u0000"+
		"MP\u0003\f\u0006\u0000NP\u0003\u000e\u0007\u0000OM\u0001\u0000\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000P\u000b\u0001\u0000\u0000\u0000QR\u0005\u0006"+
		"\u0000\u0000RS\u0003\u0016\u000b\u0000ST\u0005\u0007\u0000\u0000TU\u0005"+
		"\u000f\u0000\u0000UV\u0003\u0014\n\u0000VW\u0005\u0005\u0000\u0000W\r"+
		"\u0001\u0000\u0000\u0000XY\u0005\b\u0000\u0000YZ\u0005&\u0000\u0000Z["+
		"\u0005\t\u0000\u0000[\\\u0003$\u0012\u0000\\]\u0005\n\u0000\u0000]`\u0003"+
		"$\u0012\u0000^_\u0005\u000b\u0000\u0000_a\u0003$\u0012\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005"+
		"\u0007\u0000\u0000cd\u0005\u000f\u0000\u0000de\u0003\u0014\n\u0000ef\u0005"+
		"\u0005\u0000\u0000f\u000f\u0001\u0000\u0000\u0000gh\u0005\f\u0000\u0000"+
		"hl\u0005\u0010\u0000\u0000ij\u0005\r\u0000\u0000jl\u0005\u0010\u0000\u0000"+
		"kg\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000l\u0011\u0001\u0000"+
		"\u0000\u0000mn\u0003\u0016\u000b\u0000no\u0005\u000e\u0000\u0000op\u0005"+
		"\u0003\u0000\u0000pq\u0005\u000f\u0000\u0000qu\u0003\u0014\n\u0000rs\u0005"+
		"\u0004\u0000\u0000st\u0005\u000f\u0000\u0000tv\u0003\u0014\n\u0000ur\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0005\u0005\u0000\u0000x\u0013\u0001\u0000\u0000\u0000y|\u0003\u0002"+
		"\u0001\u0000z|\u0003\u0012\t\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0015\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0003\u0018\f\u0000\u0081\u0017\u0001\u0000"+
		"\u0000\u0000\u0082\u0087\u0003\u001a\r\u0000\u0083\u0084\u0005\u0018\u0000"+
		"\u0000\u0084\u0086\u0003\u001a\r\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0019\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008f\u0003\u001c\u000e\u0000"+
		"\u008b\u008c\u0005\u0017\u0000\u0000\u008c\u008e\u0003\u001c\u000e\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u001b\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\u0019\u0000\u0000\u0093\u009b\u0003\u001c\u000e\u0000"+
		"\u0094\u0095\u0005\u001f\u0000\u0000\u0095\u0096\u0003\u0016\u000b\u0000"+
		"\u0096\u0097\u0005 \u0000\u0000\u0097\u009b\u0001\u0000\u0000\u0000\u0098"+
		"\u009b\u0003\u001e\u000f\u0000\u0099\u009b\u0003 \u0010\u0000\u009a\u0092"+
		"\u0001\u0000\u0000\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u001d"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0003$\u0012\u0000\u009d\u009e\u0003"+
		"\"\u0011\u0000\u009e\u009f\u0003$\u0012\u0000\u009f\u001f\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0007\u0000\u0000\u0000\u00a1!\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0007\u0001\u0000\u0000\u00a3#\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a9\u0003&\u0013\u0000\u00a5\u00a6\u0007\u0002\u0000\u0000\u00a6"+
		"\u00a8\u0003&\u0013\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa%\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b1\u0003(\u0014\u0000\u00ad\u00ae\u0007\u0003"+
		"\u0000\u0000\u00ae\u00b0\u0003(\u0014\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\'\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u001b\u0000\u0000"+
		"\u00b5\u00bc\u0003(\u0014\u0000\u00b6\u00b7\u0005\u001f\u0000\u0000\u00b7"+
		"\u00b8\u0003$\u0012\u0000\u00b8\u00b9\u0005 \u0000\u0000\u00b9\u00bc\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bc\u0003*\u0015\u0000\u00bb\u00b4\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc)\u0001\u0000\u0000\u0000\u00bd\u00be\u0007\u0004\u0000"+
		"\u0000\u00be+\u0001\u0000\u0000\u0000\u00bf\u00c2\u0003$\u0012\u0000\u00c0"+
		"\u00c2\u0003\u0016\u000b\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2-\u0001\u0000\u0000\u0000\u001002"+
		"<O`ku{}\u0087\u008f\u009a\u00a9\u00b1\u00bb\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}