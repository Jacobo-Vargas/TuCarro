package model;

public class Empleado {
    private final String documento;
    private final String nombre;
    private String passCliente;

    @Override
    public String toString() {
        return "Empleado{" +
                "documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", passCliente='" + passCliente + '\'' +
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
            this.passCliente = passCliente;
        }
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
