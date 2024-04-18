package prog.unidad07.expresiones;

public class Variable implements Expresion {
  
  // Atributos
  // Nombre de la variable
  private String nombre;
  // Valor de la variable
  private int valor;
  
  /**
   * Constructor
   * @param nombre Nombre de la variable
   * @param valor Valor inicial de la variable
   */
  public Variable(String nombre, int valor) {
    this.nombre = nombre;
    this.valor = valor;
  }
  
  /**
   * Modifica el valor de la variable
   * @param valor Nuevo valor de la variable
   */
  public void setValor(int valor) {
    this.valor = valor;
  }

  @Override
  public int evaluar() {
    return valor;
  }

}
