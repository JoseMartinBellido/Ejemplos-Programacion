package prog.gof.factorymethod.ejemplo02;

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
  // Vende bicicletas?
  private boolean vendeBicicletas;

  /**
   * Constructor
   * @param vendeMotocicletas true si esta tienda venderá motocicletas. false si no
   * @param vendeCoches Igual para coches
   * @param vendeBicicletas Igual para bicicletas
   * @throws IllegalArgumentException Si vendeMotocicletas, vendeCoches y vendeBicicletas son todas
   *   false
   */
  public Tienda(boolean vendeMotocicletas, boolean vendeCoches, boolean vendeBicicletas) {
    if (!vendeCoches && !vendeMotocicletas && !vendeBicicletas) {
      throw new IllegalArgumentException("Hay que especificar al menos un tipo de vehiculo");
    }
    this.vendeMotocicletas = vendeMotocicletas;
    this.vendeCoches = vendeCoches;
    this.vendeBicicletas = vendeBicicletas;
  }
  
  /**
   * Realiza una venta. El tipo de vehiculo se escoge al azar entre las posibilidades de la tienda
   * @return Vehiculo vendido
   */
  public Vehiculo vende() {
    Random random = new Random();
    int opcion = random.nextInt(0, 3);
    if (opcion == 0) {
      if (vendeMotocicletas) {
        return new Motocicleta();
      } else {
        opcion = random.nextInt(0, 2);
        if (opcion == 0) {
          return vendeCoches ? new Coche() : new Bicicleta();
        } else {
          return vendeBicicletas ? new Bicicleta() : new Coche();
        }
      }
    } else if (opcion == 1) {
      if (vendeCoches) {
        return new Coche();
      } else {
        opcion = random.nextInt(0, 2);
        if (opcion == 0) {
          return vendeBicicletas ? new Bicicleta() : new Motocicleta();
        } else {
          return vendeMotocicletas ? new Motocicleta() : new Bicicleta();
        }
      }
    } else {
      if (vendeBicicletas) {
        return new Bicicleta();
      } else {
        opcion = random.nextInt(0, 2);
        if (opcion == 0) {
          return vendeMotocicletas ? new Motocicleta() : new Coche();
        } else {
          return vendeCoches ? new Coche() : new Motocicleta();
        }
      }
    }
  }
}
