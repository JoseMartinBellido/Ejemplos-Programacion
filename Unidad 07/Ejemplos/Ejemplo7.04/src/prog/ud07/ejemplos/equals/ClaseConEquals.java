package prog.ud07.ejemplos.equals;

/**
 * Clase que implementa equals
 */
public class ClaseConEquals {

  // Atributos
  // Nombre
  private String nombre;
  // Edad
  private int edad;
  // Salario
  private double salario;
  
  public ClaseConEquals(String nombre, int edad, double salario) {
    this.nombre = nombre;
    this.edad = edad;
    this.salario = salario;
  }

  @Override
  public boolean equals(Object obj) {
    // Si es de nuestro tipo
    if (obj instanceof ClaseConEquals) {
      // Hacemos cast
      ClaseConEquals ref = (ClaseConEquals)obj;
      // Si el nombre, edad y salario son iguales, devuelve true. false en cualquier otro caso
      return ref.nombre.equals(nombre) && ref.edad == edad && ref.salario == salario;
    } else {
      // Directamente no es igual
      return false;
    }
    
  }
  
}
