package prog.gof.adapter.ejemplo02;

public class Lampara implements Aparato {

  @Override
  public void encender() {
    System.out.println("Lámpara encendida");
  }

  @Override
  public void apagar() {
    System.out.println("Lámpara apagada");
  }

}
