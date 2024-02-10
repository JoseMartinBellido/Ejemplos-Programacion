package prog.gof.adapter.ejemplo02;

public class Cafetera implements Aparato {
  
  // Atributos
  private CoffeeMaker coffeeMaker;
  
  public Cafetera(CoffeeMaker coffeeMaker) {
    this.coffeeMaker = coffeeMaker;
  }

  @Override
  public void encender() {
    coffeeMaker.on();
  }

  @Override
  public void apagar() {
    coffeeMaker.off();
  }

}
