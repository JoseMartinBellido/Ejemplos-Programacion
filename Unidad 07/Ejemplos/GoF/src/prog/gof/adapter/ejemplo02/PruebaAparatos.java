package prog.gof.adapter.ejemplo02;

import java.util.ArrayList;
import java.util.List;

/**
 * Prueba los aparatos
 */
public class PruebaAparatos {
  
  public static void main(String[] args) {
    // Crea la case
    CasaConectada casa = new CasaConectada();
    
    // Añade los aparatos
    casa.addAparato(new Lampara());
    casa.addAparato(new Lavadora());
    // Ahora si se pueden añadir, adaptándolos
    casa.addAparato(new Cafetera(new CoffeeMaker()));
    casa.addAparato(new Molinillo(new CoffeeMill()));
    
    // Enciende los aparatos
    casa.encender();
    // Y los apaga
    casa.apagar();
  }
}
