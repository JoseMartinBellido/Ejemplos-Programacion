package prog.solid.lsp.ejemplo04;

public class CajeroAutomatico {

  private CuentaRetirable cuenta;

  public CajeroAutomatico(CuentaRetirable cuenta) {
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
