package model;

import java.util.Objects;

public class PickUps extends Vehiculo{
    private int numPasajeros;
    private int numPuertas;
    private AireAcondicionado aire;
    private CamaraReversa camReversa;
    private float capacidadCarga;
    private int numBolsasAire;
    private ABS abs;
    private CuatroPorCuatro cuatroPorCuatro;

    public PickUps(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilindraje, Combustible combustible, float precio, int numPasajeros, int numPuertas, AireAcondicionado aire, CamaraReversa camReversa, float capacidadCarga, int numBolsasAire, ABS abs, CuatroPorCuatro cuatroPorCuatro) {
        super(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilindraje, combustible, precio);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.aire = aire;
        this.camReversa = camReversa;
        this.capacidadCarga = capacidadCarga;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.cuatroPorCuatro = cuatroPorCuatro;
    }

    public static PickUps of(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilindraje,
                                Combustible combustible,float precio, int numPasajeros, int numPuertas, AireAcondicionado aire, CamaraReversa camReversa,
                                float capacidadCarga, int numBolsasAire, ABS abs, CuatroPorCuatro cuatroPorCuatro) throws Exception {
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

        if(numPasajeros <=0 ){
            throw new Exception("Numero de pasajeros debe ser mayor a cero.");
        }
        if(numPuertas <=0 ){
            throw new Exception("Numero de puertas debe ser mayor a cero.");
        }
        if (aire == null) {
            throw new Exception("La información del aire acondicionado es requerida.");
        }
        if(camReversa == null){
            throw new Exception("Indique si tiene camara de reversa.");
        }
        if(capacidadCarga < 1){
            throw new Exception("Indique la capacidad del maletero.");
        }
        if(numBolsasAire < 1){
            throw new Exception("Indique el numero de bolsas de aire.");
        }
        if(abs == null){
            throw new Exception("Indique si tiene sistemas de ABS.");
        }
        if(cuatroPorCuatro == null){
            throw new Exception("Indique si es 4X4.");
        }

        return new PickUps(placa,estadoVehiculo,marca, modelo, cambios, velocidadMaxima, cilindraje,combustible,precio,numPasajeros, numPuertas,
                aire,camReversa, capacidadCarga,numBolsasAire, abs,cuatroPorCuatro);
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

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
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

    public CuatroPorCuatro getCuatroPorCuatro() {
        return cuatroPorCuatro;
    }

}
