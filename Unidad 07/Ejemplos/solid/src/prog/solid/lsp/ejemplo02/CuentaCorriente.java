package prog.solid.lsp.ejemplo02;

public class CuentaCorriente extends Cuenta {

  private double saldo;
  private double interes;
  private double comision;
  
  public CuentaCorriente(double interes, double comision) {
    this.saldo = 0;
    this.interes = interes;
    this.comision = comision;
  }

  @Override
  public void ingresa(double cantidad) {
    this.saldo += cantidad;
  }

  @Override
  public void retira(double cantidad) {
    if (this.saldo >= cantidad) {
      saldo -= cantidad;
    } else {
      throw new IllegalArgumentException("No hay saldo suficiente para realizar la operacion");
    }
  }

  @Override
  public double getSaldo() {
    return saldo;
  }

  @Override
  public void actualizacionMensual() {
    super.actualizacionMensual();
    // Aplica la comision
    saldo -= saldo * (comision / 12);
    // Si el saldo es positivo
    if (saldo > 0) {
      // Aplica el interes
      saldo += saldo * (interes / 12);
    }
  }
}
