package prog.solid.lsp.ejemplo03;

public abstract class Cuenta {

  public abstract void ingresa(double cantidad);
  
  public abstract void retira(double cantidad);
  
  public abstract double getSaldo();
  
  public void actualizacionMensual() {
    // No hace nada. Las subclases pueden crear sus propias versiones
  }
  
}
