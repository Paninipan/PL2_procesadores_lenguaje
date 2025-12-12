// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/PL3/Parte1/EJ1Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EJ1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EJ1ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EJ1Parser#archivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchivo(EJ1Parser.ArchivoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsonArch}
	 * labeled alternative in {@link EJ1Parser#filas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArch(EJ1Parser.JsonArchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsonLine}
	 * labeled alternative in {@link EJ1Parser#fila}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonLine(EJ1Parser.JsonLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link EJ1Parser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(EJ1Parser.CampoContext ctx);
}