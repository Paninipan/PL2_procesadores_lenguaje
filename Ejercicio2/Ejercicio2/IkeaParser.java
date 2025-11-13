// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/Ex1/Ejercicio2/IkeaParser.g4 by ANTLR 4.13.2
package Ejercicio2;
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
		INICIO_MONTAJE=1, FIN=2, COMO=3, EXTENSION_DE=4, INSERTAR=5, UNIR=6, FIJAR=7, 
		MARTILLAR=8, COLOCAR=9, GIRAR=10, CONECTAR=11, MARCAR_PARED=12, NIVELAR=13, 
		FIJAR_PARED=14, EN=15, CON=16, Y=17, A=18, SOBRE=19, DE=20, MUEBLE=21, 
		TIPO_PIEZA=22, ESTE_MODULO=23, OPCIONAL=24, HERRAMIENTA=25, ORIENTACION=26, 
		ID_POSICION=27, DEJAR_ESPACIO=28, JUNTO_A=29, UD_MEDIDA=30, GUION=31, 
		PUNTOYCOMA=32, PUNTO=33, PAREN_ABRE=34, PAREN_CIERRA=35, COMA=36, NUMERO=37, 
		MEDIDA=38, HERRAJE=39, MAYUS_NOMBRE=40, NOMBRE=41, COMENTARIO=42, ESPACIO=43;
	public static final int
		RULE_programa = 0, RULE_declaracion_inicio = 1, RULE_declaracion_fin = 2, 
		RULE_paso = 3, RULE_accion = 4, RULE_pieza = 5, RULE_mueble_referencia = 6, 
		RULE_id = 7, RULE_herramienta = 8, RULE_herraje_lista = 9, RULE_id_herraje = 10, 
		RULE_posicion = 11, RULE_mod_espacio = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracion_inicio", "declaracion_fin", "paso", "accion", 
			"pieza", "mueble_referencia", "id", "herramienta", "herraje_lista", "id_herraje", 
			"posicion", "mod_espacio"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INICIO_MONTAJE'", "'FIN'", "'COMO'", "'EXTENSION_DE'", "'INSERTAR'", 
			"'UNIR'", "'FIJAR'", "'MARTILLAR'", "'COLOCAR'", "'GIRAR'", "'CONECTAR'", 
			"'MARCAR_PARED'", "'NIVELAR'", "'FIJAR_PARED'", "'EN'", "'CON'", "'Y'", 
			"'A'", "'SOBRE'", "'DE'", "'MUEBLE'", null, "'ESTE_MODULO'", "'OPCIONAL'", 
			null, null, null, "'DEJAR_ESPACIO'", "'JUNTO_A'", null, "'-'", "';'", 
			"'.'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INICIO_MONTAJE", "FIN", "COMO", "EXTENSION_DE", "INSERTAR", "UNIR", 
			"FIJAR", "MARTILLAR", "COLOCAR", "GIRAR", "CONECTAR", "MARCAR_PARED", 
			"NIVELAR", "FIJAR_PARED", "EN", "CON", "Y", "A", "SOBRE", "DE", "MUEBLE", 
			"TIPO_PIEZA", "ESTE_MODULO", "OPCIONAL", "HERRAMIENTA", "ORIENTACION", 
			"ID_POSICION", "DEJAR_ESPACIO", "JUNTO_A", "UD_MEDIDA", "GUION", "PUNTOYCOMA", 
			"PUNTO", "PAREN_ABRE", "PAREN_CIERRA", "COMA", "NUMERO", "MEDIDA", "HERRAJE", 
			"MAYUS_NOMBRE", "NOMBRE", "COMENTARIO", "ESPACIO"
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
			setState(26);
			declaracion_inicio();
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				paso();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMERO );
			setState(32);
			declaracion_fin();
			setState(33);
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
		public TerminalNode MAYUS_NOMBRE() { return getToken(IkeaParser.MAYUS_NOMBRE, 0); }
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
			setState(35);
			match(INICIO_MONTAJE);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAYUS_NOMBRE) {
				{
				setState(36);
				match(MAYUS_NOMBRE);
				}
			}

			setState(39);
			match(NUMERO);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMO) {
				{
				setState(40);
				match(COMO);
				setState(41);
				match(EXTENSION_DE);
				setState(42);
				mueble_referencia();
				}
			}

			setState(45);
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
			setState(47);
			match(FIN);
			setState(48);
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
			setState(50);
			match(NUMERO);
			setState(51);
			match(GUION);
			setState(52);
			accion();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTOYCOMA) {
				{
				{
				setState(53);
				match(PUNTOYCOMA);
				setState(54);
				accion();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
		public TerminalNode UNIR() { return getToken(IkeaParser.UNIR, 0); }
		public List<TerminalNode> Y() { return getTokens(IkeaParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(IkeaParser.Y, i);
		}
		public TerminalNode FIJAR() { return getToken(IkeaParser.FIJAR, 0); }
		public List<TerminalNode> CON() { return getTokens(IkeaParser.CON); }
		public TerminalNode CON(int i) {
			return getToken(IkeaParser.CON, i);
		}
		public HerramientaContext herramienta() {
			return getRuleContext(HerramientaContext.class,0);
		}
		public TerminalNode MARTILLAR() { return getToken(IkeaParser.MARTILLAR, 0); }
		public TerminalNode SOBRE() { return getToken(IkeaParser.SOBRE, 0); }
		public TerminalNode COLOCAR() { return getToken(IkeaParser.COLOCAR, 0); }
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
		public Mod_espacioContext mod_espacio() {
			return getRuleContext(Mod_espacioContext.class,0);
		}
		public PosicionContext posicion() {
			return getRuleContext(PosicionContext.class,0);
		}
		public TerminalNode GIRAR() { return getToken(IkeaParser.GIRAR, 0); }
		public TerminalNode ORIENTACION() { return getToken(IkeaParser.ORIENTACION, 0); }
		public TerminalNode CONECTAR() { return getToken(IkeaParser.CONECTAR, 0); }
		public TerminalNode ESTE_MODULO() { return getToken(IkeaParser.ESTE_MODULO, 0); }
		public TerminalNode A() { return getToken(IkeaParser.A, 0); }
		public Mueble_referenciaContext mueble_referencia() {
			return getRuleContext(Mueble_referenciaContext.class,0);
		}
		public TerminalNode MARCAR_PARED() { return getToken(IkeaParser.MARCAR_PARED, 0); }
		public TerminalNode NIVELAR() { return getToken(IkeaParser.NIVELAR, 0); }
		public TerminalNode MUEBLE() { return getToken(IkeaParser.MUEBLE, 0); }
		public TerminalNode FIJAR_PARED() { return getToken(IkeaParser.FIJAR_PARED, 0); }
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
		enterRule(_localctx, 8, RULE_accion);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERTAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(INSERTAR);
				setState(63);
				herraje_lista();
				setState(64);
				match(EN);
				setState(65);
				pieza();
				}
				break;
			case UNIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(UNIR);
				setState(68);
				pieza();
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					match(Y);
					setState(70);
					pieza();
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Y );
				}
				break;
			case FIJAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(FIJAR);
				setState(76);
				herraje_lista();
				setState(77);
				match(CON);
				setState(78);
				herramienta();
				}
				break;
			case MARTILLAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(MARTILLAR);
				setState(81);
				herraje_lista();
				setState(82);
				match(SOBRE);
				setState(83);
				pieza();
				}
				break;
			case COLOCAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(COLOCAR);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMERO) {
					{
					setState(86);
					match(NUMERO);
					}
				}

				setState(89);
				pieza();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEJAR_ESPACIO) {
					{
					setState(90);
					mod_espacio();
					}
				}

				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EN) {
					{
					setState(93);
					match(EN);
					setState(94);
					posicion();
					}
				}

				}
				break;
			case GIRAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(GIRAR);
				setState(98);
				match(ORIENTACION);
				}
				break;
			case CONECTAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				match(CONECTAR);
				setState(100);
				match(ESTE_MODULO);
				setState(101);
				match(A);
				setState(102);
				mueble_referencia();
				setState(103);
				match(CON);
				setState(104);
				herraje_lista();
				}
				break;
			case MARCAR_PARED:
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				match(MARCAR_PARED);
				setState(107);
				match(CON);
				setState(108);
				pieza();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(109);
					match(CON);
					setState(110);
					herramienta();
					}
				}

				}
				break;
			case NIVELAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(113);
				match(NIVELAR);
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIPO_PIEZA:
					{
					setState(114);
					pieza();
					}
					break;
				case MUEBLE:
					{
					setState(115);
					match(MUEBLE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case FIJAR_PARED:
				enterOuterAlt(_localctx, 10);
				{
				setState(118);
				match(FIJAR_PARED);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PAREN_ABRE) {
					{
					setState(119);
					match(PAREN_ABRE);
					setState(120);
					match(OPCIONAL);
					setState(121);
					match(PAREN_CIERRA);
					}
				}

				setState(124);
				match(CON);
				setState(125);
				herraje_lista();
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
		public TerminalNode TIPO_PIEZA() { return getToken(IkeaParser.TIPO_PIEZA, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(IkeaParser.PAREN_ABRE, 0); }
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(IkeaParser.PAREN_CIERRA, 0); }
		public TerminalNode NOMBRE() { return getToken(IkeaParser.NOMBRE, 0); }
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
		enterRule(_localctx, 10, RULE_pieza);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(TIPO_PIEZA);
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_ABRE:
				{
				setState(129);
				match(PAREN_ABRE);
				setState(130);
				match(NUMERO);
				setState(131);
				match(PAREN_CIERRA);
				}
				break;
			case NOMBRE:
				{
				setState(132);
				match(NOMBRE);
				}
				break;
			case EN:
			case CON:
			case Y:
			case DEJAR_ESPACIO:
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
		enterRule(_localctx, 12, RULE_mueble_referencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(MUEBLE);
			setState(136);
			id();
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
		public TerminalNode MAYUS_NOMBRE() { return getToken(IkeaParser.MAYUS_NOMBRE, 0); }
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
		enterRule(_localctx, 14, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAYUS_NOMBRE) {
				{
				setState(138);
				match(MAYUS_NOMBRE);
				}
			}

			setState(141);
			match(PAREN_ABRE);
			setState(142);
			match(NUMERO);
			setState(143);
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
		enterRule(_localctx, 16, RULE_herramienta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(HERRAMIENTA);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_ABRE) {
				{
				setState(146);
				match(PAREN_ABRE);
				setState(147);
				match(NUMERO);
				setState(148);
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
		enterRule(_localctx, 18, RULE_herraje_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(NUMERO);
			setState(152);
			id_herraje();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y) {
				{
				{
				setState(153);
				match(Y);
				setState(154);
				match(NUMERO);
				setState(155);
				id_herraje();
				}
				}
				setState(160);
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
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
		public TerminalNode HERRAJE() { return getToken(IkeaParser.HERRAJE, 0); }
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
		enterRule(_localctx, 20, RULE_id_herraje);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !(_la==NUMERO || _la==HERRAJE) ) {
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
	public static class PosicionContext extends ParserRuleContext {
		public TerminalNode ORIENTACION() { return getToken(IkeaParser.ORIENTACION, 0); }
		public TerminalNode ID_POSICION() { return getToken(IkeaParser.ID_POSICION, 0); }
		public TerminalNode JUNTO_A() { return getToken(IkeaParser.JUNTO_A, 0); }
		public Mueble_referenciaContext mueble_referencia() {
			return getRuleContext(Mueble_referenciaContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_posicion);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORIENTACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(ORIENTACION);
				}
				break;
			case ID_POSICION:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(ID_POSICION);
				}
				break;
			case JUNTO_A:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(JUNTO_A);
				setState(166);
				mueble_referencia();
				}
				break;
			case SOBRE:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(SOBRE);
				setState(168);
				mueble_referencia();
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
	public static class Mod_espacioContext extends ParserRuleContext {
		public TerminalNode DEJAR_ESPACIO() { return getToken(IkeaParser.DEJAR_ESPACIO, 0); }
		public TerminalNode NUMERO() { return getToken(IkeaParser.NUMERO, 0); }
		public TerminalNode UD_MEDIDA() { return getToken(IkeaParser.UD_MEDIDA, 0); }
		public Mod_espacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_espacio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).enterMod_espacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IkeaParserListener ) ((IkeaParserListener)listener).exitMod_espacio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IkeaParserVisitor ) return ((IkeaParserVisitor<? extends T>)visitor).visitMod_espacio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_espacioContext mod_espacio() throws RecognitionException {
		Mod_espacioContext _localctx = new Mod_espacioContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mod_espacio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(DEJAR_ESPACIO);
			setState(172);
			match(NUMERO);
			setState(173);
			match(UD_MEDIDA);
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
		"\u0004\u0001+\u00b0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0004\u0000\u001d\b\u0000\u000b\u0000"+
		"\f\u0000\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001,\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u00038\b\u0003\n\u0003\f\u0003;\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004H\b\u0004\u000b\u0004"+
		"\f\u0004I\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004X\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\\\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004`\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004p\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004u\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004{\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u007f\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0086"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u008c"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0096\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u009d\b\t\n\t\f\t\u00a0\t\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00aa"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0002"+
		"\u0000%%\'\'\u00be\u0000\u001a\u0001\u0000\u0000\u0000\u0002#\u0001\u0000"+
		"\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000"+
		"\b~\u0001\u0000\u0000\u0000\n\u0080\u0001\u0000\u0000\u0000\f\u0087\u0001"+
		"\u0000\u0000\u0000\u000e\u008b\u0001\u0000\u0000\u0000\u0010\u0091\u0001"+
		"\u0000\u0000\u0000\u0012\u0097\u0001\u0000\u0000\u0000\u0014\u00a1\u0001"+
		"\u0000\u0000\u0000\u0016\u00a9\u0001\u0000\u0000\u0000\u0018\u00ab\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001d\u0003"+
		"\u0006\u0003\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001"+
		"\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0003\u0004\u0002"+
		"\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000\u0000\u0000#%\u0005"+
		"\u0001\u0000\u0000$&\u0005(\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'+\u0005%\u0000\u0000()"+
		"\u0005\u0003\u0000\u0000)*\u0005\u0004\u0000\u0000*,\u0003\f\u0006\u0000"+
		"+(\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-.\u0005!\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005\u0002"+
		"\u0000\u000001\u0005!\u0000\u00001\u0005\u0001\u0000\u0000\u000023\u0005"+
		"%\u0000\u000034\u0005\u001f\u0000\u000049\u0003\b\u0004\u000056\u0005"+
		" \u0000\u000068\u0003\b\u0004\u000075\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005!\u0000\u0000"+
		"=\u0007\u0001\u0000\u0000\u0000>?\u0005\u0005\u0000\u0000?@\u0003\u0012"+
		"\t\u0000@A\u0005\u000f\u0000\u0000AB\u0003\n\u0005\u0000B\u007f\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0006\u0000\u0000DG\u0003\n\u0005\u0000EF\u0005"+
		"\u0011\u0000\u0000FH\u0003\n\u0005\u0000GE\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"J\u007f\u0001\u0000\u0000\u0000KL\u0005\u0007\u0000\u0000LM\u0003\u0012"+
		"\t\u0000MN\u0005\u0010\u0000\u0000NO\u0003\u0010\b\u0000O\u007f\u0001"+
		"\u0000\u0000\u0000PQ\u0005\b\u0000\u0000QR\u0003\u0012\t\u0000RS\u0005"+
		"\u0013\u0000\u0000ST\u0003\n\u0005\u0000T\u007f\u0001\u0000\u0000\u0000"+
		"UW\u0005\t\u0000\u0000VX\u0005%\u0000\u0000WV\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0003\n\u0005\u0000"+
		"Z\\\u0003\u0018\f\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\_\u0001\u0000\u0000\u0000]^\u0005\u000f\u0000\u0000^`\u0003\u0016"+
		"\u000b\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u007f"+
		"\u0001\u0000\u0000\u0000ab\u0005\n\u0000\u0000b\u007f\u0005\u001a\u0000"+
		"\u0000cd\u0005\u000b\u0000\u0000de\u0005\u0017\u0000\u0000ef\u0005\u0012"+
		"\u0000\u0000fg\u0003\f\u0006\u0000gh\u0005\u0010\u0000\u0000hi\u0003\u0012"+
		"\t\u0000i\u007f\u0001\u0000\u0000\u0000jk\u0005\f\u0000\u0000kl\u0005"+
		"\u0010\u0000\u0000lo\u0003\n\u0005\u0000mn\u0005\u0010\u0000\u0000np\u0003"+
		"\u0010\b\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u007f"+
		"\u0001\u0000\u0000\u0000qt\u0005\r\u0000\u0000ru\u0003\n\u0005\u0000s"+
		"u\u0005\u0015\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000u\u007f\u0001\u0000\u0000\u0000vz\u0005\u000e\u0000\u0000wx\u0005"+
		"\"\u0000\u0000xy\u0005\u0018\u0000\u0000y{\u0005#\u0000\u0000zw\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|}\u0005\u0010\u0000\u0000}\u007f\u0003\u0012\t\u0000~>\u0001\u0000\u0000"+
		"\u0000~C\u0001\u0000\u0000\u0000~K\u0001\u0000\u0000\u0000~P\u0001\u0000"+
		"\u0000\u0000~U\u0001\u0000\u0000\u0000~a\u0001\u0000\u0000\u0000~c\u0001"+
		"\u0000\u0000\u0000~j\u0001\u0000\u0000\u0000~q\u0001\u0000\u0000\u0000"+
		"~v\u0001\u0000\u0000\u0000\u007f\t\u0001\u0000\u0000\u0000\u0080\u0085"+
		"\u0005\u0016\u0000\u0000\u0081\u0082\u0005\"\u0000\u0000\u0082\u0083\u0005"+
		"%\u0000\u0000\u0083\u0086\u0005#\u0000\u0000\u0084\u0086\u0005)\u0000"+
		"\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u000b\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005\u0015\u0000\u0000\u0088\u0089\u0003\u000e\u0007"+
		"\u0000\u0089\r\u0001\u0000\u0000\u0000\u008a\u008c\u0005(\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\"\u0000\u0000\u008e"+
		"\u008f\u0005%\u0000\u0000\u008f\u0090\u0005#\u0000\u0000\u0090\u000f\u0001"+
		"\u0000\u0000\u0000\u0091\u0095\u0005\u0019\u0000\u0000\u0092\u0093\u0005"+
		"\"\u0000\u0000\u0093\u0094\u0005%\u0000\u0000\u0094\u0096\u0005#\u0000"+
		"\u0000\u0095\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0011\u0001\u0000\u0000\u0000\u0097\u0098\u0005%\u0000\u0000"+
		"\u0098\u009e\u0003\u0014\n\u0000\u0099\u009a\u0005\u0011\u0000\u0000\u009a"+
		"\u009b\u0005%\u0000\u0000\u009b\u009d\u0003\u0014\n\u0000\u009c\u0099"+
		"\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u0013"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0007\u0000\u0000\u0000\u00a2\u0015\u0001\u0000\u0000\u0000\u00a3\u00aa"+
		"\u0005\u001a\u0000\u0000\u00a4\u00aa\u0005\u001b\u0000\u0000\u00a5\u00a6"+
		"\u0005\u001d\u0000\u0000\u00a6\u00aa\u0003\f\u0006\u0000\u00a7\u00a8\u0005"+
		"\u0013\u0000\u0000\u00a8\u00aa\u0003\f\u0006\u0000\u00a9\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a4\u0001\u0000\u0000\u0000\u00a9\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u0017\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005\u001c\u0000\u0000\u00ac\u00ad\u0005%\u0000"+
		"\u0000\u00ad\u00ae\u0005\u001e\u0000\u0000\u00ae\u0019\u0001\u0000\u0000"+
		"\u0000\u0011\u001e%+9IW[_otz~\u0085\u008b\u0095\u009e\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}