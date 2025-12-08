// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/PL2/Ejercicio2/IkeaParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IkeaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO_MONTAJE=1, FIN=2, COMO=3, EXTENSION_DE=4, INSERTAR=5, UNIR=6, COLOCAR=7, 
		GIRAR=8, CONECTAR=9, MARCAR=10, NIVELAR=11, FIJAR=12, EN=13, PARA=14, 
		CON=15, Y=16, A=17, SOBRE=18, BAJO=19, DE=20, HACIA=21, MUEBLE=22, HERRAMIENTA=23, 
		HERRAJE=24, PIEZA=25, OPCIONAL=26, ORIENTACION=27, POSICION=28, JUNTO_A=29, 
		UD_MEDIDA=30, GUION=31, PUNTOYCOMA=32, PUNTO=33, PAREN_ABRE=34, PAREN_CIERRA=35, 
		COMA=36, CUIDADO=37, NUMERO=38, MEDIDA=39, NOMBRE=40, COMENTARIO=41, ESPACIO=42, 
		ESPACIOHERRAMIENTA=43, TIPOHERRAMIENTA=44, ESPACIOHERRAJE=45, TIPOHERRAJE=46, 
		ESPACIOANUNCIO=47, ANUNCIO=48;
	public static final int
		RULE_programa = 0, RULE_declaracion_inicio = 1, RULE_declaracion_fin = 2, 
		RULE_paso = 3, RULE_comentario = 4, RULE_accion = 5, RULE_pieza = 6, RULE_mueble_referencia = 7, 
		RULE_id = 8, RULE_herramienta = 9, RULE_herramienta_lista = 10, RULE_herraje_lista = 11, 
		RULE_id_herraje = 12, RULE_distancia = 13, RULE_posicion = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracion_inicio", "declaracion_fin", "paso", "comentario", 
			"accion", "pieza", "mueble_referencia", "id", "herramienta", "herramienta_lista", 
			"herraje_lista", "id_herraje", "distancia", "posicion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INICIO_MONTAJE'", "'FIN'", "'COMO'", "'EXTENSION_DE'", null, 
			"'UNIR'", "'COLOCAR'", "'GIRAR'", "'CONECTAR'", null, "'NIVELAR'", null, 
			"'EN'", "'PARA'", null, "'Y'", "'A'", "'SOBRE'", "'BAJO'", "'DE'", "'HACIA'", 
			"'MUEBLE'", "'HERRAMIENTA'", null, "'PIEZA'", "'OPCIONAL'", null, null, 
			"'JUNTO_A'", null, "'-'", "';'", "'.'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INICIO_MONTAJE", "FIN", "COMO", "EXTENSION_DE", "INSERTAR", "UNIR", 
			"COLOCAR", "GIRAR", "CONECTAR", "MARCAR", "NIVELAR", "FIJAR", "EN", "PARA", 
			"CON", "Y", "A", "SOBRE", "BAJO", "DE", "HACIA", "MUEBLE", "HERRAMIENTA", 
			"HERRAJE", "PIEZA", "OPCIONAL", "ORIENTACION", "POSICION", "JUNTO_A", 
			"UD_MEDIDA", "GUION", "PUNTOYCOMA", "PUNTO", "PAREN_ABRE", "PAREN_CIERRA", 
			"COMA", "CUIDADO", "NUMERO", "MEDIDA", "NOMBRE", "COMENTARIO", "ESPACIO", 
			"ESPACIOHERRAMIENTA", "TIPOHERRAMIENTA", "ESPACIOHERRAJE", "TIPOHERRAJE", 
			"ESPACIOANUNCIO", "ANUNCIO"
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
			setState(30);
			declaracion_inicio();
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERO:
					{
					setState(31);
					paso();
					}
					break;
				case CUIDADO:
					{
					setState(32);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CUIDADO || _la==NUMERO );
			setState(37);
			declaracion_fin();
			setState(38);
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
		public TerminalNode PUNTO() { return getToken(IkeaParser.PUNTO, 0); }
		public TerminalNode NOMBRE() { return getToken(IkeaParser.NOMBRE, 0); }
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
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
			setState(40);
			match(INICIO_MONTAJE);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOMBRE) {
				{
				setState(41);
				match(NOMBRE);
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO) {
				{
				setState(44);
				match(NUMERO);
				}
			}

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
		public TerminalNode SOBRE() { return getToken(IkeaParser.SOBRE, 0); }
		public List<PiezaContext> pieza() {
			return getRuleContexts(PiezaContext.class);
		}
		public PiezaContext pieza(int i) {
			return getRuleContext(PiezaContext.class,i);
		}
		public List<Mueble_referenciaContext> mueble_referencia() {
			return getRuleContexts(Mueble_referenciaContext.class);
		}
		public Mueble_referenciaContext mueble_referencia(int i) {
			return getRuleContext(Mueble_referenciaContext.class,i);
		}
		public List<TerminalNode> Y() { return getTokens(IkeaParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(IkeaParser.Y, i);
		}
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
		public List<TerminalNode> CON() { return getTokens(IkeaParser.CON); }
		public TerminalNode CON(int i) {
			return getToken(IkeaParser.CON, i);
		}
		public Herramienta_listaContext herramienta_lista() {
			return getRuleContext(Herramienta_listaContext.class,0);
		}
		public TerminalNode UNIR() { return getToken(IkeaParser.UNIR, 0); }
		public TerminalNode COLOCAR() { return getToken(IkeaParser.COLOCAR, 0); }
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
		public TerminalNode GIRAR() { return getToken(IkeaParser.GIRAR, 0); }
		public TerminalNode ORIENTACION() { return getToken(IkeaParser.ORIENTACION, 0); }
		public TerminalNode POSICION() { return getToken(IkeaParser.POSICION, 0); }
		public TerminalNode HACIA() { return getToken(IkeaParser.HACIA, 0); }
		public TerminalNode CONECTAR() { return getToken(IkeaParser.CONECTAR, 0); }
		public TerminalNode A() { return getToken(IkeaParser.A, 0); }
		public TerminalNode MARCAR() { return getToken(IkeaParser.MARCAR, 0); }
		public TerminalNode PARA() { return getToken(IkeaParser.PARA, 0); }
		public TerminalNode NIVELAR() { return getToken(IkeaParser.NIVELAR, 0); }
		public TerminalNode FIJAR() { return getToken(IkeaParser.FIJAR, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(IkeaParser.PAREN_ABRE, 0); }
		public TerminalNode OPCIONAL() { return getToken(IkeaParser.OPCIONAL, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(IkeaParser.PAREN_CIERRA, 0); }
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
			int _alt;
			setState(199);
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
				_la = _input.LA(1);
				if ( !(_la==EN || _la==SOBRE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PIEZA:
					{
					setState(75);
					pieza();
					}
					break;
				case MUEBLE:
					{
					setState(76);
					mueble_referencia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Y) {
					{
					{
					setState(79);
					match(Y);
					setState(80);
					pieza();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(88);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case A:
							{
							setState(86);
							distancia();
							}
							break;
						case EN:
						case SOBRE:
						case BAJO:
						case JUNTO_A:
							{
							setState(87);
							posicion();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(92);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 537796608L) != 0)) {
					{
					setState(95);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case A:
						{
						setState(93);
						distancia();
						}
						break;
					case EN:
					case SOBRE:
					case BAJO:
					case JUNTO_A:
						{
						setState(94);
						posicion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(100);
					match(CON);
					setState(101);
					herramienta_lista();
					}
				}

				}
				break;
			case UNIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(UNIR);
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PIEZA:
					{
					setState(105);
					pieza();
					}
					break;
				case MUEBLE:
					{
					setState(106);
					mueble_referencia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(109);
					match(Y);
					{
					setState(110);
					pieza();
					}
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Y );
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 537796608L) != 0)) {
					{
					setState(117);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case A:
						{
						setState(115);
						distancia();
						}
						break;
					case EN:
					case SOBRE:
					case BAJO:
					case JUNTO_A:
						{
						setState(116);
						posicion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case COLOCAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(COLOCAR);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMERO) {
					{
					setState(123);
					match(NUMERO);
					}
				}

				setState(126);
				pieza();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 537796608L) != 0)) {
					{
					setState(129);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case A:
						{
						setState(127);
						distancia();
						}
						break;
					case EN:
					case SOBRE:
					case BAJO:
					case JUNTO_A:
						{
						setState(128);
						posicion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case GIRAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(GIRAR);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EN || _la==HACIA) {
					{
					setState(135);
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

				setState(138);
				_la = _input.LA(1);
				if ( !(_la==ORIENTACION || _la==POSICION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case CONECTAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(CONECTAR);
				setState(140);
				mueble_referencia();
				setState(141);
				match(A);
				setState(142);
				mueble_referencia();
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(143);
					match(CON);
					setState(144);
					herraje_lista();
					}
					break;
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 537796608L) != 0)) {
					{
					setState(149);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case A:
						{
						setState(147);
						distancia();
						}
						break;
					case EN:
					case SOBRE:
					case BAJO:
					case JUNTO_A:
						{
						setState(148);
						posicion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(154);
					match(CON);
					setState(155);
					herramienta_lista();
					}
				}

				}
				break;
			case MARCAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(MARCAR);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARA) {
					{
					setState(159);
					match(PARA);
					}
				}

				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIEZA) {
					{
					setState(162);
					pieza();
					}
				}

				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 537796608L) != 0)) {
					{
					setState(167);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case A:
						{
						setState(165);
						distancia();
						}
						break;
					case EN:
					case SOBRE:
					case BAJO:
					case JUNTO_A:
						{
						setState(166);
						posicion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(172);
					match(CON);
					setState(173);
					herramienta_lista();
					}
				}

				}
				break;
			case NIVELAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				match(NIVELAR);
				setState(179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PIEZA:
					{
					setState(177);
					pieza();
					}
					break;
				case MUEBLE:
					{
					setState(178);
					mueble_referencia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(181);
					match(CON);
					setState(182);
					herramienta_lista();
					}
				}

				}
				break;
			case FIJAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(185);
				match(FIJAR);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PAREN_ABRE) {
					{
					setState(186);
					match(PAREN_ABRE);
					setState(187);
					match(OPCIONAL);
					setState(188);
					match(PAREN_CIERRA);
					}
				}

				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(191);
					match(CON);
					}
				}

				setState(194);
				herraje_lista();
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(195);
					match(CON);
					setState(196);
					herramienta_lista();
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
			setState(201);
			match(PIEZA);
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_ABRE:
				{
				{
				setState(202);
				match(PAREN_ABRE);
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(203);
					match(NOMBRE);
					}
					break;
				case 2:
					{
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOMBRE) {
						{
						setState(204);
						match(NOMBRE);
						}
					}

					setState(207);
					match(NUMERO);
					}
					break;
				}
				setState(210);
				match(PAREN_CIERRA);
				}
				}
				break;
			case NOMBRE:
				{
				setState(211);
				match(NOMBRE);
				}
				break;
			case EN:
			case CON:
			case Y:
			case A:
			case SOBRE:
			case BAJO:
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
			setState(214);
			match(MUEBLE);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_ABRE || _la==NOMBRE) {
				{
				setState(215);
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
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOMBRE) {
				{
				setState(218);
				match(NOMBRE);
				}
			}

			setState(221);
			match(PAREN_ABRE);
			setState(222);
			match(NUMERO);
			setState(223);
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
			setState(225);
			match(HERRAMIENTA);
			setState(226);
			match(TIPOHERRAMIENTA);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_ABRE) {
				{
				setState(227);
				match(PAREN_ABRE);
				setState(228);
				match(NUMERO);
				setState(229);
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
			setState(232);
			herramienta();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y) {
				{
				{
				setState(233);
				match(Y);
				setState(234);
				herramienta();
				}
				}
				setState(239);
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
			setState(240);
			match(NUMERO);
			setState(241);
			id_herraje();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y) {
				{
				{
				setState(242);
				match(Y);
				setState(243);
				match(NUMERO);
				setState(244);
				id_herraje();
				}
				}
				setState(249);
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
			setState(250);
			match(HERRAJE);
			setState(251);
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
		public List<TerminalNode> DE() { return getTokens(IkeaParser.DE); }
		public TerminalNode DE(int i) {
			return getToken(IkeaParser.DE, i);
		}
		public TerminalNode POSICION() { return getToken(IkeaParser.POSICION, 0); }
		public PiezaContext pieza() {
			return getRuleContext(PiezaContext.class,0);
		}
		public Mueble_referenciaContext mueble_referencia() {
			return getRuleContext(Mueble_referenciaContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(A);
			setState(254);
			match(NUMERO);
			setState(255);
			match(UD_MEDIDA);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(256);
				match(DE);
				setState(257);
				match(POSICION);
				}
				break;
			}
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DE:
				{
				setState(260);
				match(DE);
				setState(261);
				pieza();
				}
				break;
			case MUEBLE:
				{
				setState(262);
				mueble_referencia();
				}
				break;
			case EN:
			case CON:
			case A:
			case SOBRE:
			case BAJO:
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
		public TerminalNode BAJO() { return getToken(IkeaParser.BAJO, 0); }
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
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(265);
				match(EN);
				setState(266);
				_la = _input.LA(1);
				if ( !(_la==ORIENTACION || _la==POSICION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DE) {
					{
					setState(267);
					match(DE);
					setState(270);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MUEBLE:
						{
						setState(268);
						mueble_referencia();
						}
						break;
					case PIEZA:
						{
						setState(269);
						pieza();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				}
				break;
			case JUNTO_A:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(JUNTO_A);
				setState(277);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUEBLE:
					{
					setState(275);
					mueble_referencia();
					}
					break;
				case PIEZA:
					{
					setState(276);
					pieza();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SOBRE:
			case BAJO:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				_la = _input.LA(1);
				if ( !(_la==SOBRE || _la==BAJO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUEBLE:
					{
					setState(280);
					mueble_referencia();
					}
					break;
				case PIEZA:
					{
					setState(281);
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

	public static final String _serializedATN =
		"\u0004\u00010\u011f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001\u0001"+
		"\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00013\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005R\b\u0005\n\u0005\f\u0005U\t\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005Y\b\u0005\n\u0005\f\u0005\\\t\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005`\b\u0005\n\u0005\f\u0005c\t\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005g\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005l\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005p\b\u0005\u000b\u0005\f\u0005q\u0001"+
		"\u0005\u0001\u0005\u0005\u0005v\b\u0005\n\u0005\f\u0005y\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005}\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u0082\b\u0005\n\u0005\f\u0005\u0085\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0089\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0092\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u0096\b\u0005\n\u0005\f\u0005\u0099"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009d\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00a1\b\u0005\u0001\u0005\u0003\u0005\u00a4\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a8\b\u0005\n\u0005\f\u0005"+
		"\u00ab\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00af\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b4\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00b8\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00be\b\u0005\u0001\u0005\u0003\u0005\u00c1\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c6\b\u0005\u0003\u0005"+
		"\u00c8\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00ce\b\u0006\u0001\u0006\u0003\u0006\u00d1\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00d5\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00d9"+
		"\b\u0007\u0001\b\u0003\b\u00dc\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e7\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00ec\b\n\n\n\f\n\u00ef\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00f6\b\u000b\n\u000b\f\u000b\u00f9"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0103\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0108\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010f\b\u000e"+
		"\u0003\u000e\u0111\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0116\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u011b\b"+
		"\u000e\u0003\u000e\u011d\b\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000"+
		"\u0004\u0002\u0000\r\r\u0012\u0012\u0002\u0000\r\r\u0015\u0015\u0001\u0000"+
		"\u001b\u001c\u0001\u0000\u0012\u0013\u014b\u0000\u001e\u0001\u0000\u0000"+
		"\u0000\u0002(\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000\u0000\u0006"+
		"9\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\n\u00c7\u0001\u0000"+
		"\u0000\u0000\f\u00c9\u0001\u0000\u0000\u0000\u000e\u00d6\u0001\u0000\u0000"+
		"\u0000\u0010\u00db\u0001\u0000\u0000\u0000\u0012\u00e1\u0001\u0000\u0000"+
		"\u0000\u0014\u00e8\u0001\u0000\u0000\u0000\u0016\u00f0\u0001\u0000\u0000"+
		"\u0000\u0018\u00fa\u0001\u0000\u0000\u0000\u001a\u00fd\u0001\u0000\u0000"+
		"\u0000\u001c\u011c\u0001\u0000\u0000\u0000\u001e!\u0003\u0002\u0001\u0000"+
		"\u001f\"\u0003\u0006\u0003\u0000 \"\u0003\b\u0004\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%&\u0003\u0004\u0002\u0000&\'\u0005\u0000\u0000\u0001\'\u0001\u0001\u0000"+
		"\u0000\u0000(*\u0005\u0001\u0000\u0000)+\u0005(\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,.\u0005"+
		"&\u0000\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.2\u0001"+
		"\u0000\u0000\u0000/0\u0005\u0003\u0000\u000001\u0005\u0004\u0000\u0000"+
		"13\u0003\u000e\u0007\u00002/\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000045\u0005!\u0000\u00005\u0003\u0001\u0000"+
		"\u0000\u000067\u0005\u0002\u0000\u000078\u0005!\u0000\u00008\u0005\u0001"+
		"\u0000\u0000\u00009:\u0005&\u0000\u0000:;\u0005\u001f\u0000\u0000;@\u0003"+
		"\n\u0005\u0000<=\u0005 \u0000\u0000=?\u0003\n\u0005\u0000><\u0001\u0000"+
		"\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"CD\u0005!\u0000\u0000D\u0007\u0001\u0000\u0000\u0000EF\u0005%\u0000\u0000"+
		"FG\u00050\u0000\u0000G\t\u0001\u0000\u0000\u0000HI\u0005\u0005\u0000\u0000"+
		"IJ\u0003\u0016\u000b\u0000JM\u0007\u0000\u0000\u0000KN\u0003\f\u0006\u0000"+
		"LN\u0003\u000e\u0007\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000NS\u0001\u0000\u0000\u0000OP\u0005\u0010\u0000\u0000PR\u0003\f\u0006"+
		"\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TZ\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VY\u0003\u001a\r\u0000WY\u0003\u001c\u000e\u0000XV\u0001"+
		"\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[a\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]`\u0003\u001a\r\u0000^`\u0003\u001c"+
		"\u000e\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bf\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\u000f\u0000"+
		"\u0000eg\u0003\u0014\n\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000g\u00c8\u0001\u0000\u0000\u0000hk\u0005\u0006\u0000\u0000il\u0003"+
		"\f\u0006\u0000jl\u0003\u000e\u0007\u0000ki\u0001\u0000\u0000\u0000kj\u0001"+
		"\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mn\u0005\u0010\u0000\u0000"+
		"np\u0003\f\u0006\u0000om\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rw\u0001\u0000\u0000"+
		"\u0000sv\u0003\u001a\r\u0000tv\u0003\u001c\u000e\u0000us\u0001\u0000\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000x\u00c8\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z|\u0005\u0007\u0000\u0000{}\u0005&\u0000\u0000"+
		"|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u0083\u0003\f\u0006\u0000\u007f\u0082\u0003\u001a\r\u0000\u0080"+
		"\u0082\u0003\u001c\u000e\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u00c8\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0005\b\u0000\u0000\u0087\u0089\u0007\u0001\u0000\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u00c8\u0007\u0002\u0000\u0000\u008b\u008c"+
		"\u0005\t\u0000\u0000\u008c\u008d\u0003\u000e\u0007\u0000\u008d\u008e\u0005"+
		"\u0011\u0000\u0000\u008e\u0091\u0003\u000e\u0007\u0000\u008f\u0090\u0005"+
		"\u000f\u0000\u0000\u0090\u0092\u0003\u0016\u000b\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0097\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0003\u001a\r\u0000\u0094\u0096\u0003\u001c"+
		"\u000e\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009c\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u000f"+
		"\u0000\u0000\u009b\u009d\u0003\u0014\n\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00c8\u0001\u0000\u0000"+
		"\u0000\u009e\u00a0\u0005\n\u0000\u0000\u009f\u00a1\u0005\u000e\u0000\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a4\u0003\f\u0006\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a5\u00a8\u0003\u001a\r\u0000\u00a6\u00a8"+
		"\u0003\u001c\u000e\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005\u000f\u0000\u0000\u00ad\u00af\u0003\u0014\n\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00c8\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b3\u0005\u000b\u0000\u0000\u00b1\u00b4\u0003"+
		"\f\u0006\u0000\u00b2\u00b4\u0003\u000e\u0007\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005\u000f\u0000\u0000\u00b6\u00b8\u0003\u0014"+
		"\n\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00c8\u0001\u0000\u0000\u0000\u00b9\u00bd\u0005\f\u0000\u0000"+
		"\u00ba\u00bb\u0005\"\u0000\u0000\u00bb\u00bc\u0005\u001a\u0000\u0000\u00bc"+
		"\u00be\u0005#\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00c1"+
		"\u0005\u000f\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c5"+
		"\u0003\u0016\u000b\u0000\u00c3\u00c4\u0005\u000f\u0000\u0000\u00c4\u00c6"+
		"\u0003\u0014\n\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7H\u0001\u0000"+
		"\u0000\u0000\u00c7h\u0001\u0000\u0000\u0000\u00c7z\u0001\u0000\u0000\u0000"+
		"\u00c7\u0086\u0001\u0000\u0000\u0000\u00c7\u008b\u0001\u0000\u0000\u0000"+
		"\u00c7\u009e\u0001\u0000\u0000\u0000\u00c7\u00b0\u0001\u0000\u0000\u0000"+
		"\u00c7\u00b9\u0001\u0000\u0000\u0000\u00c8\u000b\u0001\u0000\u0000\u0000"+
		"\u00c9\u00d4\u0005\u0019\u0000\u0000\u00ca\u00d0\u0005\"\u0000\u0000\u00cb"+
		"\u00d1\u0005(\u0000\u0000\u00cc\u00ce\u0005(\u0000\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d1\u0005&\u0000\u0000\u00d0\u00cb\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d5\u0005#\u0000\u0000\u00d3\u00d5\u0005(\u0000\u0000"+
		"\u00d4\u00ca\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\r\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d8\u0005\u0016\u0000\u0000\u00d7\u00d9\u0003\u0010\b\u0000\u00d8\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u000f"+
		"\u0001\u0000\u0000\u0000\u00da\u00dc\u0005(\u0000\u0000\u00db\u00da\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005\"\u0000\u0000\u00de\u00df\u0005&"+
		"\u0000\u0000\u00df\u00e0\u0005#\u0000\u0000\u00e0\u0011\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0005\u0017\u0000\u0000\u00e2\u00e6\u0005,\u0000\u0000"+
		"\u00e3\u00e4\u0005\"\u0000\u0000\u00e4\u00e5\u0005&\u0000\u0000\u00e5"+
		"\u00e7\u0005#\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e7\u0013\u0001\u0000\u0000\u0000\u00e8\u00ed"+
		"\u0003\u0012\t\u0000\u00e9\u00ea\u0005\u0010\u0000\u0000\u00ea\u00ec\u0003"+
		"\u0012\t\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u0015\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0005&\u0000\u0000\u00f1\u00f7\u0003\u0018\f"+
		"\u0000\u00f2\u00f3\u0005\u0010\u0000\u0000\u00f3\u00f4\u0005&\u0000\u0000"+
		"\u00f4\u00f6\u0003\u0018\f\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f8\u0017\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0018\u0000\u0000\u00fb"+
		"\u00fc\u0005.\u0000\u0000\u00fc\u0019\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0005\u0011\u0000\u0000\u00fe\u00ff\u0005&\u0000\u0000\u00ff\u0102\u0005"+
		"\u001e\u0000\u0000\u0100\u0101\u0005\u0014\u0000\u0000\u0101\u0103\u0005"+
		"\u001c\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0107\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"\u0014\u0000\u0000\u0105\u0108\u0003\f\u0006\u0000\u0106\u0108\u0003\u000e"+
		"\u0007\u0000\u0107\u0104\u0001\u0000\u0000\u0000\u0107\u0106\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u001b\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005\r\u0000\u0000\u010a\u0110\u0007\u0002\u0000"+
		"\u0000\u010b\u010e\u0005\u0014\u0000\u0000\u010c\u010f\u0003\u000e\u0007"+
		"\u0000\u010d\u010f\u0003\f\u0006\u0000\u010e\u010c\u0001\u0000\u0000\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000"+
		"\u0110\u010b\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000"+
		"\u0111\u011d\u0001\u0000\u0000\u0000\u0112\u0115\u0005\u001d\u0000\u0000"+
		"\u0113\u0116\u0003\u000e\u0007\u0000\u0114\u0116\u0003\f\u0006\u0000\u0115"+
		"\u0113\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116"+
		"\u011d\u0001\u0000\u0000\u0000\u0117\u011a\u0007\u0003\u0000\u0000\u0118"+
		"\u011b\u0003\u000e\u0007\u0000\u0119\u011b\u0003\f\u0006\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011d"+
		"\u0001\u0000\u0000\u0000\u011c\u0109\u0001\u0000\u0000\u0000\u011c\u0112"+
		"\u0001\u0000\u0000\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011d\u001d"+
		"\u0001\u0000\u0000\u00003!#*-2@MSXZ_afkquw|\u0081\u0083\u0088\u0091\u0095"+
		"\u0097\u009c\u00a0\u00a3\u00a7\u00a9\u00ae\u00b3\u00b7\u00bd\u00c0\u00c5"+
		"\u00c7\u00cd\u00d0\u00d4\u00d8\u00db\u00e6\u00ed\u00f7\u0102\u0107\u010e"+
		"\u0110\u0115\u011a\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}