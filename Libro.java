import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Libro = título del catálogo. AGREGA sus ejemplares físicos (R10).
 * Agregación: los Ejemplar se crean por fuera y se registran en el libro.
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private final List<Ejemplar> ejemplares = new ArrayList<>();

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    /** Visibilidad de paquete: lo invoca el constructor de Ejemplar. */
    void registrarEjemplar(Ejemplar ejemplar) {
        if (!ejemplares.contains(ejemplar)) {
            ejemplares.add(ejemplar);
        }
    }

    public List<Ejemplar> getEjemplares() {
        return Collections.unmodifiableList(ejemplares);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
