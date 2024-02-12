package prog.ud07.polimorfismo.ejemplo01;

/**
 * Operando Binario entero que realiza el producto de los operandos
 */
public class OperadorEnteroProducto extends OperadorEnteroBinario {

  /**
   * Constructor con operandos
   * @param operandoIzquierdo Operando izquierdo
   * @param operandoDerecho Operando derecho
   */
  public OperadorEnteroProducto(int operandoIzquierdo, int operandoDerecho) {
    // Simplemente reusamos el del padre
    super(operandoIzquierdo, operandoDerecho);
  }

  @Override
  public int opera() {
    return operandoIzquierdo * operandoDerecho;
  }
}
