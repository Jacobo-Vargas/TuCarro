package model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TuCarro {

    private List<Vehiculo> listaVehiculos;
    public List<Empleado> listaEmpleados;
    public List<Cliente>  listaClientes;
    private SelectVehicle selectVehicle;

    public TuCarro(){
        listaVehiculos = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
        listaClientes = new ArrayList<>();

    }


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
    public void borrarCliente(String numeroCedula){
        for(int i = 0; i < listaClientes.size(); i++ ){
            if(listaClientes.get(i).getDocumento().equals(numeroCedula)){
                listaClientes.remove(listaClientes.get(i));
            }
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
    public boolean registrarCliente(Cliente cliente) {
        boolean validar = false;
        try {
            validar = true;
            for (Cliente e : listaClientes) {
                if (e.getDocumento().equals(cliente.getDocumento())) {
                    validar = false;
                    break;
                }
            }
            if (cliente.getDocumento().isEmpty() || cliente.getDocumento().isBlank() || cliente.getDocumento().length() != 10) {
                validar = false;
            }
            if (validar) {
                listaClientes.add(cliente);

            }

        } catch (Exception e) {
            e.printStackTrace();
            validar = false;
        }

        return validar;
    }

    public List<Vehiculo> ordenarListaCarroPlaca (){//metodo para ordenar por numero de placa
        var listaOrdenada=listaVehiculos.stream().sorted((vehiculo1 , vehiculo2)
                ->vehiculo1. getPlaca(). compareTo(vehiculo2.getPlaca())) .collect(Collectors.toList());
        return listaOrdenada;
    }
    public List<Vehiculo> ordenarListaPorModelo(){// metodo para ordenar por modelo
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

    public SelectVehicle getSelectVehicle() {
        return selectVehicle;
    }
}
