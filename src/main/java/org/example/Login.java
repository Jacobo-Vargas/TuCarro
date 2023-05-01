package org.example;


import javax.swing.*;
import java.util.List;

public class Login {
    private TuCarro tuCarro;
    public Login(TuCarro tuCarro) {
        this.tuCarro = tuCarro;
    }

    public boolean verificarCredenciales(String documento, String pass) {
        for (Empleado e : tuCarro.listaEmpleados) {
            if (e.getDocumento().equals(documento) && e.getPassCliente().equals(pass)) {
                JOptionPane.showMessageDialog(null,"Acceso exitoso");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null,"Verifique los datos ingresados.");
        return false;
    }
}
