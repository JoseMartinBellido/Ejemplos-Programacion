package prog.unidad07.expresiones;

public class Division extends OperacionBinaria {

  public Division(Expresion operandoIzquierdo, Expresion operandoDerecho) {
    super(operandoIzquierdo, operandoDerecho);
  }

  @Override
  public int evaluar() {
    try {
      return operandoIzquierdo.evaluar() / operandoDerecho.evaluar();
    } catch (ArithmeticException e) {
      throw new ExpresionException("No se puede dividir por cero");
    }
  }

}
