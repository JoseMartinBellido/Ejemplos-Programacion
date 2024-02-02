package prog.ud07.ejemplo02;

/**
 * Clase que hereda de clase abstracta con métodos abstractos
 */
public class ClaseHeredaDeClaseAbstractaConMetodosAbtractos
    extends ClaseAbstractaConMetodosAbstractos {

  public ClaseHeredaDeClaseAbstractaConMetodosAbtractos(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  
  /**
   * Este método hay que implementarlo obligatoriamente. Si no, no compila la clase
   */
  @Override
  public String aCadena() {
    return String.format("Nombre: %s, Edad: %d", nombre, edad);
  }

}
