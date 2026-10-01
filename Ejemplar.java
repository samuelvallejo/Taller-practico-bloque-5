/**
 * Ejemplar = copia física. Corresponde a UN único Libro (R10).
 */
public class Ejemplar {
    private String codigoInventario;
    private final Libro libro;

    public Ejemplar(String codigoInventario, Libro libro) {
        if (libro == null) {
            throw new IllegalArgumentException("Un ejemplar debe corresponder a un libro.");
        }
        this.codigoInventario = codigoInventario;
        this.libro = libro;
        libro.registrarEjemplar(this);
    }

    public String getCodigoInventario() {
        return codigoInventario;
    }

    public Libro getLibro() {
        return libro;
    }
}
