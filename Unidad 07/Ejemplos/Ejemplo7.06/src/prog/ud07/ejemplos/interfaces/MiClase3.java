package prog.ud07.ejemplos.interfaces;

/**
 * Implementa MiInterfaz y MiInterfaz2
 */
public class MiClase3 implements MiInterfaz, MiInterfaz2 {

  @Override
  public void metodo1() {
    System.out.println("MiClase3.metodo1()");
  }

  @Override
  public void metodo2() {
    System.out.println("MiClase3.metodo2()");
  }

}
