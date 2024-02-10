package prog.solid.oc.ejemplo01.solucion;

public class Calculadora {
  
  public double calcular(Operacion operacion) {
    
    // Si la operacion es nula
    if (operacion == null) {
      throw new IllegalArgumentException("Operacion nula");
    }
    
    return operacion.realiza();
  }
}
