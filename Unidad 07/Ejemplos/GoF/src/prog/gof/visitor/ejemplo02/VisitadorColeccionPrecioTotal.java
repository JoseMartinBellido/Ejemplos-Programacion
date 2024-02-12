package prog.gof.visitor.ejemplo02;

public class VisitadorColeccionPrecioTotal implements VisitadorColeccion {
  
  // Atributos
  private double total;
  
  public VisitadorColeccionPrecioTotal() {
    total = 0;
  }

  @Override
  public void visita(Libro libro) {
    total += libro.getPrecio();
  }

  @Override
  public void visita(CDMusica cd) {
    total += cd.getPrecio();
  }

  @Override
  public void visita(DVDVideo dvd) {
    total += dvd.getPrecio();
  }

  
  public double getTotal() {
    return total;
  }
}
