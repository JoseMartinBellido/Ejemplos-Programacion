package prog.gof.decorator.ejemplo02.version04;

public class NotificadorWhatsapp extends NotificadorDecorador {

  /**
   * Constructor
   * @param base Objeto base
   */
  public NotificadorWhatsapp(Notificador base) {
    super(base);
  }

  @Override
  public void enviar(String mensaje) {
    super.enviar(mensaje);
    System.out.printf("Mensaje \"%s\" enviado a todos los clientes por Whatsapp%n", mensaje);
  }

}
