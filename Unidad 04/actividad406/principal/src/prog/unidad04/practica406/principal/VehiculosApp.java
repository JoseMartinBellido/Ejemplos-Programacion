package prog.unidad04.practica406.principal;

import java.time.LocalDate;
import java.util.Scanner;
import prog.unidad04.practica406.libreria.Automovil;
import prog.unidad04.practica406.libreria.ConvertibleATexto;
import prog.unidad04.practica406.libreria.Fecha;
import prog.unidad04.practica406.libreria.Motocicleta;
import prog.unidad04.practica406.libreria.Vehiculo;

/**
 * Aplicación principal
 */
public class VehiculosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("PRÁCTICA DE Manolo. GESTIÓN DE VEHÍCULOS");
    
    boolean datosCorrectos = false;
    String matricula = "";
    int dia = 0;
    int mes = 0;
    int anyo = 0;
    Fecha fecha = null;
    Automovil automovil = null;
    Motocicleta motocicleta = null;
    do {
      try {
        // Pedimos los datos del automovil
        System.out.print("Introduce la matrícula del automóvil (4 números, 0 ó más espacios\n"
            + "y tres letras mayúsculas): ");
        matricula = sc.nextLine();
        System.out.print("Introduzca el día de la fecha de matriculación del automóvil: ");
        dia = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el mes de la fecha de matriculación del automóvil: ");
        mes = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el año de la fecha de matriculación del automóvil: ");
        anyo = Integer.parseInt(sc.nextLine());
        fecha = new Fecha(dia, mes, anyo);
      } catch (IllegalArgumentException e) {
        System.out.println("La fecha no es una fecha válida. Revise los valores e inténtelo de\n"
            + "nuevo");
        fecha = null;
      }
      try {
        System.out.print("Introduzca el color del automóvil (blanco, negro o azul): ");
        String color = sc.nextLine();
        System.out.print("Introduzca el número de plazas del vehículo (1 ó mas): ");
        int plazas = Integer.parseInt(sc.nextLine());
        automovil = new Automovil(matricula, fecha, color, plazas);
        datosCorrectos = true;
      } catch (IllegalArgumentException e) {
        System.out.println("No se pudo crear el automóvil. Revise los datos para comprobar que\n"
            + "todos son correctos");
        datosCorrectos = false;
      }
    } while (!datosCorrectos);
    
    datosCorrectos = false;
    do {
      try {
        // Pedimos los datos del amoto
        System.out.print("Introduce la matrícula de la motocicleta (4 números, 0 ó más espacios\n"
            + "y tres letras mayúsculas): ");
        matricula = sc.nextLine();
        System.out.print("Introduzca el día de la fecha de matriculación de la motocicleta: ");
        dia = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el mes de la fecha de matriculación de la motocicleta: ");
        mes = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el año de la fecha de matriculación de la motocicleta: ");
        anyo = Integer.parseInt(sc.nextLine());
        fecha = new Fecha(dia, mes, anyo);
      } catch (IllegalArgumentException e) {
        System.out.println("La fecha no es una fecha válida. Revise los valores e inténtelo de\n"
            + "nuevo");
        fecha = null;
      }
      try {
        System.out.print("Introduzca la cilindrada de la motocicleta (50 ó mas): ");
        int cilindrada = Integer.parseInt(sc.nextLine());
        motocicleta = new Motocicleta(matricula, fecha, cilindrada);
        datosCorrectos = true;
      } catch (IllegalArgumentException e) {
        System.out.println("No se pudo crear la motocicleta. Revise los datos para comprobar que\n"
            + "todos son correctos");
        datosCorrectos = false;
      }
    } while (!datosCorrectos);
    
    // Cuando llegamos tenemos un automovil y motocicleta correctos
    System.out.print("Datos del automovil: ");
    imprimeVehiculo(automovil);
    System.out.print("Datos de la motocicleta: ");
    imprimeVehiculo(motocicleta);
    if (automovil.getFechaMatriculacion().esBisiesto()) {
      System.out.println("El automovil se matriculó en un año bisiesto");
    }
    if (motocicleta.getFechaMatriculacion().esBisiesto()) {
      System.out.println("La motocicleta se matriculó en un año bisiesto");
    }
    Fecha hoy = getFechaHoy();
    System.out.println("El automovil lleva matriculado " + automovil.getFechaMatriculacion().diasEntre(hoy) + " dias");
    System.out.println("La motocicleta lleva matriculada " + motocicleta.getFechaMatriculacion().diasEntre(hoy) + " dias");
    int comparacionFechas = automovil.getFechaMatriculacion().compara(motocicleta.getFechaMatriculacion()); 
    if (comparacionFechas < 0) {
      System.out.println("El automovil se matrículo antes que la motocicleta");
    } else if (comparacionFechas > 0) {
      System.out.println("El automóvil se matriculod después que la motocicleta");
    } else {
      System.out.println("Los dos vehiculos se matricularon el mismo dia");
    }
    // Por último mostramos el número de vehículos matriculados
    System.out.println("El número de vehiculos matriculados es de " + Vehiculo.getVehiculosMatriculados());
  }

  private static Fecha getFechaHoy() {
    LocalDate hoy = LocalDate.now();
    return new Fecha(hoy.getDayOfMonth(), hoy.getMonthValue(), hoy.getYear());
  }

  private static void imprimeVehiculo(ConvertibleATexto vehiculo) {
    System.out.println(vehiculo.aTexto());
  }

}
