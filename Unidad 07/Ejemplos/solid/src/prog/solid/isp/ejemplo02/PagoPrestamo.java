package prog.solid.isp.ejemplo02;

import java.util.List;

public class PagoPrestamo implements Pago {

  @Override
  public void iniciaPagos() {
    throw new UnsupportedOperationException("Operacion no soportada");
  }

  @Override
  public Object getEstado() {
    // ...
    return null;
  }

  @Override
  public List<Object> getPagos() {
    // ...
    return null;
  }

  @Override
  public void iniciaAcuerdoPrestamo() {
    // ...
  }

  @Override
  public void iniciaRePago() {
    // ...
  }
}
