package prog.unidad07.expresiones;

public abstract class OperacionUnaria implements Operacion {

  // Atributos
  // Operando
  protected Expresion operando;

  public OperacionUnaria(Expresion operando) {
    this.operando = operando;
  }
}
