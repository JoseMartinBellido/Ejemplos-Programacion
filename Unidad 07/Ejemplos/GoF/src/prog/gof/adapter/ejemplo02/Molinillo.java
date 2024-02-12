package prog.gof.adapter.ejemplo02;

/**
 * Adaptador de molinillo a europeo
 */
public class Molinillo implements Aparato {
  
  // Atributos
  // Molinillo americano a emplear
  private CoffeeMill coffeeMill;
  
  /**
   * Constructor
   * @param coffeeMill Molinillo americano a emplear
   */
  public Molinillo(CoffeeMill coffeeMill) {
    this.coffeeMill = coffeeMill;
  }

  @Override
  public void encender() {
    coffeeMill.on();
  }

  @Override
  public void apagar() {
    coffeeMill.off();
  }

}
