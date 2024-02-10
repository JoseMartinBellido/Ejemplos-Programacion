package prog.gof.factorymethod.ejemplo04;

public class FactoriaBicicletas extends FactoriaVehiculo {

  @Override
  public Vehiculo fabrica() {
    return new Bicicleta();
  }

}
