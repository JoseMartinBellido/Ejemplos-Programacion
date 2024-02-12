package prog.gof.singleton;

public class PruebaSingleton {

  public static void main(String[] args) {
    // Obtiene la instancia del singleton
    // Esto está prohibido
    //ClaseSingleton sing1 = new ClaseSingleton();
    // Hay que usar esto
    ClaseSingleton sing1 = ClaseSingleton.getInstancia();
    // Obtenemos otra instancia
    ClaseSingleton sing2 = ClaseSingleton.getInstancia();
    
    // Las dos instancias son iguales (porque son el mismo objeto)
    System.out.printf("¿Las dos instancias son iguales?: %s%n", sing1 == sing2 ? "si" : "no");
  }

}
