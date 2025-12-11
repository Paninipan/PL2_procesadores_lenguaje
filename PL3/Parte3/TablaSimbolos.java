import org.antlr.v4.runtime.Token;

import java.util.LinkedHashMap;
import java.util.Map;

public class TablaSimbolos {

    private final Map<String, Simbolo> simbolos = new LinkedHashMap<>();
    private int siguienteDireccion = 0;
    private final StringBuilder errores = new StringBuilder();

    // Inserta una variable nueva
    public Simbolo insertar(String nombre, Tipo tipo) {
        if (simbolos.containsKey(nombre)) {
            error("Error: variable '" + nombre + "' ya declarada.");
            return simbolos.get(nombre);
        }
        Simbolo s = new Simbolo(nombre, tipo, siguienteDireccion++);
        simbolos.put(nombre, s);
        return s;
    }

    // Busca una variable (en este diseño solo hay un ámbito global)
    public Simbolo buscar(String nombre) {
        return simbolos.get(nombre);
    }

    // Registra un mensaje de error
    public void error(String msg) {
        errores.append(msg).append('\n');
    }

    // Indica si hay errores acumulados
    public boolean tieneErrores() {
        return errores.length() > 0;
    }

    // Devuelve todos los errores en un String
    public String getErrores() {
        return errores.toString();
    }

    // Por si necesitamos una dirección temporal anónima
    public int nuevaDireccionAnonima() {
        return siguienteDireccion++;
    }


    public void semanticError(Token t, String msg) {
        errores.append("ERROR SEMÁNTICO: ")
                .append(msg)
                .append(" (línea ")
                .append(t.getLine())
                .append(", columna ")
                .append(t.getCharPositionInLine())
                .append(")\n");
    }

    public void controlError(Token t, String msg) {
        errores.append("ERROR DE CONTROL DE BUCLE: ")
                .append(msg)
                .append('\n');
    }

    // insertar con token
    public Simbolo insertar(String nombre, Tipo tipo, Token tok) {
        if (simbolos.containsKey(nombre)) {
            semanticError(tok, "Variable '" + nombre + "' ya declarada");
            return simbolos.get(nombre);
        }
        Simbolo s = new Simbolo(nombre, tipo, siguienteDireccion++);
        simbolos.put(nombre, s);
        return s;
    }
}

