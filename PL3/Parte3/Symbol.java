public class Symbol {

    private final String name;
    private final Type type;
    private Value value;

    public Symbol(String name, Type type, Value initialValue) {
        this.name = name;
        this.type = type;
        this.value = initialValue;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
