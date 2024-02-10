package prog.gof.adapter.ejemplo01;

import java.util.ArrayList;
import java.util.List;

/**
 * Prueba los aparatos
 */
public class PruebaAparatos {
  
  public static void main(String[] args) {
    List<Aparato> aparatosEuropeos = new ArrayList<>();
    List<Appliance> aparatosAmericanos = new ArrayList<>();
    
    aparatosEuropeos.add(new Lampara());
    aparatosEuropeos.add(new Lavadora());
    
    aparatosAmericanos.add(new CoffeeMaker());
    aparatosAmericanos.add(new CoffeeMill());
    
    for (Aparato aparato: aparatosEuropeos) {
      aparato.encender();
      aparato.apagar();
    }

    for (Appliance aparato: aparatosAmericanos) {
      aparato.on();
      aparato.off();
    }
  }
}
