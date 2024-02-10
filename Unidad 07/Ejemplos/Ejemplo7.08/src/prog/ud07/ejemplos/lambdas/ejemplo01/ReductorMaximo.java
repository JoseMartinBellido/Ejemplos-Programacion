package prog.ud07.ejemplos.lambdas.ejemplo01;

/**
 * Reductor que implementa la operación cálculo de valor máximo
 */
public class ReductorMaximo implements Reductor {

  @Override
  public double reduce(double acumulador, double valor) {
    // Si el valor es superior al acumulador devuelve el valor, si no devuelve el acumulador
    return valor > acumulador ? valor : acumulador;
  }

}
