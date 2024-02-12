package prog.gof.adapter.ejemplo01;

/**
 * Lavadora
 */
public class Lavadora implements Aparato {

  @Override
  public void encender() {
    System.out.println("Lavadora encendida");
  }

  @Override
  public void apagar() {
    System.out.println("Lavadora apagada");
  }

}
