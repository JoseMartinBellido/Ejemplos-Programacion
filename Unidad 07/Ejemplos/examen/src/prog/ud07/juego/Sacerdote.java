package prog.ud07.juego;

/**
 * Personaje que cura y puede poseer una reliquia que le da poderes
 */
public class Sacerdote extends Personaje {

  // Atributos
  // Tiene reliquia?
  protected boolean tieneReliquia;
  
  public Sacerdote(String nombre, int vidaInicial, boolean tieneReliquia) {
    super(nombre, vidaInicial);
    this.tieneReliquia = tieneReliquia;
  }

  @Override
  public void recibirAtaque(int letalidad) {
    // Si tiene reliquia
    if (tieneReliquia) {
      tieneReliquia = false;
    } else {
      super.recibirAtaque(letalidad);
    }
  }

  @Override
  public void recibirCuracion(int poder) {
    // Si tiene la reliquia
    if (tieneReliquia) {
      super.recibirCuracion(poder + poder / 2);
    } else {
      super.recibirCuracion(poder);
    }
  }

  @Override
  public int getPoderCuracion() {
    // Si esta vivo
    if (estaVivo()) {
      if (tieneReliquia) {
        return vida;
      } else {
        return vida / 2;
      }
    } else {
      return 0;
    }
  }
  
  public boolean tieneReliquia() {
    return tieneReliquia;
  }

}
