package prog.unidad07.expresiones;

public class CambioSigno extends OperacionUnaria {

  public CambioSigno(Expresion operando) {
    super(operando);
  }

  @Override
  public int evaluar() {
    return -operando.evaluar();
  }

}
