package prog.unidad05.ficheros.ejercicio01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Muestra un fichero de texto por pantalla
 */
public class MuestraFicheroTextoApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Tomamos la ruta de los argumentos, si los hay. Si no se pide por teclado
    String rutaArchivo = null;
    if (args.length > 0) {
      rutaArchivo = args[0];
    } else {
      System.out.print("Introduzca la ruta al archivo a mostrar: ");
      rutaArchivo = sc.nextLine();
    }
    
    // Hacemos un try con recursos y abrimos el archivo
    try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
      // Mostramos cabecera
      System.out.printf("Contenidos del fichero \"%s\"%n", rutaArchivo);

      // Si llegamos aqui es que el flujo está abierto
      String linea = null;
      do {
        // Leemos la linea
        linea = reader.readLine();
        if (linea != null) {
          System.out.println(linea);
        }
      } while (linea != null);
      // Habria que cerrar pero no se hace porque usamos try con recursos
    } catch (FileNotFoundException e) {
      System.err.printf("El fichero \"%s\" no existe%n", rutaArchivo);
    } catch (IOException e) {
      System.err.printf("Ocurrió error leyendo del archivo \"%s\"%n", rutaArchivo);
    }
  }

}
