package org.example;

import java.util.Date;

public class Motos extends Vehiculo{

    public Motos(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilinbraje, int numeroPasajeros, int numeroPuertas, String tipoCombustible) throws Exception {
        super(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilinbraje, numeroPasajeros, numeroPuertas);
    }
}
