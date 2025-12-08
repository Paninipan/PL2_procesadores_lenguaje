// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/PL3/Parte3/EJ3Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EJ3Parser}.
 */
public interface EJ3ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(EJ3Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(EJ3Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(EJ3Parser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(EJ3Parser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(EJ3Parser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(EJ3Parser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(EJ3Parser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(EJ3Parser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(EJ3Parser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(EJ3Parser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(EJ3Parser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(EJ3Parser.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#bucle_mientras}.
	 * @param ctx the parse tree
	 */
	void enterBucle_mientras(EJ3Parser.Bucle_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#bucle_mientras}.
	 * @param ctx the parse tree
	 */
	void exitBucle_mientras(EJ3Parser.Bucle_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#bucle_para}.
	 * @param ctx the parse tree
	 */
	void enterBucle_para(EJ3Parser.Bucle_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#bucle_para}.
	 * @param ctx the parse tree
	 */
	void exitBucle_para(EJ3Parser.Bucle_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#control_bucle}.
	 * @param ctx the parse tree
	 */
	void enterControl_bucle(EJ3Parser.Control_bucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#control_bucle}.
	 * @param ctx the parse tree
	 */
	void exitControl_bucle(EJ3Parser.Control_bucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(EJ3Parser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(EJ3Parser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(EJ3Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(EJ3Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(EJ3Parser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(EJ3Parser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#bool_o}.
	 * @param ctx the parse tree
	 */
	void enterBool_o(EJ3Parser.Bool_oContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#bool_o}.
	 * @param ctx the parse tree
	 */
	void exitBool_o(EJ3Parser.Bool_oContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#bool_y}.
	 * @param ctx the parse tree
	 */
	void enterBool_y(EJ3Parser.Bool_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#bool_y}.
	 * @param ctx the parse tree
	 */
	void exitBool_y(EJ3Parser.Bool_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#bool_no}.
	 * @param ctx the parse tree
	 */
	void enterBool_no(EJ3Parser.Bool_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#bool_no}.
	 * @param ctx the parse tree
	 */
	void exitBool_no(EJ3Parser.Bool_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#operando_cmp}.
	 * @param ctx the parse tree
	 */
	void enterOperando_cmp(EJ3Parser.Operando_cmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#operando_cmp}.
	 * @param ctx the parse tree
	 */
	void exitOperando_cmp(EJ3Parser.Operando_cmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(EJ3Parser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(EJ3Parser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(EJ3Parser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(EJ3Parser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(EJ3Parser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(EJ3Parser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(EJ3Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(EJ3Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(EJ3Parser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(EJ3Parser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(EJ3Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(EJ3Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#atomo}.
	 * @param ctx the parse tree
	 */
	void enterAtomo(EJ3Parser.AtomoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#atomo}.
	 * @param ctx the parse tree
	 */
	void exitAtomo(EJ3Parser.AtomoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ3Parser#expr_general}.
	 * @param ctx the parse tree
	 */
	void enterExpr_general(EJ3Parser.Expr_generalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ3Parser#expr_general}.
	 * @param ctx the parse tree
	 */
	void exitExpr_general(EJ3Parser.Expr_generalContext ctx);
}