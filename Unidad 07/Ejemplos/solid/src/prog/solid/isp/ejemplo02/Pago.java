package prog.solid.isp.ejemplo02;

import java.util.List;

public interface Pago {

  void iniciaPagos();
  Object getEstado();
  List<Object> getPagos();
  // Metodos nuevos
  void iniciaAcuerdoPrestamo();
  void iniciaRePago();
  
}
