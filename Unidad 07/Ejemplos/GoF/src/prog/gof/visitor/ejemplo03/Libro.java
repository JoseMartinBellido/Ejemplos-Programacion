package prog.gof.visitor.ejemplo03;

/**
 * Libro
 */
public class Libro extends Coleccionable {
  
  // Atributos
  // Titulo
  private String titulo;
  // Autor
  private String autor;
  // Año de publicación
  private int anyoPublicacion;

  public Libro(double precio, String titulo, String autor, int anyoPublicacion) {
    super(precio);
    this.titulo = titulo;
    this.autor = autor;
    this.anyoPublicacion = anyoPublicacion;
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

  @Override
  public void acepta(VisitadorColeccion visitador) {
    visitador.visita(this);
  }
  
}
