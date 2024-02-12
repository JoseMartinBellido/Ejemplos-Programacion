package prog.gof.decorator.ejemplo02.version02;

/**
 * Decorador de Notificador. Sirve para extender notificadores 
 */
public abstract class NotificadorDecorador implements Notificador {
  
  // Atributos
  // Notificador base
  private Notificador base;

  /**
   * Constructor
   * @param base Notificador base. null para que no emplee un objeto base
   */
  public NotificadorDecorador(Notificador base) {
    this.base = base;
  }
  
  @Override
  public void enviar(String mensaje) {
    // Si el objeto base no es null
    if (base != null) {
      // Emplea el objeto base para enviar el mensaje
      base.enviar(mensaje);
    }
  }

}
