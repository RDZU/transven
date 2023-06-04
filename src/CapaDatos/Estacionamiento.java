
package CapaDatos;




public class Estacionamiento {
    
    private int idEstacionamiento;
    private String ciudad;
   

    public Estacionamiento(int idEstacionamiento, String ciudad) {
        this.idEstacionamiento = idEstacionamiento;
        this.ciudad = ciudad;
       
    }

    public Estacionamiento() {
    }

    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

  
    
    
}
