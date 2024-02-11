package prog.gof.strategy.ejemplo01;

public class Main {

  public static void main(String[] args) {
    Clientes clientes = new Clientes("ficherodatos.dat");
    clientes.cargar();
    clientes.addCliente(new Cliente("Paco", "99999999A", 20));
    clientes.guardar();
  }

}
