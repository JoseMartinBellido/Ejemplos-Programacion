package prog.solid.oc.ejemplo01.solucion;

public class Producto implements Operacion {

  private double izqda;
  private double dcha;
  private double resultado;
  
  public Producto(double izqda, double dcha) {
    this.izqda = izqda;
    this.dcha = dcha;
  }

  public double getIzqda() {
    return izqda;
  }

  public void setIzqda(double izqda) {
    this.izqda = izqda;
  }

  public double getDcha() {
    return dcha;
  }

  public void setDcha(double dcha) {
    this.dcha = dcha;
  }

  public double getResultado() {
    return resultado;
  }

  public void setResultado(double resultado) {
    this.resultado = resultado;
  }

  @Override
  public double realiza() {
    resultado = izqda * dcha;
    return resultado;
  }

}
