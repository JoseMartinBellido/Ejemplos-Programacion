package prog.ud06.ejemplos.ejemplo601b;

public class RecorrerArraysForEachApp {

  public static void main(String[] args) {
    // Creamos el array
    double[] calificaciones = {7.5, 2.3, 8.2, 5.6, 9.2};
    
    // Usamos un ciclo forEach para recorrer el array
    for (double calificacion: calificaciones) {
      // Imprimimos la calificacion
      System.out.println("La calificacion es de " + calificacion);
    }
  }

}
