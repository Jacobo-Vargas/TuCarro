package model;

public class PickUps extends Vehiculo{
    private int numPasajeros;
    private int numPuertas;
    private AireAcondicionado aire;
    private CamaraReversa camReversa;
    private float capacidadCarga;
    private int numBolsasAire;
    private ABS abs;
    private boolean cuatroPorCuatro;

    public PickUps(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilinbraje, int numeroPasajeros, int numeroPuertas, int numPasajeros, int numPuertas, AireAcondicionado aire, CamaraReversa camReversa, float capacidadCarga, int numBolsasAire, ABS abs, boolean cuatroPorCuatro) throws Exception {
        super(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilinbraje, numeroPasajeros, numeroPuertas);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.aire = aire;
        this.camReversa = camReversa;
        this.capacidadCarga = capacidadCarga;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.cuatroPorCuatro = cuatroPorCuatro;
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

    public boolean isCuatroPorCuatro() {
        return cuatroPorCuatro;
    }

    public void setCuatroPorCuatro(boolean cuatroPorCuatro) {
        this.cuatroPorCuatro = cuatroPorCuatro;
    }
}
