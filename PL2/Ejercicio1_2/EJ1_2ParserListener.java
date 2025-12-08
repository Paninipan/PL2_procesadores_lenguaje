// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/PL2/Ejercicio1_2/EJ1_2Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EJ1_2Parser}.
 */
public interface EJ1_2ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(EJ1_2Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(EJ1_2Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(EJ1_2Parser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(EJ1_2Parser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(EJ1_2Parser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(EJ1_2Parser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(EJ1_2Parser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(EJ1_2Parser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(EJ1_2Parser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(EJ1_2Parser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(EJ1_2Parser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(EJ1_2Parser.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#bucle_mientras}.
	 * @param ctx the parse tree
	 */
	void enterBucle_mientras(EJ1_2Parser.Bucle_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#bucle_mientras}.
	 * @param ctx the parse tree
	 */
	void exitBucle_mientras(EJ1_2Parser.Bucle_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#bucle_para}.
	 * @param ctx the parse tree
	 */
	void enterBucle_para(EJ1_2Parser.Bucle_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#bucle_para}.
	 * @param ctx the parse tree
	 */
	void exitBucle_para(EJ1_2Parser.Bucle_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#control_bucle}.
	 * @param ctx the parse tree
	 */
	void enterControl_bucle(EJ1_2Parser.Control_bucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#control_bucle}.
	 * @param ctx the parse tree
	 */
	void exitControl_bucle(EJ1_2Parser.Control_bucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(EJ1_2Parser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(EJ1_2Parser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(EJ1_2Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(EJ1_2Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(EJ1_2Parser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(EJ1_2Parser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#bool_o}.
	 * @param ctx the parse tree
	 */
	void enterBool_o(EJ1_2Parser.Bool_oContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#bool_o}.
	 * @param ctx the parse tree
	 */
	void exitBool_o(EJ1_2Parser.Bool_oContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#bool_y}.
	 * @param ctx the parse tree
	 */
	void enterBool_y(EJ1_2Parser.Bool_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#bool_y}.
	 * @param ctx the parse tree
	 */
	void exitBool_y(EJ1_2Parser.Bool_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#bool_no}.
	 * @param ctx the parse tree
	 */
	void enterBool_no(EJ1_2Parser.Bool_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#bool_no}.
	 * @param ctx the parse tree
	 */
	void exitBool_no(EJ1_2Parser.Bool_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(EJ1_2Parser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(EJ1_2Parser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(EJ1_2Parser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(EJ1_2Parser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(EJ1_2Parser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(EJ1_2Parser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(EJ1_2Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(EJ1_2Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(EJ1_2Parser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(EJ1_2Parser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(EJ1_2Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(EJ1_2Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#atomo}.
	 * @param ctx the parse tree
	 */
	void enterAtomo(EJ1_2Parser.AtomoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#atomo}.
	 * @param ctx the parse tree
	 */
	void exitAtomo(EJ1_2Parser.AtomoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ1_2Parser#expr_general}.
	 * @param ctx the parse tree
	 */
	void enterExpr_general(EJ1_2Parser.Expr_generalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ1_2Parser#expr_general}.
	 * @param ctx the parse tree
	 */
	void exitExpr_general(EJ1_2Parser.Expr_generalContext ctx);
}