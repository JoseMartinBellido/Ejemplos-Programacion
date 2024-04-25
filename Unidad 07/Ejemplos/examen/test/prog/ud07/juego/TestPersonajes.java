package prog.ud07.juego;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestPersonajes {

  @Test
  void testPrueba1() {
    Guerrero guerrero = new Guerrero("Mordor", 100, true, Guerrero.ARMA_ESPADA);
    guerrero.recibirCuracion(10);
    assertTrue(guerrero.estaVivo());
    assertTrue(guerrero.tieneArmadura());
    assertEquals(100,  guerrero.getVida());
    assertEquals(50, guerrero.getPoderAtaque());
    assertEquals(0, guerrero.getPoderCuracion());
  }

  @Test
  void testPrueba2() {
    Guerrero guerrero = new Guerrero("Mordor", 100, false, Guerrero.ARMA_ESPADA);
    guerrero.recibirAtaque(50);
    
    assertTrue(guerrero.estaVivo());
    assertFalse(guerrero.tieneArmadura());
    assertEquals(50,  guerrero.getVida());
    assertEquals(25, guerrero.getPoderAtaque());
    assertEquals(0, guerrero.getPoderCuracion());
  }

  @Test
  void testPrueba3() {
    Guerrero guerrero = new Guerrero("Mordor", 100, true, Guerrero.ARMA_ESPADA);
    guerrero.recibirAtaque(200);
    
    assertFalse(guerrero.estaVivo());
    assertFalse(guerrero.tieneArmadura());
    assertEquals(0,  guerrero.getVida());
    assertEquals(0, guerrero.getPoderAtaque());
    assertEquals(0, guerrero.getPoderCuracion());
  }

  @Test
  void testPrueba4() {
    Guerrero guerrero = new Guerrero("Mordor", 100, false, Guerrero.ARMA_MAZA);
    guerrero.recibirAtaque(50);
    guerrero.recibirCuracion(10);

    assertTrue(guerrero.estaVivo());
    assertFalse(guerrero.tieneArmadura());
    assertEquals(70,  guerrero.getVida());
    assertEquals(70, guerrero.getPoderAtaque());
    assertEquals(0, guerrero.getPoderCuracion());
  }

  @Test
  void testPrueba5() {
    Arquero arquero = new Arquero("Legolas", 100, false, Arquero.NIVEL_MEDIO);
    arquero.recibirAtaque(50);
    arquero.recibirCuracion(60);

    assertTrue(arquero.estaVivo());
    assertFalse(arquero.tieneArmadura());
    assertEquals(100,  arquero.getVida());
    assertEquals(33, arquero.getPoderAtaque());
    assertEquals(0, arquero.getPoderCuracion());
  }

  @Test
  void testPrueba6() {
    Arquero arquero = new Arquero("Legolas", 100, true, Arquero.NIVEL_NOVATO);
    arquero.recibirAtaque(50);

    assertTrue(arquero.estaVivo());
    assertFalse(arquero.tieneArmadura());
    assertEquals(75,  arquero.getVida());
    assertEquals(15, arquero.getPoderAtaque());
    assertEquals(0, arquero.getPoderCuracion());
  }

  @Test
  void testPrueba7() {
    Arquero arquero = new Arquero("Legolas", 100, true, Arquero.NIVEL_NOVATO);
    arquero.recibirAtaque(50);
    arquero.tomarArmadura();
    arquero.recibirAtaque(50);

    assertTrue(arquero.estaVivo());
    assertFalse(arquero.tieneArmadura());
    assertEquals(50,  arquero.getVida());
    assertEquals(10, arquero.getPoderAtaque());
    assertEquals(0, arquero.getPoderCuracion());
  }

  @Test
  void testPrueba8() {
    Arquero arquero = new Arquero("Legolas", 100, true, Arquero.NIVEL_NOVATO);
    arquero.recibirAtaque(50);

    assertTrue(arquero.estaVivo());
    assertFalse(arquero.tieneArmadura());
    assertEquals(75,  arquero.getVida());
    assertEquals(15, arquero.getPoderAtaque());
    assertEquals(0, arquero.getPoderCuracion());
  }

  @Test
  void testPrueba9() {
    Sanador sanador = new Sanador("Sanitol", 100);
    sanador.recibirAtaque(200);

    assertFalse(sanador.estaVivo());
    assertEquals(0,  sanador.getVida());
    assertEquals(0, sanador.getPoderAtaque());
    assertEquals(0, sanador.getPoderCuracion());
  }

  @Test
  void testPrueba10() {
    Sanador sanador = new Sanador("Sanitol", 100);
    sanador.recibirAtaque(50);
    sanador.recibirAtaque(50);

    assertFalse(sanador.estaVivo());
    assertEquals(0,  sanador.getVida());
    assertEquals(0, sanador.getPoderAtaque());
    assertEquals(0, sanador.getPoderCuracion());
  }

  @Test
  void testPrueba11() {
    Sanador sanador = new Sanador("Sanitol", 100);
    sanador.recibirCuracion(10);

    assertTrue(sanador.estaVivo());
    assertEquals(100,  sanador.getVida());
    assertEquals(0, sanador.getPoderAtaque());
    assertEquals(50, sanador.getPoderCuracion());
  }

  @Test
  void testPrueba12() {
    Sanador sanador = new Sanador("Sanitol", 100);
    sanador.recibirAtaque(50);
    sanador.recibirCuracion(10);

    assertTrue(sanador.estaVivo());
    assertEquals(63,  sanador.getVida());
    assertEquals(0, sanador.getPoderAtaque());
    assertEquals(31, sanador.getPoderCuracion());
  }

  @Test
  void testPrueba13() {
    Sacerdote sacerdote = new Sacerdote("Baal", 100, true);
    sacerdote.recibirAtaque(200);

    assertTrue(sacerdote.estaVivo());
    assertFalse(sacerdote.tieneReliquia());
    assertEquals(100,  sacerdote.getVida());
    assertEquals(0, sacerdote.getPoderAtaque());
    assertEquals(50, sacerdote.getPoderCuracion());
  }

  @Test
  void testPrueba14() {
    Sacerdote sacerdote = new Sacerdote("Baal", 100, false);
    sacerdote.recibirAtaque(200);
    sacerdote.recibirCuracion(50);
    
    assertFalse(sacerdote.estaVivo());
    assertFalse(sacerdote.tieneReliquia());
    assertEquals(0,  sacerdote.getVida());
    assertEquals(0, sacerdote.getPoderAtaque());
    assertEquals(0, sacerdote.getPoderCuracion());
  }

  @Test
  void testPrueba15() {
    Sacerdote sacerdote = new Sacerdote("Baal", 100, false);
    sacerdote.recibirAtaque(50);
    
    assertTrue(sacerdote.estaVivo());
    assertFalse(sacerdote.tieneReliquia());
    assertEquals(50,  sacerdote.getVida());
    assertEquals(0, sacerdote.getPoderAtaque());
    assertEquals(25, sacerdote.getPoderCuracion());
  }

  @Test
  void testPrueba16() {
    Sacerdote sacerdote = new Sacerdote("Baal", 100, true);
    sacerdote.recibirAtaque(200);
    
    assertTrue(sacerdote.estaVivo());
    assertFalse(sacerdote.tieneReliquia());
    assertEquals(100,  sacerdote.getVida());
    assertEquals(0, sacerdote.getPoderAtaque());
    assertEquals(50, sacerdote.getPoderCuracion());
  }

}
