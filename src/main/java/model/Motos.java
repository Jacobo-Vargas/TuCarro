package model;

public class Motos extends Vehiculo{

    public Motos(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios,
                 float velocidadMaxima, int cilinbraje, float precioVehiculo, Combustible combustible) throws Exception {
        super(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilinbraje, precioVehiculo, combustible);
    }
}
