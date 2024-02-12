package prog.gof.adapter.ejemplo01;

import java.util.ArrayList;
import java.util.List;

/**
 * Casa conectada con aparatos
 */
public class CasaConectada {
  
  // Atributos
  // Aparatos 
  private List<Aparato> aparatos;
  
  /**
   * Constructor
   */
  public CasaConectada() {
    this.aparatos = new ArrayList<>();
  }
  
  /**
   * Añade un aparato a la case
   * @param aparato Aparato a añadir
   */
  public void addAparato(Aparato aparato) {
    aparatos.add(aparato);
  }
  
  /**
   * Enciende todos los aparatos de la clase
   */
  public void encender() {
    // PAra cada aparato
    for (Aparato aparato: aparatos) {
      // Lo enciende
      aparato.encender();
    }
  }
  
  /**
   * Apaga todos los aparatos
   */
  public void apagar() {
    // Para cada aparato
    for (Aparato aparato: aparatos) {
      aparato.apagar();
    }
  }

}
