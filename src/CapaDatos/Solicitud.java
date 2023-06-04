/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.sql.Date;
import java.sql.Timestamp;


public class Solicitud {
    
   private int  numero_solicitud;
   private String cargamento;
   private int  carga;
   private Double precio;
   private String origen;
   private String destino;
   private int cedula_cliente;
   private Timestamp fecha_envio; // almacena año,mes,dia,hora,minutos,segundos,miliSeg
   
   private Timestamp fecha_entrega;
  
   private String estado;

    public Solicitud(int numero_solicitud, String cargamento, int carga, Double precio, String origen, String destino, int cedula_cliente, Timestamp fecha_envio, Timestamp fecha_entrega, String estado) {
        this.numero_solicitud = numero_solicitud;
        this.cargamento = cargamento;
        this.carga = carga;
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
        this.cedula_cliente = cedula_cliente;
        this.fecha_envio = fecha_envio;
       
        this.fecha_entrega = fecha_entrega;
      
        this.estado = estado;
    }

    public Solicitud() {
    }

    public int getNumero_solicitud() {
        return numero_solicitud;
    }

    public void setNumero_solicitud(int numero_solicitud) {
        this.numero_solicitud = numero_solicitud;
    }

    public String getCargamento() {
        return cargamento;
    }

    public void setCargamento(String cargamento) {
        this.cargamento = cargamento;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(int cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public Timestamp getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(Timestamp fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public Timestamp getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Timestamp fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
   
}
