package prog.gof.decorator.ejemplo02.version04;

public class NotificadorSMS extends NotificadorDecorador {

  public NotificadorSMS(Notificador base) {
    super(base);
  }

  @Override
  public void enviar(String mensaje) {
    super.enviar(mensaje);
    System.out.printf("Mensaje \"%s\" enviado a todos los clientes por SMS%n", mensaje);    
  }

}
