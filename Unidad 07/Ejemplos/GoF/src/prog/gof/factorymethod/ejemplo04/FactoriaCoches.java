package prog.gof.factorymethod.ejemplo04;

public class FactoriaCoches extends FactoriaVehiculo {

  @Override
  public Vehiculo fabrica() {
    return new Coche();
  }

}
