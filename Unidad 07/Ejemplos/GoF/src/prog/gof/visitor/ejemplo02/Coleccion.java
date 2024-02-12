package prog.gof.visitor.ejemplo02;

import java.util.HashSet;
import java.util.Set;

/**
 * Coleccion
 */
public class Coleccion {

  // Atibutos
  // Coleccion
  Set<Coleccionable> coleccion;
  
  public Coleccion() {
    coleccion = new HashSet<>();
  }
  
  public void addColeccionable(Coleccionable coleccionable) {
    coleccion.add(coleccionable);
  }
  
  public void acepta(VisitadorColeccion visitador) {
    for (Coleccionable objeto: coleccion) {
      objeto.acepta(visitador);
    }
  }
  
  public double precioTotal() {
    double total = 0;
    
    for (Coleccionable objeto: coleccion) {
      total += objeto.getPrecio();
    }
    return total;
  }
}
