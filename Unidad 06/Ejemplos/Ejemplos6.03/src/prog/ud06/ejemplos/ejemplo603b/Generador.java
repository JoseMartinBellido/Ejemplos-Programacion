package prog.ud06.ejemplos.ejemplo603b;

import java.util.Locale;
import java.util.Random;

public class Generador {

  public static void main(String[] args) {
    Random random = new Random();
    System.out.print("{");
    random.doubles(31).forEach((n) -> System.out.printf(Locale.US, "%.2f,", 20 * n));
    System.out.println("}");
  }

}
