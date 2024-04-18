package prog.unidad07.relacion01.ejercicio03;

/**
 * Cuenta con interés y penalización por retirada anticipada
 */
public class CuentaAhorro extends Cuenta {
  // Constante
  // Interes de ahorro
  private static final double INTERES = 15.0 / 100.0;
  // Interes de penalizacion
  private static final double INTERES_PENALIZACION = 20.0 /100.0;
  
  // Atributos
  // Meses transcurridos desde la última retirada
  protected int mesesTranscurridos;
  // Saldo de la cuenta cuando se penalizo
  protected double saldoPenalizacion;
  
  /**
   * Constructor
   */
  public CuentaAhorro() {
    // Iniciamos el número de meses transcurridos desde la última retirada a cero
    mesesTranscurridos = 0;
    saldoPenalizacion = 0;
  }

  @Override
  public double interes() {
    return saldo * INTERES / 12;
  }

  @Override
  public void actualizacionMensual() {
    double interes = interes();
    double comision = comisiones();
    double penalizacion = penalizacion();
    
    saldo = saldo + interes - comision - penalizacion;
    mesesTranscurridos++;
  }

  @Override
  public void retirada(double cantidad) {
    super.retirada(cantidad);
    if (mesesTranscurridos < 12) {
      saldoPenalizacion = saldo;
      penalizacionPendiente = true;
    }
    // Reinicio los meses transcurridos
    mesesTranscurridos = 0;
  }

  public double penalizacion() {
    // Resultado
    double resultado = 0;
    // Si hay penalizacion pendientes
    if (penalizacionPendiente) {
      // Obtenemos la penalizacion con el saldo que había en el momento de la retirada
      resultado = saldoPenalizacion * INTERES_PENALIZACION;
      // Reiniciamos el saldo
      saldoPenalizacion = 0;
      // Y marcamos que ya no hay penalizacion pendiente
      penalizacionPendiente = false;
    }
    return resultado;
  }

}
