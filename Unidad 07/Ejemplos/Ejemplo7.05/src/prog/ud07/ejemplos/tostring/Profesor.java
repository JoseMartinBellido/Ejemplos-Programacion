package prog.ud07.ejemplos.tostring;

/**
 * Profesor del centro
 */
public class Profesor extends Persona {

  // Atributos
  // Especialidad
  protected String especialidad;
  
  public Profesor(String nombre, int edad, String especialidad) {
    super(nombre, edad);
    this.especialidad = especialidad;
  }

  @Override
  public String toString() {
    return String.format("%s, Especialidad: %s", super.toString(), especialidad);
  }
}
