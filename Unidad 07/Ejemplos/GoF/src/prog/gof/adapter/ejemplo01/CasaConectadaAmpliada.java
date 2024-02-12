package prog.gof.adapter.ejemplo01;

import java.util.ArrayList;
import java.util.List;

/**
 * Casa conectada con aparatos
 */
public class CasaConectadaAmpliada {
  
  // Atributos
  // Aparatos europeos
  private List<Aparato> aparatos;
  // Aparatos americanos
  private List<Appliance> aparatosAmericanos;
  
  /**
   * Constructor
   */
  public CasaConectadaAmpliada() {
    this.aparatos = new ArrayList<>();
    this.aparatosAmericanos = new ArrayList<>();
  }
  
  /**
   * Añade un aparato europeo a la casa
   * @param aparato Aparato a añadir
   */
  public void addAparato(Aparato aparato) {
    aparatos.add(aparato);
  }
  
  /**
   * Añade un aparato americano a la casa
   * @param aparato Aparato a añadir
   */
  public void addAparato(Appliance aparato) {
    aparatosAmericanos.add(aparato);
  }
  
  /**
   * Enciende todos los aparatos de la clase
   */
  public void encender() {
    // PAra cada aparato europeo
    for (Aparato aparato: aparatos) {
      // Lo enciende
      aparato.encender();
    }
    // Y ahora los americanos
    for (Appliance aparato: aparatosAmericanos) {
      // Lo enciende
      aparato.on();
    }
  }
  
  /**
   * Apaga todos los aparatos
   */
  public void apagar() {
    // Para cada aparato europeo
    for (Aparato aparato: aparatos) {
      aparato.apagar();
    }
    // Y americano
    for (Appliance aparato: aparatosAmericanos) {
      aparato.off();
    }
  }

}
