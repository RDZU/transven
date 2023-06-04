/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Conexion;
import CapaDatos.Estacionamiento;
import CapaDatos.Vehiculo;
import CapaDatos.Estacionamiento;
import CapaPresentacion.iuVehiculo;
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
public class nVehiculo {
    
     private Conexion mysql= new Conexion();//conectar bdd
    private Connection cn=mysql.conectar();
    private String SQL1="";
    public Integer TotalRegistros;
    
    
    
     public DefaultTableModel mostrarVista(String buscar){
        DefaultTableModel modelo;
        
       
        String [] titulos= {"Placa","Modelo","Numero de solicitud","Observacion","Kilometraje","Estado","Capacidad","ID Estacionamiento","Ciudad"};
        
         String [] registro= new String [9];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        SQL1="select v.placa,v.modelo,v.numero_solicitud,v.observacion,v.kilometraje,v.estado,v.capacidad,e.ciudad,e.idEstacionamiento from vehiculo v  join Estacionamiento e using(idEstacionamiento) where estado='Disponible'";
        
        try {
             Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("placa");
               registro[1]=rs.getString("modelo");
                registro[2]=rs.getString("numero_solicitud");
               registro[3]=rs.getString("observacion");
               registro[4]=rs.getString("kilometraje");
               registro[5]=rs.getString("estado");
               registro[6]=rs.getString("capacidad");
                 registro[7]=rs.getString("idEstacionamiento");
               registro[8]=rs.getString("ciudad");
                TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "No se registraron todos los datos"+e);
            return null;
        }
     }
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
       
        String [] titulos= {"Placa","Modelo","Numero de solicitud","Observacion","Kilometraje","Estado","Capacidad","ID Estacionamiento","Ciudad"};
        
         String [] registro= new String [9];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        SQL1="select v.placa,v.modelo,v.numero_solicitud,v.observacion,v.kilometraje,v.estado,v.capacidad,e.ciudad,e.idEstacionamiento from vehiculo v  join Estacionamiento e using(idEstacionamiento)";
        
        try {
             Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("placa");
               registro[1]=rs.getString("modelo");
                registro[2]=rs.getString("numero_solicitud");
               registro[3]=rs.getString("observacion");
               registro[4]=rs.getString("kilometraje");
               registro[5]=rs.getString("estado");
               registro[6]=rs.getString("capacidad");
                 registro[7]=rs.getString("idEstacionamiento");
               registro[8]=rs.getString("ciudad");
                TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "No se registraron todos los datos"+e);
            return null;
        }
        
    } public DefaultTableModel buscar(int select,String busqueda){
        DefaultTableModel modelo;
        
       String [] titulos= {"Placa","Modelo","Numero de solicitud","Observacion","Kilometraje","Estado","Capacidad","ID Estacionamiento","Ciudad"};
        
        String [] registro= new String [9];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        if(select==0)
        SQL1="select* from vehiculo join Estacionamiento using(idEstacionamiento) where placa='"+busqueda+"'";
        else  if(select==1)
             SQL1="select* from vehiculo join Estacionamiento using(idEstacionamiento) where estado like'%"+busqueda+"%'";
      
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("placa");
               registro[1]=rs.getString("modelo");
                registro[2]=rs.getString("numero_solicitud");
               registro[3]=rs.getString("observacion");
               registro[4]=rs.getString("kilometraje");
               registro[5]=rs.getString("estado");
               registro[6]=rs.getString("capacidad");
               registro[7]=rs.getString("idEstacionamiento");
                 registro[8]=rs.getString("ciudad");
            
               TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,"Tipo de dato invalido");
            return null;
        }
    }
    
    public boolean insertar(Vehiculo dts){
        SQL1="insert into vehiculo(placa,modelo,numero_solicitud,observacion,kilometraje,estado,capacidad,idEstacionamiento) "
                + "values(?,?,?,?,?,?,?,?)";
        
        try {
             PreparedStatement pst=cn.prepareStatement(SQL1);
             
           
             pst.setString(1, dts.getPlaca());
             pst.setString(2, dts.getModelo());
             pst.setInt(3, dts.getNumero_solicitud());
             pst.setString(4, dts.getObservacion());
             pst.setDouble(5, dts.getKilometraje());
             pst.setString(6, dts.getEstado());
             pst.setInt(7, dts.getCapacidad());
             pst.setInt(8, dts.getIdEstacionamiento());
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
    
    public boolean editar(Vehiculo dts){
        SQL1="update vehiculo set  modelo=?,numero_solicitud=?,observacion=?,estado=?,capacidad=?,idEstacionamiento=? where placa=?";
        
        try {
             PreparedStatement pst=cn.prepareStatement(SQL1);
             
            
             pst.setString(1, dts.getModelo());
             pst.setInt(2, dts.getNumero_solicitud());
             pst.setString(3, dts.getObservacion());
             pst.setString(4, dts.getEstado());
             pst.setInt(5, dts.getCapacidad());
             pst.setInt(6, dts.getIdEstacionamiento());
               pst.setString(7, dts.getPlaca());
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
    
    
  

    
   
    public void eliminar( Vehiculo dts){
        SQL1="delete from vehiculo where placa=?";
        try {
            PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setString(1, dts.getPlaca());
             int n = pst.executeUpdate();
             
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar"+e);
          
            
        }
    }
    
    
    public boolean  Registrokilometraje(Vehiculo dts){
        
        SQL1="update vehiculo set kilometraje=? where placa=?";
            try {
                PreparedStatement pst=cn.prepareStatement(SQL1);
                pst.setDouble(1,dts.getKilometraje());
                pst.setString(2, dts.getPlaca());
                int n= pst.executeUpdate();
                
                 if (n != 0) {
                return true;
                
            } else {
                return false;
            }
                 
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Error al asignar kilometraje"+e);
                 return false;
            }
    }
}
