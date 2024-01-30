package pizzas;

/**
 * Pizzas
 */
public class Pizza {

  // Atributos
  private String tipo;
  private String tamanyo;
  /**
   * @param tipo
   * @param tamanyo
   */
  public Pizza(String tipo, String tamanyo) {
    this.tipo = tipo;
    this.tamanyo = tamanyo;
  }
  /**
   * @return the tipo
   */
  public String getTipo() {
    return tipo;
  }
  /**
   * @return the tamanyo
   */
  public String getTamanyo() {
    return tamanyo;
  }
  
  
  
}
