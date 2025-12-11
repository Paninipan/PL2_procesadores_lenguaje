public class Simbolo {
    public final String nombre;
    public final Tipo tipo;
    public final int direccion; // índice de variable local en Jasmin

    public Simbolo(String nombre, Tipo tipo, int direccion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
    }
}
