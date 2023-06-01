package model;


import javax.swing.*;

import static model.SistemaInstance.SISTEMAINSTANCE;

public class Login {
    private final TuCarro tuCarro;
    private String nombreUSer;

    public Login(TuCarro tuCarro) {
        this.tuCarro = tuCarro;
    }

    public int verificarCredenciales(String documento, String pass) {
        if (documento.equals("admin") && pass.equals("@dmin")) {
            this.nombreUSer = "Administrador";
            return 1;
        }
        for (Empleado e : SISTEMAINSTANCE.getSistema().listaEmpleados) {
            if ((e.getDocumento().equals(documento) && e.getPassEmpleado().equals(pass))) {
                this.nombreUSer = e.getNombre();
                return 2;
            }
        }
        return 0;
    }

    public String getNombreUSer() {
        return nombreUSer;
    }

}
