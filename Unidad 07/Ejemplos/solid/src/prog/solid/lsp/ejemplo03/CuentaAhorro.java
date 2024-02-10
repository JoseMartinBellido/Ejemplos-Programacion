package prog.solid.lsp.ejemplo03;

public class CuentaAhorro extends Cuenta {

  private double saldo;

  public CuentaAhorro() {
    saldo = 0;
  }
  
  /**
   * Añade la cantidad especificada a la cuenta
   * @param cantidad Cantidad a añadir
   */
  public void ingresa(double cantidad) 
  {
    this.saldo += cantidad;
  }
  
  /**
   * Retira la cantidad especificada de la cuenta
   * @param cantidad Cantidad a retirar
   */
  public void retira(double cantidad) {
    if (this.saldo >= cantidad) {
      this.saldo -= cantidad;
    } else {
      throw new IllegalArgumentException("Saldo insuficiente");
    }
  }
  
  /**
   * Obtiene el saldo actual de la cuenta
   * @return Saldo actual de la cuenta
   */
  public double getSaldo() {
    return this.saldo;
  }
  
  // Como no hace nada en la actualizacion mensual no la implementa
  
}
