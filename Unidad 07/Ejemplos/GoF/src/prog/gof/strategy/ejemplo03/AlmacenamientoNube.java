package prog.gof.strategy.ejemplo03;

public class AlmacenamientoNube implements Almacenamiento {

  // Atributos
  private String urlCargar;
  private String urlGuardar;
  
  public AlmacenamientoNube(String urlCargar, String urlGuardar) {
    this.urlCargar = urlCargar;
    this.urlGuardar = urlGuardar;
  }
  
  @Override
  public void guardar() {
    // Guarda los clientes en la nube
    System.out.printf("Guardando clientes en la nube en la dirección \"%s\"%n", urlGuardar);
  }

  @Override
  public void cargar() {
    // Carga los clientes desde la nube
    System.out.printf("Cargando clientes desde la nube en la dirección \"%s\"%n", urlCargar);
  }
}
