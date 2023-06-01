package model;

import java.util.Objects;

public class Camiones extends Vehiculo{
    private AireAcondicionado aire;
    private float capacidadCarga;
    private ABS abs;
    private int numeroEjes;
    private int numSalidasEmergencia;
    private FrenoAire frenoAire;
    private TipoCamion tipoCamion;


    public Camiones(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilinbraje, Combustible combustible, float precio, AireAcondicionado aire, float capacidadCarga, ABS abs, int numeroEjes, int numSalidasEmergencia, FrenoAire frenoAire, TipoCamion tipoCamion) throws Exception {
        super(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilinbraje, combustible, precio);
        this.aire = aire;
        this.capacidadCarga = capacidadCarga;
        this.abs = abs;
        this.numeroEjes = numeroEjes;
        this.numSalidasEmergencia = numSalidasEmergencia;
        this.frenoAire = frenoAire;
        this.tipoCamion = tipoCamion;
    }

    public static Camiones of (String placa,EstadoVehiculo estadoVehiculo,String marca, int modelo, int cambios, float velocidadMaxima, int cilindraje, Combustible combustible,float precio, AireAcondicionado aire, float capacidadCarga, ABS abs, int numeroEjes, int numSalidasEmergencia, FrenoAire frenoAire, TipoCamion tipoCamion)throws Exception{
        if (aire == null) {
            throw new Exception("La información del aire acondicionado es requerida");
        }
        if (capacidadCarga <= 0) {
            throw new Exception("La capacidad de carga debe ser mayor a cero");
        }
        if (abs == null) {
            throw new Exception("La información de ABS es requerida");
        }
        if (numeroEjes <= 0) {
            throw new Exception("El número de ejes debe ser mayor a cero");
        }
        if (numSalidasEmergencia <= 0) {
            throw new Exception("El número de salidas de emergencia debe ser mayor a cero");
        }
        if (frenoAire == null) {
            throw new Exception("La información del freno de aire es requerida");
        }
        if (tipoCamion == null) {
            throw new Exception("El tipo de camión es requerido");
        }
        return new Camiones(placa,estadoVehiculo,marca,modelo,cambios,velocidadMaxima,cambios,combustible,precio,aire,capacidadCarga,abs,numeroEjes,numSalidasEmergencia,frenoAire,tipoCamion);
    }



    public AireAcondicionado getAire() {
        return aire;
    }

    public void setAire(AireAcondicionado aire) {
        this.aire = aire;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
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

    public FrenoAire getFrenoAire() {
        return frenoAire;
    }

    public void setFrenoAire(FrenoAire frenoAire) {
        this.frenoAire = frenoAire;
    }

    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }
}
