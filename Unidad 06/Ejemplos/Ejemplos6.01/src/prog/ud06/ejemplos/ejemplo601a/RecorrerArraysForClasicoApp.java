package prog.ud06.ejemplos.ejemplo601a;

public class RecorrerArraysForClasicoApp {

  public static void main(String[] args) {
    // Creamos el array
    double[] calificaciones = {7.5, 2.3, 8.2, 5.6, 9.2};
    
    // Usamos un contador desde 0 hasta la longitud del array - 1 (4)
    for (int i = 0; i < calificaciones.length; i++) {
      // Imprimimos la calificacion
      System.out.println("La calificacion " + i + " es de " + calificaciones[i]);
    }
  }
}
