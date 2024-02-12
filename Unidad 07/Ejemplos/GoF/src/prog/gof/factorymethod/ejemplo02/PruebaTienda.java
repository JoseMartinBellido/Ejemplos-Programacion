package prog.gof.factorymethod.ejemplo02;

/**
 * Prueba de la tienda
 */
public class PruebaTienda {

  public static void main(String[] args) {
    // Tienda que vende ambos (motos y coches)
    Tienda tiendaAmbos = new Tienda(true, true, true);
    
    // Vamos a sacar 10 vehiculos
    for (int i = 0; i < 10; i++) {
      Vehiculo vehiculo = tiendaAmbos.vende();
      System.out.printf("Vehiculo %d: %s%n", (i + 1), vehiculo);
    }
  }

}
