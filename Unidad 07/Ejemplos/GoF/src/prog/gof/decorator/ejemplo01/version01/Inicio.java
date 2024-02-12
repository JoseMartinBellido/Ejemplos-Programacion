package prog.gof.decorator.ejemplo01.version01;

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
    // Se crea el notificador
    Notificador notificador = new Notificador();
    // Se crea la aplicación
    Aplicacion aplicacion = new Aplicacion(notificador);
    aplicacion.ejecutar();
  }

}
