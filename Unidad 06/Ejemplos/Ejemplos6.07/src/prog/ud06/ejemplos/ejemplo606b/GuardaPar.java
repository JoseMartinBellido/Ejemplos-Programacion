package prog.ud06.ejemplos.ejemplo606b;

public class GuardaPar<T1, T2> {

  // El primer atributo es del primer tipo
  T1 objeto1;
  // El segundo atributo es del segundo tipo
  T2 objeto2;
  
  // Constructor
  public GuardaPar(T1 objeto1, T2 objeto2) {
    this.objeto1 = objeto1;
    this.objeto2 = objeto2;
  }

  public T1 getPrimerObjeto() {
    return objeto1;
  }

  public void setPrimerObjeto(T1 objeto) {
    this.objeto1 = objeto;
  }

  public T2 getSegundoObjeto() {
    return objeto2;
  }

  public void setSegundoObjeto(T2 objeto) {
    this.objeto2 = objeto;
  }
}
