package prog.gof.strategy.ejemplo01;

import java.util.HashSet;
import java.util.Set;

/**
 * Clientes
 */
public class Clientes {

  // Atributos
  // Clientes
  private Set<Cliente> clientes;
  // Ruta del fichero donde se guardan los datos
  private String rutaArchivo;
  
  public Clientes(String rutaArchivo) {
    clientes = new HashSet<>();
    this.rutaArchivo = rutaArchivo;
  }
  
  public void addCliente(Cliente cliente) {
    System.out.println("Añadiendo cliente");
    clientes.add(cliente);
  }
  
  public void guardar() {
    // Guarda los clientes en un fichero
    System.out.printf("Guardando clientes en fichero \"%s\"%n", rutaArchivo);
  }

  public void cargar() {
    // Carga los clientes desde un fichero
    System.out.printf("Carga clientes desde fichero \"%s\"%n", rutaArchivo);
  }

}
