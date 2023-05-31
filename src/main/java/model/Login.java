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
            JOptionPane.showMessageDialog(null, "Acceso exitoso");
            this.nombreUSer = "admin";
            return 1;
        }
        if(documento.equals("administrador") && pass.equals("@")){
            JOptionPane.showMessageDialog(null, "Acceso exitoso");
            this.nombreUSer = "admin";
            return 3;
        }
        for (Empleado e : SISTEMAINSTANCE.getSistema().listaEmpleados) {
            if ((e.getDocumento().equals(documento) && e.getPassEmpleado().equals(pass))) {
                JOptionPane.showMessageDialog(null, "Acceso exitoso");
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
