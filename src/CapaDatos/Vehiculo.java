
package CapaDatos;



public class Vehiculo {
    private String placa;
    private String modelo;
    private int numero_solicitud;
    private String observacion;
    private Double kilometraje;
    private String estado;
    private int capacidad;
    private int idEstacionamiento;

    public Vehiculo(String placa, String modelo, int numero_solicitud, String observacion, Double kilometraje, String estado, int capacidad, int idEstacionamiento) {
        this.placa = placa;
        this.modelo = modelo;
        this.numero_solicitud = numero_solicitud;
        this.observacion = observacion;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.capacidad = capacidad;
        this.idEstacionamiento = idEstacionamiento;
    }

    public Vehiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumero_solicitud() {
        return numero_solicitud;
    }

    public void setNumero_solicitud(int numero_solicitud) {
        this.numero_solicitud = numero_solicitud;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }
    
    
}
