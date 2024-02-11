package prog.gof.strategy.ejemplo03;

public class AlmacenamientoFichero implements Almacenamiento {
  
  // Atributos
  private String rutaArchivo;
  
  public AlmacenamientoFichero(String rutaArchivo) {
    this.rutaArchivo = rutaArchivo;
  }

  @Override
  public void guardar() {
    // Guarda los clientes en un fichero
    System.out.printf("Guardando clientes en fichero \"%s\"%n", rutaArchivo);
  }

  @Override
  public void cargar() {
    // Carga los clientes desde un fichero
    System.out.printf("Cargando clientes desde fichero \"%s\"%n", rutaArchivo);
  }

}
