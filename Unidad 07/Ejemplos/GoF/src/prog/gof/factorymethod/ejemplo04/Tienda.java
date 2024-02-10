package prog.gof.factorymethod.ejemplo04;

import java.util.List;
import java.util.Random;

/**
 * Tienda de vehiculos
 */
public class Tienda {
  
  // Atributos
  // Factorías de vehiculos
  List<FactoriaVehiculo> factorias;

  /**
   * Constructor
   * @param factorias Factorias de vehiculos
   * @throws NullPointerException si factorias es null o está vacía
   */
  public Tienda(List<FactoriaVehiculo> factorias) {
    if (factorias == null || factorias.size() == 0) {
      throw new NullPointerException("Hay que especificar al menos una factoria");
    }
    this.factorias = factorias;
  }
  
  /**
   * Realiza una venta. El tipo de vehiculo se escoge al azar entre las posibilidades de la tienda
   * @return Vehiculo vendido
   */
  public Vehiculo vende() {
    Random random = new Random();
    int opcion = random.nextInt(0, factorias.size());
    return factorias.get(opcion).fabrica();
  }
}
