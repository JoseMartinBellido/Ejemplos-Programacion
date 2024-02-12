package prog.gof.visitor.ejemplo02;

public class Main {

  public static void main(String[] args) {
    // Crea la coleccion
    Coleccion coleccion = new Coleccion();
    
    // Añade algunos títulos
    coleccion.addColeccionable(new Libro(25.35, "La Odisea", "Homero", -200));
    coleccion.addColeccionable(new Libro(32.99, "Ulises", "James Joyce", 1922));
    coleccion.addColeccionable(new CDMusica(19.99, "Grandes éxitos", "Antonio Machin", 1982, 12, 65));
    coleccion.addColeccionable(new CDMusica(22.00, "Back in Black", "AC/DC", 1980, 10, 43));
    coleccion.addColeccionable(new DVDVideo(35.99, "La Jungla de Cristal", "John McTiernan", 1988, "EEUU", 131));
    coleccion.addColeccionable(new DVDVideo(19.95, "La naranja mecánica", "Stanley Kubrick", 1971, "UK", 136));
    
    // Imprime el listado
    System.out.println("Listado de todos los elementos");
    
    coleccion.acepta(new VisitadorColeccion() {
      
      @Override
      public void visita(DVDVideo dvd) {
        System.out.printf("DVD de video: %s, Director: %s, Año de Publicación: %d, Nacionalidad: %s, Duración total en minutos: %d%n", dvd.getTitulo(), dvd.getDirector(), dvd.getAnyoPublicacion(), dvd.getNacionalidad(), dvd.getDuracion());
      }
      
      @Override
      public void visita(CDMusica cd) {
        System.out.printf("CD de música: %s, Autor: %s, Año de Publicación: %d, Número de canciones: %d, Duración total en minutos: %d%n", cd.getTitulo(), cd.getAutor(), cd.getAnyoPublicacion(), cd.getNumCanciones(), cd.getDuracion());
      }
      
      @Override
      public void visita(Libro libro) {
        System.out.printf("Libro: %s, Autor: %s, Año de Publicación: %d%n", libro.getTitulo(), libro.getAutor(), libro.getAnyoPublicacion());
      }
    });
    
    // Imprime el coste total
    VisitadorColeccionPrecioTotal visitadorPrecio = new VisitadorColeccionPrecioTotal();
    coleccion.acepta(visitadorPrecio);
    System.out.printf("El coste total de la coleccion es de %1.2f euros%n", visitadorPrecio.getTotal());
  }

}
