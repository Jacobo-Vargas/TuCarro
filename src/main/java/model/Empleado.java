package model;

import javafx.scene.control.Alert;

public class Empleado {
    private final String documento;
    private final String nombre;
    private String passEmpleado;

    @Override
    public String toString() {
        return "Empleado{" +
                "documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", passCliente='" + passEmpleado + '\'' +
                '}';
    }





    public Empleado(String documento, String nombre, String passCliente) throws Exception {
        if (documento == null || documento.isEmpty() || documento.isBlank() || documento.length() !=10){
            throw new Exception("Existe un error en el documento");
        }else {
            this.documento=documento;
        }if (nombre == null || nombre.isBlank() || nombre.isEmpty()){
            throw new Exception("Existe un error en el nombre");
        }else {
            this.nombre = nombre;
        }if (passCliente == null || passCliente.isEmpty() || passCliente.isBlank()){
            throw new Exception("el passCliente tiene un error");
        }else {
            this.passEmpleado = passCliente;
        }
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassEmpleado() {
        return passEmpleado;
    }

    public void setPassEmpleado(String passCliente) {
        this.passEmpleado = passCliente;
    }

    public void agregarVehiculo(TuCarro almacenar,Vehiculo vehiculo) throws Exception {
        almacenar.registrarVehiculo(vehiculo);
    }
}
