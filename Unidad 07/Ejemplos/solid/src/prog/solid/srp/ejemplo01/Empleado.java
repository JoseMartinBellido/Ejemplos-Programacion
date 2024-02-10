package prog.solid.srp.ejemplo01;

public class Empleado {

  private long id;
  private String nombre;
  private String email;
  private double salario;
  
  public Empleado(long id, String nombre, String email, double salario) {
    this.id = id;
    setNombre(nombre);
    setEmail(email);
    setSalario(salario);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
  
  public long getId() {
    return id;
  }
  
}
