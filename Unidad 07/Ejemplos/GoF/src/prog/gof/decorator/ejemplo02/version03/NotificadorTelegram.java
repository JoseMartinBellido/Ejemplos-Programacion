package prog.gof.decorator.ejemplo02.version03;

public class NotificadorTelegram extends NotificadorDecorador {

  public NotificadorTelegram(Notificador base) {
    super(base);
  }

  @Override
  public void enviar(String mensaje) {
    super.enviar(mensaje);
    System.out.printf("Mensaje \"%s\" enviado a todos los clientes por Telegram%n", mensaje);    
  }
  
}
