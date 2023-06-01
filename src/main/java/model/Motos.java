package model;

import java.util.Objects;

public class Motos extends Vehiculo{

    public Motos(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilindraje, Combustible combustible, float precio,String vendedor, Disponibilidad disponibilidad) throws Exception {
        super(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilindraje, combustible, precio,vendedor,disponibilidad);
    }
    public static Motos of(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios, float velocidadMaxima, int cilindraje, Combustible combustible, float precio,String vendedor, Disponibilidad disponibilidad)throws Exception{
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

        return new Motos(placa, estadoVehiculo, marca, modelo, cambios, velocidadMaxima, cilindraje, combustible, precio,vendedor,disponibilidad);
    }
}
