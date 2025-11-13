// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/Ex1/Ejercicio1_2/EJ2Parser.g4 by ANTLR 4.13.2
package Ejercicio1_2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EJ2Parser}.
 */
public interface EJ2ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(EJ2Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(EJ2Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(EJ2Parser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(EJ2Parser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(EJ2Parser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(EJ2Parser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(EJ2Parser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(EJ2Parser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(EJ2Parser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(EJ2Parser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(EJ2Parser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(EJ2Parser.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#control_bucle}.
	 * @param ctx the parse tree
	 */
	void enterControl_bucle(EJ2Parser.Control_bucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#control_bucle}.
	 * @param ctx the parse tree
	 */
	void exitControl_bucle(EJ2Parser.Control_bucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(EJ2Parser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(EJ2Parser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(EJ2Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(EJ2Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(EJ2Parser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(EJ2Parser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#bool_o}.
	 * @param ctx the parse tree
	 */
	void enterBool_o(EJ2Parser.Bool_oContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#bool_o}.
	 * @param ctx the parse tree
	 */
	void exitBool_o(EJ2Parser.Bool_oContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#bool_y}.
	 * @param ctx the parse tree
	 */
	void enterBool_y(EJ2Parser.Bool_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#bool_y}.
	 * @param ctx the parse tree
	 */
	void exitBool_y(EJ2Parser.Bool_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#bool_no}.
	 * @param ctx the parse tree
	 */
	void enterBool_no(EJ2Parser.Bool_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#bool_no}.
	 * @param ctx the parse tree
	 */
	void exitBool_no(EJ2Parser.Bool_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(EJ2Parser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(EJ2Parser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(EJ2Parser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(EJ2Parser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(EJ2Parser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(EJ2Parser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(EJ2Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(EJ2Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(EJ2Parser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(EJ2Parser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(EJ2Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(EJ2Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EJ2Parser#atomo}.
	 * @param ctx the parse tree
	 */
	void enterAtomo(EJ2Parser.AtomoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EJ2Parser#atomo}.
	 * @param ctx the parse tree
	 */
	void exitAtomo(EJ2Parser.AtomoContext ctx);
}