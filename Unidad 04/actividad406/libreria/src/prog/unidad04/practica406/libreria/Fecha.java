package prog.unidad04.practica406.libreria;

public class Fecha implements ConvertibleATexto{

  // Constantes
  // Año base
  private static final int ANYO_BASE = 1900;
  
  // Atributos
  // Dia
  private int dia;
  // Mes
  private int mes;
  // Año
  private int anyo;

  public Fecha(int dia, int mes, int anyo) {
    // Si la fecha es correcta
    if (esFechaCorrecta(dia, mes, anyo)) {
      this.dia = dia;
      this.mes = mes;
      this.anyo = anyo;
    } else {
      throw new IllegalArgumentException();
    }
  }

  /**
   * @return the dia
   */
  public int getDia() {
    return dia;
  }

  /**
   * @return the mes
   */
  public int getMes() {
    return mes;
  }

  /**
   * @return the anyo
   */
  public int getAnyo() {
    return anyo;
  }
  
  public boolean esBisiesto() {
    return esBisiesto(anyo);
  }
  
  public long diasTranscurridos() {
    long dias = 0;
    // Por cada año
    for (int i = 1900; i < anyo; i++) {
      dias += esBisiesto(i) ? 366 : 365;
    }
    // Por cada mes
    for (int i = 1; i < mes; i++) {
      dias += numeroDiasMes(i, anyo);
    }
    dias += dia - 1;
    return dias;
  }
  
  public long diasEntre(Fecha fecha) {
    long dias = diasTranscurridos();
    long diasOtraFecha = fecha.diasTranscurridos();
    long diferencia = diasOtraFecha - dias;
    if (diferencia >= 0) {
      return diferencia;
    } else {
      throw new FechaException();
    }
  }
  
  public int compara(Fecha fecha) {
    long dias = diasTranscurridos();
    long diasOtraFecha = fecha.diasTranscurridos();
    long diferencia = dias - diasOtraFecha;
    return (int)diferencia;
  }

  @Override
  public String aTexto() {
    return dia + " de " + getNombreMes(mes) + " de " + anyo;
  }

  private boolean esFechaCorrecta(int dia, int mes, int anyo) {
    // Si el año es correcto
    if (anyo >= ANYO_BASE) {
      // Si el mes es correcto
      if (mes >= 1 && mes <= 12) {
        // Si el dia es correcto
        return (dia >= 1 && dia <= numeroDiasMes(mes, anyo));
      }
    }
    return false;
  }

  private int numeroDiasMes(int mes, int anyo) {
    // Si es un mes de 30 dias
    if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
      return 30;
    } else if (mes == 2) {
      return (esBisiesto(anyo) ? 29 : 28);
    } else {
      // Es de 31 dias
      return 31;
    }
  }

  private boolean esBisiesto(int anyo) {
    return (anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0;
  }

  private String getNombreMes(int mes) {
    switch (mes) {
      case 1:
        return "enero";
      case 2:
        return "febrero";
      case 3:
        return "marzo";
      case 4:
        return "abril";
      case 5:
        return "mayo";
      case 6:
        return "junio";
      case 7:
        return "julio";
      case 8:
        return "agosto";
      case 9:
        return "septiembre";
      case 10:
        return "octubre";
      case 11:
        return "noviembre";
      case 12:
        return "diciembre";
      default:
        throw new IllegalArgumentException();
    }
  }

}
