package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TuCarro {

    private List<Vehiculo> listaVehiculos;
    public List<Empleado> listaEmpleados;
    public List<Cliente>  listaClientes;

    public TuCarro() {
        listaVehiculos = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
        listaClientes = new ArrayList<>();
    }

//    public void registrarVehiculo(Vehiculo vehiculo) throws Exception {
//        for(int i=0;i<listaVehiculos.size();i++){
//            if(listaVehiculos.get(i).getPlaca()==vehiculo.getPlaca()){
//                throw new Exception("el vehiculo este repetido");
//            }
//        }
//        listaVehiculos.add(vehiculo);
//
//    }

    public void registrarVehiculo(Vehiculo vehiculo){
        boolean validar = true;
        for (Vehiculo v : listaVehiculos) {
            if (v.getPlaca().equals(vehiculo.getPlaca())) {
                JOptionPane.showMessageDialog(null,"Ya existe este vehiculo");
                validar = false;
                break;
            }
        }
        if(validar){
            listaVehiculos.add(vehiculo);
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


    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
