package prog.gof.adapter.ejemplo01;

public class CoffeeMaker implements Appliance {

  @Override
  public void on() {
    System.out.println("Coffee Maker on");
  }

  @Override
  public void off() {
    System.out.println("Coffee Maker off");
  }

}
