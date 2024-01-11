package prog.unidad06.ejemplos.ejemplo602b;

public class BusquedaArraysForClasico {

  public static void main(String[] args) {
    int[] edades = {25, 33, 45, 67, 92, 16};
    
    int indice = localizarArrayEntero(edades, 67); 
    if (indice >= 0) {
      System.out.println("Correcto. Se encontró la edad 67 en el array en la posición " + indice);
    } else {
      System.out.println("Error. NO se encontró la edad 67 en el array");
    }
    
    indice = localizarArrayEntero(edades, 73); 
    if (indice >= 0) {
      System.out.println("Error. Se encontró la edad 73 en el array en la posición " + indice);
    } else {
      System.out.println("Correcto. No se encontró la edad 73 en el array");
    }
  }

  private static int localizarArrayEntero(int[] array, int buscado) {
    // Para cada indice del array
    for (int i = 0; i < array.length; i++) {
      // Si el elemento en esa posición es el buscado
      if (array[i] == buscado) {
        // Termina y devuelve la posición
        return i;
      }
    }
    // Si se llega al final del ciclo es que no se ha encontrado
    // Devolvemos un valor establecido no válido en un array, por ejemplo -1
    return -1;
  }

}
