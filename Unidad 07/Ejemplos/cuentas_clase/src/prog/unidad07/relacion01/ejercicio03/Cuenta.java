package prog.unidad07.relacion01.ejercicio03;

/**
 * Clase general para todas las cuentas
 */
public abstract class Cuenta {
  // Constantes
  // Saldo mínimo para que se aplique la comisión máxima
  private static final double SALDO_MINIMO_COMISION = 100;
  // Comision maxima 
  private static final double COMISION_MAXIMA = 10;
  // Porcentaje de comision
  private static final double PORCENTAJE_COMISION = 0.1;
  
  // Atributos
  // Saldo
  protected double saldo;
  
  /**
   * Constructor. Inicializa la cuenta con el saldo a cero
   */
  public Cuenta() {
    // Ponemos el saldo siempre inicialmente a cero
    saldo = 0;
  }
  
  public void ingreso(double cantidad) {
    // Si la cantidad es positiva
    if (cantidad > 0) {
      // Se añade al saldo
      saldo += cantidad;
      saldo = redondeaDosDecimales(saldo);
    } else {
      throw new IllegalArgumentException("No se puede ingresar una cantidad negativa");
    }
  }
  
  public void retirada(double cantidad) {
   if (cantidad > 0 && cantidad <= saldo) {
     saldo -= cantidad;
     saldo = redondeaDosDecimales(saldo);
   } else {
     throw new IllegalArgumentException("No se puede retirar la cantidad indicada");
   }
  }
  
  public double comisiones() {
    // Si el saldo pasa del máximo
    if (saldo > SALDO_MINIMO_COMISION) {
      // Devuelvo la comisión máxima
      return COMISION_MAXIMA;
    } else {
      // Si no, calcula el porcentaje
      return saldo * PORCENTAJE_COMISION;
    }
  }
  
  public double getSaldo() {
    return saldo;
  }
  
  public abstract double interes();
  
  
  public abstract void actualizacionMensual();
  
  protected double redondeaDosDecimales(double valor) {
    return Math.round(valor * 100.0) / 100.0;
  }
}
