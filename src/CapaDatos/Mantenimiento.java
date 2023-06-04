

package CapaDatos;

import java.sql.Date;


public class Mantenimiento {
    private int  idMantenimiento;
    private Date fecha;
    private String descripcion;
    private String repuesto;
    private String placa;

    public Mantenimiento(int idMantenimiento, Date fecha, String descripcion, String repuesto, String placa) {
        this.idMantenimiento = idMantenimiento;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.repuesto = repuesto;
        this.placa = placa;
    }

    public Mantenimiento() {
    }

    public int getIdMantenimiento() {
        return idMantenimiento;
    }

    public void setIdMantenimiento(int idMantenimiento) {
        this.idMantenimiento = idMantenimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(String repuesto) {
        this.repuesto = repuesto;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}
