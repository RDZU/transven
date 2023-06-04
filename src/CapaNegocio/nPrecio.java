/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Conexion;
import CapaDatos.Precio;
import CapaDatos.Usuario;
import CapaPresentacion.iuPrecio;
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
public class nPrecio {
    private Conexion mysql= new Conexion();//conectar bdd
    private Connection cn=mysql.conectar();
    private String SQL1="";
    public Integer TotalRegistros;
    
    
    
    public void LlenarCampos(){
         SQL1="Select Tarifa_Kg,Tarifa_viaje,Tarifa_Km,Tarifa_viatico,Sueldo_base from precio where ID=0";
        try {
          
           Statement st= cn.createStatement();
              ResultSet rs=st.executeQuery(SQL1);
              while(rs.next()){
                  iuPrecio.txtTarifa_Kg.setText(rs.getString("Tarifa_Kg"));
                  iuPrecio.txtTarifa_Viaje.setText(rs.getString("Tarifa_viaje"));
                  iuPrecio.txtTarifa_Km.setText(rs.getString("Tarifa_Km"));
                  iuPrecio.txtTarifa_Viatico.setText(rs.getString("Tarifa_viatico"));
                  iuPrecio.txtSueldo_base.setText(rs.getString("Sueldo_base"));
              }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
   
     //PROCEDIMIENTOS ALMACENADOS
   
    public boolean editar(Precio dts){
        try {
    CallableStatement cs=cn.prepareCall("CALL ActualizarPrecio(?,?,?,?,?)");
                    cs.setDouble(1, dts.getTarifa_Kg());
                     cs.setDouble(2, dts.getTarifa_viaje());
                      cs.setDouble(3, dts.getTarifa_Km());
                       cs.setDouble(4, dts.getTarifa_viatico());
                        cs.setDouble(5, dts.getSueldo_base());
                cs.execute();
                     return true;
          } catch (Exception e) {
    JOptionPane.showConfirmDialog(null, "Error al actualizar"+e);
            return false;
        }
       
    }
 
    


}
