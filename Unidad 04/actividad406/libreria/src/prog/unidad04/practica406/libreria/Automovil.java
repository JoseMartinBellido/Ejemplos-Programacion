package prog.unidad04.practica406.libreria;

/**
 * Clase que representa un automovil. Es un vehiculo de cuatro ruedas con un
 *   color y un número de plazas
 */
public class Automovil extends Vehiculo implements ConvertibleATexto {
  
  public static final String COLOR_BLANCO = "blanco";
  public static final String COLOR_AZUL = "azul";
  public static final String COLOR_NEGRO = "negro";

  /**
   * Color del coche
   */
  protected String color;
  
  /**
   * Plazas del coche
   */
  protected int plazas;

  /**
   * Constructor
   * @param matricula Matrícula del vehiculo. Debe tener un formato válido
   *   NNNN AAA donde NNNN son 4 dígitos y AAA son tres letras MAYÚSCULAS.
   *   Entre ellas puede haber cuantos espacios se quiera (incluido ninguno)
   * @param fechaMatriculacion Fecha de matriculación del vehiculo. No puede
   * ser null
   * @param color Color del vehículo. Sólo se permite uno de COLOR_BLANCO,
   *   COLOR_NEGRO, COLOR_AZUL
   * @param plazas Número de plazas del vehiculo. Debe ser mayor que 0 (por
   *   lo menos tiene que tener una para el conductor
   * @throws IllegalArgumentException Si alguno de los parámetros es incorrecto 
   */
  public Automovil(String matricula, Fecha fechaMatriculacion, String color, int plazas) {
    // Invocamos al constructor de Vehiculo
    super(matricula, fechaMatriculacion);
    
    // Comprobamos los atributos propios (color y plazas)
    if (esColorValido(color) && plazas > 0) {
      // Lo almaceno
      this.color = color;
      this.plazas = plazas;
    } else {
      // Quitamos un vehiculo porque este no se va a crear
      vehiculosMatriculados--;
      // Lanzamos excepción
      throw new IllegalArgumentException();
    }
  }

  @Override
  public String aTexto() {
    return "Matricula: " + matricula + ", Fecha Matriculacion: "
      + fechaMatriculacion.aTexto() + ", Color:"  + color + ", Num. Plazas: " + plazas;
  }

  /**
   * @return the color
   */
  public String getColor() {
    return color;
  }

  /**
   * @return the plazas
   */
  public int getPlazas() {
    return plazas;
  }

  /**
   * Comprueba que el color es valido
   * @param color Color a comprobar
   * @return true si es valido o false si no lo es
   */
  private boolean esColorValido(String color) {
    return (color != null && color.equals(COLOR_BLANCO)
      || color.equals(COLOR_AZUL)
      || color.equals(COLOR_NEGRO));
  }

}
