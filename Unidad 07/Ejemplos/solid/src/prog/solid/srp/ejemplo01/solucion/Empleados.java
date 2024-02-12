package prog.solid.srp.ejemplo01.solucion;

import java.util.HashMap;
import java.util.Map;

public class Empleados {
  
  private Map<Long, Empleado> empleados;
  
  public Empleados() {
    this.empleados =  new HashMap<>();
  }
  
  public Empleado getEmpleadoPorId(long id) {
    return empleados.get(id);
  }
  
  public void addEmpleado(Empleado empleado) {
    empleados.put(empleado.getId(), empleado);
  }

}
