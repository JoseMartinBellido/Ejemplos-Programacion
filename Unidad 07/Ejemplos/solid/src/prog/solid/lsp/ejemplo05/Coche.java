package prog.solid.lsp.ejemplo05;

public class Coche {

  protected double limite;
  protected double velocidad;
  
  public Coche(double limite) {
    if (limite <= 0) {
      throw new IllegalArgumentException("La velocidad no puede superar al limite");
    } else {
      this.velocidad = 0;
      this.limite = limite;
    }
  }
  
  public double acelerar(double paso) {
    if (velocidad + paso <= limite) {
      velocidad += paso;
    }
    return velocidad;
  }

}
