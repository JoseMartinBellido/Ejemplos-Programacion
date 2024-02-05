package prog.ud07.polimorfismo.ejemplo01;

/**
 * Operador entero que no redefine el método opera()
 */
public class OperadorEnteroNulo extends OperadorEnteroBinario {

  /**
   * Constructor con operandos
   * @param operandoIzquierdo Operando izquierdo
   * @param operandoDerecho Operando derecho
   */
  public OperadorEnteroNulo(int operandoIzquierdo, int operandoDerecho) {
    // Usamos el constructor del padre
    super(operandoIzquierdo, operandoDerecho);
  }

}
