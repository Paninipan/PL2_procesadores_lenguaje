import org.antlr.v4.runtime.Token;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    private final Map<String, Symbol> symbols = new HashMap<>();

    public void declare(String name, Value initialValue, Token token) {
        if (symbols.containsKey(name)) {
            throw new SemanticException(
                    "Variable '" + name + "' ya declarada (línea " +
                            token.getLine() + ", columna " + token.getCharPositionInLine() + ")"
            );
        }
        Type type = initialValue.getType();
        symbols.put(name, new Symbol(name, type, initialValue));
    }

    public Symbol lookup(String name, Token token) {
        Symbol s = symbols.get(name);
        if (s == null) {
            throw new SemanticException(
                    "Variable '" + name + "' no declarada (línea " +
                            token.getLine() + ", columna " + token.getCharPositionInLine() + ")"
            );
        }
        return s;
    }

    public boolean exists(String name) {
        return symbols.containsKey(name);
    }
}
