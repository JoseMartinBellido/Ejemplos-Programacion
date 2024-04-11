package prog.ud07.polimorfismo.ejemplo01;

public class OperadorEnteroResta extends OperadorEnteroBinario {

  public OperadorEnteroResta(int operandoIzquierdo, int operandoDerecho) {
    super(operandoIzquierdo, operandoDerecho);
  }

  public int opera() {
    return operandoIzquierdo - operandoDerecho;
  }
  
  public int opera(int param1, int param2) {
    return param1 - param2;
  }

}
