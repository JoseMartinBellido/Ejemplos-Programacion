package prog.gof.decorator.ejemplo01.version03;

/**
 * Notificador de mensajes
 */
public interface Notificador {

  /**
   * Envia el mensaje a los usuarios
   * @param mensaje Mensaje a enviar
   */
  void enviar(String mensaje);
}
