package org.example;

import org.junit.Test;

public class TestRegistrarEmpleado {
    @Test
    public void prueba1(){
        TuCarro sistema = new TuCarro();
        Empleado u1= new Empleado("1094958613","juan","123@");
        Empleado u2= new Empleado("1094958614","juan","123@");
        Empleado u3= new Empleado("1094958614","juan","123@");
        Vehiculo v1 = new Vehiculo("123456H");
        Vehiculo v2 = new Vehiculo("123456H");
        sistema.registrarEmpleado(u1);
        sistema.registrarEmpleado(u2);
        sistema.registrarEmpleado(u3);
        sistema.registrarVehiculo(v1);
        sistema.registrarVehiculo(v2);
        System.out.println(sistema.listaVehiculos.size());
        System.out.println(sistema.listaEmpleados.size());
    }

}
