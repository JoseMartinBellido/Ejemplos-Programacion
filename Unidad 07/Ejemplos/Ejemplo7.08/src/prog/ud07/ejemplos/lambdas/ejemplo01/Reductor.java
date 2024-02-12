package prog.ud07.ejemplos.lambdas.ejemplo01;

/**
 * Interfaz que reduce una secuencia de valores reales a un sólo valor real
 * 
 */
@FunctionalInterface
public interface Reductor {

  /**
   * Añade un nuevo valor al reductor
   * @param acumulador Valor acumulador hasta el momento en la operación de reducción
   * @param valor Valor a añadir a la secuencia
   * @return nuevo valor acumulado
   */
  double reduce(double acumulador, double valor);
  
  default int cuentaValores() {return 0;}  
}
