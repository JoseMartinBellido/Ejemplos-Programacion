package prog.gof.decorator.ejemplo01.version02;

/**
 * Clase principal de la aplicación
 */
public class Aplicacion {
  
  // Atributos
  private Notificador notificador;
  
  public Aplicacion(Notificador notificador) {
    this.notificador = notificador;
  }
  
  public void ejecutar() {
    // Hacemos cosas
    // ...

    // Y notificamos que hay una nueva oferta
    notificador.enviar("Hay una nueva oferta en polos de cuello vuelto");
    
    // Hacemos más cosas
    // ...
  }

}
