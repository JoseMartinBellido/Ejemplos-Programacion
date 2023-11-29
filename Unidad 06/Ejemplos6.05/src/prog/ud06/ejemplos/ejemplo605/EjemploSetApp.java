package prog.ud06.ejemplos.ejemplo605;

import java.util.HashSet;
import java.util.Set;

public class EjemploSetApp {

  public static void main(String[] args) {
    // Creamos un conjunto de enteros
    Set<Integer> conjunto = new HashSet<>();
    
    // Añadimos el elemento 1
    conjunto.add(1);
    // Imprimimos
    imprimeConjunto(conjunto);
    // Añadimos el 2
    conjunto.add(2);
    // Imprimimos
    imprimeConjunto(conjunto);
    // Volvemos a añadir 2
    conjunto.add(2);
    // Imprimimos (debe salir lo mismo)
    imprimeConjunto(conjunto);
    
    // Eliminamos el 2
    conjunto.remove(2);
    
    // El conjunto sólo debe contener 1
    imprimeConjunto(conjunto);
    
    // Obtenemos el tamaño del conjunto y si está vacía
    System.out.println("El conjunto tiene " + conjunto.size() + " elementos");
    System.out.println("¿Está vacío? " + (conjunto.isEmpty() ? "si" : "no"));
    // Lo vaciamos y volvemos a imprimir
    conjunto.clear();
    System.out.println("El conjunto tiene ahora " + conjunto.size() + " elementos");
    System.out.println("¿Está vacío? " + (conjunto.isEmpty() ? "si" : "no"));

    // Añadimos un par de elementos
    conjunto.add(3);
    conjunto.add(2);

    // Está el 2? Si debe estar
    System.out.println("Contiene el 2?: " + (conjunto.contains(2) ? "si" : "no"));
    // Está el 4? NO debe estar
    System.out.println("Contiene el 4?: " + (conjunto.contains(4) ? "si" : "no"));

    // Convertimos el conjunto en un array
    Integer[] conjuntoArray = conjunto.toArray(new Integer[1]);
    // Y lo imprimimos
    for (int elemento: conjuntoArray) {
      System.out.println("Elemento : " + elemento);
    }
  }

  private static void imprimeConjunto(Set<Integer> conjunto) {
    // Imprimimos el paréntesis de apertura
    System.out.print("(");
    // Para cada elemento del conjunto
    int contador = 0;
    for (int elemento: conjunto) {
      // Lo imprimimos
      System.out.print(elemento);
      if (contador < conjunto.size() - 1) {
        // Imprimimos una coma
        System.out.print(", ");
      }
      contador++;
    }
    // Terminamos con el paréntesis de cierre
    System.out.println(")");
  }

}
