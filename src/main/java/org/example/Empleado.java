package org.example;

import java.util.List;
public class Empleado {
    private final String documento;
    private final String nombre;
    private String passCliente;



    public Empleado(String documento, String nombre, String passCliente) {
        this.documento = documento;
        this.nombre = nombre;
        this.passCliente = passCliente;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassCliente() {
        return passCliente;
    }

    public void setPassCliente(String passCliente) {
        this.passCliente = passCliente;
    }

    public void agregarVehiculo(TuCarro almacenar,Vehiculo vehiculo) throws Exception {
        almacenar.registrarVehiculo(vehiculo);
    }
}
