import java.time.LocalDate;

/**
 * Renovación: historial interno de un Prestamo (R11). COMPOSICIÓN.
 * Constructor con visibilidad de paquete: solo Prestamo puede crearla,
 * por eso no existe ni tiene sentido fuera de un préstamo.
 */
public class Renovacion {
    private final LocalDate fechaRenovacion;
    private final LocalDate fechaAnterior;
    private final LocalDate nuevaFecha;

    Renovacion(LocalDate fechaRenovacion, LocalDate fechaAnterior, LocalDate nuevaFecha) {
        this.fechaRenovacion = fechaRenovacion;
        this.fechaAnterior = fechaAnterior;
        this.nuevaFecha = nuevaFecha;
    }

    public LocalDate getFechaRenovacion() {
        return fechaRenovacion;
    }

    public LocalDate getFechaAnterior() {
        return fechaAnterior;
    }

    public LocalDate getNuevaFecha() {
        return nuevaFecha;
    }
}
