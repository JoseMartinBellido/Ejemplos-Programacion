package prog.ud07.ejemplo02;

import prog.ud07.ejemplo01.ClaseAbstractaSimple;
import prog.ud07.ejemplo01.ClaseHeredaDeClaseAbstractaSimple;

public class PruebaClaseAbstractaConMetodosAbstractos {

  public static void main(String[] args) {
    // Esta línea está comentada porque no compila
    // Ya que de la clase abstracta no se pueden crear instancias
    //ClaseAbstractaConMetodosAbstractos objeto = new ClaseAbstractaConMetodosAbstractos();
    // Esta si funciona porque la clase que hereda no es abstracta
    ClaseHeredaDeClaseAbstractaConMetodosAbtractos objeto = new ClaseHeredaDeClaseAbstractaConMetodosAbtractos("Pepe", 10);
    System.out.printf("Nombre: %s%n", objeto.getNombre());
    // Esto también funciona porque se pueden asignar referencias a una subclase a variables de la
    // superclase
    ClaseAbstractaConMetodosAbstractos objeto2 = new ClaseHeredaDeClaseAbstractaConMetodosAbtractos("Loli", 54);
    System.out.printf("Nombre: %s%n", objeto2.getNombre());
    // Podemos usar el método aCadena con ambos objetos porque ambos lo definen
    System.out.printf("Primero objeto a cadena: %s%n", objeto.aCadena());
    System.out.printf("Segundo objeto a cadena: %s%n", objeto2.aCadena());
    
  }

}
