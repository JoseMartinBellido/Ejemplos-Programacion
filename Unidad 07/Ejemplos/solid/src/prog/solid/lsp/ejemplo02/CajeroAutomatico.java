package prog.solid.lsp.ejemplo02;

public class CajeroAutomatico {

  private Cuenta cuenta;

  public CajeroAutomatico(Cuenta cuenta) {
    this.cuenta = cuenta;
  }
  
  public void retirada(double cantidad) {
    if (cuenta.getSaldo() >= cantidad) {
      cuenta.retira(cantidad);
      System.out.println("Cantidad retirada");
    } else {
      System.err.println("Saldo insuficiente");
    }
  }
}
