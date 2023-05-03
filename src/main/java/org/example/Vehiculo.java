package org.example;

public class Vehiculo {
    private final String placa;

    public Vehiculo(String placa) throws Exception {
        if(placa.isBlank() || placa.isEmpty()){
            throw new Exception("la placa del vehiculo no puede estar vacia");
        }else {
            this.placa=placa;
            System.out.println("hola mundo");
        }
    }

    public String getPlaca() {
        return placa;
    }
}
