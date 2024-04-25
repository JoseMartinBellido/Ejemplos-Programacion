package prog.ud07.juego;

/**
 * Un personaje
 */
public abstract class Personaje {

  // Atributos
  // Nombre
  protected String nombre;
  // Vida inicial
  protected int vidaInicial;
  // Vida actual
  protected int vida;
  
  public Personaje(String nombre, int vidaInicial) {
    if (nombre == null) {
      throw new NullPointerException("El nombre no puede ser null");
    }
    
    if (nombre.isBlank()) {
      throw new IllegalArgumentException("El nombre no puede estar vacío");
    }
    
    if (vidaInicial <= 0) {
      throw new IllegalArgumentException("La vida debe ser superior a cero");
    }
    
    this.nombre = nombre;
    this.vidaInicial = vidaInicial;
    this.vida = vidaInicial;
  }

  
  public void recibirAtaque(int letalidad) {
    // Si esta vivo
    if (estaVivo()) {
      // Pierde tanta vida como la letalidad
      vida = vida - letalidad;
    }
    // Si la vida ha pasado a ser negativa se ajusta a 0
    if (vida < 0) {
      vida = 0;
    }
  }
  
  public void recibirCuracion(int cantidad) {
    // Si esta vivo
    if (estaVivo()) {
      // 
      vida += cantidad;
    }
    // Si la vida se ha pasado de la inicial
    if (vida > vidaInicial) {
      // La ajustamos a la inicial
      vida = vidaInicial;
    }
  }
  
  public int getPoderAtaque() {
    return 0;
  }
  
  public int getPoderCuracion() {
    return 0;
  }
  
  public boolean estaVivo() {
    return vida > 0;
  }
  
  public int getVida() {
    return vida;
  }
}
