package prog.solid.isp.ejemplo01;

import java.util.List;

public interface Pago {

  void iniciaPagos();
  Object getEstado();
  List<Object> getPagos();
}
