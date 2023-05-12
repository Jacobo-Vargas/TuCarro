package org.example;

public class Deportivo extends Vehiculo{
    private int numPasajeros;
    private int numPuertas;
    private float caballosFuerza;
    private int numBolsasAire;
    private float timeCienKM;


    public Deportivo(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilinbraje, int numeroPasajeros, int numeroPuertas, String tipoCombustible, int numPasajeros, int numPuertas, float caballosFuerza, int numBolsasAire, float timeCienKM) throws Exception {
        super(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilinbraje, numeroPasajeros, numeroPuertas);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.caballosFuerza = caballosFuerza;
        this.numBolsasAire = numBolsasAire;
        this.timeCienKM = timeCienKM;
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
