package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
                JOptionPane.showMessageDialog(null,"La placa ingresada ya existe.");
                validar = false;
                break;
            }
        }
        if(validar){
            listaVehiculos.add(vehiculo);
        }
    }

    public void registrarEmpleado(Empleado empleado){
        boolean validar = true;
        for (Empleado e : listaEmpleados) {
            if (e.getDocumento().equals(empleado.getDocumento())) {
                JOptionPane.showMessageDialog(null,"El documento ingresado ya existe.");
                validar = false;
                break;
            }
        }
        if(validar){
            listaEmpleados.add(empleado);
        }

    }
    public void registrarCliente(Cliente cliente){
        boolean validar = true;
        for (Cliente e : listaClientes) {
            if (e.getDocumento().equals(cliente.getDocumento())) {
                JOptionPane.showMessageDialog(null,"El numero de documento ingresado ya existe.");
                validar = false;
                break;
            }
        }
        if (validar){
            listaClientes.add(cliente);
        }
    }
    public List<Vehiculo> ordenarListaCarroPlaca (){//metodo para ordenar por numero de placa
        var listaOrdenada=listaVehiculos.stream().sorted((vehiculo1 , vehiculo2)
                ->vehiculo1. getPlaca(). compareTo(vehiculo2.getPlaca())) .collect(Collectors.toList());
        return listaOrdenada;
    }
    public List<Vehiculo> ordenarListaPorModelo(){
        var listaOrdenada=listaVehiculos.stream().sorted((vehiculo1 , vehiculo2)->vehiculo1.getModelo()-
                vehiculo2.getModelo()).collect(Collectors.toList());
        return listaOrdenada;
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
