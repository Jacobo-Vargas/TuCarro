package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

public class Cliente {
    private String documento;
    private String nombre;


    public Cliente(String documento, String nombre) throws Exception {

        try {
            validarNombre(nombre);
            validarDocumento(documento);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

private void validarNombre(String nombre) {
    if (nombre == null || nombre.isEmpty() || nombre.isBlank()) {
        throw new IllegalArgumentException("El nombre no puede estar vacío");
    }else{
        this.nombre = nombre;
    }
}

private void validarDocumento(String documento) throws Exception {
    // Realizar validaciones específicas para el documento
    if (documento == null || documento.length() != 10 || documento.isBlank()) {
        throw new IllegalArgumentException("El documento no puede estar vacío");
    }else{
        this.documento = documento;
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

    public StringProperty documentoProperty() {
        return new SimpleStringProperty(documento);
    }

    public StringProperty nombreProperty() {
        return new SimpleStringProperty(nombre);
    }
}
