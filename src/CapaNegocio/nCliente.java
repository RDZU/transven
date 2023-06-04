/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Cliente;
import CapaDatos.Conexion;
import CapaDatos.Usuario;
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
public class nCliente {
    private Conexion mysql= new Conexion();//conectar bdd
    private Connection cn=mysql.conectar();
    private String SQL1="";
    public Integer TotalRegistros;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos= {"Cedula","Nombre","Apellido","Direccion","Telefono","Cedula del usuario"};
        
        String [] registro= new String [6];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        
        SQL1="select* from cliente where nombre like'%"+buscar+"%' group by nombre,apellido "; 
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("cedula_cliente");
               registro[1]=rs.getString("nombre");
               registro[2]=rs.getString("apellido");
               registro[3]=rs.getString("direccion");
               registro[4]=rs.getString("telefono");
               registro[5]=rs.getString("cedula_usuario");
              
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
        
        String [] titulos= {"Cedula","Nombre","Apellido","Direccion","Telefono","cedula del usuario"};
        
        String [] registro= new String [6];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        if(select==0)
        SQL1="select* from cliente where nombre like'%"+busqueda+"%'";
        else  if(select==1)
             SQL1="select* from cliente where apellido like'%"+busqueda+"%'";
        else if(select==2){
           // if(busqueda.matches("[0-9]*"))
            SQL1="select * from cliente where cedula_cliente="+busqueda+"";   
            
            
        }
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("cedula_cliente");
               registro[1]=rs.getString("nombre");
               registro[2]=rs.getString("apellido");
               registro[3]=rs.getString("direccion");
               registro[4]=rs.getString("telefono");
               registro[5]=rs.getString("cedula_usuario");
            
               TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Tipo de dato invalido");
            return null;
        }
    }
    
    public boolean insertar (Cliente dts){
        SQL1="insert into cliente(cedula_cliente,nombre,apellido,direccion,telefono,cedula_usuario)"
                +"values(?,?,?,?,?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setInt(1, dts.getCedula_cliente());
            pst.setString(2, dts.getNombre());
             pst.setString(3, dts.getApellido());
             pst.setString(4, dts.getDireccion());
             pst.setString(5, dts.getTelefono());
            pst.setInt(6, dts.getCedula_usuario());
             
             int n=pst.executeUpdate();
             
             if(n!=0){//si se insertaron registro
                 return true;
             }
             else{ //no se insertaron regiustro
                 return false;
             }
             
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "tipo de dato incorrecto"+e);
            return false;
        }
        
    }
    
    public boolean editar(Cliente dts) {
        
        SQL1="update cliente set cedula_cliente=?, nombre=?,apellido=?,direccion=?,telefono=?,cedula_usuario=? where cedula_cliente=? ";
        
                
                try {
            
                    PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setInt(1, dts.getCedula_cliente());
            pst.setString(2, dts.getNombre());
             pst.setString(3, dts.getApellido());
             pst.setString(4, dts.getDireccion());
             pst.setString(5, dts.getTelefono());
             pst.setInt(6, dts.getCedula_usuario());
              pst.setInt(7, dts.getCedula_cliente());
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
    
    public boolean eliminar (Cliente dts){
        
        SQL1="delete from cliente where cedula_cliente=?";
        
        try {
            PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setInt(1, dts.getCedula_cliente());
        
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
    
   
}
