package org.example;

public class Cliente {
    private  String documento;
    private  String nombre;


    public Cliente(String documento, String nombre) throws Exception {
        if (documento == null || documento.isEmpty() || documento.isBlank() || documento.length() !=10){
            throw new Exception("Existe un error en el documento");
        }else {
            this.documento=documento;
        }if (nombre == null || nombre.isBlank() || nombre.isEmpty()){
            throw new Exception("Existe un error en el nombre");
        }else {
            this.nombre = nombre;
        }
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
