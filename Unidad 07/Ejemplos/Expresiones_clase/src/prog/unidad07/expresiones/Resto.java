package prog.unidad07.expresiones;

public class Resto extends OperacionBinaria {

  public Resto(Expresion operandoIzquierdo, Expresion operandoDerecho) {
    super(operandoIzquierdo, operandoDerecho);
  }

  @Override
  public int evaluar() {
    return operandoIzquierdo.evaluar() % operandoDerecho.evaluar();
  }

}
