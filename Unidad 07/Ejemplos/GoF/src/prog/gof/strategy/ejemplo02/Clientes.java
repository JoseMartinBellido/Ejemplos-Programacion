package prog.gof.strategy.ejemplo02;

import java.util.HashSet;
import java.util.Set;

/**
 * Clientes
 */
public class Clientes {

  // Constantes
  private static final String TABLA = "CLIENTES";
  
  // Atributos
  // Clientes
  private Set<Cliente> clientes;
  // URL para acceder a la base de datos
  private String url;
  
  public Clientes(String url) {
    clientes = new HashSet<>();
    this.url = url;
  }
  
  public void addCliente(Cliente cliente) {
    System.out.println("Añadiendo cliente");
    clientes.add(cliente);
  }
  
  public void guardar() {
    // Guarda los clientes en un fichero
    System.out.printf("Guardando clientes en base de datos \"%s\", tabla \"%s\"%n", url, TABLA);
  }

  public void cargar() {
    // Carga los clientes desde un fichero
    System.out.printf("Carga clientes desde base de datos \"%s\", tabla \"%s\"%n", url, TABLA);
  }

}
