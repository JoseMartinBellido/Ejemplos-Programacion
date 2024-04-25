package prog.ud07.juego;

/**
 * Un arquero tiene armadura y maneja un arco con uno de tres niveles de habilidad: Novato, medio
 *   y experto
 */
public class Arquero extends PersonajeConArmadura {
  
  // Constantes
  // Nivel novato
  public static final int NIVEL_NOVATO = 0;
  // Nivel medio
  public static final int NIVEL_MEDIO = 1;
  // Nivel experto
  public static final int NIVEL_EXPERTO = 2;
  
  // Atributos
  // Nivel
  protected int nivel;

  public Arquero(String nombre, int vidaInicial, boolean tieneArmadura, int nivel) {
    super(nombre, vidaInicial, tieneArmadura);
    cambiaNivel(nivel);
  }

  @Override
  public int getPoderAtaque() {
    // Si está vivo
    if (estaVivo()) {
      // Si es novato
      if (nivel == NIVEL_NOVATO) {
        return vida / 5;
      } else if (nivel == NIVEL_MEDIO) {
        return vida / 3;
      } else {
        return vida / 2;
      }
    }
    else {
      return 0;
    }
  }

  public void subeNivel() {
    if (nivel == NIVEL_NOVATO) {
      nivel = NIVEL_MEDIO;
    } else if (nivel == NIVEL_MEDIO) {
      nivel = NIVEL_EXPERTO;
    }
  }

  protected void cambiaNivel(int nivel) {
    // Si el nivel no es legal
    if (nivel != NIVEL_NOVATO && nivel != NIVEL_MEDIO && nivel != NIVEL_EXPERTO) {
      // Lanzamos excepcion
      throw new IllegalArgumentException("El nivel proporcionado no es ni novato ni medio ni experto");
    }
    // Almacenamos el nuevo nivel
    this.nivel = nivel;
  }
}
