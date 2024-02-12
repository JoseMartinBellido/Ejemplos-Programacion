package prog.ud07.ejemplos.interfaces;

public interface MiInterfaz2 {
  
  void metodo1();
  
  default void metodo2() {
    System.out.println("MiInterfaz2.metodo2()");
  }

}
