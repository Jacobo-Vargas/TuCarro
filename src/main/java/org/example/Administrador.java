package org.example;

public class Administrador {
    private final String documento;
    private final String nombre;
    private String correo;
    private String clave;

    public Administrador(String documento, String nombre, String correo, String clave) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
