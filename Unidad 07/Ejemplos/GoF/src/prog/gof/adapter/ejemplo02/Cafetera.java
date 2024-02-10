package prog.gof.adapter.ejemplo02;

/**
 * Adaptador de Cafetera americana a europea
 */
public class Cafetera implements Aparato {
  
  // Atributos
  // Cafetera americana
  private CoffeeMaker coffeeMaker;
  
  /**
   * Constructor
   * @param coffeeMaker Cafetera americana a adaptar
   */
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
