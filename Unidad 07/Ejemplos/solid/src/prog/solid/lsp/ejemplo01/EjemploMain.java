package prog.solid.lsp.ejemplo01;

public class EjemploMain {

  public static void main(String[] args) {
    // Mi cuenta 
    Cuenta miCuenta = new Cuenta();
    // Ingreso mil loiros
    miCuenta.ingresa(1000);
    
    // Puedo sacar en el cajero porque tiene saldo
    CajeroAutomatico cajeroAutomatico = new CajeroAutomatico(miCuenta);
    cajeroAutomatico.retirada(100);
  }
}
