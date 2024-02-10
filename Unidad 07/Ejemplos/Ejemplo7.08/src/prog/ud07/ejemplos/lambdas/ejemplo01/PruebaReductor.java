package prog.ud07.ejemplos.lambdas.ejemplo01;

public class PruebaReductor {
  
  public static void main(String[] args) {
    // Array con la secuencia
    double[] valores = {6.4, 39.0, 85.3, 28.9, 60.4, 85.6, 84.0, 44.6, 88.2, 75.5};
    
    // Prueba la clase ReductorMaximo y ReductorMinimo
    double maximo = calculaReductor(valores, new ReductorMaximo());
    double minimo = calculaReductor(valores, new ReductorMinimo());
    
    // Muestra el maximo y minimo
    System.out.printf("El máximo es %f y el minimo %f%n", maximo, minimo);

    // Ahora empleamos clases anonimas
    maximo = calculaReductor(valores, new Reductor() {
      @Override
      public double reduce(double acumulador, double valor) {
        return valor > acumulador ? valor : acumulador;
      }
    });

    minimo = calculaReductor(valores, new Reductor() {
      @Override
      public double reduce(double acumulador, double valor) {
        return valor < acumulador ? valor : acumulador;
      }
    });
    
    // Muestra el maximo y minimo
    System.out.printf("El máximo es %f y el minimo %f%n", maximo, minimo);
    
    // Y por último empleamos lambdas
    maximo = calculaReductor(valores, (a, v) -> v > a ? v : a);
    minimo = calculaReductor(valores, (a, v) -> v < a ? v : a);

    // Muestra el maximo y minimo
    System.out.printf("El máximo es %f y el minimo %f%n", maximo, minimo);
    
  }
  
  private static double calculaReductor(double[] valores, Reductor reductor) {
    double resultado = valores[0];
    for (double valor: valores) {
      resultado = reductor.reduce(resultado, valor);
    }
    return resultado;
  }
}
