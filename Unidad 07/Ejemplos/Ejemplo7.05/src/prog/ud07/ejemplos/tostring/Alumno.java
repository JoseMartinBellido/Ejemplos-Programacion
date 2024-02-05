package prog.ud07.ejemplos.tostring;

/**
 * Alumno del centro
 */
public class Alumno extends Persona {

  // Atributos
  // Numero de matricula
  protected String matricula;
  
  public Alumno(String nombre, int edad, String matricula) {
    super(nombre, edad);
    this.matricula = matricula;
  }

  @Override
  public String toString() {
    return String.format("%s, Matricula: %s", super.toString(), matricula);
  }
  
  
}
