package prog.gof.visitor.ejemplo03;

/**
 * Visitador de colección de coleccionables
 */
public interface VisitadorColeccion {

  void visita(Libro libro);
  
  void visita(CDMusica cd);
  
  void visita(DVDVideo dvd);
}
