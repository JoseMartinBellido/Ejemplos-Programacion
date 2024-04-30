package prog.bbdd;

public class Empleado {
  
  // Atributos
  private int id;
  private String nombre;
  private double salario;
  private Integer idJefe;

  /**
   * @param id
   * @param nombre
   * @param salario
   * @param idJefe
   */
  public Empleado(int id, String nombre, double salario, Integer idJefe) {
    this.id = id;
    this.nombre = nombre;
    this.salario = salario;
    this.idJefe = idJefe;
  }

  /**
   * @return the id
   */
  int getId() {
    return id;
  }

  /**
   * @return the nombre
   */
  String getNombre() {
    return nombre;
  }

  /**
   * @return the salario
   */
  double getSalario() {
    return salario;
  }

  /**
   * @return the idJefe
   */
  Integer getIdJefe() {
    return idJefe;
  }
  
  Empleado clonar() {
    return new Empleado (id, nombre, salario, idJefe);
  }
}
