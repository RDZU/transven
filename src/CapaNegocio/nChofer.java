/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Chofer;
import CapaDatos.Conexion;
import CapaDatos.Usuario;
import CapaPresentacion.iuChofer;
import CapaPresentacion.iuPrecio;
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
public class nChofer {
    private Conexion mysql= new Conexion();//conectar bdd
    private Connection cn=mysql.conectar();
    private String SQL1="";
    public Integer TotalRegistros;
    
     public DefaultTableModel mostrarVista(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos= {"Cedula","Nombre","Apellido","Direccion","Telefono","Estado","N# Viajes","Km Recorrido","Dias de viatico","Viatico","Pago"};
        
        String [] registro= new String [11];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        
        SQL1="select* from chofer where estado='Disponible' group by nombre,apellido"; 
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("cedula_chofer");
               registro[1]=rs.getString("nombre");
               registro[2]=rs.getString("apellido");
               registro[3]=rs.getString("direccion");
               registro[4]=rs.getString("telefono");
               registro[5]=rs.getString("estado");
               registro[6]=rs.getString("Num_viajes");
               registro[7]=rs.getString("Km_recorrido");
               registro[8]=rs.getString("dia_viaje");
               registro[9]=rs.getString("viatico");
               registro[10]=rs.getString("pago");
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
        
        String [] titulos= {"Cedula","Nombre","Apellido","Direccion","Telefono","Estado","N# Viajes","Km Recorrido","Dias de viatico","Viatico","Pago"};
        
        String [] registro= new String [11];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        
        SQL1="select* from chofer where nombre like'%"+buscar+"%' group by nombre,apellido"; 
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("cedula_chofer");
               registro[1]=rs.getString("nombre");
               registro[2]=rs.getString("apellido");
               registro[3]=rs.getString("direccion");
               registro[4]=rs.getString("telefono");
               registro[5]=rs.getString("estado");
               registro[6]=rs.getString("Num_viajes");
               registro[7]=rs.getString("Km_recorrido");
               registro[8]=rs.getString("dia_viaje");
               registro[9]=rs.getString("viatico");
               registro[10]=rs.getString("pago");
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
        
        String [] titulos= {"Cedula","Nombre","Apellido","Direccion","Telefono","Estado","N# Viajes","Km Recorrido","Dias de viatico","Viatico","Pago"};
        
        String [] registro= new String [11];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        if(select==0)
        SQL1="select* from chofer where nombre like'%"+busqueda+"%'";
        else  if(select==1)
             SQL1="select* from chofer where apellido like'%"+busqueda+"%'";
        else if(select==2){
            if(busqueda.matches("[0-9]*"))
            SQL1="select * from chofer where cedula_chofer="+busqueda+"";   
            
            
        }
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
              registro[0]=rs.getString("cedula_chofer");
               registro[1]=rs.getString("nombre");
               registro[2]=rs.getString("apellido");
               registro[3]=rs.getString("direccion");
               registro[4]=rs.getString("telefono");
               registro[5]=rs.getString("estado");
               registro[6]=rs.getString("Num_viajes");
               registro[7]=rs.getString("Km_recorrido");
               registro[8]=rs.getString("dia_viaje");
               registro[9]=rs.getString("viatico");
               registro[10]=rs.getString("pago");
               TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,"Tipo de dato invalido");
            return null;
        }
    }
     public DefaultTableModel buscar2(int select,String busqueda){
        DefaultTableModel modelo;
        
        String [] titulos= {"Cedula","Nombre","Apellido","Direccion","Telefono","Estado","N# Viajes","Km Recorrido","Dias de viatico","Viatico","Pago"};
        
        String [] registro= new String [11];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        if(select==0)
        SQL1="select* from chofer where estado='Disponible' and nombre like'%"+busqueda+"%'";
        else  if(select==1)
             SQL1="select* from chofer where estado='Disponible' and apellido like'%"+busqueda+"%'";
        else if(select==2){
            if(busqueda.matches("[0-9]*"))
            SQL1="select * from chofer where estado='Disponible' and cedula_chofer="+busqueda+"";   
            
            
        }
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
              registro[0]=rs.getString("cedula_chofer");
               registro[1]=rs.getString("nombre");
               registro[2]=rs.getString("apellido");
               registro[3]=rs.getString("direccion");
               registro[4]=rs.getString("telefono");
               registro[5]=rs.getString("estado");
               registro[6]=rs.getString("Num_viajes");
               registro[7]=rs.getString("Km_recorrido");
               registro[8]=rs.getString("dia_viaje");
               registro[9]=rs.getString("viatico");
               registro[10]=rs.getString("pago");
               TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,"Tipo de dato invalido");
            return null;
        }
    }
    public boolean insertar (Chofer dts){
        SQL1="insert into chofer(cedula_chofer,nombre,apellido,direccion,telefono,estado,Num_viajes,Km_recorrido,dia_viaje,viatico,pago)"
                +"values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setInt(1, dts.getCedula_chofer());
            pst.setString(2, dts.getNombre());
             pst.setString(3, dts.getApellido());
             pst.setString(4, dts.getDireccion());
             pst.setString(5, dts.getTelefono());
             pst.setString(6, dts.getEstado());
             pst.setInt(7, dts.getNum_viajes());
             pst.setDouble(8, dts.getKm_recorrido());
             pst.setInt(9,dts.getDia_viaje());
             pst.setDouble(10,dts.getViatico());
             pst.setDouble(11,dts.getPago());
             
             int n=pst.executeUpdate();
             
             if(n!=0){//si se insertaron registro
                 return true;
             }
             else{ //no se insertaron regiustro
                 return false;
             }
             
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al ingreso de un tipo de dato incorrecto"+e);
            return false;
        }
        
    }
    
    
    public boolean CalcularSueldo(Chofer dts){
  SQL1="update chofer set Num_viajes=?,Km_recorrido=?,dia_viaje=?, viatico=?, pago=? where cedula_chofer=?";
         try {
       PreparedStatement pst=cn.prepareStatement(SQL1);
              pst.setInt(1, dts.getNum_viajes());
              pst.setDouble(2, dts.getKm_recorrido());
              pst.setInt(3, dts.getDia_viaje());
             pst.setDouble(4, dts.getViatico());
             pst.setDouble(5, dts.getPago());
              pst.setInt(6, dts.getCedula_chofer());
             int n=pst.executeUpdate();
              if(n!=0){//si se insertaron registro
                 return true;
             }
             else{ //no se insertaron regiustro
                 return false;
             }
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "Error al calcular sueldo"+e);
            return false;
        }    }

    public boolean editar(Chofer dts) {
        
        SQL1="update chofer set cedula_chofer=?, nombre=?,apellido=?,direccion=?,telefono=?,estado=? where cedula_chofer=? ";
        
                
                try {
            
                    PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setInt(1, dts.getCedula_chofer());
            pst.setString(2, dts.getNombre());
             pst.setString(3, dts.getApellido());
             pst.setString(4, dts.getDireccion());
             pst.setString(5, dts.getTelefono());
             pst.setString(6, dts.getEstado());
          
              pst.setInt(7, dts.getCedula_chofer());
             int n=pst.executeUpdate();
              if(n!=0){//si se insertaron registro
                 return true;
             }
             else{ //no se insertaron regiustro
                 return false;
             }
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "Error al editar"+e);
            return false;
        }
                
                
    
    }
    
    public boolean eliminar (Chofer dts){
        
       SQL1="delete from chofer where cedula_chofer=?";
        
        try {
            PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setInt(1, dts.getCedula_chofer());
        
             int n = pst.executeUpdate();
              if(n!=0){//si se insertaron registro
                 return true;
             }
             else{ //no se insertaron regiustro
                 return false;
             }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al eliminar "+e);
            return false;
        }
    }
     public void LlenarCampos(){
         SQL1="Select Tarifa_viaje,Tarifa_Km,Tarifa_viatico,Sueldo_base from precio where ID=0";
        try {
          
           Statement st= cn.createStatement();
              ResultSet rs=st.executeQuery(SQL1);
              while(rs.next()){
                  iuChofer.txtTarifa_Viaje.setText(rs.getString("Tarifa_viaje"));
                  iuChofer.txtTarifa_Km.setText(rs.getString("Tarifa_Km"));
                  iuChofer.txtTarifa_Viatico.setText(rs.getString("Tarifa_viatico"));
                  iuChofer.txtSueldo_base.setText(rs.getString("Sueldo_base"));
              }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public boolean OcuparChofer(Chofer dts){
        SQL1="update chofer set estado=? where cedula_chofer=?";
        try {
            PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setString(1, dts.getEstado());
            pst.setInt(2, dts.getCedula_chofer());
            int n = pst.executeUpdate();
              if(n!=0){//si se insertaron registro
                 return true;
             }
             else{ //no se insertaron regiustro
                 return false;
             }
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "Error al ocupar"+e);
             return false;
        }
    }
    
    public boolean ViaticoSueldo(Chofer dts){
        SQL1="update chofer set Num_viajes=?,Km_recorrido=?,dia_viaje=? where cedula_chofer=?";
        try {
              PreparedStatement pst=cn.prepareStatement(SQL1);
              pst.setInt(1, dts.getNum_viajes());
              pst.setDouble(2, dts.getKm_recorrido());
              pst.setInt(3, dts.getDia_viaje());
              pst.setInt(4, dts.getCedula_chofer());
              
              int n=pst.executeUpdate();
               if(n!=0){//si se insertaron registro
                 return true;
             }
             else{ //no se insertaron regiustro
                 return false;
             }
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "Error al calcular viatico y sueldo"+e);
                     return false;
        }
    }
}

