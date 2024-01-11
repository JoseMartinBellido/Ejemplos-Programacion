package prog.ud06.ejemplos.ejemplo606c;

public class PruebaMetodoGenerico {

  public static void main(String[] args) {
    Integer[] arrayEntero = {1, 2, 3, 4, 5};
    Double[] arrayDouble = {5.0, 4.0, 3.0, 2.0, 1.0};
    String[] arrayString = {"uno", "dos", "tres", "cuatro", "cinco"};
    
    System.out.println("Array entero: " + ultimoElementoDelArray(arrayEntero));
    System.out.println("Array real: " + ultimoElementoDelArray(arrayDouble));
    System.out.println("Array cadena: " + ultimoElementoDelArray(arrayString));
  }
  
  private static <T> T ultimoElementoDelArray(T[] array) {
    if (array.length > 0) {
      return array[array.length - 1];
    } else {
      return null;
    }
  }

}
