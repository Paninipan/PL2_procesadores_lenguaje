// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/Ex1/Ejercicio2/IkeaParser.g4 by ANTLR 4.13.2
package Ejercicio2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IkeaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO_MONTAJE=1, FIN=2, COMO=3, EXTENSION_DE=4, INSERTAR=5, UNIR=6, MARTILLAR=7, 
		COLOCAR=8, GIRAR=9, CONECTAR=10, MARCAR=11, NIVELAR=12, FIJAR=13, EN=14, 
		PARA=15, CON=16, Y=17, A=18, SOBRE=19, DE=20, HACIA=21, MUEBLE=22, HERRAMIENTA=23, 
		HERRAJE=24, PIEZA=25, ESTE_MODULO=26, OPCIONAL=27, ORIENTACION=28, POSICION=29, 
		JUNTO_A=30, UD_MEDIDA=31, GUION=32, PUNTOYCOMA=33, PUNTO=34, PAREN_ABRE=35, 
		PAREN_CIERRA=36, COMA=37, REPETIR=38, VECES=39, CUIDADO=40, NUMERO=41, 
		MEDIDA=42, NOMBRE=43, COMENTARIO=44, ESPACIO=45, ESPACIOHERRAMIENTA=46, 
		TIPOHERRAMIENTA=47, ESPACIOHERRAJE=48, TIPOHERRAJE=49, ESPACIOANUNCIO=50, 
		ANUNCIO=51;
	public static final int
		RULE_programa = 0, RULE_declaracion_inicio = 1, RULE_declaracion_fin = 2, 
		RULE_paso = 3, RULE_comentario = 4, RULE_accion = 5, RULE_pieza = 6, RULE_mueble_referencia = 7, 
		RULE_id = 8, RULE_herramienta = 9, RULE_herramienta_lista = 10, RULE_herraje_lista = 11, 
		RULE_id_herraje = 12, RULE_distancia = 13, RULE_posicion = 14, RULE_veces = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracion_inicio", "declaracion_fin", "paso", "comentario", 
			"accion", "pieza", "mueble_referencia", "id", "herramienta", "herramienta_lista", 
			"herraje_lista", "id_herraje", "distancia", "posicion", "veces"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INICIO_MONTAJE'", "'FIN'", "'COMO'", "'EXTENSION_DE'", "'INSERTAR'", 
			"'UNIR'", "'MARTILLAR'", "'COLOCAR'", "'GIRAR'", "'CONECTAR'", null, 
			"'NIVELAR'", null, "'EN'", "'PARA'", null, "'Y'", "'A'", "'SOBRE'", "'DE'", 
			"'HACIA'", "'MUEBLE'", "'HERRAMIENTA'", null, "'PIEZA'", "'ESTE_MODULO'", 
			"'OPCIONAL'", null, null, "'JUNTO_A'", null, "'-'", "';'", "'.'", "'('", 
			"')'", "','", "'REPETIR_PASOS'", "'VECES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INICIO_MONTAJE", "FIN", "COMO", "EXTENSION_DE", "INSERTAR", "UNIR", 
			"MARTILLAR", "COLOCAR", "GIRAR", "CONECTAR", "MARCAR", "NIVELAR", "FIJAR", 
			"EN", "PARA", "CON", "Y", "A", "SOBRE", "DE", "HACIA", "MUEBLE", "HERRAMIENTA", 
			"HERRAJE", "PIEZA", "ESTE_MODULO", "OPCIONAL", "ORIENTACION", "POSICION", 
			"JUNTO_A", "UD_MEDIDA", "GUION", "PUNTOYCOMA", "PUNTO", "PAREN_ABRE", 
			"PAREN_CIERRA", "COMA", "REPETIR", "VECES", "CUIDADO", "NUMERO", "MEDIDA", 
			"NOMBRE", "COMENTARIO", "ESPACIO", "ESPACIOHERRAMIENTA", "TIPOHERRAMIENTA", 
			"ESPACIOHERRAJE", "TIPOHERRAJE", "ESPACIOANUNCIO", "ANUNCIO"
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
	public String getGrammarFileName() { return "IkeaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IkeaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public Declaracion_inicioContext declaracion_inicio() {
			return getRuleContext(Declaracion_inicioContext.class,0);
		}
		public Declaracion_finContext declaracion_fin() {
			return getRuleContext(Declaracion_finContext.class,0);
		}
		public TerminalNode EOF() { return getToken(IkeaParser.EOF, 0); }
		public List<PasoContext> paso() {
			return getRuleContexts(PasoContext.class);
		}
		public PasoContext paso(int i) {
			return getRuleContext(PasoContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitPrograma(this);
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
			setState(32);
			declaracion_inicio();
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERO:
					{
					setState(33);
					paso();
					}
					break;
				case CUIDADO:
					{
					setState(34);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CUIDADO || _la==NUMERO );
			setState(39);
			declaracion_fin();
			setState(40);
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
	public static class Declaracion_inicioContext extends ParserRuleContext {
		public TerminalNode INICIO_MONTAJE() { return getToken(IkeaParser.INICIO_MONTAJE, 0); }
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
		public TerminalNode PUNTO() { return getToken(IkeaParser.PUNTO, 0); }
		public TerminalNode NOMBRE() { return getToken(IkeaParser.NOMBRE, 0); }
		public TerminalNode COMO() { return getToken(IkeaParser.COMO, 0); }
		public TerminalNode EXTENSION_DE() { return getToken(IkeaParser.EXTENSION_DE, 0); }
		public Mueble_referenciaContext mueble_referencia() {
			return getRuleContext(Mueble_referenciaContext.class,0);
		}
		public Declaracion_inicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterDeclaracion_inicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitDeclaracion_inicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitDeclaracion_inicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_inicioContext declaracion_inicio() throws RecognitionException {
		Declaracion_inicioContext _localctx = new Declaracion_inicioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(INICIO_MONTAJE);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOMBRE) {
				{
				setState(43);
				match(NOMBRE);
				}
			}

			setState(46);
			match(NUMERO);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMO) {
				{
				setState(47);
				match(COMO);
				setState(48);
				match(EXTENSION_DE);
				setState(49);
				mueble_referencia();
				}
			}

			setState(52);
			match(PUNTO);
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
	public static class Declaracion_finContext extends ParserRuleContext {
		public TerminalNode FIN() { return getToken(IkeaParser.FIN, 0); }
		public TerminalNode PUNTO() { return getToken(IkeaParser.PUNTO, 0); }
		public Declaracion_finContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_fin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterDeclaracion_fin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitDeclaracion_fin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitDeclaracion_fin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_finContext declaracion_fin() throws RecognitionException {
		Declaracion_finContext _localctx = new Declaracion_finContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion_fin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(FIN);
			setState(55);
			match(PUNTO);
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
	public static class PasoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
		public TerminalNode GUION() { return getToken(IkeaParser.GUION, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public TerminalNode PUNTO() { return getToken(IkeaParser.PUNTO, 0); }
		public List<TerminalNode> PUNTOYCOMA() { return getTokens(IkeaParser.PUNTOYCOMA); }
		public TerminalNode PUNTOYCOMA(int i) {
			return getToken(IkeaParser.PUNTOYCOMA, i);
		}
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterPaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitPaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitPaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(NUMERO);
			setState(58);
			match(GUION);
			setState(59);
			accion();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTOYCOMA) {
				{
				{
				setState(60);
				match(PUNTOYCOMA);
				setState(61);
				accion();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(PUNTO);
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
	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode CUIDADO() { return getToken(IkeaParser.CUIDADO, 0); }
		public TerminalNode ANUNCIO() { return getToken(IkeaParser.ANUNCIO, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CUIDADO);
			setState(70);
			match(ANUNCIO);
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
	public static class AccionContext extends ParserRuleContext {
		public TerminalNode INSERTAR() { return getToken(IkeaParser.INSERTAR, 0); }
		public Herraje_listaContext herraje_lista() {
			return getRuleContext(Herraje_listaContext.class,0);
		}
		public TerminalNode EN() { return getToken(IkeaParser.EN, 0); }
		public List<PiezaContext> pieza() {
			return getRuleContexts(PiezaContext.class);
		}
		public PiezaContext pieza(int i) {
			return getRuleContext(PiezaContext.class,i);
		}
		public List<TerminalNode> Y() { return getTokens(IkeaParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(IkeaParser.Y, i);
		}
		public List<TerminalNode> CON() { return getTokens(IkeaParser.CON); }
		public TerminalNode CON(int i) {
			return getToken(IkeaParser.CON, i);
		}
		public Herramienta_listaContext herramienta_lista() {
			return getRuleContext(Herramienta_listaContext.class,0);
		}
		public TerminalNode UNIR() { return getToken(IkeaParser.UNIR, 0); }
		public TerminalNode MARTILLAR() { return getToken(IkeaParser.MARTILLAR, 0); }
		public TerminalNode SOBRE() { return getToken(IkeaParser.SOBRE, 0); }
		public List<DistanciaContext> distancia() {
			return getRuleContexts(DistanciaContext.class);
		}
		public DistanciaContext distancia(int i) {
			return getRuleContext(DistanciaContext.class,i);
		}
		public List<PosicionContext> posicion() {
			return getRuleContexts(PosicionContext.class);
		}
		public PosicionContext posicion(int i) {
			return getRuleContext(PosicionContext.class,i);
		}
		public TerminalNode COLOCAR() { return getToken(IkeaParser.COLOCAR, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(IkeaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(IkeaParser.NUMERO, i);
		}
		public TerminalNode GIRAR() { return getToken(IkeaParser.GIRAR, 0); }
		public TerminalNode ORIENTACION() { return getToken(IkeaParser.ORIENTACION, 0); }
		public TerminalNode HACIA() { return getToken(IkeaParser.HACIA, 0); }
		public TerminalNode CONECTAR() { return getToken(IkeaParser.CONECTAR, 0); }
		public TerminalNode ESTE_MODULO() { return getToken(IkeaParser.ESTE_MODULO, 0); }
		public TerminalNode A() { return getToken(IkeaParser.A, 0); }
		public Mueble_referenciaContext mueble_referencia() {
			return getRuleContext(Mueble_referenciaContext.class,0);
		}
		public TerminalNode MARCAR() { return getToken(IkeaParser.MARCAR, 0); }
		public TerminalNode PARA() { return getToken(IkeaParser.PARA, 0); }
		public TerminalNode NIVELAR() { return getToken(IkeaParser.NIVELAR, 0); }
		public TerminalNode FIJAR() { return getToken(IkeaParser.FIJAR, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(IkeaParser.PAREN_ABRE, 0); }
		public TerminalNode OPCIONAL() { return getToken(IkeaParser.OPCIONAL, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(IkeaParser.PAREN_CIERRA, 0); }
		public TerminalNode REPETIR() { return getToken(IkeaParser.REPETIR, 0); }
		public VecesContext veces() {
			return getRuleContext(VecesContext.class,0);
		}
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterAccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitAccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitAccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_accion);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERTAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(INSERTAR);
				setState(73);
				herraje_lista();
				setState(74);
				match(EN);
				setState(75);
				pieza();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Y) {
					{
					{
					setState(76);
					match(Y);
					setState(77);
					pieza();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(83);
					match(CON);
					setState(84);
					herramienta_lista();
					}
				}

				}
				break;
			case UNIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(UNIR);
				setState(88);
				pieza();
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					match(Y);
					setState(90);
					pieza();
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Y );
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(95);
					match(CON);
					setState(96);
					pieza();
					}
					break;
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(99);
					match(CON);
					setState(100);
					herramienta_lista();
					}
				}

				}
				break;
			case MARTILLAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(MARTILLAR);
				setState(104);
				herraje_lista();
				setState(105);
				match(SOBRE);
				setState(106);
				pieza();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1074544640L) != 0)) {
					{
					setState(109);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case A:
						{
						setState(107);
						distancia();
						}
						break;
					case EN:
					case SOBRE:
					case JUNTO_A:
						{
						setState(108);
						posicion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(114);
					match(CON);
					setState(115);
					herramienta_lista();
					}
				}

				}
				break;
			case COLOCAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(COLOCAR);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMERO) {
					{
					setState(119);
					match(NUMERO);
					}
				}

				setState(122);
				pieza();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1074544640L) != 0)) {
					{
					setState(125);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case A:
						{
						setState(123);
						distancia();
						}
						break;
					case EN:
					case SOBRE:
					case JUNTO_A:
						{
						setState(124);
						posicion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case GIRAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(GIRAR);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EN || _la==HACIA) {
					{
					setState(131);
					_la = _input.LA(1);
					if ( !(_la==EN || _la==HACIA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(134);
				match(ORIENTACION);
				}
				break;
			case CONECTAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(CONECTAR);
				setState(136);
				match(ESTE_MODULO);
				setState(137);
				match(A);
				setState(138);
				mueble_referencia();
				setState(139);
				match(CON);
				setState(140);
				herraje_lista();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1074544640L) != 0)) {
					{
					setState(143);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case A:
						{
						setState(141);
						distancia();
						}
						break;
					case EN:
					case SOBRE:
					case JUNTO_A:
						{
						setState(142);
						posicion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(148);
					match(CON);
					setState(149);
					herramienta_lista();
					}
				}

				}
				break;
			case MARCAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				match(MARCAR);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARA) {
					{
					setState(153);
					match(PARA);
					}
				}

				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIEZA) {
					{
					setState(156);
					pieza();
					}
				}

				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1074544640L) != 0)) {
					{
					setState(161);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case A:
						{
						setState(159);
						distancia();
						}
						break;
					case EN:
					case SOBRE:
					case JUNTO_A:
						{
						setState(160);
						posicion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(166);
					match(CON);
					setState(167);
					herramienta_lista();
					}
				}

				}
				break;
			case NIVELAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(170);
				match(NIVELAR);
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PIEZA:
					{
					setState(171);
					pieza();
					}
					break;
				case MUEBLE:
					{
					setState(172);
					mueble_referencia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(175);
					match(CON);
					setState(176);
					herramienta_lista();
					}
				}

				}
				break;
			case FIJAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(179);
				match(FIJAR);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PAREN_ABRE) {
					{
					setState(180);
					match(PAREN_ABRE);
					setState(181);
					match(OPCIONAL);
					setState(182);
					match(PAREN_CIERRA);
					}
				}

				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(185);
					match(CON);
					}
				}

				setState(188);
				herraje_lista();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(189);
					match(CON);
					setState(190);
					herramienta_lista();
					}
				}

				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 10);
				{
				setState(193);
				match(REPETIR);
				setState(194);
				match(NUMERO);
				setState(195);
				match(A);
				setState(196);
				match(NUMERO);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PAREN_ABRE) {
					{
					setState(197);
					veces();
					}
				}

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
	public static class PiezaContext extends ParserRuleContext {
		public TerminalNode PIEZA() { return getToken(IkeaParser.PIEZA, 0); }
		public TerminalNode NOMBRE() { return getToken(IkeaParser.NOMBRE, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(IkeaParser.PAREN_ABRE, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(IkeaParser.PAREN_CIERRA, 0); }
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
		public PiezaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieza; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterPieza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitPieza(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitPieza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiezaContext pieza() throws RecognitionException {
		PiezaContext _localctx = new PiezaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pieza);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(PIEZA);
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_ABRE:
				{
				{
				setState(203);
				match(PAREN_ABRE);
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(204);
					match(NOMBRE);
					}
					break;
				case 2:
					{
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOMBRE) {
						{
						setState(205);
						match(NOMBRE);
						}
					}

					setState(208);
					match(NUMERO);
					}
					break;
				}
				setState(211);
				match(PAREN_CIERRA);
				}
				}
				break;
			case NOMBRE:
				{
				setState(212);
				match(NOMBRE);
				}
				break;
			case EN:
			case CON:
			case Y:
			case A:
			case SOBRE:
			case JUNTO_A:
			case PUNTOYCOMA:
			case PUNTO:
				break;
			default:
				break;
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
	public static class Mueble_referenciaContext extends ParserRuleContext {
		public TerminalNode MUEBLE() { return getToken(IkeaParser.MUEBLE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Mueble_referenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mueble_referencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterMueble_referencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitMueble_referencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitMueble_referencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mueble_referenciaContext mueble_referencia() throws RecognitionException {
		Mueble_referenciaContext _localctx = new Mueble_referenciaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mueble_referencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(MUEBLE);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_ABRE || _la==NOMBRE) {
				{
				setState(216);
				id();
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode PAREN_ABRE() { return getToken(IkeaParser.PAREN_ABRE, 0); }
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(IkeaParser.PAREN_CIERRA, 0); }
		public TerminalNode NOMBRE() { return getToken(IkeaParser.NOMBRE, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOMBRE) {
				{
				setState(219);
				match(NOMBRE);
				}
			}

			setState(222);
			match(PAREN_ABRE);
			setState(223);
			match(NUMERO);
			setState(224);
			match(PAREN_CIERRA);
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
	public static class HerramientaContext extends ParserRuleContext {
		public TerminalNode HERRAMIENTA() { return getToken(IkeaParser.HERRAMIENTA, 0); }
		public TerminalNode TIPOHERRAMIENTA() { return getToken(IkeaParser.TIPOHERRAMIENTA, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(IkeaParser.PAREN_ABRE, 0); }
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(IkeaParser.PAREN_CIERRA, 0); }
		public HerramientaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_herramienta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterHerramienta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitHerramienta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitHerramienta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HerramientaContext herramienta() throws RecognitionException {
		HerramientaContext _localctx = new HerramientaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_herramienta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(HERRAMIENTA);
			setState(227);
			match(TIPOHERRAMIENTA);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_ABRE) {
				{
				setState(228);
				match(PAREN_ABRE);
				setState(229);
				match(NUMERO);
				setState(230);
				match(PAREN_CIERRA);
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
	public static class Herramienta_listaContext extends ParserRuleContext {
		public List<HerramientaContext> herramienta() {
			return getRuleContexts(HerramientaContext.class);
		}
		public HerramientaContext herramienta(int i) {
			return getRuleContext(HerramientaContext.class,i);
		}
		public List<TerminalNode> Y() { return getTokens(IkeaParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(IkeaParser.Y, i);
		}
		public Herramienta_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_herramienta_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterHerramienta_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitHerramienta_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitHerramienta_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Herramienta_listaContext herramienta_lista() throws RecognitionException {
		Herramienta_listaContext _localctx = new Herramienta_listaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_herramienta_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			herramienta();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y) {
				{
				{
				setState(234);
				match(Y);
				setState(235);
				herramienta();
				}
				}
				setState(240);
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
	public static class Herraje_listaContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(IkeaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(IkeaParser.NUMERO, i);
		}
		public List<Id_herrajeContext> id_herraje() {
			return getRuleContexts(Id_herrajeContext.class);
		}
		public Id_herrajeContext id_herraje(int i) {
			return getRuleContext(Id_herrajeContext.class,i);
		}
		public List<TerminalNode> Y() { return getTokens(IkeaParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(IkeaParser.Y, i);
		}
		public Herraje_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_herraje_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterHerraje_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitHerraje_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitHerraje_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Herraje_listaContext herraje_lista() throws RecognitionException {
		Herraje_listaContext _localctx = new Herraje_listaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_herraje_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(NUMERO);
			setState(242);
			id_herraje();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y) {
				{
				{
				setState(243);
				match(Y);
				setState(244);
				match(NUMERO);
				setState(245);
				id_herraje();
				}
				}
				setState(250);
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
	public static class Id_herrajeContext extends ParserRuleContext {
		public TerminalNode HERRAJE() { return getToken(IkeaParser.HERRAJE, 0); }
		public TerminalNode TIPOHERRAJE() { return getToken(IkeaParser.TIPOHERRAJE, 0); }
		public Id_herrajeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_herraje; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterId_herraje(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitId_herraje(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitId_herraje(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_herrajeContext id_herraje() throws RecognitionException {
		Id_herrajeContext _localctx = new Id_herrajeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_id_herraje);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(HERRAJE);
			setState(252);
			match(TIPOHERRAJE);
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
	public static class DistanciaContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(IkeaParser.A, 0); }
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
		public TerminalNode UD_MEDIDA() { return getToken(IkeaParser.UD_MEDIDA, 0); }
		public TerminalNode DE() { return getToken(IkeaParser.DE, 0); }
		public PiezaContext pieza() {
			return getRuleContext(PiezaContext.class,0);
		}
		public DistanciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distancia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterDistancia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitDistancia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitDistancia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistanciaContext distancia() throws RecognitionException {
		DistanciaContext _localctx = new DistanciaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_distancia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(A);
			setState(255);
			match(NUMERO);
			setState(256);
			match(UD_MEDIDA);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DE) {
				{
				setState(257);
				match(DE);
				setState(258);
				pieza();
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
	public static class PosicionContext extends ParserRuleContext {
		public TerminalNode EN() { return getToken(IkeaParser.EN, 0); }
		public TerminalNode ORIENTACION() { return getToken(IkeaParser.ORIENTACION, 0); }
		public TerminalNode POSICION() { return getToken(IkeaParser.POSICION, 0); }
		public TerminalNode DE() { return getToken(IkeaParser.DE, 0); }
		public Mueble_referenciaContext mueble_referencia() {
			return getRuleContext(Mueble_referenciaContext.class,0);
		}
		public PiezaContext pieza() {
			return getRuleContext(PiezaContext.class,0);
		}
		public TerminalNode JUNTO_A() { return getToken(IkeaParser.JUNTO_A, 0); }
		public TerminalNode SOBRE() { return getToken(IkeaParser.SOBRE, 0); }
		public PosicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterPosicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitPosicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitPosicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosicionContext posicion() throws RecognitionException {
		PosicionContext _localctx = new PosicionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_posicion);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(261);
				match(EN);
				setState(262);
				_la = _input.LA(1);
				if ( !(_la==ORIENTACION || _la==POSICION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DE:
					{
					setState(263);
					match(DE);
					setState(264);
					mueble_referencia();
					}
					break;
				case PIEZA:
					{
					setState(265);
					pieza();
					}
					break;
				case EN:
				case CON:
				case A:
				case SOBRE:
				case JUNTO_A:
				case PUNTOYCOMA:
				case PUNTO:
					break;
				default:
					break;
				}
				}
				}
				break;
			case JUNTO_A:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(JUNTO_A);
				setState(271);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUEBLE:
					{
					setState(269);
					mueble_referencia();
					}
					break;
				case PIEZA:
					{
					setState(270);
					pieza();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SOBRE:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(SOBRE);
				setState(276);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUEBLE:
					{
					setState(274);
					mueble_referencia();
					}
					break;
				case PIEZA:
					{
					setState(275);
					pieza();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class VecesContext extends ParserRuleContext {
		public TerminalNode PAREN_ABRE() { return getToken(IkeaParser.PAREN_ABRE, 0); }
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
		public TerminalNode VECES() { return getToken(IkeaParser.VECES, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(IkeaParser.PAREN_CIERRA, 0); }
		public VecesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_veces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterVeces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitVeces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitVeces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VecesContext veces() throws RecognitionException {
		VecesContext _localctx = new VecesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_veces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(PAREN_ABRE);
			setState(281);
			match(NUMERO);
			setState(282);
			match(VECES);
			setState(283);
			match(PAREN_CIERRA);
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
		"\u0004\u00013\u011e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000$\b\u0000\u000b\u0000"+
		"\f\u0000%\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001-\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00013\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005O\b\u0005\n\u0005\f\u0005"+
		"R\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005V\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005\\\b\u0005\u000b\u0005\f\u0005"+
		"]\u0001\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005n\b\u0005\n\u0005\f\u0005q\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005u\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005y\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"~\b\u0005\n\u0005\f\u0005\u0081\t\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0085\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0090"+
		"\b\u0005\n\u0005\f\u0005\u0093\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0097\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009b\b\u0005\u0001"+
		"\u0005\u0003\u0005\u009e\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a2"+
		"\b\u0005\n\u0005\f\u0005\u00a5\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00a9\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ae\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b2\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b8\b\u0005\u0001\u0005\u0003"+
		"\u0005\u00bb\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c0"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00c7\b\u0005\u0003\u0005\u00c9\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00cf\b\u0006\u0001\u0006\u0003\u0006"+
		"\u00d2\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d6\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00da\b\u0007\u0001\b\u0003\b\u00dd\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00e8\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00ed\b\n\n\n\f\n"+
		"\u00f0\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00f7\b\u000b\n\u000b\f\u000b\u00fa\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0104\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010b"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0110\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0115\b\u000e\u0003\u000e"+
		"\u0117\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0002\u0002\u0000\u000e"+
		"\u000e\u0015\u0015\u0001\u0000\u001c\u001d\u0145\u0000 \u0001\u0000\u0000"+
		"\u0000\u0002*\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000\u0000\u0006"+
		"9\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\n\u00c8\u0001\u0000"+
		"\u0000\u0000\f\u00ca\u0001\u0000\u0000\u0000\u000e\u00d7\u0001\u0000\u0000"+
		"\u0000\u0010\u00dc\u0001\u0000\u0000\u0000\u0012\u00e2\u0001\u0000\u0000"+
		"\u0000\u0014\u00e9\u0001\u0000\u0000\u0000\u0016\u00f1\u0001\u0000\u0000"+
		"\u0000\u0018\u00fb\u0001\u0000\u0000\u0000\u001a\u00fe\u0001\u0000\u0000"+
		"\u0000\u001c\u0116\u0001\u0000\u0000\u0000\u001e\u0118\u0001\u0000\u0000"+
		"\u0000 #\u0003\u0002\u0001\u0000!$\u0003\u0006\u0003\u0000\"$\u0003\b"+
		"\u0004\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'(\u0003\u0004\u0002\u0000()\u0005\u0000\u0000"+
		"\u0001)\u0001\u0001\u0000\u0000\u0000*,\u0005\u0001\u0000\u0000+-\u0005"+
		"+\u0000\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.2\u0005)\u0000\u0000/0\u0005\u0003\u0000\u000001\u0005"+
		"\u0004\u0000\u000013\u0003\u000e\u0007\u00002/\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0005\"\u0000\u0000"+
		"5\u0003\u0001\u0000\u0000\u000067\u0005\u0002\u0000\u000078\u0005\"\u0000"+
		"\u00008\u0005\u0001\u0000\u0000\u00009:\u0005)\u0000\u0000:;\u0005 \u0000"+
		"\u0000;@\u0003\n\u0005\u0000<=\u0005!\u0000\u0000=?\u0003\n\u0005\u0000"+
		"><\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000CD\u0005\"\u0000\u0000D\u0007\u0001\u0000\u0000\u0000EF\u0005"+
		"(\u0000\u0000FG\u00053\u0000\u0000G\t\u0001\u0000\u0000\u0000HI\u0005"+
		"\u0005\u0000\u0000IJ\u0003\u0016\u000b\u0000JK\u0005\u000e\u0000\u0000"+
		"KP\u0003\f\u0006\u0000LM\u0005\u0011\u0000\u0000MO\u0003\f\u0006\u0000"+
		"NL\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QU\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000ST\u0005\u0010\u0000\u0000TV\u0003\u0014\n\u0000US\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000V\u00c9\u0001\u0000\u0000\u0000"+
		"WX\u0005\u0006\u0000\u0000X[\u0003\f\u0006\u0000YZ\u0005\u0011\u0000\u0000"+
		"Z\\\u0003\f\u0006\u0000[Y\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^a\u0001\u0000"+
		"\u0000\u0000_`\u0005\u0010\u0000\u0000`b\u0003\f\u0006\u0000a_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000cd\u0005"+
		"\u0010\u0000\u0000df\u0003\u0014\n\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000f\u00c9\u0001\u0000\u0000\u0000gh\u0005\u0007\u0000"+
		"\u0000hi\u0003\u0016\u000b\u0000ij\u0005\u0013\u0000\u0000jo\u0003\f\u0006"+
		"\u0000kn\u0003\u001a\r\u0000ln\u0003\u001c\u000e\u0000mk\u0001\u0000\u0000"+
		"\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pt\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000rs\u0005\u0010\u0000\u0000su\u0003\u0014\n\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u00c9\u0001\u0000\u0000"+
		"\u0000vx\u0005\b\u0000\u0000wy\u0005)\u0000\u0000xw\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u007f\u0003"+
		"\f\u0006\u0000{~\u0003\u001a\r\u0000|~\u0003\u001c\u000e\u0000}{\u0001"+
		"\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u00c9\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0005\t\u0000\u0000\u0083\u0085\u0007\u0000\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u00c9\u0005\u001c\u0000\u0000\u0087"+
		"\u0088\u0005\n\u0000\u0000\u0088\u0089\u0005\u001a\u0000\u0000\u0089\u008a"+
		"\u0005\u0012\u0000\u0000\u008a\u008b\u0003\u000e\u0007\u0000\u008b\u008c"+
		"\u0005\u0010\u0000\u0000\u008c\u0091\u0003\u0016\u000b\u0000\u008d\u0090"+
		"\u0003\u001a\r\u0000\u008e\u0090\u0003\u001c\u000e\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0096\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\u0010\u0000\u0000\u0095\u0097\u0003"+
		"\u0014\n\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u00c9\u0001\u0000\u0000\u0000\u0098\u009a\u0005\u000b"+
		"\u0000\u0000\u0099\u009b\u0005\u000f\u0000\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0003\f\u0006\u0000\u009d\u009c\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a3\u0001\u0000\u0000"+
		"\u0000\u009f\u00a2\u0003\u001a\r\u0000\u00a0\u00a2\u0003\u001c\u000e\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0010\u0000\u0000"+
		"\u00a7\u00a9\u0003\u0014\n\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00c9\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ad\u0005\f\u0000\u0000\u00ab\u00ae\u0003\f\u0006\u0000\u00ac\u00ae"+
		"\u0003\u000e\u0007\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\u0010\u0000\u0000\u00b0\u00b2\u0003\u0014\n\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00c9\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b7\u0005\r\u0000\u0000\u00b4\u00b5\u0005#"+
		"\u0000\u0000\u00b5\u00b6\u0005\u001b\u0000\u0000\u00b6\u00b8\u0005$\u0000"+
		"\u0000\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005\u0010\u0000"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bf\u0003\u0016\u000b"+
		"\u0000\u00bd\u00be\u0005\u0010\u0000\u0000\u00be\u00c0\u0003\u0014\n\u0000"+
		"\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c9\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005&\u0000\u0000\u00c2"+
		"\u00c3\u0005)\u0000\u0000\u00c3\u00c4\u0005\u0012\u0000\u0000\u00c4\u00c6"+
		"\u0005)\u0000\u0000\u00c5\u00c7\u0003\u001e\u000f\u0000\u00c6\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c8H\u0001\u0000\u0000\u0000\u00c8W\u0001\u0000\u0000"+
		"\u0000\u00c8g\u0001\u0000\u0000\u0000\u00c8v\u0001\u0000\u0000\u0000\u00c8"+
		"\u0082\u0001\u0000\u0000\u0000\u00c8\u0087\u0001\u0000\u0000\u0000\u00c8"+
		"\u0098\u0001\u0000\u0000\u0000\u00c8\u00aa\u0001\u0000\u0000\u0000\u00c8"+
		"\u00b3\u0001\u0000\u0000\u0000\u00c8\u00c1\u0001\u0000\u0000\u0000\u00c9"+
		"\u000b\u0001\u0000\u0000\u0000\u00ca\u00d5\u0005\u0019\u0000\u0000\u00cb"+
		"\u00d1\u0005#\u0000\u0000\u00cc\u00d2\u0005+\u0000\u0000\u00cd\u00cf\u0005"+
		"+\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005)\u0000"+
		"\u0000\u00d1\u00cc\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d6\u0005$\u0000\u0000"+
		"\u00d4\u00d6\u0005+\u0000\u0000\u00d5\u00cb\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\r\u0001\u0000\u0000\u0000\u00d7\u00d9\u0005\u0016\u0000\u0000\u00d8\u00da"+
		"\u0003\u0010\b\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u000f\u0001\u0000\u0000\u0000\u00db\u00dd\u0005"+
		"+\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0005#\u0000"+
		"\u0000\u00df\u00e0\u0005)\u0000\u0000\u00e0\u00e1\u0005$\u0000\u0000\u00e1"+
		"\u0011\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0017\u0000\u0000\u00e3"+
		"\u00e7\u0005/\u0000\u0000\u00e4\u00e5\u0005#\u0000\u0000\u00e5\u00e6\u0005"+
		")\u0000\u0000\u00e6\u00e8\u0005$\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u0013\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ee\u0003\u0012\t\u0000\u00ea\u00eb\u0005\u0011\u0000\u0000"+
		"\u00eb\u00ed\u0003\u0012\t\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed"+
		"\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u0015\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005)\u0000\u0000\u00f2\u00f8"+
		"\u0003\u0018\f\u0000\u00f3\u00f4\u0005\u0011\u0000\u0000\u00f4\u00f5\u0005"+
		")\u0000\u0000\u00f5\u00f7\u0003\u0018\f\u0000\u00f6\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u0017\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u0018"+
		"\u0000\u0000\u00fc\u00fd\u00051\u0000\u0000\u00fd\u0019\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0012\u0000\u0000\u00ff\u0100\u0005)\u0000\u0000"+
		"\u0100\u0103\u0005\u001f\u0000\u0000\u0101\u0102\u0005\u0014\u0000\u0000"+
		"\u0102\u0104\u0003\f\u0006\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u001b\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0005\u000e\u0000\u0000\u0106\u010a\u0007\u0001\u0000\u0000\u0107"+
		"\u0108\u0005\u0014\u0000\u0000\u0108\u010b\u0003\u000e\u0007\u0000\u0109"+
		"\u010b\u0003\f\u0006\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0117"+
		"\u0001\u0000\u0000\u0000\u010c\u010f\u0005\u001e\u0000\u0000\u010d\u0110"+
		"\u0003\u000e\u0007\u0000\u010e\u0110\u0003\f\u0006\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0117\u0001"+
		"\u0000\u0000\u0000\u0111\u0114\u0005\u0013\u0000\u0000\u0112\u0115\u0003"+
		"\u000e\u0007\u0000\u0113\u0115\u0003\f\u0006\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000"+
		"\u0000\u0000\u0116\u0105\u0001\u0000\u0000\u0000\u0116\u010c\u0001\u0000"+
		"\u0000\u0000\u0116\u0111\u0001\u0000\u0000\u0000\u0117\u001d\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0005#\u0000\u0000\u0119\u011a\u0005)\u0000\u0000"+
		"\u011a\u011b\u0005\'\u0000\u0000\u011b\u011c\u0005$\u0000\u0000\u011c"+
		"\u001f\u0001\u0000\u0000\u0000-#%,2@PU]aemotx}\u007f\u0084\u008f\u0091"+
		"\u0096\u009a\u009d\u00a1\u00a3\u00a8\u00ad\u00b1\u00b7\u00ba\u00bf\u00c6"+
		"\u00c8\u00ce\u00d1\u00d5\u00d9\u00dc\u00e7\u00ee\u00f8\u0103\u010a\u010f"+
		"\u0114\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}