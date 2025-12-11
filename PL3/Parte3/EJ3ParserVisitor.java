// Generated from EJ3Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EJ3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EJ3ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(EJ3Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(EJ3Parser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(EJ3Parser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(EJ3Parser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(EJ3Parser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle(EJ3Parser.BucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#bucle_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_mientras(EJ3Parser.Bucle_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#bucle_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_para(EJ3Parser.Bucle_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#control_bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_bucle(EJ3Parser.Control_bucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(EJ3Parser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(EJ3Parser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(EJ3Parser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link EJ3Parser#bool_o}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOr(EJ3Parser.BoolOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link EJ3Parser#bool_y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAnd(EJ3Parser.BoolAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolNot}
	 * labeled alternative in {@link EJ3Parser#bool_no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(EJ3Parser.BoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolParen}
	 * labeled alternative in {@link EJ3Parser#bool_no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolParen(EJ3Parser.BoolParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolComp}
	 * labeled alternative in {@link EJ3Parser#bool_no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolComp(EJ3Parser.BoolCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAtom}
	 * labeled alternative in {@link EJ3Parser#bool_no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAtom(EJ3Parser.BoolAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#operando_cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperando_cmp(EJ3Parser.Operando_cmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(EJ3Parser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(EJ3Parser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#operador_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_relacional(EJ3Parser.Operador_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSumRes}
	 * labeled alternative in {@link EJ3Parser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSumRes(EJ3Parser.ExprSumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDivMod}
	 * labeled alternative in {@link EJ3Parser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDivMod(EJ3Parser.ExprMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link EJ3Parser#potencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPow(EJ3Parser.ExprPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNeg}
	 * labeled alternative in {@link EJ3Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeg(EJ3Parser.ExprNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link EJ3Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(EJ3Parser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAtom}
	 * labeled alternative in {@link EJ3Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtom(EJ3Parser.ExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ3Parser#atomo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomo(EJ3Parser.AtomoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprGeneralArith}
	 * labeled alternative in {@link EJ3Parser#expr_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGeneralArith(EJ3Parser.ExprGeneralArithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprGeneralBool}
	 * labeled alternative in {@link EJ3Parser#expr_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGeneralBool(EJ3Parser.ExprGeneralBoolContext ctx);
}