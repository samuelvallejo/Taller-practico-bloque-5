import java.time.LocalDate;

/** Pruebas mínimas del taller (5.3): una renovación válida y una inválida. */
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("1085000111", "Laura Gómez",
                "laura.gomez@universidad.edu.co", "EST-2024-015", "Ingeniería de Software");
        Libro libro = new Libro("978-0-13-468599-1", "Clean Code", "Robert C. Martin");
        Ejemplar ejemplar = new Ejemplar("EJ-001", libro);
        Prestamo prestamo = new Prestamo(estudiante, ejemplar, LocalDate.of(2026, 10, 8));

        // ---- Prueba 1: renovación VÁLIDA ----
        System.out.println("== Prueba 1: renovación válida ==");
        prestamo.renovar(LocalDate.of(2026, 10, 15));
        estudiante.notificar("Su préstamo fue renovado.");
        System.out.println("Nueva fecha prevista: " + prestamo.getFechaPrevistaDevolucion());
        System.out.println("Cantidad de renovaciones: " + prestamo.getCantidadRenovaciones());

        // ---- Prueba 2: renovación INVÁLIDA (fecha igual o anterior a la vigente) ----
        System.out.println();
        System.out.println("== Prueba 2: renovación inválida ==");
        try {
            prestamo.renovar(LocalDate.of(2026, 10, 10)); // anterior a 2026-10-15
            System.out.println("ERROR: no debió permitirse la renovación.");
        } catch (IllegalArgumentException e) {
            System.out.println("Renovación rechazada: " + e.getMessage());
        }
        System.out.println("Fecha prevista (sin cambios): " + prestamo.getFechaPrevistaDevolucion());
        System.out.println("Cantidad de renovaciones (sin cambios): " + prestamo.getCantidadRenovaciones());
    }
}
