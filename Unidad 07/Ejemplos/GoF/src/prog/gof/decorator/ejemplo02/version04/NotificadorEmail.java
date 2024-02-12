package prog.gof.decorator.ejemplo02.version04;

/**
 * Notifica mensajes por email
 */
public class NotificadorEmail extends NotificadorDecorador {
  
  public NotificadorEmail(Notificador base) {
    super(base);
  }

  @Override
  public void enviar(String mensaje) {
    super.enviar(mensaje);
    System.out.printf("Mensaje \"%s\" enviado a todos los clientes por correo electrónico%n", mensaje);
  }

}
