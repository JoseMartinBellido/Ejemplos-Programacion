package prog.ud06.ejemplos.ejemplo608;

import java.util.Scanner;

public class SplitApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Solicita la cadena y el separador
    System.out.print("Introduzca la cadena a dividir: ");
    String cadena = sc.nextLine();
    System.out.print("Introduzca la expresión regular del separador: ");
    String separador = sc.nextLine();
    // Hace la división
    String[] partes = cadena.split(separador);
    
    // Muestra número de partes
    System.out.println("Se encontraron " + partes.length + " partes");
    for (int i = 0; i < partes.length; i++) {
      System.out.println("Parte " + (i + 1) + ": " + partes[i]);
    }
  }

}
