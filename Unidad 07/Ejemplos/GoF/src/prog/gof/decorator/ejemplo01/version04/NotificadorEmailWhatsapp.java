package prog.gof.decorator.ejemplo01.version04;

public class NotificadorEmailWhatsapp implements Notificador {

  @Override
  public void enviar(String mensaje) {
    System.out.printf("Mensaje \"%s\" enviado a todos los clientes por correo electrónico%n", mensaje);
    System.out.printf("Mensaje \"%s\" enviado a todos los clientes por Whatsapp%n", mensaje);
  }

}
