package prog.ud06.ejemplos.ejemplo604a;

import java.util.ArrayList;
import java.util.List;

public class ListasApp {

  public static void main(String[] args) {
    // Creamos una lista de enteros
    List<Integer> lista = new ArrayList<>();
    
    // Añadimos al final (como está vacía, da igual)
    lista.add(1);
    // Añadimos 2 delante del 1
    lista.add(0, 2);
    // Y añadimos 3 al final
    lista.add(3);
    // La lista debe quedar 2, 1, 3
    // Imprimimos la lista
    imprimeLista(lista);
    
    // Sustituimos el 1 por un 4
    lista.set(1, 4);
    
    // La lista debe quedar 2, 4, 3
    imprimeLista(lista);

    // Eliminamos el 4
    lista.remove(1);
    
    // La lista debe quedar 2, 3
    imprimeLista(lista);
    
    // Accedemos a los dos elementos
    System.out.println("Primer elemento: " +  lista.get(0));
    System.out.println("Segundo elemento: " +  lista.get(1));
    
    // Obtenemos el tamaño de la lista y si está vacía
    System.out.println("La lista tiene " + lista.size() + " elementos");
    System.out.println("¿Está vacía? " + (lista.isEmpty() ? "si" : "no"));
    // La vaciamos y volvemos a imprimir
    lista.clear();
    System.out.println("La lista tiene ahora " + lista.size() + " elementos");
    System.out.println("¿Está vacía? " + (lista.isEmpty() ? "si" : "no"));
    // Añadimos un par de elementos
    lista.add(3);
    lista.add(2);

    // Está el 2? Si debe estar
    System.out.println("Contiene el 2?: " + (lista.contains(2) ? "si" : "no"));
    // Está el 4? NO debe estar
    System.out.println("Contiene el 4?: " + (lista.contains(4) ? "si" : "no"));

    // Obtenemos la posición del 2 (1)
    System.out.println("Posición del 2: " + lista.indexOf(2));
    // Obtenemos la posición del 4 (-1)
    System.out.println("Posición del 4: " + lista.indexOf(4));
    
    // Convertimos la lista en un array
    Integer[] listaArray = lista.toArray(new Integer[1]);
    // Y la imprimimos
    for (int elemento: listaArray) {
      System.out.println("Elemento : " + elemento);
    }
    
    // Lista antes de ordenar
    imprimeLista(lista);
    // La ordenamos
    lista.sort(null);
    // Y la volvemos a imprimir
    imprimeLista(lista);
  }

  private static void imprimeLista(List<Integer> lista) {
    
    // Imprimimos el paréntesis de apertura
    System.out.print("(");
    // Para cada elemento de la lista
    for (int i = 0; i < lista.size(); i++) {
      // Lo imprimimos
      System.out.print(lista.get(i));
      // Si no es el último
      if (i < (lista.size() - 1)) {
        // Imprimimos una coma
        System.out.print(", ");
      }
    }
    // Terminamos con el paréntesis de cierre
    System.out.println(")");
  }

}
