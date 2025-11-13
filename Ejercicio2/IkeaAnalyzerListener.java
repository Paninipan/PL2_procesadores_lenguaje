import java.util.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class IkeaAnalyzerListener extends IkeaParserBaseListener {

    // Tabla de símbolos para herrajes: nombre/id -> cantidad total
    private final Map<String, Integer> herrajes = new LinkedHashMap<>();

    // Conjunto de herramientas usadas (sin duplicados, en orden de aparición)
    private final Set<String> herramientas = new LinkedHashSet<>();

    // Lista de números de paso que se han leído
    private final List<Integer> pasos = new ArrayList<>();

    // (Extra) Piezas que aparecen en el montaje
    private final Set<String> piezas = new LinkedHashSet<>();

    // Getters públicos para usar desde fuera

    public Map<String, Integer> getHerrajes() {
        return herrajes;
    }

    public Set<String> getHerramientas() {
        return herramientas;
    }

    public List<Integer> getPasos() {
        return pasos;
    }

    public Set<String> getPiezas() {
        return piezas;
    }

    // --- Callbacks del listener ---

    @Override
    public void enterPaso(IkeaParser.PasoContext ctx) {
        int numPaso = Integer.parseInt(ctx.NUMERO().getText());
        pasos.add(numPaso);
    }

    @Override
    public void enterHerraje_lista(IkeaParser.Herraje_listaContext ctx) {
        int n = ctx.id_herraje().size();
        for (int i = 0; i < n; i++) {
            String cantidadTexto = ctx.NUMERO(i).getText();
            int cantidad = Integer.parseInt(cantidadTexto);

            String idHerraje = ctx.id_herraje(i).getText(); // Puede ser "108363" o "TORNILLO_PARED"

            herrajes.merge(idHerraje, cantidad, Integer::sum);
        }
    }

    @Override
    public void enterHerramienta(IkeaParser.HerramientaContext ctx) {
        String nombreHerramienta = ctx.HERRAMIENTA().getText();
        herramientas.add(nombreHerramienta);
    }

    @Override
    public void enterPieza(IkeaParser.PiezaContext ctx) {
        String tipo = ctx.TIPO_PIEZA().getText(); // PIEZA, PANEL, BALDA, ESTANTE
        String etiqueta;

        if (ctx.NUMERO() != null) {
            etiqueta = tipo + "(" + ctx.NUMERO().getText() + ")";
        } else if (ctx.NOMBRE() != null) {
            etiqueta = tipo + "(" + ctx.NOMBRE().getText() + ")";
        } else {
            etiqueta = tipo;
        }

        piezas.add(etiqueta);
    }

    // Método de utilidad para imprimir el informe

    public void imprimirInforme() {
        System.out.println("=== Resumen del montaje IKEA-ASML ===");
        System.out.println();

        System.out.println("Pasos leídos:");
        pasos.stream()
                .sorted()
                .forEach(p -> System.out.println("  - Paso " + p));

        System.out.println();

        System.out.println("Herrajes utilizados (ID -> cantidad total):");
        if (herrajes.isEmpty()) {
            System.out.println("  (ninguno)");
        } else {
            herrajes.forEach((id, cant) ->
                    System.out.println("  - " + id + " : " + cant)
            );
        }

        System.out.println();

        System.out.println("Herramientas utilizadas:");
        if (herramientas.isEmpty()) {
            System.out.println("  (ninguna)");
        } else {
            for (String h : herramientas) {
                System.out.println("  - " + h);
            }
        }

        System.out.println();

        System.out.println("Piezas mencionadas:");
        if (piezas.isEmpty()) {
            System.out.println("  (ninguna)");
        } else {
            for (String p : piezas) {
                System.out.println("  - " + p);
            }
        }
    }
}
