package prog.ud06.ejemplos.ejemplo606b;

import java.util.Random;

public class UsaGuardaParGenerico {

  public static void main(String[] args) {
    // Primer objeto del par
    Integer primero = 1;
    // Segundo objeto del par
    Double segundo = 2.0;
    
    // Creamos el par con los dos números
    GuardaPar<Integer,Double> par = new GuardaPar<>(primero, segundo);
    
    // Hacemos más cosas
    
    // Intentamos recuperar el primer objeto
    // Linea correcta
    Integer otroPrimero = par.getPrimerObjeto();

    // Intentamos recuperar el segundo objeto
    // Linea correcta
    Double otroSegundo = par.getSegundoObjeto();
    
    // Creamos otro par con otros dos tipos
    GuardaPar<String, Integer> otroPar = new GuardaPar<>("primero", 2);

    // Intentamos recuperar el primer objeto
    // Linea correcta
    String otroPrimeroMas = otroPar.getPrimerObjeto();

    // Intentamos recuperar el segundo objeto
    // Linea correcta
    Integer otroSegundoMas = otroPar.getSegundoObjeto();
  }
}