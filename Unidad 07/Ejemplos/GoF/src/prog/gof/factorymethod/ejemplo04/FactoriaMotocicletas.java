package prog.gof.factorymethod.ejemplo04;

public class FactoriaMotocicletas extends FactoriaVehiculo {

  @Override
  public Vehiculo fabrica() {
    return new Motocicleta();
  }

}
