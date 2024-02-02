package prog.ud07.polimorfismo.ejemplo01;

public class PruebaOperadorBinario {

  public static void main(String[] args) {
    // Creamos tres operadores, un base, un producto y una suma
    OperadorEnteroBinario operadorBase = new OperadorEnteroBinario(4, 2);
    OperadorEnteroSuma operadorSuma = new OperadorEnteroSuma(4, 2);
    OperadorEnteroProducto operadorProducto = new OperadorEnteroProducto(4, 2);
    
    // El primero objeto lanza excepción al intentar invocar a opera
    try {
      System.out.printf("El resultado de la primera operacion es: %d%n", operadorBase.opera());
    } catch (UnsupportedOperationException e) {
      System.out.println("La operación no se soporta en la clase base");
    }
    
    // El segundo y tercero SI devuelven resultado
    System.out.printf("El resultado de la segunda operacion es: %d%n", operadorSuma.opera());
    System.out.printf("El resultado de la tercer operacion es: %d%n", operadorProducto.opera());
    
    // Hasta aqui nada nuevo pero dado que suma y producto heredan de binario podríamos hacer:
    // Creamos tres operadores de nuevo, un base, un producto y una suma
    // Pero asignamos todos a variables de tipo base
    OperadorEnteroBinario operadorBase2 = new OperadorEnteroBinario(4, 2);
    OperadorEnteroBinario operadorSuma2 = new OperadorEnteroSuma(4, 2);
    OperadorEnteroBinario operadorProducto2 = new OperadorEnteroProducto(4, 2);
    // ¿Qué pasa con estas instrucciones? ¿Qué resultado dan?
    System.out.printf("El resultado de la primera operacion es: %d%n", operadorBase2.opera());
    System.out.printf("El resultado de la segunda operacion es: %d%n", operadorSuma2.opera());
    System.out.printf("El resultado de la tercer operacion es: %d%n", operadorProducto2.opera());
    
  }

}
