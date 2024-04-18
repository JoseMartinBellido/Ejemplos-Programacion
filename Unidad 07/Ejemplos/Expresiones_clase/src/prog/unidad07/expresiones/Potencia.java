package prog.unidad07.expresiones;

public class Potencia extends OperacionBinaria {

  public Potencia(Expresion operandoIzquierdo, Expresion operandoDerecho) {
    super(operandoIzquierdo, operandoDerecho);
  }

  @Override
  public int evaluar() {
    int base = operandoIzquierdo.evaluar();
    int resultado = base;
    for (int i = 1; i < operandoDerecho.evaluar(); i++) {
     resultado = resultado * base;  
    }
    return resultado;
  }

}
