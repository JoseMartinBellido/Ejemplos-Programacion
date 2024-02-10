package prog.solid.lsp.ejemplo06;

public class Coche {

  // kilometraje se inicia a cero y sólo se puede incrementar
  protected int kilometraje;
  
  public Coche() {
    this.kilometraje = 0;
  }
  
  public void recorre(int kilometros) {
    this.kilometraje += kilometros;
  }

  public int getKilometraje() {
    return kilometraje;
  }
}
