package prog.unidad07.expresiones;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestExpresion {

  @Test
  void testLiteral3() {
    // Caso: Un solo literal con valor 3
    //       Se evalua
    // RE  : Debe valer 3
    
    Expresion expresion = new Literal(3);
    assertEquals(3, expresion.evaluar());
  }

  @Test
  void testCambioSignoMenos3() {
    // Caso: Un solo literal con valor -3 y se le calcula el cambio de signo
    //       Se evalua
    // RE  : Debe valer 3
    
    Expresion expresion = new CambioSigno(new Literal(-3));
    assertEquals(3, expresion.evaluar());
  }

  @Test
  void testValorAbsolutoMenos3() {
    // Caso: Un solo literal con valor -3 y se le calcula el valor absoluto
    //       Se evalua
    // RE  : Debe valer 3
    
    Expresion expresion = new ValorAbsoluto(new Literal(-3));
    assertEquals(3, expresion.evaluar());
  }

  @Test
  void testCompleja1() {
    // Caso: b ^ 2 - 4 * a * c, siendo a = 2, b = 3 y c = 4
    //       Se evalua
    // RE  : Debe valer -23
    
    Variable var1 = new Variable("a", 2);
    Variable var2 = new Variable("b", 3);
    Variable var3 = new Variable("c", 4);
    
    Expresion expresion = new Resta(new Potencia(var2, new Literal(2)), new Producto(new Producto(new Literal(4), var1), var3));
    assertEquals(-23, expresion.evaluar());
  }

}
