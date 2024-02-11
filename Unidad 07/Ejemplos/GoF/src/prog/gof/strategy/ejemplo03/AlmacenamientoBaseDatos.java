package prog.gof.strategy.ejemplo03;

public class AlmacenamientoBaseDatos implements Almacenamiento {
  
  // Constante
  private static final String TABLA = "CLIENTES";
  
  // Atributos
  private String url;
  
  public AlmacenamientoBaseDatos(String url) {
    this.url = url;
  }

  @Override
  public void guardar() {
    // Guarda los clientes en una base de datos
    System.out.printf("Guardando clientes en base de datos \"%s\", tabla=\"%s\"%n", url, TABLA);
  }

  @Override
  public void cargar() {
    // Carga los clientes desde una base de datos
    System.out.printf("Cargando clientes desde base de datos \"%s\", tabla=\"%s\"%n", url, TABLA);
  }

}
