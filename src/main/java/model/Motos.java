package model;

public class Motos extends Vehiculo{

    public Motos(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilinbraje, Combustible combustible, float precio) throws Exception {
        super(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilinbraje, combustible, precio);
    }
    public static Motos of(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilinbraje, Combustible combustible, float precio)throws Exception{
        return new Motos(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilinbraje, combustible, precio);
    }
}
