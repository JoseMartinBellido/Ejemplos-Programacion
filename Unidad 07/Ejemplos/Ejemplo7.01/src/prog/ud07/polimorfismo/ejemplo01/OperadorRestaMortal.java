package prog.ud07.polimorfismo.ejemplo01;

public class OperadorRestaMortal extends OperadorEnteroResta {

  public OperadorRestaMortal(int operandoIzquierdo, int operandoDerecho) {
    super(operandoIzquierdo, operandoDerecho);
    // TODO Auto-generated constructor stub
  }

  @Override
  public int opera() {
    return 3 + super.opera();
  }

  
}
