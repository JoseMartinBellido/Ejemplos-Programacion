package prog.ud07.juego;

/**
 * Personaje guerrero. Tiene armadura y una de dos aramas (espada o maza)
 */
public class Guerrero extends PersonajeConArmadura {
  
  // Constantes
  // Arma espada
  public static final int ARMA_ESPADA = 0;
  // Arma maza
  public static final int ARMA_MAZA = 1;
  
  // Atributos
  // Arma
  protected int arma;

  public Guerrero(String nombre, int vidaInicial, boolean tieneArmadura, int arma) {
    super(nombre, vidaInicial, tieneArmadura);
    cambiaArma(arma);
  }

  @Override
  public void recibirCuracion(int poder) {
    super.recibirCuracion(poder * 2);
  }

  @Override
  public int getPoderAtaque() {
    // Si está vivo
    if (estaVivo()) {
      if (arma == ARMA_ESPADA) {
        return vida / 2;
      } else {
        return vida;
      }
    } else {
      return 0;
    }
  }

  public void cambiaArma(int arma) {
    // Si el arma no es legal
    if (arma != ARMA_ESPADA && arma != ARMA_MAZA) {
      // Lanzamos excepcion
      throw new IllegalArgumentException("El arma proporcionada no es ni espada ni maza");
    }
    // Almacenamos la nueva arma
    this.arma = arma;
  }
}
