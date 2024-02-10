package prog.solid.dip.ejemplo02.high;

import java.util.List;
import prog.solid.dip.ejemplo02.low.AlmacenamientoCliente;

public class ServicioCliente {
  
  private final AlmacenamientoCliente ac;
  
  public ServicioCliente(AlmacenamientoCliente ac) {
    this.ac = ac;
  }
  
  public Cliente buscaPorId(int id) {
    return ac.buscaPorId(id);
  }

  public List<Cliente> buscaTodos() {
    return ac.buscaTodos();
  }
}
