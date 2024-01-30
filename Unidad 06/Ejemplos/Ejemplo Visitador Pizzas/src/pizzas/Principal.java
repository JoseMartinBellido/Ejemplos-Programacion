package pizzas;

public class Principal {

  public static void main(String[] args) {
    Pizzas pizzas = new Pizzas();
    
    // Añado un par de pizzas
    pizzas.addPizza(new Pizza ("Peperoni", "Mediana"));
    pizzas.addPizza(new Pizza ("Cuatro quesos", "Familiar"));
      
    pizzas.aceptarConsumidor(new ConsumidorPizzasQueImprimePorConsola());
  }

}
