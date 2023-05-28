package model;

public class Cliente {
    private String documento;
    private String nombre;


    public Cliente(String documento, String nombre) throws Exception {

        try {
            validarNombre(nombre);
            validarDocumento(documento);
            this.nombre = nombre;
            if (documento == null || documento.isEmpty() || documento.isBlank() || documento.length() != 10) {
                throw new Exception("Existe un error en el documento");
            } else {
                this.documento = documento;
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

private void validarNombre(String nombre) {
    if (nombre == null || nombre.isEmpty() || nombre.isBlank()) {
        throw new IllegalArgumentException("El nombre no puede estar vacío");
    }
}

private void validarDocumento(String documento) throws Exception {
    // Realizar validaciones específicas para el documento
    if (documento == null || documento.isEmpty() || documento.length() != 10 || documento.isBlank()) {
        throw new IllegalArgumentException("El documento no puede estar vacío");
    }
    if (nombre == null || nombre.isBlank() || nombre.isEmpty()) {
        throw new Exception("Existe un error en el nombre");
    } else {
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
