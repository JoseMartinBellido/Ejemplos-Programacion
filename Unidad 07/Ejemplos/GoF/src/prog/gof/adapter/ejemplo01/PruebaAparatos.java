package prog.gof.adapter.ejemplo01;

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
    // Estos dos no se pueden añadir porque son incompatibles
    //casa.addAparato(new CoffeeMaker());
    //casa.addAparato(new CoffeeMill());
    
    // Enciende los aparatos
    casa.encender();
    // Y los apaga
    casa.apagar();
  }
}
