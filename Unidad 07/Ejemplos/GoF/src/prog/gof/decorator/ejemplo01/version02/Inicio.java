package prog.gof.decorator.ejemplo01.version02;

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
    // Se crea el notificador (por whatsapp)
    // Si lo quieres crear por correo electrónico comenta la siguiente linea y descomenta la situada a continuación 
    Notificador notificador = new NotificadorWhatsapp();
    // Notificador notificador = new NotificadorEmail();

    // Se crea la aplicación
    Aplicacion aplicacion = new Aplicacion(notificador);
    aplicacion.ejecutar();
  }

}
