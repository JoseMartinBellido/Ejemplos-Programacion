package prog.solid.dip.ejemplo02.low;

import java.util.List;
import prog.solid.dip.ejemplo02.high.Cliente;

public interface AlmacenamientoCliente {
  Cliente buscaPorId(int id);
  List<Cliente> buscaTodos();
}
