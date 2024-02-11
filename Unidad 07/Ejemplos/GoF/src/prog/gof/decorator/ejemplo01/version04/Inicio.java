package prog.gof.decorator.ejemplo01.version04;

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
    // Se crea el notificador (por telegram y whatsapp)
    // Si lo quieres crear por cualquier otra combinación, comenta la linea siguiente y descomenta una de las otras
    Notificador notificador = new NotificadorTelegramWhatsapp();
    //Notificador notificador = new NotificadorEmailTelegram();
    //Notificador notificador = new NotificadorEmailWhatsapp();
    //Notificador notificador = new NotificadorEmailTelegramWhatsapp();
    //Notificador notificador = new NotificadorTelegram();
    //Notificador notificador = new NotificadorWhatsapp();
    // Notificador notificador = new NotificadorEmail();

    // Se crea la aplicación
    Aplicacion aplicacion = new Aplicacion(notificador);
    aplicacion.ejecutar();
  }

}
