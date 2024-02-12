package prog.gof.visitor.ejemplo01;

import java.util.HashSet;
import java.util.Set;

/**
 * Coleccion
 */
public class Coleccion {

  // Atibutos
  // Coleccion
  Set<Coleccionable> coleccion;
  
  public Coleccion() {
    coleccion = new HashSet<>();
  }
  
  public void addColeccionable(Coleccionable coleccionable) {
    coleccion.add(coleccionable);
  }
  
  public void listado() {
    for (Coleccionable objeto: coleccion) {
      if (objeto instanceof Libro) {
        Libro libro = (Libro)objeto;
        System.out.printf("Libro: %s, Autor: %s, Año de Publicación: %d%n", libro.getTitulo(), libro.getAutor(), libro.getAnyoPublicacion());
      } else if (objeto instanceof CDMusica) {
        CDMusica cd = (CDMusica)objeto;
        System.out.printf("CD de música: %s, Autor: %s, Año de Publicación: %d, Número de canciones: %d, Duración total en minutos: %d%n", cd.getTitulo(), cd.getAutor(), cd.getAnyoPublicacion(), cd.getNumCanciones(), cd.getDuracion());
      } else {
        DVDVideo dvd = (DVDVideo)objeto;
        System.out.printf("DVD de video: %s, Director: %s, Año de Publicación: %d, Nacionalidad: %s, Duración total en minutos: %d%n", dvd.getTitulo(), dvd.getDirector(), dvd.getAnyoPublicacion(), dvd.getNacionalidad(), dvd.getDuracion());
      }
    }
  }
  
  public double precioTotal() {
    double total = 0;
    
    for (Coleccionable objeto: coleccion) {
      total += objeto.getPrecio();
    }
    return total;
  }
}
