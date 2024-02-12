package prog.gof.strategy.ejemplo03;

/**
 * Cliente
 */
public class Cliente {

  // Atributos
  private String nombre;
  private String dni;
  private int edad;
  
  public Cliente(String nombre, String dni, int edad) {
    this.nombre = nombre;
    this.dni = dni;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDni() {
    return dni;
  }

  public int getEdad() {
    return edad;
  }
  
  
}
