package org.example;

import java.util.function.Predicate;

public class UtilFiltrar {
    public static Predicate<Vehiculo> filtrarPorPlaca(String placa){
        Predicate<Vehiculo> predicate=new Predicate<Vehiculo>() {
            @Override
            public boolean test(Vehiculo vehiculo) {
                return vehiculo.getPlaca()==placa;
            }
        };
        return predicate;
    }
    public static Predicate<Vehiculo> filtrarEstado(EstadoVehiculo estadoVehiculo){
        Predicate<Vehiculo> predicate=new Predicate<Vehiculo>() {
            @Override
            public boolean test(Vehiculo vehiculo) {
                return vehiculo.getEstadoVehiculo()==estadoVehiculo;
            }
        };
        return predicate;
    }
    public static Predicate<Vehiculo> filtrarPorMarca(String marca){
        Predicate<Vehiculo> predicate=new Predicate<Vehiculo>() {
            @Override
            public boolean test(Vehiculo vehiculo) {
                return vehiculo.getMarca()==marca;
            }
        };
        return predicate;
    }
    public static Predicate<Vehiculo> filtrarPorModelo(int modelo){
        Predicate<Vehiculo> predicate=new Predicate<Vehiculo>() {
            @Override
            public boolean test(Vehiculo vehiculo) {
                return vehiculo.getModelo()==modelo;
            }
        };
        return predicate;
    }
    public static Predicate<Vehiculo> filtrarPorCambios(int cambios){
        Predicate<Vehiculo> predicate=new Predicate<Vehiculo>() {
            @Override
            public boolean test(Vehiculo vehiculo) {
                return vehiculo.getCambios()==cambios;
            }
        };
        return predicate;
    }
    public static Predicate<Vehiculo> filtrarPorVelicidadMaxima(float velocidadMaxima){
        Predicate<Vehiculo> predicate=new Predicate<Vehiculo>() {
            @Override
            public boolean test(Vehiculo vehiculo) {
                return vehiculo.getVelocidadMaxima()>=velocidadMaxima;
            }
        };
        return predicate;
    }
    public static Predicate<Vehiculo> filtrarPorClinbraje(int cilinbraje){
        Predicate<Vehiculo> predicate=new Predicate<Vehiculo>() {
            @Override
            public boolean test(Vehiculo vehiculo) {
                return vehiculo.getCilinbraje()==cilinbraje;
            }
        };
        return predicate;
    }
    public static Predicate<Vehiculo> filtrarPorNumeroPasajeros(int numeroPasajeros){
        Predicate<Vehiculo> predicate=new Predicate<Vehiculo>() {
            @Override
            public boolean test(Vehiculo vehiculo) {
                return vehiculo.getNumeroPasajeros()==numeroPasajeros;
            }
        };
        return predicate;
    }
    public static Predicate<Vehiculo> filtrarPorNumeroPuertas(int numeroPuertas){
        Predicate<Vehiculo> predicate=new Predicate<Vehiculo>() {
            @Override
            public boolean test(Vehiculo vehiculo) {
                return vehiculo.getNumeroPuertas()==numeroPuertas;
            }
        };
        return predicate;
    }
    //public static Predicate<Vehiculo> filtrarPorTipoCombustible(Combustible combustible){
      //  Predicate<Vehiculo> predicate=new Predicate<Vehiculo>() {
        //    @Override
          //  public boolean test(Vehiculo vehiculo) {
            //    return vehiculo.getCombustible()==combustible;
            //}
        //};
        //return predicate;
    //}

    public static Predicate<Vehiculo> filtrar (String placa, EstadoVehiculo estadoVehiculo,
    String marca, int modelo , int cambios, float velocidadMaxima, int cilinbraje, int numeroPasajeros,
      int numeroPuertas, Combustible combustible){

        Predicate<Vehiculo> predicate = persona -> true;
        if( placa != null ){
            predicate = predicate.and(filtrarPorPlaca(placa));
        }
        if ( estadoVehiculo != null ){
            predicate = predicate.and(filtrarEstado(estadoVehiculo));
        }
        if ( marca != null ){
            predicate = predicate.and(filtrarPorMarca(marca));
        }
        if ( modelo != 0 ){
            predicate = predicate.and(filtrarPorModelo(modelo));
        }
        if ( cambios != 0 ){
            predicate = predicate.and(filtrarPorCambios(cambios));
        }
        if ( velocidadMaxima != 0 ){
            predicate = predicate.and(filtrarPorVelicidadMaxima(velocidadMaxima));
        }
        if ( cilinbraje != 0 ){
            predicate = predicate.and(filtrarPorClinbraje(cilinbraje));
        }
        if ( numeroPasajeros != 0 ){
            predicate = predicate.and(filtrarPorNumeroPasajeros(numeroPasajeros));
        }
        if ( numeroPuertas != 0 ){
            predicate = predicate.and(filtrarPorNumeroPuertas(numeroPuertas));
        }
        //if ( combustible != null ){
          //  predicate = predicate.and(filtrarPorTipoCombustible(combustible));
        //}
        return predicate;

    }

}
