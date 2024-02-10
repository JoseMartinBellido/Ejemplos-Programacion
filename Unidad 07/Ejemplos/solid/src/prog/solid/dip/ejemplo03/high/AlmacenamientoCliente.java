package prog.solid.dip.ejemplo03.high;

import java.util.List;

public interface AlmacenamientoCliente {
  Cliente buscaPorId(int id);
  List<Cliente> buscaTodos();
}
