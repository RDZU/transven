/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Conexion;
import CapaDatos.Estacionamiento;
import CapaDatos.Mantenimiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class nMantenimiento {
    
     private Conexion mysql= new Conexion();//conectar bdd
    private Connection cn=mysql.conectar();
    private String SQL1="";
    public Integer TotalRegistros;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
       
        String [] titulos= {"ID","Fecha","Descripcion","Repuesto","Placa"};
        
         String [] registro= new String [5];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        SQL1="select * from mantenimiento where placa='"+buscar+"'";
        
        try {
             Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("idMantenimiento");
               registro[1]=rs.getString("fecha");
               registro[2]=rs.getString("descripcion");
                registro[3]=rs.getString("repuesto");
                 registro[4]=rs.getString("placa");
                TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "No se registraron todos los datos"+e);
            return null;
        }
        
    }
    
    public boolean insertar(Mantenimiento dts){
        SQL1="insert into mantenimiento(fecha,descripcion,repuesto,placa) values(?,?,?,?)";
        
        try {
             PreparedStatement pst=cn.prepareStatement(SQL1);
             
           
             pst.setDate(1, dts.getFecha());
             pst.setString(2, dts.getDescripcion());
            pst.setString(3, dts.getRepuesto());
             pst.setString(4, dts.getPlaca());
               int n=pst.executeUpdate();
             
             if(n!=0){//si se insertaron registro
                 return true;
             }
             else{ //no se insertaron regiustro
                 return false;
             }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al agregar un registro"+e);
            return false;
        }
        
    }
    
    public boolean editar(Mantenimiento dts){
        SQL1="update mantenimiento set fecha=?,descripcion=?,repuesto=?,placa=? where idMantenimiento=?";
        
        try {
             PreparedStatement pst=cn.prepareStatement(SQL1);
             
             pst.setDate(1, dts.getFecha());
             pst.setString(2, dts.getDescripcion());
            pst.setString(3, dts.getRepuesto());
             pst.setString(4, dts.getPlaca());
             pst.setInt(5, dts.getIdMantenimiento());
             
              int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "error al editar"+e);
           
            return false;
        }
    }
    
    public void eliminar( Mantenimiento dts){
        SQL1="delete from Mantenimiento where idMantenimiento=?";
        try {
            PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setInt(1, dts.getIdMantenimiento());
             int n = pst.executeUpdate();
             
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar"+e);
          
            
        }
    }
}
