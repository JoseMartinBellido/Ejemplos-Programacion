package prog.solid.lsp.ejemplo05;

public class CocheTurbo extends Coche {
  
  protected double turbo;

  public CocheTurbo(double limite, double turbo) {
    super(limite);
    this.turbo = turbo;
  }

  @Override
  public double acelerar(double paso) {
    if (velocidad + paso <= turbo) {
      velocidad += paso;
    }
    return velocidad;
  }
}
