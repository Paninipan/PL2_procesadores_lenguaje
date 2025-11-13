// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/Ex1/Ejercicio1_2/EJ2Parser.g4 by ANTLR 4.13.2
package Ejercicio1_2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EJ2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EJ2ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(EJ2Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(EJ2Parser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(EJ2Parser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(EJ2Parser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(EJ2Parser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle(EJ2Parser.BucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#control_bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_bucle(EJ2Parser.Control_bucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(EJ2Parser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(EJ2Parser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(EJ2Parser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#bool_o}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_o(EJ2Parser.Bool_oContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#bool_y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_y(EJ2Parser.Bool_yContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#bool_no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_no(EJ2Parser.Bool_noContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(EJ2Parser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(EJ2Parser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#operador_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_relacional(EJ2Parser.Operador_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(EJ2Parser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(EJ2Parser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(EJ2Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ2Parser#atomo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomo(EJ2Parser.AtomoContext ctx);
}