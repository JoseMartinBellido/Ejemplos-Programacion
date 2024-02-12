package prog.ud07.ejemplos.lambdas.ejemplo01;

public class ReductorMinimo implements Reductor {

  @Override
  public double reduce(double acumulador, double valor) {
    return valor < acumulador ? valor : acumulador;
  }

}
