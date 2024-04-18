package prog.unidad07.expresiones;

public abstract class OperacionBinaria implements Operacion {

  // Atributos
  // Operando Izquierdo
  protected Expresion operandoIzquierdo;
  // Operando Derecho
  protected Expresion operandoDerecho;

  public OperacionBinaria(Expresion operandoIzquierdo, Expresion operandoDerecho) {
    this.operandoIzquierdo = operandoIzquierdo;
    this.operandoDerecho = operandoDerecho;
  }
}
