/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

/**
 *
 * @author david
 */
public class Precio {
    private int ID;
    private Double Tarifa_Kg;
     private Double Tarifa_viaje;
     private Double Tarifa_Km;
     private Double Tarifa_viatico;
     private Double Sueldo_base;

    public Precio(int ID,Double Tarifa_Kg, Double Tarifa_viaje, Double Tarifa_Km, Double Tarifa_viatico, Double Sueldo_base) {
        this.ID=ID;
        this.Tarifa_Kg = Tarifa_Kg;
        this.Tarifa_viaje = Tarifa_viaje;
        this.Tarifa_Km = Tarifa_Km;
        this.Tarifa_viatico = Tarifa_viatico;
        this.Sueldo_base = Sueldo_base;
    }

    public Precio() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Double getTarifa_Kg() {
        return Tarifa_Kg;
    }

    public void setTarifa_Kg(Double Tarifa_Kg) {
        this.Tarifa_Kg = Tarifa_Kg;
    }

    public Double getTarifa_viaje() {
        return Tarifa_viaje;
    }

    public void setTarifa_viaje(Double Tarifa_viaje) {
        this.Tarifa_viaje = Tarifa_viaje;
    }

    public Double getTarifa_Km() {
        return Tarifa_Km;
    }

    public void setTarifa_Km(Double Tarifa_Km) {
        this.Tarifa_Km = Tarifa_Km;
    }

    public Double getTarifa_viatico() {
        return Tarifa_viatico;
    }

    public void setTarifa_viatico(Double Tarifa_viatico) {
        this.Tarifa_viatico = Tarifa_viatico;
    }

    public Double getSueldo_base() {
        return Sueldo_base;
    }

    public void setSueldo_base(Double Sueldo_base) {
        this.Sueldo_base = Sueldo_base;
    }
     
     
}
