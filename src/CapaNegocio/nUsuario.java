/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Conexion;
import CapaDatos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;

/**
 *
 * @author david
 */
public class nUsuario {
    private Conexion mysql= new Conexion();//conectar bdd
    private Connection cn=mysql.conectar();
    private String SQL1="";
    public Integer TotalRegistros;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos= {"Cedula","Nombre","Apellido","Direccion","Telefono","Acceso","Login","Contraseña"};
        
        String [] registro= new String [8];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        
        SQL1="select* from usuario where nombre like'%"+buscar+"%'group by nombre,apellido";  
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("cedula_usuario");
               registro[1]=rs.getString("nombre");
               registro[2]=rs.getString("apellido");
               registro[3]=rs.getString("direccion");
               registro[4]=rs.getString("telefono");
               registro[5]=rs.getString("acceso");
               registro[6]=rs.getString("login");
               registro[7]=rs.getString("contraseña");
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
        
        String [] titulos= {"Cedula","Nombre","Apellido","Direccion","Telefono","Acceso","Login","Contraseña"};
        
        String [] registro= new String [8];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        if(select==0)
        SQL1="select* from usuario where nombre like'%"+busqueda+"%'";
        else  if(select==1)
             SQL1="select* from usuario where apellido like'%"+busqueda+"%'";
        else if(select==2){
           // if(busqueda.matches("[0-9]*"))
            SQL1="select * from usuario where cedula_usuario="+busqueda+"";   
           
            
        }
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("cedula_usuario");
               registro[1]=rs.getString("nombre");
               registro[2]=rs.getString("apellido");
               registro[3]=rs.getString("direccion");
               registro[4]=rs.getString("telefono");
               registro[5]=rs.getString("acceso");
               registro[6]=rs.getString("login");
               registro[7]=rs.getString("contraseña");
               TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Tipo de dato invalido");
            return null;
        }
    }
    
   /* public boolean insertar (Usuario dts){
        SQL1="insert into usuario(cedula_usuario,nombre,apellido,direccion,telefono,acceso,login,contraseña)"
                +"values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setInt(1, dts.getCedula_usuario());
            pst.setString(2, dts.getNombre());
             pst.setString(3, dts.getApellido());
             pst.setString(4, dts.getDireccion());
             pst.setString(5, dts.getTelefono());
             pst.setString(6, dts.getAcceso());
             pst.setString(7, dts.getLogin());
             pst.setString(8, dts.getContraseña());
             
             int n=pst.executeUpdate();
             
             if(n!=0){//si se insertaron registro
                 return true;
             }
             else{ //no se insertaron regiustro
                 return false;
             }
             
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Login repetido o ingreso un tipo de dato incorrecto"+e);
            return false;
        }
        
    }
    /*/  //PROCEDIMIENTOS ALMACENADOS
    public boolean insertar(Usuario dts)  {
         try {
            
       
        CallableStatement cs=cn.prepareCall("CALL InsertarUsuario(?,?,?,?,?,?,?,?)");
       
           cs.setInt(1, dts.getCedula_usuario());  
            cs.setString(2, dts.getNombre());
             cs.setString(3, dts.getApellido());
             cs.setString(4, dts.getDireccion());
             cs.setString(5, dts.getTelefono());
             cs.setString(6, dts.getAcceso());
             cs.setString(7, dts.getLogin());
             cs.setString(8, dts.getContraseña());
                cs.execute();
                     return true;
          } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "Login o cedula repetida, ingreso un tipo de dato incorrecto "+e);
            return false;
        }
       
    }
    public boolean editar(Usuario dts){
        try {
    CallableStatement cs=cn.prepareCall("CALL EditarUsuario(?,?,?,?,?,?,?,?,?)");
    cs.setInt(1, dts.getCedula_usuario());  
            cs.setString(2, dts.getNombre());
             cs.setString(3, dts.getApellido());
             cs.setString(4, dts.getDireccion());
             cs.setString(5, dts.getTelefono());
             cs.setString(6, dts.getAcceso());
             cs.setString(7, dts.getLogin());
             cs.setString(8, dts.getContraseña());
             cs.setInt(9, dts.getCedula_usuario());
                cs.execute();
                     return true;
          } catch (Exception e) {
    JOptionPane.showConfirmDialog(null, "Error al editar"+e);
            return false;
        }
       
    }
   /* public boolean editar(Usuario dts) {
        
        SQL1="update Usuario set cedula_usuario=?, nombre=?,apellido=?,direccion=?,telefono=?,acceso=?,login=?,contraseña=? where cedula_usuario=? ";
        
                
                try {
            
                    PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setInt(1, dts.getCedula_usuario());
            pst.setString(2, dts.getNombre());
             pst.setString(3, dts.getApellido());
             pst.setString(4, dts.getDireccion());
             pst.setString(5, dts.getTelefono());
             pst.setString(6, dts.getAcceso());
             pst.setString(7, dts.getLogin());
             pst.setString(8, dts.getContraseña());
              pst.setInt(9, dts.getCedula_usuario());
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
    /*/
    
    public boolean eliminar(Usuario dts){
         try {
    CallableStatement cs=cn.prepareCall("CALL EliminarUsuario(?)");
    cs.setInt(1, dts.getCedula_usuario());  
                cs.execute();
                     return true;
          } catch (Exception e) {
    JOptionPane.showConfirmDialog(null, "Error al Eliminar"+e);
            return false;
            
        }
        
    }
    
    /*
    public boolean eliminar (Usuario dts){
        
        SQL1="delete from Usuario where cedula_usuario=?";
        
        try {
            PreparedStatement pst=cn.prepareStatement(SQL1);
            pst.setInt(1, dts.getCedula_usuario());
        
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
    }/*/
    
    public DefaultTableModel login(String login, String contraseña){
        DefaultTableModel modelo;
        
        String [] titulos= {"Cedula","Nombre","Apellido","Acceso","Login","Contraseña"};
        
        String [] registro= new String [6];
        TotalRegistros=0;
        modelo= new DefaultTableModel(null,titulos);
        
        SQL1="select cedula_usuario,nombre,apellido,acceso,login,contraseña from usuario  where login='"+login+"' and contraseña='"+contraseña+"'"; 
        
        try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(SQL1);
           
           while(rs.next()){
               registro[0]=rs.getString("cedula_usuario");
               registro[1]=rs.getString("nombre");
               registro[2]=rs.getString("apellido");
               registro[3]=rs.getString("acceso");
               registro[4]=rs.getString("login");
               registro[5]=rs.getString("contraseña");
               TotalRegistros++;
               modelo.addRow(registro);//agrega todo losregistro en una fila de la tabla
           }
           return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "No se registraron todos los datos"+e);
            return null;
        }
    }
}
