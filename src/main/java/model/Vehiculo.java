package model;

import java.util.Objects;

public class Vehiculo {
    private final String placa;
    private EstadoVehiculo estadoVehiculo;
    private final String marca;
    private final int modelo;
    private final int cambios;
    private final float velocidadMaxima;
    private final int cilindraje;
    private Combustible combustible;

    private float precio;


    public Vehiculo(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilindraje, Combustible combustible, float precio) {
        this.placa = placa;
        this.estadoVehiculo = estadoVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.combustible = combustible;
        this.precio = precio;
    }
    public static Vehiculo of(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilindraje, Combustible combustible, float precio) throws Exception {

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

        return new Vehiculo(placa,estadoVehiculo,marca,modelo,cambios,velocidadMaxima,cilindraje,combustible,precio);
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
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

    public int getModelo() {
        return modelo;
    }


    public int getCambios() {
        return cambios;
    }


    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }


    public int getCilindraje() {
        return cilindraje;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", estadoVehiculo=" + estadoVehiculo +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", cambios=" + cambios +
                ", velocidadMaxima=" + velocidadMaxima +
                ", cilinbraje=" + cilindraje +
                '}';
    }
}



