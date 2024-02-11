package prog.gof.strategy.ejemplo02;

public class Main {

  public static void main(String[] args) {
    Clientes clientes = new Clientes("jdbc:mysql:localhost:mydb");
    clientes.cargar();
    clientes.addCliente(new Cliente("Paco", "99999999A", 20));
    clientes.guardar();
  }

}
