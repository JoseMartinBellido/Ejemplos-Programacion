package prog.ud07.juego;

/**
 * Personaje que no tiene habilidades de lucha pero si de curación
 */
public class Sanador extends Personaje {

  public Sanador(String nombre, int vidaInicial) {
    super(nombre, vidaInicial);
  }

  @Override
  public void recibirCuracion(int poder) {
    super.recibirCuracion(poder + poder / 3);
  }

  @Override
  public int getPoderCuracion() {
    // Si esta vivo
    if (estaVivo()) {
      return vida / 2;
    } else {
      return 0;
    }
  }

}
