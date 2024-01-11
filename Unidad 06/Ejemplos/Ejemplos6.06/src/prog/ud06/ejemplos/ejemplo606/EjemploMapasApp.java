package prog.ud06.ejemplos.ejemplo606;

import java.util.HashMap;
import java.util.Map;

public class EjemploMapasApp {

  public static void main(String[] args) {
    // Creamos un mapa que relaciona los nombres de los números con los valores de los mismos
    // La clave, por tanto será una cadena (el nombre) y el valor un entero (el valor numérico de ese nombre)
    Map<String, Integer> numeros = new HashMap<>();

    // Creamos algunos mapeos
    numeros.put("uno", 1);
    numeros.put("dos", 2);
    numeros.put("tres", 3);
    
    // Imprimimos el mapa
    imprimeMapa(numeros);
    
    // Usamos putIfAbsent
    // Este funciona porque no hay ya mapeo
    numeros.putIfAbsent("cuatro", 4);
    // Este no, porque ya hay uno
    numeros.putIfAbsent("tres", 33);
    
    // Imprimimos el mapa
    imprimeMapa(numeros);
    
    // Obtenemos un valor existente
    System.out.println("El valor numérico de \"cuatro\" es " + numeros.get("cuatro"));
    
    // Obtenemos un valor inexistente usando el valor por defecto
    System.out.println("El valor numérico de \"cinco\" es " + numeros.getOrDefault("cinco", -1));

    // Eliminamos el mapeo de cuatro
    numeros.remove("cuatro");
    
    // Imprimimos el mapa
    imprimeMapa(numeros);
    
    // Obtenemos el tamaño (3)
    System.out.println("El tamaño del mapa es de " + numeros.size());
    // Y si está vacío o no (no)
    System.out.println("Está vacío?" + (numeros.isEmpty() ? "si" : "no"));
    
    // Lo vaciamos y repetimos
    numeros.clear();
    // Obtenemos el tamaño (0)
    System.out.println("El tamaño del mapa es de " + numeros.size());
    // Y si está vacío o no (si)
    System.out.println("Está vacío?" + (numeros.isEmpty() ? "si" : "no"));
    
    // Volvemos a rellenar los tres primeros mapeos
    numeros.put("uno", 1);
    numeros.put("dos", 2);
    numeros.put("tres", 3);

    // Contiene la clave "tres"? (si)
    System.out.println("Contiene la clave \"tres\"?: " + (numeros.containsKey("tres") ? "si" : "no"));
    // Y cuatro? (no)
    System.out.println("Contiene la clave \"cuatro\"?: " + (numeros.containsKey("cuatro") ? "si" : "no"));

    // Lo mismo pero con los valores
    System.out.println("Contiene el valor 3?: " + (numeros.containsValue(3) ? "si" : "no"));
    System.out.println("Contiene el valor 4?: " + (numeros.containsValue(4) ? "si" : "no"));

    // Imprime los valores contenidos en el mappa usando values()
    System.out.println("Valores en el mapa (en orden del mapa)");
    for (int valor: numeros.values()) {
      System.out.println("Valor: " + valor);
    }
  }

  private static void imprimeMapa(Map<String, Integer> mapa) {
    // Para cada clave
    for (String clave: mapa.keySet()) {
      // Imprime el mapeo
      System.out.println("Con la clave \"" + clave + "\" está el valor " + mapa.get(clave));
    }
  }

}
