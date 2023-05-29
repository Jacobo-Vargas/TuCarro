package model;

import javax.swing.*;

public class Vehiculo {
    private  String placa;
    private EstadoVehiculo estadoVehiculo;
    private String marca;
    private int modelo;
    private int cambios;
    private float velocidadMaxima;
    private int cilinbraje;
    private Combustible combustible;



    public Vehiculo(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios,
                    float velocidadMaxima, int cilinbraje, Combustible combustible) throws Exception {
        if(placa.isEmpty() || placa.isBlank() || placa.length()!=6){
            JOptionPane.showMessageDialog(null,"Existe un error en la placa");
        }else{
            this.placa=placa;
        }
        if(estadoVehiculo==null){
            JOptionPane.showMessageDialog(null,"El estado del vehiculo no puede ser nulo");
        }else{
            this.estadoVehiculo = estadoVehiculo;
        }
        if(marca.isBlank() || marca.isEmpty()){
            JOptionPane.showMessageDialog(null,"La marca del vehiculo no puede estar vacia");
        }else{
            this.marca = marca;
        }

      if(modelo< 1980 || modelo> 2023 ){
          JOptionPane.showMessageDialog(null,"Error al ingresar el modelo de vehiculo");
      }else{
          this.modelo = modelo;
      }
        if(cambios <=3 ){
            JOptionPane.showMessageDialog(null,"El numero de cambios no puede ser menor a tres");
        }else {
            this.cambios = cambios;
        }
        if(velocidadMaxima<=0){
            JOptionPane.showMessageDialog(null,"La velocidad maxima del vehiculo no puede ser " +
                    "menor a cero");
        }else{
            this.velocidadMaxima = velocidadMaxima;
        }
        if (cilinbraje <= 0){
            JOptionPane.showMessageDialog(null,"El cilinbraje del vehiculo no puede menor a cero");
        }else {this.cilinbraje = cilinbraje;
        }

        if(combustible==null){
            JOptionPane.showMessageDialog(null,"El tipo de combustible no puede ser null");
        }else {
            this.combustible=combustible;
        }
    }

    public String getPlaca() {
        return placa;
    }

    public EstadoVehiculo getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(EstadoVehiculo estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCilinbraje() {
        return cilinbraje;
    }

    public void setCilinbraje(int cilinbraje) {
        this.cilinbraje = cilinbraje;
    }
    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }



    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", estadoVehiculo=" + estadoVehiculo +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", cambios=" + cambios +
                ", velocidadMaxima=" + velocidadMaxima +
                ", cilinbraje=" + cilinbraje +
                '}';
    }
}



