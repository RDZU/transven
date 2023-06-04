


package CapaDatos;


public class Kilometraje {
   private int ID;
    private int numero_solicitud;
    private String placa;
    private int cedula_chofer;
    private Double  km_inicial;
    private Double km_final;

    public Kilometraje() {
    }

    public Kilometraje(int ID,int numero_solicitud, String placa, int cedula_chofer, Double km_inicial, Double km_final) {
        this.ID=ID;
        this.numero_solicitud = numero_solicitud;
        this.placa = placa;
        this.cedula_chofer = cedula_chofer;
        this.km_inicial = km_inicial;
        this.km_final = km_final;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumero_solicitud() {
        return numero_solicitud;
    }

    public void setNumero_solicitud(int numero_solicitud) {
        this.numero_solicitud = numero_solicitud;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCedula_chofer() {
        return cedula_chofer;
    }

    public void setCedula_chofer(int cedula_chofer) {
        this.cedula_chofer = cedula_chofer;
    }

    public Double getKm_inicial() {
        return km_inicial;
    }

    public void setKm_inicial(Double km_inicial) {
        this.km_inicial = km_inicial;
    }

    public Double getKm_final() {
        return km_final;
    }

    public void setKm_final(Double km_final) {
        this.km_final = km_final;
    }
    
    
    
}
