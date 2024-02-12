package prog.solid.dip.ejemplo01.high;

import java.util.List;
import prog.solid.dip.ejemplo01.low.BaseDatosCliente;

public class ServicioCliente {
  
  private final BaseDatosCliente bdc;
  
  public ServicioCliente(BaseDatosCliente bdc) {
    this.bdc = bdc;
  }
  
  public Cliente buscaPorId(int id) {
    return bdc.buscaPorId(id);
  }

  public List<Cliente> buscaTodos() {
    return bdc.buscaTodos();
  }
}
