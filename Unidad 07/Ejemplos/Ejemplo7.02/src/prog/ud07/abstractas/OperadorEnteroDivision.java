package prog.ud07.abstractas;

public class OperadorEnteroDivision extends OperadorEnteroBinario {

  public OperadorEnteroDivision(int operandoIzquierdo, int operandoDerecho) {
    super(operandoIzquierdo, operandoDerecho);
  }

  @Override
  public int opera() {
    return operandoIzquierdo / operandoDerecho;
  }

}
