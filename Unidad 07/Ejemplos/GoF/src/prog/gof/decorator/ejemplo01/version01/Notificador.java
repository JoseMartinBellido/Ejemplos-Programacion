package prog.gof.decorator.ejemplo01.version01;

/**
 * Notifica mensajes por correo electrónico
 */
public class Notificador {

  public void enviar(String mensaje) {
    System.out.printf("Mensaje \"%s\" enviado a todos los clientes por correo electrónico%n", mensaje);
  }
}
