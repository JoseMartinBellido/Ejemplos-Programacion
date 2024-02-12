package prog.solid.lsp.ejemplo03;

public class EjemploMain {

  public static void main(String[] args) {
    // Mi cuenta de ahorro
    CuentaAhorro miCuentaAhorro = new CuentaAhorro();
    // Ingreso mil loiros
    miCuentaAhorro.ingresa(1000);
    // Mi cuenta corriente
    CuentaCorriente miCuentaCorriente = new CuentaCorriente(0.1, 0.05);
    miCuentaCorriente.ingresa(1000);
    // Mi cuenta a plazo fijo
    CuentaPlazoFijo miCuentaPlazoFijo = new CuentaPlazoFijo(12, 0.1);
    // Hacemos un ingreso
    miCuentaPlazoFijo.ingresa(1000);
    
    // Puedo sacar en el cajero porque tiene saldo
    CajeroAutomatico cajeroAutomatico = new CajeroAutomatico(miCuentaAhorro);
    cajeroAutomatico.retirada(100);
    // Y también de mi cuenta corriente
    cajeroAutomatico = new CajeroAutomatico(miCuentaCorriente);
    cajeroAutomatico.retirada(100);
    // Y de mi cuenta de plazo fijo
    cajeroAutomatico = new CajeroAutomatico(miCuentaPlazoFijo);
    cajeroAutomatico.retirada(100);
    
  }
}
