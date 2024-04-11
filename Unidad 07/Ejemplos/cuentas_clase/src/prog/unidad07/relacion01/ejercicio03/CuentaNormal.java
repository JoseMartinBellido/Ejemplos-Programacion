package prog.unidad07.relacion01.ejercicio03;

/**
 * Cuenta Normal es una cuenta sin interes pero tiene comisiones y penalizacion por saldo
 * inferior a 500 euros
 */
public class CuentaNormal extends Cuenta {
  
  // Atributo
  // Indica si se ha bajado del saldo minimo durante el mes
  protected boolean penaliza;

  /**
   * Constructor
   */
  public CuentaNormal() {
    // Inicialmente la cuenta no está penalizada
    penaliza = false;
  }
  
  @Override
  public double interes() {
    // No tiene ningún interes y devolvemos 0
    return 0;
  }

  @Override
  public void actualizacionMensual() {
    // Calculamos interes, comision y penalizacion
    double interes = interes();
    double comision = comisiones();
    double penalizacion = penalizacion();
    
    // El nuevo saldo se obtiene sumando el interes y restando los otros dos
    saldo = saldo + interes - comision - penalizacion;
    saldo = redondeaDosDecimales(saldo);
  }

  @Override
  public void retirada(double cantidad) {
    // Retiramos normalmente
    super.retirada(cantidad);
    // Si el saldo ha bajado de 500
    if (saldo < 500) {
      // Penaliza en la siguiente actualizacion mensual
      penaliza = true;
    }
  }

  /**
   * Calcula la penalización
   * @return Penalización del mes
   */
  private double penalizacion() {
    // Si hay penalizacion
    if (penaliza) {
      // La anota como hecha
      penaliza = false;
      // Y devolvemos el importe
      return 10;
    } else {
      // No hay penalizacion
      return 0;
    }
  }
}
