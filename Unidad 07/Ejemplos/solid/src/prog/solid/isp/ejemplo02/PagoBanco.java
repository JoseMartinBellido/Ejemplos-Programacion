package prog.solid.isp.ejemplo02;

import java.util.List;

public class PagoBanco implements Pago {

  @Override
  public void iniciaPagos() {
    // ...
  }

  @Override
  public Object getEstado() {
    // ....
    return null;
  }

  @Override
  public List<Object> getPagos() {
    // ....
    return null;
  }

  @Override
  public void iniciaAcuerdoPrestamo() {
    throw new UnsupportedOperationException("Operacion no soportada");
  }

  @Override
  public void iniciaRePago() {
    throw new UnsupportedOperationException("Operacion no soportada");
  }
}
