package prog.ud07.ejemplo01;

/**
 * Clase abstracta. No se pueden crear instancias de esta clase pero si se puede heredar
 */
public abstract class ClaseAbstractaSimple {

  // Atributos
  protected String nombre;
  protected int edad;
  
  public ClaseAbstractaSimple() {
    this.nombre = "";
    this.edad = 0;
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public int getEdad() {
    return edad;
  }
  
}
