package prog.ud06.ejemplos.ejemplo603a;

public class ArrayBidimensionalApp {

  public static void main(String[] args) {
    // Creamos el array bidimensional
    // Con las tablas de multiplicar del 1 al 4 (filas 0 a 3)
    // Cada fila es una tabla y cada columna contiene
    // el múltiplo correspondiente a la fila * (columna + 1)
    int[][] tablasMultiplicar = {
        {1,2,3,4,5,6,7,8,9},
        {2,4,6,8,10,12,14,16,18,20},
        {3,6,9,12,15,18,21,24,27,30},
        {4,8,12,16,20,24,28,32,36,40}
    };
    
    // Imprimimos cuanto vale 3 * 4
    // El número de fila y columna es uno menos porque los índices
    // comienzan por cero en lugar de por 1
    System.out.println("3 * 4 vale " + tablasMultiplicar[2][3]);

    // Podemos pasar una sola tabla e imprimirla
    imprimeTabla(3, tablasMultiplicar[2]);
    
    // Para recorrer la tabla se emplean dos ciclos
    // Uno para recorrer las filas y otro para recorrer
    // las casillas de una fila (las columnas)
    for (int i = 0; i < tablasMultiplicar.length; i++) {
      System.out.println("Tabla del " + (i + 1));
      for (int j = 0; j < tablasMultiplicar[i].length; j++) {
        System.out.println((i + 1) + " * " + (j + 1) + " = " + tablasMultiplicar[i][j]);
      }
    }
    
    // Metodo alternativo usando forEach
    for (int[] fila: tablasMultiplicar) {
      System.out.println("Nueva fila");
      for(int casilla: fila) {
        System.out.println("Elemento: " + casilla);
      }
    }
  }

  private static void imprimeTabla(int numero, int[] tabla) {
    for (int i = 0; i < tabla.length; i++) {
      System.out.println(numero + " * " + (i + 1) + " = " + tabla[i]);
    }
  }
}
