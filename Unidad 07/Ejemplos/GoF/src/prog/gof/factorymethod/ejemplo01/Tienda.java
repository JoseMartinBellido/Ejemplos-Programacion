package prog.gof.factorymethod.ejemplo01;

import java.util.Random;

/**
 * Tienda de vehiculos
 */
public class Tienda {
  
  // Atributos
  // Vende coches?
  private boolean vendeMotocicletas;
  // Vende motocicletas?
  private boolean vendeCoches;

  /**
   * Constructor
   * @param vendeMotocicletas true si esta tienda venderá motocicletas. false si no
   * @param vendeCoches Igual para coches
   * @throws IllegalArgumentException Si vendeMotocicletas y vendeCoches son ambas false
   */
  public Tienda(boolean vendeMotocicletas, boolean vendeCoches) {
    if (!vendeCoches && !vendeMotocicletas) {
      throw new IllegalArgumentException("Hay que especificar al menos un tipo de vehiculo");
    }
    this.vendeMotocicletas = vendeMotocicletas;
    this.vendeCoches = vendeCoches;
  }
  
  /**
   * Realiza una venta. El tipo de vehiculo se escoge al azar entre las posibilidades de la tienda
   * @return Vehiculo vendido
   */
  public Vehiculo vende() {
    Random random = new Random();
    if (random.nextBoolean()) {
      return vendeCoches ? new Coche() : new Motocicleta();
    } else {
      return vendeMotocicletas ? new Motocicleta() : new Coche();
    }
  }
}
