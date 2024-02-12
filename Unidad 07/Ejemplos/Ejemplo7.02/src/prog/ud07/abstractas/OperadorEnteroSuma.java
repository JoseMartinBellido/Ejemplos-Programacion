package prog.ud07.abstractas;

/**
 * Operador entero binario que implementa la suma<br>
 * El resultado es la suma de los operandos
 */
public class OperadorEnteroSuma extends OperadorEnteroBinario {

  /**
   * Constuctor con operandos
   * @param operandoIzquierdo Operando izquierdo
   * @param operandoDerecho Operando derecho
   */
  public OperadorEnteroSuma(int operandoIzquierdo, int operandoDerecho) {
    // Usamos el de la clase padre ya que no añadimos atributos
    super(operandoIzquierdo, operandoDerecho);
  }
  
  @Override
  public int opera() {
    return operandoIzquierdo + operandoDerecho;
  }

}
