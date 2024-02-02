package prog.ud07.ejemplo01;

public class PruebaClaseAbstractaSimple {

  public static void main(String[] args) {
    // Esta línea está comentada porque no compila
    // Ya que de la clase abstracta no se pueden crear instancias
    //ClaseAbstractaSimple objeto = new ClaseAbstractaSimple();
    // Esta si funciona porque la clase que hereda no es abstracta
    ClaseHeredaDeClaseAbstractaSimple objeto = new ClaseHeredaDeClaseAbstractaSimple("Pepe", 10);
    System.out.printf("Nombre: %s%n", objeto.getNombre());
    // Esto también funciona porque se pueden asignar referencias a una subclase a variables de la
    // superclase
    ClaseAbstractaSimple objeto2 = new ClaseHeredaDeClaseAbstractaSimple("Loli", 54);
    System.out.printf("Nombre: %s%n", objeto2.getNombre());
  }

}
