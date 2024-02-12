package prog.gof.visitor.ejemplo03;

public class VisitadorColeccionDuracionTotal implements VisitadorColeccion {

  // Atributos
  private int total;
  
  public VisitadorColeccionDuracionTotal() {
    total = 0;
  }
  
  @Override
  public void visita(Libro libro) {
    // Los libros no tienen duracion, por lo que no añade nada
  }

  @Override
  public void visita(CDMusica cd) {
    // Añade la duracion
    total += cd.getDuracion();
  }

  @Override
  public void visita(DVDVideo dvd) {
    // Añade la duracion
    total += dvd.getDuracion();
  }

  public int getTotal() {
    return total;
  }
}
