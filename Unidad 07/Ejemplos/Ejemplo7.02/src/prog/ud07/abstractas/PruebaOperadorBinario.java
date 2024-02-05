package prog.ud07.abstractas;

import prog.ud07.polimorfismo.ejemplo01.OperadorEnteroBinario;
import prog.ud07.polimorfismo.ejemplo01.OperadorEnteroNulo;
import prog.ud07.polimorfismo.ejemplo01.OperadorEnteroProducto;
import prog.ud07.polimorfismo.ejemplo01.OperadorEnteroSuma;

public class PruebaOperadorBinario {

  public static void main(String[] args) {
    // Creamos cuatro operadores, un base, un producto, una suma y un nulo
    // Esta línea ya no compila porque no podemos crear objetos de una clase abstracta
    //OperadorEnteroBinario operadorBase = new OperadorEnteroBinario(4, 2);
    OperadorEnteroSuma operadorSuma = new OperadorEnteroSuma(4, 2);
    OperadorEnteroProducto operadorProducto = new OperadorEnteroProducto(4, 2);
    // La clase OperadorEnteroNulo ya no compila porque no define opera()
    //OperadorEnteroNulo operadorNulo = new OperadorEnteroNulo(4, 2);
    
    // El primero objeto lanza excepción al intentar invocar a opera
    // Ya que operadorBase no se puede crear, tampoco se puede usar
    /*try {
      System.out.printf("El resultado de la primera operacion es: %d%n", operadorBase.opera());
    } catch (UnsupportedOperationException e) {
      System.out.println("La operación no se soporta en la clase base");
    }*/
    
    // El segundo y tercero SI devuelven resultado
    System.out.printf("El resultado de la segunda operacion es: %d%n", operadorSuma.opera());
    System.out.printf("El resultado de la tercer operacion es: %d%n", operadorProducto.opera());
    
    // El cuarto objeto también lanza excepción al intentar invocar a opera
    // Tampoco se puede usar porque no se ha podido crear
    /*try {
      System.out.printf("El resultado de la cuarta operacion es: %d%n", operadorNulo.opera());
    } catch (UnsupportedOperationException e) {
      System.out.println("La operación no se soporta en la clase OperadorEnteroNulo");
    }*/
    
    // Hasta aqui nada nuevo pero dado que suma y producto heredan de binario podríamos hacer:
    // Creamos cuatro operadores de nuevo
    // Pero asignamos todos a variables de tipo base
    // Igual que antes no compila
    //OperadorEnteroBinario operadorBase2 = new OperadorEnteroBinario(4, 2);
    OperadorEnteroBinario operadorSuma2 = new OperadorEnteroSuma(4, 2);
    OperadorEnteroBinario operadorProducto2 = new OperadorEnteroProducto(4, 2);
    // Idem
    //OperadorEnteroBinario operadorNulo2 = new OperadorEnteroNulo(4, 2);
    // ¿Qué pasa con estas instrucciones? ¿Qué resultado dan?
    System.out.printf("El resultado de la primera operacion es: %d%n", operadorBase2.opera());
    System.out.printf("El resultado de la segunda operacion es: %d%n", operadorSuma2.opera());
    System.out.printf("El resultado de la tercer operacion es: %d%n", operadorProducto2.opera());
    System.out.printf("El resultado de la cuarta operacion es: %d%n", operadorNulo2.opera());
  }
}
