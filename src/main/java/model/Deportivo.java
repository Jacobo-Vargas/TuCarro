package model;

import java.util.Objects;

public class Deportivo extends Vehiculo{
    private int numPasajeros;
    private int numPuertas;
    private float caballosFuerza;
    private int numBolsasAire;
    private float timeCienKM;

    public Deportivo(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios,
                     float velocidadMaxima, int cilindraje, Combustible combustible,float precio, int numPasajeros,
                     int numPuertas, float caballosFuerza, int numBolsasAire, float timeCienKM) throws Exception {
        super(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilindraje, combustible,precio);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.caballosFuerza = caballosFuerza;
        this.numBolsasAire = numBolsasAire;
        this.timeCienKM = timeCienKM;
    }
    public static Deportivo of(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios,
                               float velocidadMaxima, int cilindraje, Combustible combustible,float precio, int numPasajeros,
                               int numPuertas, float caballosFuerza, int numBolsasAire, float timeCienKM) throws Exception {
        if (Objects.requireNonNull(placa,"La placa no puede estar vacia").isEmpty()) {
            throw new Exception("Placa vehiculo");
        }
        if (estadoVehiculo == null) {
            throw  new Exception("Estado vehiculo");
        }
        if (Objects.requireNonNull(marca,"la marca no puede estar vacia").isEmpty()) {
            throw new Exception("la marca no pued estar vacia");
        }

        if (modelo < 1980 || modelo > 2023) {
            throw new Exception("verifique el modelo.");
        }
        if (cambios <= 3) {
            throw new Exception("El numero de cambios no puede ser menor a cero.");
        }
        if (velocidadMaxima <= 0){
            throw new Exception("La velocidad no puede ser menor o igual a cero.");
        }
        if (cilindraje <= 0){
            throw new Exception("El cilindraje no puede ser menos o igual a cero.");
        }
        if (combustible == null){
            throw new Exception("Debe proporcionar un tipo de combustible");
        }
        if(precio <= 0 ){
            throw new Exception("El precio debe ser mayor a cero.");
        }

        if(numPasajeros <= 0){
            throw new Exception("El numero de pasajeros es requerido");
        }
        if(numPuertas < 1){
            throw new Exception("el numero de puertas debe ser mayor a cero");
        }
        if(caballosFuerza <= 0){
            throw new Exception("Caballos de fuerza no puede ser igual a cero.");
        }
        if(numBolsasAire < 1){
            throw new Exception("Indique el numero de bolsas de aire");
        }
        if(timeCienKM <=0){
            throw new Exception("Tiempo de 100 km/h no puede ser menor a cero.");
        }
        return new Deportivo(placa,estadoVehiculo,marca,modelo,cambios,
        velocidadMaxima,cilindraje,combustible, precio, numPasajeros,
        numPuertas,caballosFuerza, numBolsasAire, timeCienKM);
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public float getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(float caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    public float getTimeCienKM() {
        return timeCienKM;
    }

    public void setTimeCienKM(float timeCienKM) {
        this.timeCienKM = timeCienKM;
    }
}
