package prog.gof.visitor.ejemplo02;

/**
 * Visitador de colección de coleccionables
 */
public interface VisitadorColeccion {

  void visita(Libro libro);
  
  void visita(CDMusica cd);
  
  void visita(DVDVideo dvd);
}
