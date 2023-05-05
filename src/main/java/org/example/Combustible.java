package org.example;

public class Combustible {
    private boolean gasolina;
    private Diesel diesel;
    private boolean electrico;
    private float promedioCarga;
    private float autonomia;
    private boolean hibrido;
    private boolean enchufable;
    private boolean noEnchufable;
    private boolean ligero;

    public Combustible(boolean gasolina){
        this.gasolina = gasolina;
    }
    public Combustible(Diesel diesel){
        this.diesel = diesel;
    }
    public Combustible(boolean electrico,float promedioCarga,float autonomia){
        this.electrico = electrico;
        this.promedioCarga = promedioCarga;
        this.autonomia = autonomia;
    }

    public Combustible(boolean hibrido,boolean enchufable,boolean ligero){
        this.hibrido = hibrido;
        this.enchufable = enchufable;
        this. ligero = ligero;
    }

    public Combustible(boolean hibrido,boolean noEnchufable){
        this.hibrido = hibrido;
        this.noEnchufable = noEnchufable;

    }

    public boolean isGasolina() {
        return gasolina;
    }

    public Diesel getDiesel() {
        return diesel;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public float getPromedioCarga() {
        return promedioCarga;
    }

    public float getAutonomia() {
        return autonomia;
    }

    public boolean isHibrido() {
        return hibrido;
    }

    public boolean isEnchufable() {
        return enchufable;
    }

    public boolean isNoEnchufable() {
        return noEnchufable;
    }

    public boolean isLigero() {
        return ligero;
    }
}
