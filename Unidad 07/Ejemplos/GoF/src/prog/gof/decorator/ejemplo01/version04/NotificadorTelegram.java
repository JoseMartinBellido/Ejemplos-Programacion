package prog.gof.decorator.ejemplo01.version04;

public class NotificadorTelegram implements Notificador {

  @Override
  public void enviar(String mensaje) {
    System.out.printf("Mensaje \"%s\" enviado a todos los clientes por Telegram%n", mensaje);
  }

}
