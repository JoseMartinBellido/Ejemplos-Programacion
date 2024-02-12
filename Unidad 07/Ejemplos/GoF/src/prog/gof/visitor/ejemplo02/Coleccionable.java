package prog.gof.visitor.ejemplo02;

/**
 * Clase antepasada de todos los coleccionables
 */
public abstract class Coleccionable {

  // Atributos
  private double precio;
  
  public Coleccionable(double precio) {
    this.precio = precio;
  }
  
  public double getPrecio() {
    return precio;
  }
  
  public abstract void acepta(VisitadorColeccion visitador);
  
}
