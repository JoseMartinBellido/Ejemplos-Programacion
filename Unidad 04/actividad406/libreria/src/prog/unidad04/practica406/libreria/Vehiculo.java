package prog.unidad04.practica406.libreria;

/**
 * Clase que representa a un vehículo
 */
public class Vehiculo {
  
  /**
   * Fecha de matriculación del vehiculo
   */
  protected Fecha fechaMatriculacion;
  /**
   * Matricula del vehiculo
   */
  protected String matricula;
  /**
   * Número de vehiculos matriculados hasta el momento
   */
  protected static int vehiculosMatriculados;
  
  /**
   * Constructor protegido para que no pueda usarse para crear objetos desde
   * clases que no hereden de esta
   * @param matricula Matrícula del vehiculo. Debe tener un formato válido
   *   NNNN AAA donde NNNN son 4 dígitos y AAA son tres letras MAYÚSCULAS.
   *   Entre ellas puede haber cuantos espacios se quiera (incluido ninguno)
   * @param fechaMatriculacion Fecha de matriculación del vehiculo. No puede
   *   ser null
   *   @throws IllegalArgumentException Si alguno de los parametros no es válido
   */
  protected Vehiculo(String matricula, Fecha fechaMatriculacion) {
    // Si los atributos son válidos
    if (esMatriculaValida(matricula) && fechaMatriculacion != null) {
      // Los almaceno
      this.matricula = matricula;
      this.fechaMatriculacion = fechaMatriculacion;
      // Aumenta el número de vehículos
      vehiculosMatriculados++;
    } else {
      // Algún parámetro no es correcto. Lanzamos excepción
      throw new IllegalArgumentException();
    }
  }

  /**
   * Obtiene la fecha de matriculación del vehículo
   * @return Fecha de matriculación del vehiculo
   */
  public Fecha getFechaMatriculacion() {
    return fechaMatriculacion;
  }

  /**
   * Obtiene la matrícula del vehiculo
   * @return Matrícula del vehículo
   */
  public String getMatricula() {
    return matricula;
  }

  /**
   * Obtiene el número de vehículos matriculados hasta el momento
   * @return Número de vehículos matriculados hasta el momento
   */
  public static int getVehiculosMatriculados() {
    return vehiculosMatriculados;
  }

  /**
   * Comprueba que la matricula es válida. El formato válido es
   *   NNNN AAA donde NNNN son 4 dígitos y AAA son tres letras MAYÚSCULAS.
   *   Entre ellas puede haber cuantos espacios se quiera (incluido ninguno)
   * @param matricula Matricula a comprobar
   * @return true si la matricula es válida o false si no lo es
   */
  private boolean esMatriculaValida(String matricula) {
    // No puede ser nula
    if (matricula != null) {
      // Si tiene menos de 7 caracteres (4 números y 3 letras) no puede ser correcto
      if (matricula.length() >= 7) {
        if (esDigito(matricula.charAt(0)) && esDigito(matricula.charAt(1))
          && esDigito(matricula.charAt(2)) && esDigito(matricula.charAt(3))) {
          // Saltamos los espacios
          int posicion = 4;
          while (posicion < matricula.length() && (matricula.charAt(posicion) == ' ')) {
            posicion++;
          }
          // Si estamos al final y nos quedan 3 caracteres exactamente
          if (posicion == matricula.length() - 3) {
            return (esLetraMayuscula(matricula.charAt(posicion))
              && esLetraMayuscula(matricula.charAt(posicion + 1))
              && esLetraMayuscula(matricula.charAt(posicion + 2)));
          } else {
            // Hemos llegado al final de la cadena sin encontrar las letras
            return false;
          }
        } else {
          // Alguno de los primeros caracteres no es un digito
          return false;
        }
      } else {
        // No puede ser correcta porque la longitud no es válida
        return false;
      }
    } else {
      // Si no devolvemos false 
      return false;
    }
  }

  private boolean esDigito(char caracter) {
    return caracter >= '0' && caracter <= '9';
  }

  private boolean esLetraMayuscula(char caracter) {
    return caracter >= 'A' && caracter <= 'Z' || caracter == 'Ñ';
  }
}
