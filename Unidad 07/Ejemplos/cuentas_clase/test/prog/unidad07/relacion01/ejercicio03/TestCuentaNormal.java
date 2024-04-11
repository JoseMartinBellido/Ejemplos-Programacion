package prog.unidad07.relacion01.ejercicio03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCuentaNormal {

  @Test
  void testNuevaSaldoCero() {
    Cuenta cuenta = new CuentaNormal();
    assertEquals(0, cuenta.getSaldo());
  }

  @Test
  void testNuevaActualizaSaldoCero() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.actualizacionMensual();
    assertEquals(0, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresa() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(90);
    assertEquals(90, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresaActualiza() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(90);
    cuenta.actualizacionMensual();
    assertEquals(81, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresaCien() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(100);
    assertEquals(100, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresaCienActualiza() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(100);
    cuenta.actualizacionMensual();
    assertEquals(90, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresaCientoDiez() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(110);
    assertEquals(110, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresaCientoDiezActualiza() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(110);
    cuenta.actualizacionMensual();
    assertEquals(100, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresaDoscientos() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(200);
    assertEquals(200, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresaDoscientosActualiza() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(200);
    cuenta.actualizacionMensual();
    assertEquals(190, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresaDoscientosRetira50() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(200);
    cuenta.retirada(50);
    assertEquals(150, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresaDoscientosRetira50Actualiza() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(200);
    cuenta.retirada(50);
    cuenta.actualizacionMensual();
    assertEquals(130, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresaSeiscientosRetira50() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(600);
    cuenta.retirada(50);
    assertEquals(550, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresaSeiscientosRetira50Actualiza() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(600);
    cuenta.retirada(50);
    cuenta.actualizacionMensual();
    assertEquals(540, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresa550Retira50() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(550);
    cuenta.retirada(50);
    assertEquals(500, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresa550Retira50Actualiza() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(550);
    cuenta.retirada(50);
    cuenta.actualizacionMensual();
    assertEquals(490, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresa549Retira50() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(549);
    cuenta.retirada(50);
    assertEquals(499, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresa549Retira50Actualiza() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(549);
    cuenta.retirada(50);
    cuenta.actualizacionMensual();
    assertEquals(479, cuenta.getSaldo());
  }

  @Test
  void testNuevaIngresa500Retira501() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(500);
    assertThrows(IllegalArgumentException.class, () -> cuenta.retirada(501));
  }

  @Test
  void testComplejo() {
    Cuenta cuenta = new CuentaNormal();
    cuenta.ingreso(1200);
    cuenta.retirada(259.88);
    cuenta.retirada(94.8);
    cuenta.actualizacionMensual();
    cuenta.ingreso(1200);
    cuenta.retirada(372.08);
    cuenta.retirada(659.14);
    cuenta.retirada(388.66);
    cuenta.actualizacionMensual();
    cuenta.ingreso(1200);
    cuenta.retirada(412.56);
    cuenta.retirada(30.09);
    cuenta.actualizacionMensual();
    assertEquals(1352.79, cuenta.getSaldo());
  }

  
}
