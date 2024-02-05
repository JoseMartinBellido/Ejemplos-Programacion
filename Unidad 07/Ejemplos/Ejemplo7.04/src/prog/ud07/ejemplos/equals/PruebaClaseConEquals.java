package prog.ud07.ejemplos.equals;

/**
 * Prueba nuestra clase con equals 
 */
public class PruebaClaseConEquals {

  public static void main(String[] args) {
    // Creamos objetos de la clase
    ClaseConEquals obj1 = new ClaseConEquals("Pepe", 25, 2100.54);
    ClaseConEquals obj2 = new ClaseConEquals("Pepe", 25, 2100.54);
    ClaseConEquals obj3 = new ClaseConEquals("Pepe", 25, 2100.54);
    ClaseConEquals obj4 = new ClaseConEquals("Paco", 25, 2100.54);
    ClaseConEquals obj5 = new ClaseConEquals("Pepe", 35, 2100.54);
    ClaseConEquals obj6 = new ClaseConEquals("Pepe", 25, 2100.55);
    
    // Todos los objetos deben ser iguales a si mismos
    assert obj1.equals(obj1);
    assert obj1.equals(obj1);
    assert obj3.equals(obj3);
    assert obj4.equals(obj4);
    assert obj5.equals(obj5);
    assert obj6.equals(obj6);
    
    // obj1, obj2 y obj3 deben ser iguales simetrica y transitivamente
    assert obj1.equals(obj2);
    assert obj2.equals(obj1);
    assert obj2.equals(obj3);
    assert obj3.equals(obj2);
    assert obj1.equals(obj3);
    assert obj3.equals(obj1);
    
    // obj1 debe ser distinto de 4, 5, 6
    assert !obj1.equals(obj4);
    assert !obj1.equals(obj5);
    assert !obj1.equals(obj6);
  }
}
