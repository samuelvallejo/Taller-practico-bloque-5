/**
 * Bibliotecario ES-UN Usuario.
 * Decisión: NO implementa Notificable, porque ningún requisito (R13) indica que
 * el bibliotecario reciba notificaciones del sistema; el flujo del taller
 * (renovación de un préstamo) notifica únicamente al estudiante.
 * Si el negocio lo pidiera, bastaría con agregar "implements Notificable"
 * aquí, sin tocar Usuario ni Estudiante.
 */
public class Bibliotecario extends Usuario {
    private String codigoEmpleado;
    private String turno;

    public Bibliotecario(String identificacion, String nombre, String correo,
                         String codigoEmpleado, String turno) {
        super(identificacion, nombre, correo);
        this.codigoEmpleado = codigoEmpleado;
        this.turno = turno;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public String getTurno() {
        return turno;
    }
}
