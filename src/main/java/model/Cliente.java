package model;

public class Cliente {
    private  String documento;
    private  String nombre;


    public Cliente(String documento, String nombre) throws Exception {
        try {
            validarNombre(nombre);
            validarDocumento(documento);
            this.nombre = nombre;
            this.documento = documento;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private void validarNombre(String nombre) {
        if (nombre == null || nombre.isEmpty() || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }

    private void validarDocumento(String documento) {
        // Realizar validaciones específicas para el documento
        if (documento == null || documento.isEmpty() || documento.length() != 10 || documento.isBlank()) {
            throw new IllegalArgumentException("El documento no puede estar vacío");
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
