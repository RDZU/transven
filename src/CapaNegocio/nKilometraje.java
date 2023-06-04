/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Chofer;
import CapaDatos.Conexion;
import CapaDatos.Estacionamiento;
import CapaDatos.Kilometraje;
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
public class nKilometraje {
    
     private Conexion mysql= new Conexion();//conectar bdd
    private Connection cn=mysql.conectar();
    private String SQL1="";
    public Integer TotalRegistros;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
       
        String [] titulos= {"ID","Numero Solicitud","Placa","Cedula Chofer","Km Inicial","Km final"};
        
         String [] registro= new String [6];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        SQL1="select * from kilometraje where numero_solicitud like'%"+buscar+"%'";
        
        try {
             Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("ID");
               registro[1]=rs.getString("numero_solicitud");
               registro[2]=rs.getString("placa");
               registro[3]=rs.getString("cedula_chofer");
               registro[4]=rs.getString("km_inicial");
               registro[5]=rs.getString("km_final");
                TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "No se registraron todos los datos kilometraje"+e);
            return null;
        }
        
    }
    
    public boolean insertar(Kilometraje dts){
        SQL1="insert into kilometraje(numero_solicitud,placa,cedula_chofer,km_inicial,km_final) values(?,?,?,?,?)";
        
        try {
             PreparedStatement pst=cn.prepareStatement(SQL1);
             
           
            
             pst.setInt(1, dts.getNumero_solicitud());
              pst.setString(2, dts.getPlaca());
               pst.setInt(3, dts.getCedula_chofer());
                pst.setDouble(4, dts.getKm_inicial());
                 pst.setDouble(5, dts.getKm_final());
                 
             
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
    
    public boolean editar(Kilometraje dts){
        SQL1="update kilometraje set  numero_solicitud=?,placa=?,cedula_chofer=?,km_inicial=?,km_final=? where ID=?";
        
        try {
             PreparedStatement pst=cn.prepareStatement(SQL1);
             
          
             pst.setInt(1, dts.getNumero_solicitud());
              pst.setString(2, dts.getPlaca());
               pst.setInt(3, dts.getCedula_chofer());
                pst.setDouble(4, dts.getKm_inicial());
                 pst.setDouble(5, dts.getKm_final());
                 pst.setInt(6, dts.getID());
                 
             
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
    
    public void eliminar( Kilometraje dts){
        SQL1="delete from kilometraje where ID=?";
        try {
            PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setInt(1, dts.getID());
             int n = pst.executeUpdate();
             
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar"+e);
         
    
    
        }
    }
}
    

