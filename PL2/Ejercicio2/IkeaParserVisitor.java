// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/PL2/Ejercicio2/IkeaParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IkeaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IkeaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IkeaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(IkeaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#declaracion_inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_inicio(IkeaParser.Declaracion_inicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#declaracion_fin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_fin(IkeaParser.Declaracion_finContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#paso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaso(IkeaParser.PasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(IkeaParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#accion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion(IkeaParser.AccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#pieza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieza(IkeaParser.PiezaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#mueble_referencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMueble_referencia(IkeaParser.Mueble_referenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(IkeaParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#herramienta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHerramienta(IkeaParser.HerramientaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#herramienta_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHerramienta_lista(IkeaParser.Herramienta_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#herraje_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHerraje_lista(IkeaParser.Herraje_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#id_herraje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_herraje(IkeaParser.Id_herrajeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#distancia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistancia(IkeaParser.DistanciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IkeaParser#posicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosicion(IkeaParser.PosicionContext ctx);
}