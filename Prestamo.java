import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Préstamo: se ASOCIA con un Estudiante y un Ejemplar, y COMPONE sus Renovaciones.
 */
public class Prestamo {
    private final Estudiante estudiante;
    private final Ejemplar ejemplar;
    private LocalDate fechaPrevistaDevolucion;
    private final List<Renovacion> renovaciones = new ArrayList<>();

    public Prestamo(Estudiante estudiante, Ejemplar ejemplar, LocalDate fechaPrevistaDevolucion) {
        if (estudiante == null || ejemplar == null || fechaPrevistaDevolucion == null) {
            throw new IllegalArgumentException("Estudiante, ejemplar y fecha prevista son obligatorios.");
        }
        this.estudiante = estudiante;
        this.ejemplar = ejemplar;
        this.fechaPrevistaDevolucion = fechaPrevistaDevolucion;
    }

    /**
     * Renueva el préstamo. Regla: la nueva fecha debe ser POSTERIOR
     * a la fecha prevista vigente; si no, se lanza IllegalArgumentException
     * y el préstamo queda intacto.
     */
    public void renovar(LocalDate nuevaFecha) {
        // 1. validar que nuevaFecha sea posterior a la fecha actual prevista
        if (nuevaFecha == null || !nuevaFecha.isAfter(fechaPrevistaDevolucion)) {
            throw new IllegalArgumentException("La nueva fecha (" + nuevaFecha
                    + ") debe ser posterior a la fecha prevista vigente ("
                    + fechaPrevistaDevolucion + ").");
        }
        // 2. crear la Renovacion
        Renovacion renovacion = new Renovacion(LocalDate.now(), fechaPrevistaDevolucion, nuevaFecha);
        // 3. almacenarla
        renovaciones.add(renovacion);
        // 4. actualizar fechaPrevistaDevolucion
        fechaPrevistaDevolucion = nuevaFecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public LocalDate getFechaPrevistaDevolucion() {
        return fechaPrevistaDevolucion;
    }

    public List<Renovacion> getRenovaciones() {
        return Collections.unmodifiableList(renovaciones);
    }

    public int getCantidadRenovaciones() {
        return renovaciones.size();
    }
}
