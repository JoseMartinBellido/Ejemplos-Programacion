package prog.gof.strategy.ejemplo03;

import java.util.HashSet;
import java.util.Set;

/**
 * Clientes
 */
public class Clientes {

  // Atributos
  // Clientes
  private Set<Cliente> clientes;
  // Almacenamiento
  private Almacenamiento almacenamiento;
  
  public Clientes(Almacenamiento almacenamiento) {
    clientes = new HashSet<>();
    this.almacenamiento = almacenamiento;
  }
  
  public void addCliente(Cliente cliente) {
    System.out.println("Añadiendo cliente");
    clientes.add(cliente);
  }
  
  public void guardar() {
    almacenamiento.guardar();
  }

  public void cargar() {
    almacenamiento.cargar();
  }

}
