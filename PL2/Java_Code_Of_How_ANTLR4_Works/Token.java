package Java_Code_Of_How_ANTLR4_Works;

public class Token {
    public final String value;

    public Token(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Token(\"%s\")", value);
    }

    public String getValor() {
        return this.value;
    }
}
