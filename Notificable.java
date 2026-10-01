/**
 * Contrato de comportamiento: quien lo implemente puede recibir notificaciones.
 * No define CÓMO se entrega el mensaje (consola, correo, SMS...).
 */
public interface Notificable {
    void notificar(String mensaje);
}
