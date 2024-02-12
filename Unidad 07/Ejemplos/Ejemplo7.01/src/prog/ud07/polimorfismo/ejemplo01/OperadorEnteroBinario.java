package prog.ud07.polimorfismo.ejemplo01;

/**
 * Esta clase representa un operador entero binario cualquiera<br>
 * Un operador entero binario toma dos parámetros enteros (de ahi lo de binario) y devuelve un
 * resultado también entero
 */
public class OperadorEnteroBinario {

  // Atributos
  // Operandos
  protected int operandoIzquierdo;
  protected int operandoDerecho;
  
  /**
   * Constructor Toma los dos operandos
   * @param operandoIzquierdo Operando izquierdo
   * @param operandoDerecho Operando derecho
   */
  public OperadorEnteroBinario(int operandoIzquierdo, int operandoDerecho) {
    this.operandoIzquierdo = operandoIzquierdo;
    this.operandoDerecho = operandoDerecho;
  }
  
  /**
   * Realiza la operacion
   * @return Resultado de la operación
   */
  public int opera() {
    // No se implementa y lanzamos una excepcion
    throw new UnsupportedOperationException();
  }
}
