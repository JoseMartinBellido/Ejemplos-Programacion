package prog.ud07.polimorfismo.ejemplo02;

/**
 * Clase que representa a un empleado
 */
public class Empleado {
  
  // Atributos
  // Nombre
  protected String nombre;
  // Salario base
  protected double salarioBase;
  
  /**
   * Constructor
   * @param nombre Nombre del empleado
   * @param salarioBase Salario base
   */
  public Empleado(String nombre, double salarioBase) {
    this.nombre = nombre;
    this.salarioBase = salarioBase;
  }
  
  /**
   * Devuelve el salario real del empleado
   * @return Salario real del empleado
   */
  public double calcularSalario() {
    // Devolvemos el salario menos un 10% para el seguro médico
    return salarioBase * 0.9;
  }
}
