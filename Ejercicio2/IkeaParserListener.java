// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/Ex1/Ejercicio2/IkeaParser.g4 by ANTLR 4.13.2
package Ejercicio2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IkeaParser}.
 */
public interface IkeaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IkeaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(IkeaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(IkeaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#declaracion_inicio}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_inicio(IkeaParser.Declaracion_inicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#declaracion_inicio}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_inicio(IkeaParser.Declaracion_inicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#declaracion_fin}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_fin(IkeaParser.Declaracion_finContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#declaracion_fin}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_fin(IkeaParser.Declaracion_finContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#paso}.
	 * @param ctx the parse tree
	 */
	void enterPaso(IkeaParser.PasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#paso}.
	 * @param ctx the parse tree
	 */
	void exitPaso(IkeaParser.PasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(IkeaParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(IkeaParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(IkeaParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(IkeaParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#pieza}.
	 * @param ctx the parse tree
	 */
	void enterPieza(IkeaParser.PiezaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#pieza}.
	 * @param ctx the parse tree
	 */
	void exitPieza(IkeaParser.PiezaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#mueble_referencia}.
	 * @param ctx the parse tree
	 */
	void enterMueble_referencia(IkeaParser.Mueble_referenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#mueble_referencia}.
	 * @param ctx the parse tree
	 */
	void exitMueble_referencia(IkeaParser.Mueble_referenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(IkeaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(IkeaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#herramienta}.
	 * @param ctx the parse tree
	 */
	void enterHerramienta(IkeaParser.HerramientaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#herramienta}.
	 * @param ctx the parse tree
	 */
	void exitHerramienta(IkeaParser.HerramientaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#herramienta_lista}.
	 * @param ctx the parse tree
	 */
	void enterHerramienta_lista(IkeaParser.Herramienta_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#herramienta_lista}.
	 * @param ctx the parse tree
	 */
	void exitHerramienta_lista(IkeaParser.Herramienta_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#herraje_lista}.
	 * @param ctx the parse tree
	 */
	void enterHerraje_lista(IkeaParser.Herraje_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#herraje_lista}.
	 * @param ctx the parse tree
	 */
	void exitHerraje_lista(IkeaParser.Herraje_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#id_herraje}.
	 * @param ctx the parse tree
	 */
	void enterId_herraje(IkeaParser.Id_herrajeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#id_herraje}.
	 * @param ctx the parse tree
	 */
	void exitId_herraje(IkeaParser.Id_herrajeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#distancia}.
	 * @param ctx the parse tree
	 */
	void enterDistancia(IkeaParser.DistanciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#distancia}.
	 * @param ctx the parse tree
	 */
	void exitDistancia(IkeaParser.DistanciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#posicion}.
	 * @param ctx the parse tree
	 */
	void enterPosicion(IkeaParser.PosicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#posicion}.
	 * @param ctx the parse tree
	 */
	void exitPosicion(IkeaParser.PosicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IkeaParser#veces}.
	 * @param ctx the parse tree
	 */
	void enterVeces(IkeaParser.VecesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IkeaParser#veces}.
	 * @param ctx the parse tree
	 */
	void exitVeces(IkeaParser.VecesContext ctx);
}