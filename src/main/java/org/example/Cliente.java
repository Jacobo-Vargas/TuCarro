package org.example;

public class Cliente {
    private final String documento;
    private final String nombre;
    private String password;

    public Cliente(String documento, String nombre,String password) {
        this.documento = documento;
        this.nombre = nombre;
        this.password = password;
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
}
