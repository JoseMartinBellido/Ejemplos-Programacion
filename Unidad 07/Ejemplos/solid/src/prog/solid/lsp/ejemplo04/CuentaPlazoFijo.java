package prog.solid.lsp.ejemplo04;

public class CuentaPlazoFijo extends Cuenta {

  private double saldo;
  private int mesesPlazo;
  private int mesesRestantes;
  private double interes;
  
  public CuentaPlazoFijo(int mesesPlazo, double interes) {
    // Saldo a cero
    this.saldo = 0;
    // Los meses del plazo de la cuenta
    this.mesesPlazo = mesesPlazo;
    // Los restantes son los del plazo
    this.mesesRestantes = mesesPlazo;
    // Y por último el interés a aplicar cada mes durante el plazo
    this.interes = interes;
    
  }

  @Override
  public void ingresa(double cantidad) {
    // Se realiza el ingreso
    saldo += cantidad;
    // Se reinicia el plazo
    this.mesesRestantes = this.mesesPlazo;
  }

  @Override
  public double getSaldo() {
    return this.saldo;
  }

  @Override
  public void actualizacionMensual() {
    // Actualizamos el saldo con el interes
    this.saldo += saldo * interes;
    // Reduce el número de meses que restan (si es mayor que cero)
    if (this.mesesRestantes > 0) {
      this.mesesRestantes--;
    }
  }
}
