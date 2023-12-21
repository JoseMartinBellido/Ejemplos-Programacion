package prog.unidad04.practica406.libreria;
/**
 * Esta clase representa una motocicleta
 */
public class Motocicleta extends Vehiculo implements ConvertibleATexto {
  
  /**
   * Cilindrada de la motocicleta
   */
  protected int cilindrada;
  
  /**
   * 
   * @param matricula Igual que super
   * @param fechaMatriculacion Igual que super
   * @param cilindrada Cilindrada de la motocicleta (debe ser superior o igual a 50)
   */
  public Motocicleta(String matricula, Fecha fechaMatriculacion,
    int cilindrada) {
    super(matricula, fechaMatriculacion);
    if (cilindrada >= 50) {
      this.cilindrada = cilindrada;
    } else {
      // Quitamos el vehiculo de los matriculados
      vehiculosMatriculados--;
      throw new IllegalArgumentException();
    }
  }
  
  /**
   * @return the cilindrada
   */
  public int getCilindrada() {
    return cilindrada;
  }

  @Override
  public String aTexto() {
    return "Matricula: " + matricula + ", Fecha Matriculacion: " + fechaMatriculacion.aTexto() + ", Cilindrada: " + cilindrada;
  }

}
