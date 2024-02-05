package prog.ud07.polimorfismo.ejemplo02;

/**
 * Comercial. Es un empleado que además tiene una comisión por ventas
 */
public class Comercial extends Empleado {

  // Atributos
  // Ventas realizada
  protected double ventas;
  
  /**
   * Constructor
   * @param nombre Nombre del empleado
   * @param salarioBase Salario base
   * @param ventas Ventas del mes
   */
  public Comercial(String nombre, double salarioBase, double ventas) {
    super(nombre, salarioBase);
    this.ventas = ventas;
  }

  @Override
  public double calcularSalario() {
    // El salario es el base más el 5% de las ventas
    return super.calcularSalario() + ventas * 0.05;
  }
  
  
}
