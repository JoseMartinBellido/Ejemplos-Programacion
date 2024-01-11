package prog.ud06.ejemplos.ejemplo606a;

/**
 * Clase que guarda dos objetos cualesquiera
 */
public class GuardaParIntegerDouble {

  // Primer objeto
  private Integer objeto1;
  // Segundo objeto
  private Double objeto2;

  // Constructor
  public GuardaParIntegerDouble(Integer objeto1, Double objeto2) {
    // Almacenamos los dos objetos
    this.objeto1 = objeto1;
    this.objeto2 = objeto2;
  }

  // Obtiene el primer objeto
  public Integer getPrimerObjeto() {
    return objeto1;
  }

  // Modifica el segundo objeto
  public void setPrimerObjeto(Integer objeto) {
    this.objeto1 = objeto;
  }

  // Obtiene el segundo objeto
  public Double getSegundoObjeto() {
    return objeto2;
  }

  // Modifica el segundo objeto
  public void setSegundoObjeto(Double objeto) {
    this.objeto2 = objeto;
  }

}
