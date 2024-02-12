package prog.gof.visitor.ejemplo01;

/**
 * CD de Musica
 */
public class CDMusica extends Coleccionable {
  
  // Atributos
  // Titulo
  private String titulo;
  // Autor
  private String autor;
  // Año de publicacion
  private int anyoPublicacion;
  // Número de canciones
  private int numCanciones;
  // Duracion del CD (en minutos)
  private int duracion;

  public CDMusica(double precio, String titulo, String autor, int anyoPublicacion, int numCanciones,
      int duracion) {
    super(precio);
    this.titulo = titulo;
    this.autor = autor;
    this.anyoPublicacion = anyoPublicacion;
    this.numCanciones = numCanciones;
    this.duracion = duracion;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getAnyoPublicacion() {
    return anyoPublicacion;
  }

  public int getNumCanciones() {
    return numCanciones;
  }

  public int getDuracion() {
    return duracion;
  }
  
  
}
