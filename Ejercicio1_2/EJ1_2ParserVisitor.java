// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/Ex1/Ejercicio1_2/EJ1_2Parser.g4 by ANTLR 4.13.2
package Ejercicio1_2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EJ1_2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EJ1_2ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(EJ1_2Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(EJ1_2Parser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(EJ1_2Parser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(EJ1_2Parser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(EJ1_2Parser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle(EJ1_2Parser.BucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#bucle_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_mientras(EJ1_2Parser.Bucle_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#bucle_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_para(EJ1_2Parser.Bucle_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#control_bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_bucle(EJ1_2Parser.Control_bucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(EJ1_2Parser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(EJ1_2Parser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(EJ1_2Parser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#bool_o}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_o(EJ1_2Parser.Bool_oContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#bool_y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_y(EJ1_2Parser.Bool_yContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#bool_no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_no(EJ1_2Parser.Bool_noContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(EJ1_2Parser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(EJ1_2Parser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#operador_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_relacional(EJ1_2Parser.Operador_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(EJ1_2Parser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(EJ1_2Parser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(EJ1_2Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#atomo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomo(EJ1_2Parser.AtomoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1_2Parser#expr_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_general(EJ1_2Parser.Expr_generalContext ctx);
}