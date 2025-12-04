public class Value {

    private final Type type;
    private final Object value;

    public static final Value VOID = new Value(Type.VOID, null);

    public Value(Type type, Object value) {
        this.type = type;
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public Object getRawValue() {
        return value;
    }

    public int asInt() {
        return (Integer) value;
    }

    public float asFloat() {
        if (type == Type.INT) {
            return ((Integer) value).floatValue();
        }
        return (Float) value;
    }

    public boolean asBool() {
        return (Boolean) value;
    }

    public String asString() {
        if (value == null) return "null";
        return value.toString();
    }

    @Override
    public String toString() {
        return asString();
    }
}

