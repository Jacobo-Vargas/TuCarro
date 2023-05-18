package org.example;

public class Cliente {
    private  String documento;
    private  String nombre;
    private String password;

    public Cliente(String documento, String nombre,String password) throws Exception {
        if (documento == null || documento.isEmpty() || documento.isBlank() || documento.length() !=10){
            throw new Exception("Existe un error en el documento");
        }else {
            this.documento=documento;
        }if (nombre == null || nombre.isBlank() || nombre.isEmpty()){
            throw new Exception("Existe un error en el nombre");
        }else {
            this.nombre = nombre;
        }if (password == null || password.isEmpty() || password.isBlank()){
            throw new Exception("el passCliente tiene un error");
        }else {
            this.password = password;
        }
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
