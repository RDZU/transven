/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Conexion;
import CapaDatos.Estacionamiento;
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
public class nEstacionamiento {
    
     private Conexion mysql= new Conexion();//conectar bdd
    private Connection cn=mysql.conectar();
    private String SQL1="";
    public Integer TotalRegistros;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
       
        String [] titulos= {"ID","Ciudad"};
        
         String [] registro= new String [2];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        SQL1="select * from estacionamiento where ciudad like'%"+buscar+"%'";
        
        try {
             Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("idEstacionamiento");
               registro[1]=rs.getString("Ciudad");
             
                TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "No se registraron todos los datos"+e);
            return null;
        }
        
    }
    
    public boolean insertar(Estacionamiento dts){
        SQL1="insert into estacionamiento(ciudad) values(?)";
        
        try {
             PreparedStatement pst=cn.prepareStatement(SQL1);
             
           
             pst.setString(1, dts.getCiudad());
           
             
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
    
    public boolean editar(Estacionamiento dts){
        SQL1="update estacionamiento set ciudad=? where idEstacionamiento=?";
        
        try {
             PreparedStatement pst=cn.prepareStatement(SQL1);
             
             pst.setString(1, dts.getCiudad());
            
                pst.setInt(2, dts.getIdEstacionamiento());
             
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
    
    public void eliminar( Estacionamiento dts){
        SQL1="delete from Estacionamiento where idEstacionamiento=?";
        try {
            PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setInt(1, dts.getIdEstacionamiento());
             int n = pst.executeUpdate();
             
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar"+e);
          
            
        }
    }
}
