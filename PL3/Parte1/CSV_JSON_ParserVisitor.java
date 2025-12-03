// Generated from C:/Users/alvar/OneDrive/Documentos/uni/3.1Cuatri/Procesadores/Laboratorio/PL2/PL3/Parte1/CSV_JSON_Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSV_JSON_Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSV_JSON_ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSV_JSON_Parser#archivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchivo(CSV_JSON_Parser.ArchivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSV_JSON_Parser#fila}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFila(CSV_JSON_Parser.FilaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSV_JSON_Parser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(CSV_JSON_Parser.CampoContext ctx);
}