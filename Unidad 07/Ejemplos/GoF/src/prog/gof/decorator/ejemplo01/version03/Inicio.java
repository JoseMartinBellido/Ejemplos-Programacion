package prog.gof.decorator.ejemplo01.version03;

/**
 * Clase con el punto de entrada de la aplicación
 * Configura la aplicación principal y la ejecuta
 */
public class Inicio {

  /** 
   * Punto de inicio
   * @param args
   */
  public static void main(String[] args) {
    // Se crea el notificador (por telegram)
    // Si lo quieres crear por correo electrónico o por Whatsapp. comenta la siguiente linea y descomenta una de las otras dos 
    Notificador notificador = new NotificadorTelegram();
    //Notificador notificador = new NotificadorWhatsapp();
    // Notificador notificador = new NotificadorEmail();

    // Se crea la aplicación
    Aplicacion aplicacion = new Aplicacion(notificador);
    aplicacion.ejecutar();
  }

}
