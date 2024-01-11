package prog.ud06.ejemplos.ejemplo608;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class ExpresionesRegularesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Probador de expresiones regulares");
    String expresion = null;
    String cadena = null;
    // Solicita una expresión regular por teclado
    do {
      System.out.print("Introduce una expresión regular para probar (vacia para terminar): ");
      expresion = sc.nextLine();
      // Si la expresión no está vacía
      if (!expresion.isBlank()) {
        // Solicitamos cadenas hasta que el usuario decida terminar
        do {
          System.out.print("Introduzca una cadena para probar contra la expresión regular (vacia para terminar): ");
          cadena = sc.nextLine();
          // Si la cadena no está vacía
          if (!cadena.isEmpty()) {
            try {
              // Intenta ver si la cadena cumple la expresión
              String resultado = cadena.matches(expresion) ? "si" : "no";
              // Y muestra el resultado
              System.out.println("La cadena " + resultado + " cumple la expresión regular");
            } catch (PatternSyntaxException e) {
              // Error en la expresión regular
              System.out.println("La expresión regular no es correcta. Inténtalo con otra");
              // Salimos del bucle
              break;
            }
          }
        } while (!cadena.isEmpty());
      }
    } while (!expresion.isBlank());
    System.out.println("Fin de programa");
  }

}
