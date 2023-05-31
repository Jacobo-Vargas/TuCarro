package model;


import javax.swing.*;

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
        for(int i=0;i<Em)
        JOptionPane.showMessageDialog(null, "Verifique los datos ingresados.");
        return 0;
    }

    public String getNombreUSer() {
        return nombreUSer;
    }
}
