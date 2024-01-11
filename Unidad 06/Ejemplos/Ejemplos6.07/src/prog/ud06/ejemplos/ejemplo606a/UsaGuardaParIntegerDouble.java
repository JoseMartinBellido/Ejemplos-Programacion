package prog.ud06.ejemplos.ejemplo606a;

import java.util.Random;

public class UsaGuardaParIntegerDouble {

  public static void main(String[] args) {
    // Primer objeto del par
    Integer primero = 1;
    // Segundo objeto del par
    Double segundo = 2.0;
    
    // Creamos el par con los dos números
    GuardaParIntegerDouble par = new GuardaParIntegerDouble(primero, segundo);
    
    // Hacemos más cosas
    
    // Intentamos recuperar el primer objeto
    // Linea correcta
    Integer otroPrimero = par.getPrimerObjeto();
    // Linea correcta
    //Integer otroPrimero = (Integer)par.getPrimerObjeto();
    // Linea que dará error en ejecución
    //Integer otroPrimero = par.getSegundoObjeto();
    
  }
}