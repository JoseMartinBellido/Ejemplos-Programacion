package prog.ud07.juego;

/**
 * Personaje que tiene armadura
 */
public abstract class PersonajeConArmadura extends Personaje {
  
  // Atributos
  // Tiene armadura?
  protected boolean tieneArmadura;


  public PersonajeConArmadura(String nombre, int vidaInicial, boolean tieneArmadura) {
    super(nombre, vidaInicial);
    this.tieneArmadura = tieneArmadura;
  }

  @Override
  public void recibirAtaque(int letalidad) {
    // Si tiene armadura
    if (tieneArmadura) {
      // La pierda
      tieneArmadura = false;
      // Y pierde tanta vida como la mitad de la letalidad
      super.recibirAtaque(letalidad / 2);
    } else {
      // Si no tiene armadura pierde tanta vida como la letalidad
      super.recibirAtaque(letalidad);
    }
  }

  public void tomarArmadura() {
    tieneArmadura = true;
  }


  public boolean tieneArmadura() {
    return tieneArmadura;
  }
}
