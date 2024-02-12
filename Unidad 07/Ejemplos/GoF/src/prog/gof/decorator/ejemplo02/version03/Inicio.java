package prog.gof.decorator.ejemplo02.version03;

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
    // Se crea el notificador (por Telegram)
    // En el resto de lineas están el resto de combinaciones para enviar por uno, otro o los dos medios
    Notificador notificador = new NotificadorTelegram(null);
    // Notificador notificador = new NotificadorWhatsapp(null);
    // Notificador notificador = new NotificadorEmail(null);
    // Notificador notificador = new NotificadorEmail(new NotificadorWhatsapp(null));
    // Notificador notificador = new NotificadorTelegram(new NotificadorEmail(new NotificadorWhatsapp(null)));
    // Se crea la aplicación
    Aplicacion aplicacion = new Aplicacion(notificador);
    aplicacion.ejecutar();
  }

}
