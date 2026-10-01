import java.time.LocalDate;

/** Reserva de un Libro hecha por un Estudiante (contexto para el componente Gestión de Reservas). */
public class Reserva {
    private final Estudiante estudiante;
    private final Libro libro;
    private final LocalDate fechaReserva;

    public Reserva(Estudiante estudiante, Libro libro, LocalDate fechaReserva) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaReserva = fechaReserva;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Libro getLibro() {
        return libro;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }
}
