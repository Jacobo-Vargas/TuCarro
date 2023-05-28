package model;


import javax.swing.*;

public class Login {
    private TuCarro tuCarro;
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
        for (Empleado e : tuCarro.listaEmpleados) {
            if ((e.getDocumento().equals(documento) && e.getPassEmpleado().equals(pass))) {
                JOptionPane.showMessageDialog(null, "Acceso exitoso");
                this.nombreUSer = e.getNombre();
                return 2;
            }
        }
        JOptionPane.showMessageDialog(null, "Verifique los datos ingresados.");
        return 0;
    }

    public String getNombreUSer() {
        return nombreUSer;
    }
}
