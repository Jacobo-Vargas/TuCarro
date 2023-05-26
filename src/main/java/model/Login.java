package model;


import javax.swing.*;

public class Login {
    private TuCarro tuCarro;
    public Login(TuCarro tuCarro) {
        this.tuCarro = tuCarro;
    }

    public boolean verificarCredenciales(String documento, String pass) {
        if (documento.equals("admin") && pass.equals("@dmin")){
            JOptionPane.showMessageDialog(null,"Acceso exitoso");
            return true;
        }else{
            for (Empleado e : tuCarro.listaEmpleados) {
                if ((e.getDocumento().equals(documento) && e.getPassEmpleado().equals(pass)) ) {
                    JOptionPane.showMessageDialog(null,"Acceso exitoso");
                    return true;
                }
            }
            JOptionPane.showMessageDialog(null,"Verifique los datos ingresados.");
            return false;
        }

    }
}
