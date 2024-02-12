package prog.solid.dip.ejemplo03.high;

import java.util.List;

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
