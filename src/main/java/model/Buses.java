package model;

import java.util.Objects;

public class Buses extends Vehiculo {
    private int numPasajeros;
    private int numPuertas;
    private AireAcondicionado aire;
    private CamaraReversa camReversa;
    private float capacidadMaletero;
    private int numBolsasAire;
    private ABS abs;
    private int numeroEjes;
    private int numSalidasEmergencia;

    public Buses(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilindraje, Combustible combustible, float precio,String vendedor,Disponibilidad disponibilidad, int numPasajeros, int numPuertas, AireAcondicionado aire, CamaraReversa camReversa, float capacidadMaletero, int numBolsasAire, ABS abs, int numeroEjes, int numSalidasEmergencia) throws Exception {
        super(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilindraje, combustible, precio,vendedor,disponibilidad);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.aire = aire;
        this.camReversa = camReversa;
        this.capacidadMaletero = capacidadMaletero;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.numeroEjes = numeroEjes;
        this.numSalidasEmergencia = numSalidasEmergencia;
    }

    public static Buses of(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilindraje, Combustible combustible, float precio,String vendedor,Disponibilidad disponibilidad, int numPasajeros, int numPuertas, AireAcondicionado aire, CamaraReversa camReversa, float capacidadMaletero, int numBolsasAire, ABS abs, int numeroEjes, int numSalidasEmergencia) throws Exception {
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
        if(Objects.requireNonNull(vendedor,"Debe ingresar el vendedor").isEmpty()){
            throw new Exception("Debe ingresar el vendedor");
        }
        if(disponibilidad == null){
            throw new Exception("Disponibilidad requerida");
        }
        if(numPasajeros <= 0){
            throw new Exception("El numero de pasajeros es requerido");
        }
        if(numPuertas < 1){
            throw new Exception("el numero de puertas debe ser mayor a cero");
        }
        if(aire == null){
            throw new Exception("Indique si tiene aire acondicionado");
        }
        if(camReversa == null){
            throw new Exception("Indique si tiene camara de reversa");
        }
        if(capacidadMaletero < 1){
            throw new Exception("Indique la capacidad del maletero");
        }
        if(numBolsasAire < 1){
            throw new Exception("Indique el numero de bolsas de aire");
        }
        if(abs == null){
            throw new Exception("Indique si tiene sistemas de ABS");
        }
        if(numeroEjes < 1 || numeroEjes > 5){
            throw new Exception("Indique un numero de ejes valido");
        }
        if(numSalidasEmergencia < 1 || numSalidasEmergencia > 6){
            throw new Exception("Indique la capacidad del maletero");
        }

        return new Buses(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilindraje, combustible, precio,vendedor,disponibilidad, numPasajeros, numPuertas, aire, camReversa, capacidadMaletero, numBolsasAire, abs, numeroEjes, numSalidasEmergencia);
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

    public AireAcondicionado getAire() {
        return aire;
    }

    public void setAire(AireAcondicionado aire) {
        this.aire = aire;
    }

    public CamaraReversa getCamReversa() {
        return camReversa;
    }

    public void setCamReversa(CamaraReversa camReversa) {
        this.camReversa = camReversa;
    }

    public float getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(float capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    public ABS getAbs() {
        return abs;
    }

    public void setAbs(ABS abs) {
        this.abs = abs;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getNumSalidasEmergencia() {
        return numSalidasEmergencia;
    }

    public void setNumSalidasEmergencia(int numSalidasEmergencia) {
        this.numSalidasEmergencia = numSalidasEmergencia;
    }
}
