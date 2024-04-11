package pog.ud07.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    
    List<Integer> listaOriginal = new ArrayList<>();
    
    listaOriginal.add(10);
    listaOriginal.add(5);
    listaOriginal.add(20);
    listaOriginal.add(30);
    listaOriginal.add(1);
    listaOriginal.add(50);
    List<Integer> filtrada = new ArrayList<>();
    filtrada = listaOriginal.removeIf((a) -> a <= 10);
    
    / Imprimimos la lista
  }
}
