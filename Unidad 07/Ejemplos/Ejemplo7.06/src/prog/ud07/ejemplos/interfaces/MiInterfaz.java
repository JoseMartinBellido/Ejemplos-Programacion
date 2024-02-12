package prog.ud07.ejemplos.interfaces;

/**
 * Interfaz con métodos por defecto
 */
public interface MiInterfaz {

  void metodo1();
  
  default void metodo2() {
    System.out.println("MiInterfaz.metodo2()");
  }
}
