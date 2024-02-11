package prog.gof.decorator.ejemplo02.version02;
/**
 * Notificadores de mensajes
 */
public interface Notificador {

  /**
   * Notifica un mensaje a todos los usuarios
   * @param mensaje Mensaje a notificar
   */
  void enviar(String mensaje);
}
