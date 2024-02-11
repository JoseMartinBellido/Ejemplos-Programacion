package prog.gof.decorator.ejemplo01.version03;

/**
 * Notifica mensajes pos email
 */
public class NotificadorEmail implements Notificador {

  @Override
  public void enviar(String mensaje) {
    System.out.printf("Mensaje \"%s\" enviado a todos los clientes por correo electrónico%n", mensaje);
  }

}
