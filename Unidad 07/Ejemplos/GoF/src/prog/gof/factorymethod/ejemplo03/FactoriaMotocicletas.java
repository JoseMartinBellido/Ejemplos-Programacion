package prog.gof.factorymethod.ejemplo03;

public class FactoriaMotocicletas extends FactoriaVehiculo {

  @Override
  public Vehiculo fabrica() {
    return new Motocicleta();
  }

}
