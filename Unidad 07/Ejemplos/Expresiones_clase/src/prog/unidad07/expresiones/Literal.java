package prog.unidad07.expresiones;

/**
 * Es una expresión que contiene un valor numérico constante
 */
public class Literal implements Expresion {
  
  // Atributos
  // Valor literal de este Literal
  private int valor;
  
  /**
   * Constructor
   * @param valor Valor del literal
   */
  public Literal(int valor) {
    this.valor = valor;
  }

  @Override
  public int evaluar() {
    return valor;
  }

}
