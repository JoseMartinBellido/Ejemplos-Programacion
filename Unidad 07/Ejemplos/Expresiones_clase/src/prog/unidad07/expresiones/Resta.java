package prog.unidad07.expresiones;

public class Resta extends OperacionBinaria {

  public Resta(Expresion operandoIzquierdo, Expresion operandoDerecho) {
    super(operandoIzquierdo, operandoDerecho);
  }

  @Override
  public int evaluar() {
    return operandoIzquierdo.evaluar() - operandoDerecho.evaluar();
  }

}
