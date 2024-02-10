package prog.gof.singleton;

/**
 * Clase que implementa el patrón singleton
 */
public class ClaseSingleton {

  // Atributos
  // Única instancia de la clase
  private static ClaseSingleton instancia = null;
  
  /**
   * Constructor. Privado por lo que no se puede emplear desde fuera de la clase
   */
  private ClaseSingleton() {
    // Constructor vacío por ahora
  }
  
  /**
   * Obtiene la instancia de la clase
   * @return Instancia de la clase
   */
  public static ClaseSingleton getInstancia() {
    // Si aún no se ha creado la instancia
    if (instancia == null) {
      // Es la primera llamada. Creamos la instancia
      instancia = new ClaseSingleton();
    }
    // Devolvemos la instancia
    return instancia;
  }
  
  // Otros métodos de la clase
}
