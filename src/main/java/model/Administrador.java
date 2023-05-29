package model;

import javax.swing.*;

public class Administrador {
    private String documento;
    private String nombre;
    private String correo;
    private String clave;

    public Administrador(String documento, String nombre, String correo, String clave) {
        if(documento ==null || documento.isBlank() || documento.isEmpty()){
            JOptionPane.showMessageDialog(null,"Error al ingresar el documento");
        }else{
            this.documento = documento;
        }if(nombre ==null || nombre.isBlank() || nombre.isEmpty()){
            JOptionPane.showMessageDialog(null,"Error al ingresar el nombre");
        }else {
            this.nombre = nombre;
        }if(correo ==null || correo.isBlank() || correo.isEmpty()){
            JOptionPane.showMessageDialog(null,"Error al ingresar el correo");
        }else {
            this.correo = correo;
        }if(clave ==null || clave.isBlank() || clave.isEmpty()){
            JOptionPane.showMessageDialog(null,"Error al ingresar el clave");
        }else {
            this.clave = clave;
        }
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
