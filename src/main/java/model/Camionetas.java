package model;

public class Camionetas extends Vehiculo{
    private int numPasajeros;
    private int numPuertas;
    private AireAcondicionado aire;
    private CamaraReversa camReversa;
    private float capacidadMaletero;
    private int numBolsasAire;
    private ABS abs;
    private VelocidadCrucero velCucero;
    private SensorColision sensorColision;
    private SensorTrafico sensorTrafico;
    private AsistenciaPermanencia asistenciaPermanencia;
    private boolean cuatroPorCuatro;

    public Camionetas(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilinbraje, int numeroPasajeros, int numeroPuertas, String tipoCombustible, int numPasajeros, int numPuertas, AireAcondicionado aire, CamaraReversa camReversa, float capacidadMaletero, int numBolsasAire, ABS abs, VelocidadCrucero velCucero, SensorColision sensorColision, SensorTrafico sensorTrafico, AsistenciaPermanencia asistenciaPermanencia, boolean cuatroPorCuatro) throws Exception {
        super(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilinbraje, numeroPasajeros, numeroPuertas);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.aire = aire;
        this.camReversa = camReversa;
        this.capacidadMaletero = capacidadMaletero;
        this.numBolsasAire = numBolsasAire;
        this.abs = abs;
        this.velCucero = velCucero;
        this.sensorColision = sensorColision;
        this.sensorTrafico = sensorTrafico;
        this.asistenciaPermanencia = asistenciaPermanencia;
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

    public VelocidadCrucero getVelCucero() {
        return velCucero;
    }

    public void setVelCucero(VelocidadCrucero velCucero) {
        this.velCucero = velCucero;
    }

    public SensorColision getSensorColision() {
        return sensorColision;
    }

    public void setSensorColision(SensorColision sensorColision) {
        this.sensorColision = sensorColision;
    }

    public SensorTrafico getSensorTrafico() {
        return sensorTrafico;
    }

    public void setSensorTrafico(SensorTrafico sensorTrafico) {
        this.sensorTrafico = sensorTrafico;
    }

    public AsistenciaPermanencia getAsistenciaPermanencia() {
        return asistenciaPermanencia;
    }

    public void setAsistenciaPermanencia(AsistenciaPermanencia asistenciaPermanencia) {
        this.asistenciaPermanencia = asistenciaPermanencia;
    }

    public boolean isCuatroPorCuatro() {
        return cuatroPorCuatro;
    }

    public void setCuatroPorCuatro(boolean cuatroPorCuatro) {
        this.cuatroPorCuatro = cuatroPorCuatro;
    }
}
