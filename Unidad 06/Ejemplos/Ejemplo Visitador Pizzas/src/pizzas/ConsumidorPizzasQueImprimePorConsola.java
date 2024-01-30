package pizzas;

public class ConsumidorPizzasQueImprimePorConsola implements ConsumidorPizzasADieta {

  @Override
  public void consume(Pizza pizza) {
    System.out.println("Pizza de tipo " + pizza.getTipo() + ", tamaño = " + pizza.getTamanyo());
  }

}
