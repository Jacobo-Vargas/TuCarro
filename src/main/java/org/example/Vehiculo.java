package org.example;

import java.util.Date;

public class Vehiculo {
    private final String placa;
    private EstadoVehiculo estadoVehiculo;
    private String marca;
    private Date modelo;
    private int numeroMarchas;
    private float velocidadMaxima;
    private int cilinbraje;
    private int numeroPasajeros;
    private int numeroPuertas;
    private String tipoCombustible;

    public Vehiculo(String placa, EstadoVehiculo estadoVehiculo, String marca, Date modelo, int numeroMarchas,
                    float velocidadMaxima, int cilinbraje, int numeroPasajeros, int numeroPuertas, String tipoCombustible) throws Exception {
        if(placa.isEmpty() || placa.isBlank() || placa.length()!=6){
            throw new Exception("existe un erro en la placa");
        }else{
            this.placa=placa;
        }
        if(estadoVehiculo==null){
            throw new Exception("el estado del vehiculo no puede ser nulo");
        }else{
            this.estadoVehiculo = estadoVehiculo;
        }
        if(marca.isBlank() || marca.isEmpty()){
            throw new Exception("el vehiculo no puede estar vacio");
        }else{
            this.marca = marca;
        }
        if (modelo.after(1990)){

        }
//        if(modelo<0 || modelo>4000){
//            throw new Exception("el modelo no puede ser menor que cero o mayor que 4000");
//        }else{
//            this.modelo = modelo;
//        }
        if(numeroMarchas <=3 ){
            throw new Exception("el numero de marchas no puede ser menor que 3");
        }else {
            this.numeroMarchas = numeroMarchas;
        }
        if(velocidadMaxima<=0){
            throw new Exception("la velocidad maxima no puede ser menor o igual a cero");
        }else{
            this.velocidadMaxima = velocidadMaxima;
        }
        if (cilinbraje <= 0){
            throw new Exception("el cilindraje no puede menor o igual a cero");
        }else {this.cilinbraje = cilinbraje;
        }
        if(numeroPasajeros<2){
            throw new Exception("el numero de pasajeros no puede ser menor que cero");
        }else{this.numeroPasajeros = numeroPasajeros;
        }

        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public String getPlaca() {
        return placa;
    }

    public EstadoVehiculo getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(EstadoVehiculo estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCilinbraje() {
        return cilinbraje;
    }

    public void setCilinbraje(int cilinbraje) {
        this.cilinbraje = cilinbraje;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", estadoVehiculo=" + estadoVehiculo +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", numeroMarchas=" + numeroMarchas +
                ", velocidadMaxima=" + velocidadMaxima +
                ", cilinbraje=" + cilinbraje +
                ", numeroPasajeros=" + numeroPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                '}';
    }
}



