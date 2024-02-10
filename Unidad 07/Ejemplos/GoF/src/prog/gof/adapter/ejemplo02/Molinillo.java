package prog.gof.adapter.ejemplo02;

public class Molinillo implements Aparato {
  
  // Atributos
  private CoffeeMill coffeeMill;
  
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
