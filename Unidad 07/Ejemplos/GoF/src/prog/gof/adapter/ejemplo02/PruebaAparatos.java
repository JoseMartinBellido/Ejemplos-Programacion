package prog.gof.adapter.ejemplo02;

import java.util.ArrayList;
import java.util.List;

/**
 * Prueba los aparatos
 */
public class PruebaAparatos {
  
  public static void main(String[] args) {
    List<Aparato> aparatosEuropeos = new ArrayList<>();
    aparatosEuropeos.add(new Lampara());
    aparatosEuropeos.add(new Lavadora());
    
    aparatosEuropeos.add(new Cafetera(new CoffeeMaker()));
    aparatosEuropeos.add(new Molinillo(new CoffeeMill()));
    
    for (Aparato aparato: aparatosEuropeos) {
      aparato.encender();
      aparato.apagar();
    }

  }
}
