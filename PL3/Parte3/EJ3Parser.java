// Generated from EJ3Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EJ3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASIGNAR=1, MOSTRAR=2, SI=3, SI_NO=4, TERMINAR=5, MIENTRAS=6, HACER=7, 
		PARA=8, DESDE=9, HASTA=10, PASO=11, ROMPER=12, CONTINUAR=13, MARCA_COND=14, 
		FLECHA=15, FIN_LINEA=16, IGUAL=17, DISTINTO=18, MENOR_IGUAL=19, MAYOR_IGUAL=20, 
		MENOR=21, MAYOR=22, AND=23, OR=24, NOT=25, SUMA=26, RESTA=27, ASIGNACION=28, 
		MULT=29, DIV=30, POT=31, MOD=32, PAREN_ABRE=33, PAREN_CIERRA=34, VERDADERO=35, 
		FALSO=36, INT=37, FLOAT=38, STRING=39, ID=40, COMENTARIO=41, ESPACIO=42;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_declaracion = 2, RULE_asignacion = 3, 
		RULE_impresion = 4, RULE_bucle = 5, RULE_bucle_mientras = 6, RULE_bucle_para = 7, 
		RULE_control_bucle = 8, RULE_condicional = 9, RULE_bloque = 10, RULE_condicion = 11, 
		RULE_bool_o = 12, RULE_bool_y = 13, RULE_bool_no = 14, RULE_operando_cmp = 15, 
		RULE_comparacion = 16, RULE_booleano = 17, RULE_operador_relacional = 18, 
		RULE_expresion = 19, RULE_termino = 20, RULE_potencia = 21, RULE_factor = 22, 
		RULE_atomo = 23, RULE_expr_general = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "declaracion", "asignacion", "impresion", "bucle", 
			"bucle_mientras", "bucle_para", "control_bucle", "condicional", "bloque", 
			"condicion", "bool_o", "bool_y", "bool_no", "operando_cmp", "comparacion", 
			"booleano", "operador_relacional", "expresion", "termino", "potencia", 
			"factor", "atomo", "expr_general"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'asignar'", "'mostrar'", "'si'", "'no'", "'terminar'", "'mientras'", 
			"'hacer'", "'para'", "'desde'", "'hasta'", "'paso'", "'romper'", "'continuar'", 
			"'???'", "'->'", "';P'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", 
			"'and'", "'or'", "'not'", "'+'", "'-'", "'='", "'*'", "'/'", "'^'", "'%'", 
			"'('", "')'", "'verdadero'", "'falso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASIGNAR", "MOSTRAR", "SI", "SI_NO", "TERMINAR", "MIENTRAS", "HACER", 
			"PARA", "DESDE", "HASTA", "PASO", "ROMPER", "CONTINUAR", "MARCA_COND", 
			"FLECHA", "FIN_LINEA", "IGUAL", "DISTINTO", "MENOR_IGUAL", "MAYOR_IGUAL", 
			"MENOR", "MAYOR", "AND", "OR", "NOT", "SUMA", "RESTA", "ASIGNACION", 
			"MULT", "DIV", "POT", "MOD", "PAREN_ABRE", "PAREN_CIERRA", "VERDADERO", 
			"FALSO", "INT", "FLOAT", "STRING", "ID", "COMENTARIO", "ESPACIO"
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
	public String getGrammarFileName() { return "EJ3Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EJ3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EJ3Parser.EOF, 0); }
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
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitPrograma(this);
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
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2173421236550L) != 0)) {
				{
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(50);
					sentencia();
					}
					break;
				case 2:
					{
					setState(51);
					condicional();
					}
					break;
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGNAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				declaracion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				asignacion();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				impresion();
				}
				break;
			case MIENTRAS:
			case PARA:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				bucle();
				}
				break;
			case ROMPER:
			case CONTINUAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
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
		public Token id;
		public Expr_generalContext valor;
		public TerminalNode ASIGNAR() { return getToken(EJ3Parser.ASIGNAR, 0); }
		public TerminalNode ASIGNACION() { return getToken(EJ3Parser.ASIGNACION, 0); }
		public TerminalNode FIN_LINEA() { return getToken(EJ3Parser.FIN_LINEA, 0); }
		public TerminalNode ID() { return getToken(EJ3Parser.ID, 0); }
		public Expr_generalContext expr_general() {
			return getRuleContext(Expr_generalContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ASIGNAR);
			setState(67);
			((DeclaracionContext)_localctx).id = match(ID);
			setState(68);
			match(ASIGNACION);
			setState(69);
			((DeclaracionContext)_localctx).valor = expr_general();
			setState(70);
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
		public Token id;
		public Expr_generalContext valor;
		public TerminalNode ASIGNACION() { return getToken(EJ3Parser.ASIGNACION, 0); }
		public TerminalNode FIN_LINEA() { return getToken(EJ3Parser.FIN_LINEA, 0); }
		public TerminalNode ID() { return getToken(EJ3Parser.ID, 0); }
		public Expr_generalContext expr_general() {
			return getRuleContext(Expr_generalContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((AsignacionContext)_localctx).id = match(ID);
			setState(73);
			match(ASIGNACION);
			setState(74);
			((AsignacionContext)_localctx).valor = expr_general();
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
	public static class ImpresionContext extends ParserRuleContext {
		public Expr_generalContext expr;
		public TerminalNode MOSTRAR() { return getToken(EJ3Parser.MOSTRAR, 0); }
		public TerminalNode FIN_LINEA() { return getToken(EJ3Parser.FIN_LINEA, 0); }
		public Expr_generalContext expr_general() {
			return getRuleContext(Expr_generalContext.class,0);
		}
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(MOSTRAR);
			setState(78);
			((ImpresionContext)_localctx).expr = expr_general();
			setState(79);
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
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitBucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitBucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bucle);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIENTRAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				bucle_mientras();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
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
		public CondicionContext cond;
		public BloqueContext cuerpo;
		public TerminalNode MIENTRAS() { return getToken(EJ3Parser.MIENTRAS, 0); }
		public TerminalNode HACER() { return getToken(EJ3Parser.HACER, 0); }
		public TerminalNode FLECHA() { return getToken(EJ3Parser.FLECHA, 0); }
		public TerminalNode TERMINAR() { return getToken(EJ3Parser.TERMINAR, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Bucle_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterBucle_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitBucle_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitBucle_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bucle_mientrasContext bucle_mientras() throws RecognitionException {
		Bucle_mientrasContext _localctx = new Bucle_mientrasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bucle_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(MIENTRAS);
			setState(86);
			((Bucle_mientrasContext)_localctx).cond = condicion();
			setState(87);
			match(HACER);
			setState(88);
			match(FLECHA);
			setState(89);
			((Bucle_mientrasContext)_localctx).cuerpo = bloque();
			setState(90);
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
		public Token var;
		public ExpresionContext inicio;
		public ExpresionContext fin;
		public ExpresionContext paso;
		public BloqueContext cuerpo;
		public TerminalNode PARA() { return getToken(EJ3Parser.PARA, 0); }
		public TerminalNode DESDE() { return getToken(EJ3Parser.DESDE, 0); }
		public TerminalNode HASTA() { return getToken(EJ3Parser.HASTA, 0); }
		public TerminalNode HACER() { return getToken(EJ3Parser.HACER, 0); }
		public TerminalNode FLECHA() { return getToken(EJ3Parser.FLECHA, 0); }
		public TerminalNode TERMINAR() { return getToken(EJ3Parser.TERMINAR, 0); }
		public TerminalNode ID() { return getToken(EJ3Parser.ID, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode PASO() { return getToken(EJ3Parser.PASO, 0); }
		public Bucle_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterBucle_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitBucle_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitBucle_para(this);
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
			setState(92);
			match(PARA);
			setState(93);
			((Bucle_paraContext)_localctx).var = match(ID);
			setState(94);
			match(DESDE);
			setState(95);
			((Bucle_paraContext)_localctx).inicio = expresion();
			setState(96);
			match(HASTA);
			setState(97);
			((Bucle_paraContext)_localctx).fin = expresion();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASO) {
				{
				setState(98);
				match(PASO);
				setState(99);
				((Bucle_paraContext)_localctx).paso = expresion();
				}
			}

			setState(102);
			match(HACER);
			setState(103);
			match(FLECHA);
			setState(104);
			((Bucle_paraContext)_localctx).cuerpo = bloque();
			setState(105);
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
		public TerminalNode ROMPER() { return getToken(EJ3Parser.ROMPER, 0); }
		public TerminalNode FIN_LINEA() { return getToken(EJ3Parser.FIN_LINEA, 0); }
		public TerminalNode CONTINUAR() { return getToken(EJ3Parser.CONTINUAR, 0); }
		public Control_bucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterControl_bucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitControl_bucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitControl_bucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_bucleContext control_bucle() throws RecognitionException {
		Control_bucleContext _localctx = new Control_bucleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_control_bucle);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROMPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(ROMPER);
				setState(108);
				match(FIN_LINEA);
				}
				break;
			case CONTINUAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(CONTINUAR);
				setState(110);
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
		public CondicionContext cond;
		public BloqueContext thenBlock;
		public BloqueContext elseBlock;
		public TerminalNode MARCA_COND() { return getToken(EJ3Parser.MARCA_COND, 0); }
		public TerminalNode SI() { return getToken(EJ3Parser.SI, 0); }
		public List<TerminalNode> FLECHA() { return getTokens(EJ3Parser.FLECHA); }
		public TerminalNode FLECHA(int i) {
			return getToken(EJ3Parser.FLECHA, i);
		}
		public TerminalNode TERMINAR() { return getToken(EJ3Parser.TERMINAR, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode SI_NO() { return getToken(EJ3Parser.SI_NO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitCondicional(this);
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
			setState(113);
			((CondicionalContext)_localctx).cond = condicion();
			setState(114);
			match(MARCA_COND);
			setState(115);
			match(SI);
			setState(116);
			match(FLECHA);
			setState(117);
			((CondicionalContext)_localctx).thenBlock = bloque();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI_NO) {
				{
				setState(118);
				match(SI_NO);
				setState(119);
				match(FLECHA);
				setState(120);
				((CondicionalContext)_localctx).elseBlock = bloque();
				}
			}

			setState(123);
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
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitBloque(this);
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
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2173421236550L) != 0)) {
				{
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(125);
					sentencia();
					}
					break;
				case 2:
					{
					setState(126);
					condicional();
					}
					break;
				}
				}
				setState(131);
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
		public Bool_oContext raiz;
		public Bool_oContext bool_o() {
			return getRuleContext(Bool_oContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			((CondicionContext)_localctx).raiz = bool_o();
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
		public Bool_oContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_o; }
	 
		public Bool_oContext() { }
		public void copyFrom(Bool_oContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolOrContext extends Bool_oContext {
		public Bool_yContext left;
		public Token OR;
		public List<Token> ops = new ArrayList<Token>();
		public Bool_yContext bool_y;
		public List<Bool_yContext> rights = new ArrayList<Bool_yContext>();
		public List<Bool_yContext> bool_y() {
			return getRuleContexts(Bool_yContext.class);
		}
		public Bool_yContext bool_y(int i) {
			return getRuleContext(Bool_yContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(EJ3Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(EJ3Parser.OR, i);
		}
		public BoolOrContext(Bool_oContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterBoolOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitBoolOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitBoolOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_oContext bool_o() throws RecognitionException {
		Bool_oContext _localctx = new Bool_oContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_o);
		int _la;
		try {
			_localctx = new BoolOrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((BoolOrContext)_localctx).left = bool_y();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(135);
				((BoolOrContext)_localctx).OR = match(OR);
				((BoolOrContext)_localctx).ops.add(((BoolOrContext)_localctx).OR);
				setState(136);
				((BoolOrContext)_localctx).bool_y = bool_y();
				((BoolOrContext)_localctx).rights.add(((BoolOrContext)_localctx).bool_y);
				}
				}
				setState(141);
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
		public Bool_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_y; }
	 
		public Bool_yContext() { }
		public void copyFrom(Bool_yContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolAndContext extends Bool_yContext {
		public Bool_noContext left;
		public Token AND;
		public List<Token> ops = new ArrayList<Token>();
		public Bool_noContext bool_no;
		public List<Bool_noContext> rights = new ArrayList<Bool_noContext>();
		public List<Bool_noContext> bool_no() {
			return getRuleContexts(Bool_noContext.class);
		}
		public Bool_noContext bool_no(int i) {
			return getRuleContext(Bool_noContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(EJ3Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(EJ3Parser.AND, i);
		}
		public BoolAndContext(Bool_yContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterBoolAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitBoolAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitBoolAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_yContext bool_y() throws RecognitionException {
		Bool_yContext _localctx = new Bool_yContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_y);
		int _la;
		try {
			_localctx = new BoolAndContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((BoolAndContext)_localctx).left = bool_no();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(143);
				((BoolAndContext)_localctx).AND = match(AND);
				((BoolAndContext)_localctx).ops.add(((BoolAndContext)_localctx).AND);
				setState(144);
				((BoolAndContext)_localctx).bool_no = bool_no();
				((BoolAndContext)_localctx).rights.add(((BoolAndContext)_localctx).bool_no);
				}
				}
				setState(149);
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
		public Bool_noContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_no; }
	 
		public Bool_noContext() { }
		public void copyFrom(Bool_noContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolCompContext extends Bool_noContext {
		public ComparacionContext comp;
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public BoolCompContext(Bool_noContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterBoolComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitBoolComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitBoolComp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolAtomContext extends Bool_noContext {
		public BooleanoContext bool;
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public BoolAtomContext(Bool_noContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterBoolAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitBoolAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitBoolAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolNotContext extends Bool_noContext {
		public Bool_noContext negado;
		public TerminalNode NOT() { return getToken(EJ3Parser.NOT, 0); }
		public Bool_noContext bool_no() {
			return getRuleContext(Bool_noContext.class,0);
		}
		public BoolNotContext(Bool_noContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterBoolNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitBoolNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitBoolNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolParenContext extends Bool_noContext {
		public CondicionContext inner;
		public TerminalNode PAREN_ABRE() { return getToken(EJ3Parser.PAREN_ABRE, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(EJ3Parser.PAREN_CIERRA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public BoolParenContext(Bool_noContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterBoolParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitBoolParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitBoolParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_noContext bool_no() throws RecognitionException {
		Bool_noContext _localctx = new Bool_noContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool_no);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new BoolNotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(NOT);
				setState(151);
				((BoolNotContext)_localctx).negado = bool_no();
				}
				break;
			case 2:
				_localctx = new BoolParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(PAREN_ABRE);
				setState(153);
				((BoolParenContext)_localctx).inner = condicion();
				setState(154);
				match(PAREN_CIERRA);
				}
				break;
			case 3:
				_localctx = new BoolCompContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				((BoolCompContext)_localctx).comp = comparacion();
				}
				break;
			case 4:
				_localctx = new BoolAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				((BoolAtomContext)_localctx).bool = booleano();
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
	public static class Operando_cmpContext extends ParserRuleContext {
		public ExpresionContext expr;
		public BooleanoContext bool;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public Operando_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterOperando_cmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitOperando_cmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitOperando_cmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operando_cmpContext operando_cmp() throws RecognitionException {
		Operando_cmpContext _localctx = new Operando_cmpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operando_cmp);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				((Operando_cmpContext)_localctx).expr = expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				((Operando_cmpContext)_localctx).bool = booleano();
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
		public Operando_cmpContext left;
		public Operador_relacionalContext op;
		public Operando_cmpContext right;
		public List<Operando_cmpContext> operando_cmp() {
			return getRuleContexts(Operando_cmpContext.class);
		}
		public Operando_cmpContext operando_cmp(int i) {
			return getRuleContext(Operando_cmpContext.class,i);
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
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((ComparacionContext)_localctx).left = operando_cmp();
			setState(165);
			((ComparacionContext)_localctx).op = operador_relacional();
			setState(166);
			((ComparacionContext)_localctx).right = operando_cmp();
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
		public Token id;
		public TerminalNode VERDADERO() { return getToken(EJ3Parser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(EJ3Parser.FALSO, 0); }
		public TerminalNode ID() { return getToken(EJ3Parser.ID, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_booleano);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(VERDADERO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(FALSO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				((BooleanoContext)_localctx).id = match(ID);
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
	public static class Operador_relacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(EJ3Parser.IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(EJ3Parser.DISTINTO, 0); }
		public TerminalNode MENOR() { return getToken(EJ3Parser.MENOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(EJ3Parser.MENOR_IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(EJ3Parser.MAYOR, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(EJ3Parser.MAYOR_IGUAL, 0); }
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitOperador_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitOperador_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprSumResContext extends ExpresionContext {
		public TerminoContext left;
		public Token SUMA;
		public List<Token> ops = new ArrayList<Token>();
		public Token RESTA;
		public Token _tset491;
		public TerminoContext termino;
		public List<TerminoContext> rights = new ArrayList<TerminoContext>();
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> SUMA() { return getTokens(EJ3Parser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(EJ3Parser.SUMA, i);
		}
		public List<TerminalNode> RESTA() { return getTokens(EJ3Parser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(EJ3Parser.RESTA, i);
		}
		public ExprSumResContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterExprSumRes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitExprSumRes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitExprSumRes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expresion);
		int _la;
		try {
			_localctx = new ExprSumResContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((ExprSumResContext)_localctx).left = termino();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==RESTA) {
				{
				{
				setState(176);
				((ExprSumResContext)_localctx)._tset491 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SUMA || _la==RESTA) ) {
					((ExprSumResContext)_localctx)._tset491 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((ExprSumResContext)_localctx).ops.add(((ExprSumResContext)_localctx)._tset491);
				setState(177);
				((ExprSumResContext)_localctx).termino = termino();
				((ExprSumResContext)_localctx).rights.add(((ExprSumResContext)_localctx).termino);
				}
				}
				setState(182);
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
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	 
		public TerminoContext() { }
		public void copyFrom(TerminoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMulDivModContext extends TerminoContext {
		public PotenciaContext left;
		public Token MULT;
		public List<Token> ops = new ArrayList<Token>();
		public Token DIV;
		public Token MOD;
		public Token _tset521;
		public PotenciaContext potencia;
		public List<PotenciaContext> rights = new ArrayList<PotenciaContext>();
		public List<PotenciaContext> potencia() {
			return getRuleContexts(PotenciaContext.class);
		}
		public PotenciaContext potencia(int i) {
			return getRuleContext(PotenciaContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(EJ3Parser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(EJ3Parser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(EJ3Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(EJ3Parser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(EJ3Parser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(EJ3Parser.MOD, i);
		}
		public ExprMulDivModContext(TerminoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterExprMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitExprMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitExprMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termino);
		int _la;
		try {
			_localctx = new ExprMulDivModContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((ExprMulDivModContext)_localctx).left = potencia();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5905580032L) != 0)) {
				{
				{
				setState(184);
				((ExprMulDivModContext)_localctx)._tset521 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 5905580032L) != 0)) ) {
					((ExprMulDivModContext)_localctx)._tset521 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((ExprMulDivModContext)_localctx).ops.add(((ExprMulDivModContext)_localctx)._tset521);
				setState(185);
				((ExprMulDivModContext)_localctx).potencia = potencia();
				((ExprMulDivModContext)_localctx).rights.add(((ExprMulDivModContext)_localctx).potencia);
				}
				}
				setState(190);
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
	public static class PotenciaContext extends ParserRuleContext {
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
	 
		public PotenciaContext() { }
		public void copyFrom(PotenciaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPowContext extends PotenciaContext {
		public FactorContext base;
		public PotenciaContext exp;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode POT() { return getToken(EJ3Parser.POT, 0); }
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public ExprPowContext(PotenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterExprPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitExprPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitExprPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_potencia);
		int _la;
		try {
			_localctx = new ExprPowContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((ExprPowContext)_localctx).base = factor();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POT) {
				{
				setState(192);
				match(POT);
				setState(193);
				((ExprPowContext)_localctx).exp = potencia();
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
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenContext extends FactorContext {
		public ExpresionContext inner;
		public TerminalNode PAREN_ABRE() { return getToken(EJ3Parser.PAREN_ABRE, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(EJ3Parser.PAREN_CIERRA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExprParenContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterExprParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitExprParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAtomContext extends FactorContext {
		public AtomoContext atom;
		public AtomoContext atomo() {
			return getRuleContext(AtomoContext.class,0);
		}
		public ExprAtomContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNegContext extends FactorContext {
		public FactorContext neg;
		public TerminalNode RESTA() { return getToken(EJ3Parser.RESTA, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExprNegContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterExprNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitExprNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitExprNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESTA:
				_localctx = new ExprNegContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(RESTA);
				setState(197);
				((ExprNegContext)_localctx).neg = factor();
				}
				break;
			case PAREN_ABRE:
				_localctx = new ExprParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(PAREN_ABRE);
				setState(199);
				((ExprParenContext)_localctx).inner = expresion();
				setState(200);
				match(PAREN_CIERRA);
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
			case ID:
				_localctx = new ExprAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				((ExprAtomContext)_localctx).atom = atomo();
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
		public Token intLit;
		public Token floatLit;
		public Token strLit;
		public Token id;
		public TerminalNode INT() { return getToken(EJ3Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(EJ3Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EJ3Parser.STRING, 0); }
		public TerminalNode ID() { return getToken(EJ3Parser.ID, 0); }
		public AtomoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterAtomo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitAtomo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitAtomo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomoContext atomo() throws RecognitionException {
		AtomoContext _localctx = new AtomoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atomo);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				((AtomoContext)_localctx).intLit = match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				((AtomoContext)_localctx).floatLit = match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				((AtomoContext)_localctx).strLit = match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				((AtomoContext)_localctx).id = match(ID);
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
	public static class Expr_generalContext extends ParserRuleContext {
		public Expr_generalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_general; }
	 
		public Expr_generalContext() { }
		public void copyFrom(Expr_generalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprGeneralBoolContext extends Expr_generalContext {
		public CondicionContext bool;
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public ExprGeneralBoolContext(Expr_generalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterExprGeneralBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitExprGeneralBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitExprGeneralBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprGeneralArithContext extends Expr_generalContext {
		public ExpresionContext arith;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExprGeneralArithContext(Expr_generalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).enterExprGeneralArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EJ3ParserListener ) ((EJ3ParserListener)listener).exitExprGeneralArith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EJ3ParserVisitor ) return ((EJ3ParserVisitor<? extends T>)visitor).visitExprGeneralArith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_generalContext expr_general() throws RecognitionException {
		Expr_generalContext _localctx = new Expr_generalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_general);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ExprGeneralArithContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				((ExprGeneralArithContext)_localctx).arith = expresion();
				}
				break;
			case 2:
				_localctx = new ExprGeneralBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				((ExprGeneralBoolContext)_localctx).bool = condicion();
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
		"\u0004\u0001*\u00d8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0005\u00005\b\u0000\n\u0000\f\u00008\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001A\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005T\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007e\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bp\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tz\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u0080\b\n\n\n\f\n\u0083"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u008a\b\f"+
		"\n\f\f\f\u008d\t\f\u0001\r\u0001\r\u0001\r\u0005\r\u0092\b\r\n\r\f\r\u0095"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009f\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00a3\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ac\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00b3"+
		"\b\u0013\n\u0013\f\u0013\u00b6\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u00bb\b\u0014\n\u0014\f\u0014\u00be\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00c3\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00cc"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00d2"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u00d6\b\u0018\u0001\u0018"+
		"\u0000\u0000\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0003\u0001\u0000\u0011"+
		"\u0016\u0001\u0000\u001a\u001b\u0002\u0000\u001d\u001e  \u00db\u00006"+
		"\u0001\u0000\u0000\u0000\u0002@\u0001\u0000\u0000\u0000\u0004B\u0001\u0000"+
		"\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000"+
		"\nS\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000"+
		"\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012q\u0001\u0000\u0000\u0000"+
		"\u0014\u0081\u0001\u0000\u0000\u0000\u0016\u0084\u0001\u0000\u0000\u0000"+
		"\u0018\u0086\u0001\u0000\u0000\u0000\u001a\u008e\u0001\u0000\u0000\u0000"+
		"\u001c\u009e\u0001\u0000\u0000\u0000\u001e\u00a2\u0001\u0000\u0000\u0000"+
		" \u00a4\u0001\u0000\u0000\u0000\"\u00ab\u0001\u0000\u0000\u0000$\u00ad"+
		"\u0001\u0000\u0000\u0000&\u00af\u0001\u0000\u0000\u0000(\u00b7\u0001\u0000"+
		"\u0000\u0000*\u00bf\u0001\u0000\u0000\u0000,\u00cb\u0001\u0000\u0000\u0000"+
		".\u00d1\u0001\u0000\u0000\u00000\u00d5\u0001\u0000\u0000\u000025\u0003"+
		"\u0002\u0001\u000035\u0003\u0012\t\u000042\u0001\u0000\u0000\u000043\u0001"+
		"\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u00009:\u0005\u0000\u0000\u0001:\u0001\u0001\u0000\u0000\u0000;A\u0003"+
		"\u0004\u0002\u0000<A\u0003\u0006\u0003\u0000=A\u0003\b\u0004\u0000>A\u0003"+
		"\n\u0005\u0000?A\u0003\u0010\b\u0000@;\u0001\u0000\u0000\u0000@<\u0001"+
		"\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@?\u0001\u0000\u0000\u0000A\u0003\u0001\u0000\u0000\u0000BC\u0005\u0001"+
		"\u0000\u0000CD\u0005(\u0000\u0000DE\u0005\u001c\u0000\u0000EF\u00030\u0018"+
		"\u0000FG\u0005\u0010\u0000\u0000G\u0005\u0001\u0000\u0000\u0000HI\u0005"+
		"(\u0000\u0000IJ\u0005\u001c\u0000\u0000JK\u00030\u0018\u0000KL\u0005\u0010"+
		"\u0000\u0000L\u0007\u0001\u0000\u0000\u0000MN\u0005\u0002\u0000\u0000"+
		"NO\u00030\u0018\u0000OP\u0005\u0010\u0000\u0000P\t\u0001\u0000\u0000\u0000"+
		"QT\u0003\f\u0006\u0000RT\u0003\u000e\u0007\u0000SQ\u0001\u0000\u0000\u0000"+
		"SR\u0001\u0000\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0005\u0006"+
		"\u0000\u0000VW\u0003\u0016\u000b\u0000WX\u0005\u0007\u0000\u0000XY\u0005"+
		"\u000f\u0000\u0000YZ\u0003\u0014\n\u0000Z[\u0005\u0005\u0000\u0000[\r"+
		"\u0001\u0000\u0000\u0000\\]\u0005\b\u0000\u0000]^\u0005(\u0000\u0000^"+
		"_\u0005\t\u0000\u0000_`\u0003&\u0013\u0000`a\u0005\n\u0000\u0000ad\u0003"+
		"&\u0013\u0000bc\u0005\u000b\u0000\u0000ce\u0003&\u0013\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0007\u0000\u0000gh\u0005\u000f\u0000\u0000hi\u0003\u0014\n\u0000ij\u0005"+
		"\u0005\u0000\u0000j\u000f\u0001\u0000\u0000\u0000kl\u0005\f\u0000\u0000"+
		"lp\u0005\u0010\u0000\u0000mn\u0005\r\u0000\u0000np\u0005\u0010\u0000\u0000"+
		"ok\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000p\u0011\u0001\u0000"+
		"\u0000\u0000qr\u0003\u0016\u000b\u0000rs\u0005\u000e\u0000\u0000st\u0005"+
		"\u0003\u0000\u0000tu\u0005\u000f\u0000\u0000uy\u0003\u0014\n\u0000vw\u0005"+
		"\u0004\u0000\u0000wx\u0005\u000f\u0000\u0000xz\u0003\u0014\n\u0000yv\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0005\u0005\u0000\u0000|\u0013\u0001\u0000\u0000\u0000}\u0080\u0003"+
		"\u0002\u0001\u0000~\u0080\u0003\u0012\t\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0015\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0003\u0018\f\u0000\u0085\u0017\u0001\u0000\u0000\u0000\u0086"+
		"\u008b\u0003\u001a\r\u0000\u0087\u0088\u0005\u0018\u0000\u0000\u0088\u008a"+
		"\u0003\u001a\r\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008d\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u0019\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u0093\u0003\u001c\u000e\u0000\u008f\u0090\u0005"+
		"\u0017\u0000\u0000\u0090\u0092\u0003\u001c\u000e\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u001b\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		"\u0019\u0000\u0000\u0097\u009f\u0003\u001c\u000e\u0000\u0098\u0099\u0005"+
		"!\u0000\u0000\u0099\u009a\u0003\u0016\u000b\u0000\u009a\u009b\u0005\""+
		"\u0000\u0000\u009b\u009f\u0001\u0000\u0000\u0000\u009c\u009f\u0003 \u0010"+
		"\u0000\u009d\u009f\u0003\"\u0011\u0000\u009e\u0096\u0001\u0000\u0000\u0000"+
		"\u009e\u0098\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u001d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a3\u0003&\u0013\u0000\u00a1\u00a3\u0003\"\u0011\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u001f\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\u001e\u000f\u0000\u00a5"+
		"\u00a6\u0003$\u0012\u0000\u00a6\u00a7\u0003\u001e\u000f\u0000\u00a7!\u0001"+
		"\u0000\u0000\u0000\u00a8\u00ac\u0005#\u0000\u0000\u00a9\u00ac\u0005$\u0000"+
		"\u0000\u00aa\u00ac\u0005(\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac#\u0001\u0000\u0000\u0000\u00ad\u00ae\u0007\u0000\u0000\u0000\u00ae"+
		"%\u0001\u0000\u0000\u0000\u00af\u00b4\u0003(\u0014\u0000\u00b0\u00b1\u0007"+
		"\u0001\u0000\u0000\u00b1\u00b3\u0003(\u0014\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\'\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00bc\u0003*\u0015\u0000"+
		"\u00b8\u00b9\u0007\u0002\u0000\u0000\u00b9\u00bb\u0003*\u0015\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		")\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c2"+
		"\u0003,\u0016\u0000\u00c0\u00c1\u0005\u001f\u0000\u0000\u00c1\u00c3\u0003"+
		"*\u0015\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3+\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u001b\u0000"+
		"\u0000\u00c5\u00cc\u0003,\u0016\u0000\u00c6\u00c7\u0005!\u0000\u0000\u00c7"+
		"\u00c8\u0003&\u0013\u0000\u00c8\u00c9\u0005\"\u0000\u0000\u00c9\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003.\u0017\u0000\u00cb\u00c4\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c6\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc-\u0001\u0000\u0000\u0000\u00cd\u00d2\u0005%\u0000"+
		"\u0000\u00ce\u00d2\u0005&\u0000\u0000\u00cf\u00d2\u0005\'\u0000\u0000"+
		"\u00d0\u00d2\u0005(\u0000\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000\u00d1"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2/\u0001\u0000\u0000\u0000\u00d3\u00d6"+
		"\u0003&\u0013\u0000\u00d4\u00d6\u0003\u0016\u000b\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d61\u0001\u0000"+
		"\u0000\u0000\u001446@Sdoy\u007f\u0081\u008b\u0093\u009e\u00a2\u00ab\u00b4"+
		"\u00bc\u00c2\u00cb\u00d1\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}