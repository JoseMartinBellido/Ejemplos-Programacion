package pizzas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Guardamos pizzas
 */
public class Pizzas {
  
  // Atributos
  private Set<Pizza> pizzas;

  public Pizzas() {
    pizzas = new HashSet<>();
    
  }
  
  public void addPizza(Pizza pizza) {
    pizzas.add(pizza);
  }
  
  public int cuantasPizzas() {
    return pizzas.size();
  }
  
  public void aceptarConsumidor(ConsumidorPizzasADieta consumidor) {
    for (Pizza pizza: pizzas) {
      consumidor.consume(pizza);
    }
  }

}
