package prog.gof.adapter.ejemplo02;

public class CoffeeMill implements Appliance {

  @Override
  public void on() {
    System.out.println("Cofeemill on");
  }

  @Override
  public void off() {
    System.out.println("Cofeemill off");
  }

}
