/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Conexion;
import CapaDatos.Solicitud;
import CapaPresentacion.iuChofer;
import CapaPresentacion.iuSolicitud;
import CapaPresentacion.iuVehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class nSolicitud {
    private Conexion mysql= new Conexion();//conectar bdd
    private Connection cn=mysql.conectar();
    private String SQL1="";
    private String SQL2="";
    public Integer TotalRegistros;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos={"N# Solicitud","Cedula del cliente","Cliente","Cargamento","Carga","Precio","Origen","Destino","Fecha envio","Fecha entrega","Estado"};
        String [] registro= new String [12];  
         TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        
        SQL1="select s.numero_solicitud, s.cedula_cliente, (select nombre from cliente where cedula_cliente=s.cedula_cliente) as clienten,"
                + "(select apellido from cliente where cedula_cliente=s.cedula_cliente) as clientep,"
                + "s.cargamento,s.carga,s.precio,s.origen,s.destino,s.fecha_envio,s.fecha_entrega,s.estado from solicitud s order by s.numero_solicitud desc ";
        //natural left join kilometraje
         try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("numero_solicitud");
               registro[1]=rs.getString("cedula_cliente");
               registro[2]=rs.getString("clienten")+" "+ rs.getString("clientep");
               registro[3]=rs.getString("cargamento");
               registro[4]=rs.getString("carga");
               registro[5]=rs.getString("precio");
               registro[6]=rs.getString("origen");
               registro[7]=rs.getString("destino");
               registro[8]=rs.getString("fecha_envio");
                registro[9]=rs.getString("fecha_entrega");
                  registro[10]=rs.getString("estado");
               
               TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "No se registraron todos los datos"+e);
            return null;
        }
    }
    
     public DefaultTableModel buscar(int select,String busqueda){
        DefaultTableModel modelo;
        
        String [] titulos={"N# Solicitud","Cedula del cliente","Cliente","Cargamento","Carga","Precio","Origen","Destino","Fecha envio","Fecha entrega","Estado"};
        String [] registro= new String [12];  
         TotalRegistros=0;
        
        modelo= new DefaultTableModel(null,titulos);
        if(select==0)
       SQL1="select s.numero_solicitud, s.cedula_cliente, (select nombre from cliente where cedula_cliente=s.cedula_cliente) as clienten,"
                + "(select apellido from cliente where cedula_cliente=s.cedula_cliente) as clientep,"
                + "s.cargamento,s.carga,s.precio,s.origen,s.destino,s.fecha_envio,s.fecha_entrega,s.estado from solicitud s  where s.numero_solicitud="+busqueda+ "";
        else  if(select==1)
            SQL1="select s.numero_solicitud, s.cedula_cliente, (select nombre from cliente where cedula_cliente=s.cedula_cliente) as clienten,"
                + "(select apellido from cliente where cedula_cliente=s.cedula_cliente) as clientep,"
                + "s.cargamento,s.carga,s.precio,s.origen,s.destino,s.fecha_envio,s.fecha_entrega,s.estado from solicitud s where s.cedula_cliente="+busqueda+ "";
        else if(select==2)
           
           SQL1="select s.numero_solicitud, s.cedula_cliente, (select nombre from cliente where cedula_cliente=s.cedula_cliente) as clienten,"
                + "(select apellido from cliente where cedula_cliente=s.cedula_cliente) as clientep,"
                + "s.cargamento,s.carga,s.precio,s.origen,s.destino,s.fecha_envio,s.fecha_entrega,s.estado from solicitud s where s.fecha_envio like'%"+busqueda+"%'" ;
        
             else if(select==3){
           
           SQL1="select s.numero_solicitud, s.cedula_cliente, (select nombre from cliente where cedula_cliente=s.cedula_cliente) as clienten,"
                + "(select apellido from cliente where cedula_cliente=s.cedula_cliente) as clientep,"
                + "s.cargamento,s.carga,s.precio,s.origen,s.destino,s.fecha_envio,s.fecha_entrega,s.estado from solicitud s where s.fecha_entrega like'%"+busqueda+"%'  ";
        }
        
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("numero_solicitud");
               registro[1]=rs.getString("cedula_cliente");
               registro[2]=rs.getString("clienten")+" "+ rs.getString("clientep");
               registro[3]=rs.getString("cargamento");
               registro[4]=rs.getString("carga");
               registro[5]=rs.getString("precio");
               registro[6]=rs.getString("origen");
               registro[7]=rs.getString("destino");
               registro[8]=rs.getString("fecha_envio");
                registro[9]=rs.getString("fecha_entrega");
                  registro[10]=rs.getString("estado");
               
               TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "No se registraron todos los datos"+e);
            return null;
        }
    }
    
    
    
    public boolean insertar(Solicitud dts){
        SQL1="insert into solicitud(cedula_cliente,cargamento,carga,precio,origen,destino,fecha_envio,fecha_entrega,estado)"
                +"values(?,?,?,?,?,?,?,?,?)";
        
        try {
             PreparedStatement pst=cn.prepareStatement(SQL1);
            
             pst.setInt(1, dts.getCedula_cliente());
             pst.setString(2, dts.getCargamento());
             pst.setInt(3, dts.getCarga());
             pst.setDouble(4,dts.getPrecio());
              pst.setString(5, dts.getOrigen());
              pst.setString(6, dts.getDestino());
              pst.setTimestamp(7, dts.getFecha_envio());
              pst.setTimestamp(8, dts.getFecha_entrega());
             pst.setString(9, dts.getEstado());
             
              int n=pst.executeUpdate();
             
             
              if(n!=0){//si se insertaron registro
              return true;
             }
             else{ //no se insertaron regiustro
                 return false;
             }
             
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "No se ingresaron todos los datos"+e);
           return false;
        }
        
    }
    
    
    public boolean editar(Solicitud dts){
        
        SQL1="update solicitud set cedula_cliente=?,cargamento=?,carga=?,precio=?,origen=?,destino=?,fecha_envio=?,fecha_entrega=?,estado=? where numero_solicitud=?";
        
         try {
             PreparedStatement pst=cn.prepareStatement(SQL1);
         
             pst.setInt(1, dts.getCedula_cliente());
             pst.setString(2, dts.getCargamento());
             pst.setInt(3, dts.getCarga());
             pst.setDouble(4,dts.getPrecio());
              pst.setString(5, dts.getOrigen());
              pst.setString(6, dts.getDestino());
              pst.setTimestamp(7, dts.getFecha_envio());
              pst.setTimestamp(8, dts.getFecha_entrega());
             pst.setString(9, dts.getEstado());
                pst.setInt(10, dts.getNumero_solicitud());
              int n=pst.executeUpdate();
             
             
              if(n!=0){//si se insertaron registro
              return true;
             }
             else{ //no se insertaron regiustro
                 return false;
             }
             
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "No se pudieron editar los datos"+e);
           return false;
        }
        
    }
    
    
      public void cargar(){
        try {
              iuSolicitud.cbEstacionamiento.removeAllItems();
             Statement st= cn.createStatement();
         
         ResultSet rs=st.executeQuery("select* from estacionamiento");
             
            while(rs.next()){
               
                iuSolicitud.cbEstacionamiento.addItem(rs.getString("ciudad"));
               
            }
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public boolean eliminar(Solicitud dts){
        
        SQL1="delete from solicitud where numero_solicitud=? ";
        
        try {
          PreparedStatement pst=cn.prepareStatement(SQL1);
          pst.setInt(1, dts.getNumero_solicitud());
          
          int n=pst.executeUpdate();
          
          if(n!=0){
              return true;}
          else{
              return false;
          }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al eliminar"+e);
            return false;
        }
        
    }
    
 public void LlenarCampos(){
         SQL1="Select Tarifa_Kg from precio where ID=0";
        try {
          
           Statement st= cn.createStatement();
              ResultSet rs=st.executeQuery(SQL1);
              while(rs.next()){
               
                  iuSolicitud.txtTarifa_Kg.setText(rs.getString("Tarifa_Kg"));
              }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
           
     
    
             

