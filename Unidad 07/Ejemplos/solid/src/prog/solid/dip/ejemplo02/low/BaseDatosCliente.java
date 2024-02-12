package prog.solid.dip.ejemplo02.low;

import java.util.List;
import prog.solid.dip.ejemplo02.high.Cliente;

public class BaseDatosCliente implements AlmacenamientoCliente {

  // ... Usa JDBC para obtener la informacion

  public Cliente buscaPorId(int id) {
    return null;
  }

  public List<Cliente> buscaTodos() {
    return null;
  }
}
