package model;

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
    public static Predicate<Empleado> filtrarPorNumeroDocumento(String numeroDocumento){
        Predicate<Empleado> predicate=new Predicate<Empleado>() {
            @Override
            public boolean test(Empleado empleado) {
                return empleado.getDocumento()==numeroDocumento;
            }
        };
        return predicate;
    }
    public static Predicate<Empleado> filtrarPorNombre(String nombre){
        Predicate<Empleado> predicate=new Predicate<Empleado>() {
            @Override
            public boolean test(Empleado empleado) {
                return empleado.getNombre()==nombre;
            }
        };
        return predicate;
    }
    public static Predicate<Empleado> filtrarPorPassClienteEmpleado(String passEmpleado){
        Predicate<Empleado> predicate=new Predicate<Empleado>() {
            @Override
            public boolean test(Empleado empleado) {
                return empleado.getPassEmpleado()==passEmpleado;
            }
        };
        return predicate;
    }
    public static Predicate<Cliente> filtrarPorNombreCliente(String nombre){
        Predicate<Cliente> predicate=new Predicate<Cliente>() {
            @Override
            public boolean test(Cliente cliente) {
                return cliente.getNombre()==nombre;
            }
        };
        return predicate;
    }
    public static Predicate<Cliente> filtrarPorDocumentoCliente(String documento){
        Predicate<Cliente> predicate=new Predicate<Cliente>() {
            @Override
            public boolean test(Cliente cliente) {
                return cliente.getDocumento()==documento;
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
        //if ( combustible != null ){
          //  predicate = predicate.and(filtrarPorTipoCombustible(combustible));
        //}
        return predicate;

    }
    public static Predicate<Empleado> filtrarEmpleado (String documento, String nombre, String passCliente) {

        Predicate<Empleado> predicate = persona -> true;
        if (documento != null) {
            predicate = predicate.and(filtrarPorNumeroDocumento(documento));
        }if ( nombre != null){
            predicate = predicate.and(filtrarPorNombre(nombre));
        }if (passCliente != null){
            predicate = predicate.and(filtrarPorPassClienteEmpleado(passCliente));
        }
        return predicate;
    }
    public static Predicate<Cliente> filtrarCliente (String documento, String nombre, String password){
        Predicate<Cliente> predicate = persona -> true;
        if (documento != null){
            predicate = predicate.and(filtrarPorDocumentoCliente(documento));
        }if (nombre != null){
            predicate = predicate.and(filtrarPorNombreCliente(nombre));
        }
        return predicate;
    }
}
