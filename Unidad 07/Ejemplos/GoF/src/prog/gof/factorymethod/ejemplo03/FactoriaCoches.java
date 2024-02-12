package prog.gof.factorymethod.ejemplo03;

public class FactoriaCoches extends FactoriaVehiculo {

  @Override
  public Vehiculo fabrica() {
    return new Coche();
  }

}
