package prog.gof.factorymethod.ejemplo04;

import java.util.ArrayList;
import java.util.List;

/**
 * Prueba de la tienda
 */
public class PruebaTienda {

  public static void main(String[] args) {
    // Tienda que vende ambos (motos y coches)
    List<FactoriaVehiculo> factorias = new ArrayList<>();
    factorias.add(new FactoriaMotocicletas());
    factorias.add(new FactoriaCoches());
    factorias.add(new FactoriaBicicletas());
    Tienda tiendaAmbos = new Tienda(factorias);
    
    // Vamos a sacar 10 vehiculos
    for (int i = 0; i < 10; i++) {
      Vehiculo vehiculo = tiendaAmbos.vende();
      System.out.printf("Vehiculo %d: %s%n", (i + 1), vehiculo);
    }
  }

}
