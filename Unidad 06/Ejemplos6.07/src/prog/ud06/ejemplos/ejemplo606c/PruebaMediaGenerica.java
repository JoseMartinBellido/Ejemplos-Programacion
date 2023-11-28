package prog.ud06.ejemplos.ejemplo606c;

public class PruebaMediaGenerica {

  public static void main(String[] args) {
    Integer[] arrayEntero = {1,2, 3, 4, 5};
    Double[] arrayDouble = {6.0, 7.0, 8.0, 9.0, 10.0};
    Long[] arrayLong = {11L, 12L, 13L, 14L, 15L};
    
    System.out.println("Media enteros: " + calculaMedia(arrayEntero));
    System.out.println("Media reales: " + calculaMedia(arrayDouble));
    System.out.println("Media largos: " + calculaMedia(arrayLong));
  }

  public static <T extends Number> double calculaMedia(T[] numeros) {
    
    double suma = 0;
    int contador = 0;
    
    for (T valor: numeros) {
      suma += valor.doubleValue();
      contador++;
    }
    return suma / contador;
  }
}
