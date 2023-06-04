
package CapaDatos;


public class Chofer {
    
    private int cedula_chofer;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String  estado;
    private Double  viatico;
    private Double pago;
    private int Num_viajes;
    private Double Km_recorrido;
    private int dia_viaje;

    public Chofer(int cedula_chofer, String nombre, String apellido, String direccion, String telefono, String estado,int Num_viajes,Double Km_recorrido,int dia_viaje, Double viatico, Double pago) {
        this.cedula_chofer = cedula_chofer;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
        this.Num_viajes=Num_viajes;
        this.Km_recorrido=Km_recorrido;
        this.dia_viaje=dia_viaje;
        this.viatico = viatico;
        this.pago = pago;
    }

    public Chofer() {
    }

    public int getCedula_chofer() {
        return cedula_chofer;
    }

    public void setCedula_chofer(int cedula_chofer) {
        this.cedula_chofer = cedula_chofer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getViatico() {
        return viatico;
    }

    public void setViatico(Double viatico) {
        this.viatico = viatico;
    }

    public Double getPago() {
        return pago;
    }

    public void setPago(Double pago) {
        this.pago = pago;
    }

    public int getNum_viajes() {
        return Num_viajes;
    }

    public void setNum_viajes(int Num_viajes) {
        this.Num_viajes = Num_viajes;
    }

    public Double getKm_recorrido() {
        return Km_recorrido;
    }

    public void setKm_recorrido(Double Km_recorrido) {
        this.Km_recorrido = Km_recorrido;
    }

    public int getDia_viaje() {
        return dia_viaje;
    }

    public void setDia_viaje(int dia_viaje) {
        this.dia_viaje = dia_viaje;
    }
    
    
    
    
}
