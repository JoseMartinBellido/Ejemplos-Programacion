package prog.ud07.ejemplo02;

/**
 * Clase abstracta que contiene métodos abstractos
 */
public abstract class ClaseAbstractaConMetodosAbstractos {

  // Atributos
  protected String nombre;
  protected int edad;
  
  public ClaseAbstractaConMetodosAbstractos() {
    this.nombre = "";
    this.edad = 0;
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public int getEdad() {
    return edad;
  }
  
  public abstract String aCadena();
}
