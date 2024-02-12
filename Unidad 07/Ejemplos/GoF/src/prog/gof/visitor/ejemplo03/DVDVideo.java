package prog.gof.visitor.ejemplo03;

/**
 * DVD de Video
 */
public class DVDVideo extends Coleccionable {
  // Atributos
  // Titulo
  private String titulo;
  // Director
  private String director;
  // Año de publicacion
  private int anyoPublicacion;
  // Nacionalidad
  private String nacionalidad;
  // Duracion total (en minutos)
  private int duracion;

  public DVDVideo(double precio, String titulo, String director, int anyoPublicacion,
      String nacionalidad, int duracion) {
    super(precio);
    this.titulo = titulo;
    this.director = director;
    this.anyoPublicacion = anyoPublicacion;
    this.nacionalidad = nacionalidad;
    this.duracion = duracion;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getDirector() {
    return director;
  }

  public int getAnyoPublicacion() {
    return anyoPublicacion;
  }

  public String getNacionalidad() {
    return nacionalidad;
  }

  public int getDuracion() {
    return duracion;
  }

  @Override
  public void acepta(VisitadorColeccion visitador) {
    visitador.visita(this);
  }
}
