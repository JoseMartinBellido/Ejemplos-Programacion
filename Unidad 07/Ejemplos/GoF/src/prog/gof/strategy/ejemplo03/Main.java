package prog.gof.strategy.ejemplo03;

public class Main {

  public static void main(String[] args) {
    // Usamos almacenamiento nube
    // Para usar otro descomentar alguna de las otras lineas y comentar la siguiente
    Clientes clientes = new Clientes(new AlmacenamientoFichero("ficherodatos.dat"));
    // Clientes clientes = new Clientes(new AlmacenamientoBaseDatos("jdbc:mysql:localhost:mydb"));
    // Clientes clientes = new Clientes(new AlmacenamientoNube("http://www.minube.com/cargar", "http://www.minube.com/guardar"));
    clientes.cargar();
    clientes.addCliente(new Cliente("Paco", "99999999A", 20));
    clientes.guardar();
  }

}
