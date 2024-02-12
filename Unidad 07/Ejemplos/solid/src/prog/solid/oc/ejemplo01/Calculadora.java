package prog.solid.oc.ejemplo01;

public class Calculadora {
  
  public double calcular(Operacion operacion) {
    
    // Si la operacion es nula
    if (operacion == null) {
      throw new IllegalArgumentException("Operacion nula");
    }
    
    // Si la operacion es Suma
    if (operacion instanceof Suma) {
      Suma suma = (Suma)operacion;
      suma.setResultado(suma.getIzqda() + suma.getDcha());
      return suma.getResultado();
    } else if (operacion instanceof Resta) {
      Resta resta = (Resta)operacion;
      resta.setResultado(resta.getIzqda() - resta.getDcha());
      return resta.getResultado();
    } else {
      throw new IllegalArgumentException("Operacion no soportada");
    }
  }

}
