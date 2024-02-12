package prog.ud07.ejemplos.tostring;

/**
 * Persona relacionada con el centro educativo
 */
public abstract class Persona {

  // Atributos
  // Nombre 
  protected String nombre;
  // Edad
  protected int edad;
  
  /**
   * Constructor
   * @param nombre Nombre de la persona
   * @param edad Edad de la persona
   */
  protected Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  
  @Override
  public String toString() {
    return String.format("Nombre: %s, Edad: %d", nombre, edad);
  }
}
