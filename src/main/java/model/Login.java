package model;


import javax.swing.*;

public class Login {
    private final TuCarro tuCarro;
    private String nombreUSer;
    private String nombre;

    public Login(TuCarro tuCarro) {
        this.tuCarro = tuCarro;
    }

    public int verificarCredenciales(String documento, String pass) {
        if (documento.equals("admin") && pass.equals("@dmin")) {
            this.nombreUSer = "admin";
            return 1;
        }
        for (Empleado e : tuCarro.listaEmpleados) {
            if ((e.getDocumento().equals(documento) && e.getPassEmpleado().equals(pass))) {
                this.nombreUSer = e.getNombre();
                this.nombre = e.getNombre();
                return 2;
            }
        }
        return 0;
    }

    public String getNombreUSer() {
        return nombreUSer;
    }

    public String getNombre() {
        return nombre;
    }
}
