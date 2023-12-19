package prog.unidad04.practica406.libreria.test;

import java.util.Scanner;
import prog.unidad04.practica406.libreria.Fecha;
import prog.unidad04.practica406.libreria.Vehiculo;

public class PruebaVehiculo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String matricula = "";
    do {
      System.out.print("Introduce la matricula (vacia para terminar): ");
      matricula = sc.nextLine();
      try {
        Vehiculo vehiculo = new Vehiculo(matricula, new Fecha());
        System.out.println("okk");
      } catch (Exception e) {
        // 
        System.out.println("eeeeeeeeehhh");
      }
    } while (matricula.length() > 0);
  }

}
