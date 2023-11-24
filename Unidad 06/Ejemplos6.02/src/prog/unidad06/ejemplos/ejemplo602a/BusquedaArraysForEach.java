package prog.unidad06.ejemplos.ejemplo602a;

public class BusquedaArraysForEach {

  public static void main(String[] args) {
    int[] edades = {25, 33, 45, 67, 92, 16};
    
    if (buscarArrayEntero(edades, 67)) {
      System.out.println("Correcto. Se encontró la edad 67 en el array");
    } else {
      System.out.println("Error. NO se encontró la edad 67 en el array");
    }
    
    if (buscarArrayEntero(edades, 73)) {
      System.out.println("Error. Se encontró la edad 73 en el array");
    } else {
      System.out.println("Correcto. No se encontró la edad 73 en el array");
    }
  }
  
  private static boolean buscarArrayEntero(int[] array, int buscado) {
    // Para cada elemento
    for(int elemento: array) {
      // Si es el buscado
      if (elemento == buscado) {
        // Terminamos con éxito
        return true;
      }
    }
    // Si se llega al final del array sin haberlo encontrado es
    // porque no está en el array
    return false;
  }

}
