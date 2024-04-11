package prog.ud07.polimorfismo.ejemplo01;

public class Prueba1 {

  public static void main(String[] args) {
    OperadorEnteroResta operador = new OperadorEnteroResta(2,3);
    int resultado = operador.opera(6,5);
    //int resultado = obtieneResultado(operador);
    
    System.out.printf("El resultado es %d%n", resultado);
  }

  private static int obtieneResultado(OperadorEnteroBinario operador) {
    return operador.opera();
  }
  
}
