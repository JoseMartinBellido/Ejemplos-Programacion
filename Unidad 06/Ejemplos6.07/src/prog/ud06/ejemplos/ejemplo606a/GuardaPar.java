package prog.ud06.ejemplos.ejemplo606a;

/**
 * Clase que guarda dos objetos cualesquiera
 */
public class GuardaPar {

  // Primer objeto
  private Object objeto1;
  // Segundo objeto
  private Object objeto2;

  // Constructor
  public GuardaPar(Object objeto1, Object objeto2) {
    // Almacenamos los dos objetos
    this.objeto1 = objeto1;
    this.objeto2 = objeto2;
  }

  // Obtiene el primer objeto
  public Object getPrimerObjeto() {
    return objeto1;
  }

  // Modifica el segundo objeto
  public void setPrimerObjeto(Object objeto) {
    this.objeto1 = objeto;
  }

  // Obtiene el segundo objeto
  public Object getSegundoObjeto() {
    return objeto2;
  }

  // Modifica el segundo objeto
  public void setSegundoObjeto(Object objeto) {
    this.objeto2 = objeto;
  }

}
