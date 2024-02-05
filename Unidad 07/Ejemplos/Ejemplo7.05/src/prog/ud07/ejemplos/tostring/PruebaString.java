package prog.ud07.ejemplos.tostring;

public class PruebaString {

  public static void main(String[] args) {
    Persona alumno = new Alumno("De Basica, Gustavo", 22, "667HG");
    Persona profesor = new Profesor("Gustavin, Manolin", 43, "Historia");
    
    System.out.println(alumno);
    System.out.println(profesor);
  }

}
