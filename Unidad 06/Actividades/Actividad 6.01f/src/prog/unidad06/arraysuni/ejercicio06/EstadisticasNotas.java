package prog.unidad06.arraysuni.ejercicio06;

/**
 * Clase que calcula estadisticas en notas
 */
public class EstadisticasNotas {

  // Atributos
  // Para la media
  // Suma de las calificaciones
  private double suma;
  // Cantidad de calificaciones
  private int calificaciones;
  // Para la moda
  private int[] frecuencias;

  /**
   * Constructor
   */
  public EstadisticasNotas() {
    // Inicializamos los atributos
    suma = 0;
    calificaciones = 0;
    // Se crea el array con 11 posiciones
    frecuencias = new int[11];
  }
  
  /**
   * Añade una nueva aparición de la calificación indicada
   * @param calificacion Debe valer entre 0 y 10, ambos incluidos
   * @throws IllegalArgumentException Si la calificacion no es válida
   */
  public void addCalificacion(int calificacion) {
    // Si la calificacion es correcta
    if (calificacion >= 0 && calificacion <= 10) {
      // Actualizamos la frecuencia de la calificacion
      frecuencias[calificacion]++;
      // Añadimos la calificacion a la suma total
      suma += calificacion;
      // Contamos una nueva calificación
      calificaciones++;
    } else {
      // Lanzamos la excepcion
      throw new IllegalArgumentException();
    }
  }
  
  public double calificacionMedia() {
    if (calificaciones > 0) {
      return suma / calificaciones;
    } else {
      return 0;
    }
  }
  
  public int calificacionModa() throws EstadisticasNotasException {
    if (calificaciones > 0) {
      int posicion = 0;
      int maximo = frecuencias[0];
      for (int i = 0; i < frecuencias.length; i++) {
        // Si la frecuencia es mayor que el maximo actual
        if (frecuencias[i] > maximo) {
          posicion = i;
          maximo = frecuencias[i];
        }
      }
      // Cuando llegamos aqui en maximo está la maxima frecuencia
      // y en posicion su posicion
      // la devolvemos
      return posicion;
    } else {
      throw new EstadisticasNotasException();
    }
  }
}
