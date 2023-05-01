package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TuCarro {

    public List<Vehiculo> listaVehiculos;
    public List<Empleado> listaEmpleados;
    public List<Cliente>  listaClientes;

    public TuCarro() {
        listaVehiculos = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
        listaClientes = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo){
        for (Vehiculo v : listaVehiculos) {
            if (v.getPlaca().equals(vehiculo.getPlaca())) {
                JOptionPane.showMessageDialog(null,"El usuario ya existe");
            }else{
                listaVehiculos.add(vehiculo);
            }
        }
    }

    public void registrarEmpleado(Empleado empleado){

        for (Empleado e : listaEmpleados) {
            if (e.getDocumento().equals(empleado.getDocumento())) {
                JOptionPane.showMessageDialog(null,"El empleado ya existe");
            }else{
                listaEmpleados.add(empleado);
            }
        }

    }
    public void registrarCliente(Cliente cliente){

        for (Cliente e : listaClientes) {
            if (e.getDocumento().equals(cliente.getDocumento())) {
                JOptionPane.showMessageDialog(null,"El cliente ya existe");
            }else{
                listaClientes.add(cliente);
            }
        }
    }
}
