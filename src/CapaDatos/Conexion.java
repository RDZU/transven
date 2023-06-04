
package CapaDatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {  
   public String db="transven"; //nombre de la base de datos en xamppp
   public String url="jdbc:mysql://127.0.0.1/"+db;//direccion de la base de datos por defecto
    public String usuario="root"; //usuario por defecto
    public String password="";
   
    
    
    
    //conexion para red
/*
 public String db="transven3";
 public String usuario="rdzu55";
  public String url="jdbc:mysql://db4free.net:3306/"+db;
  public String password="o7117649";
/*/
    public Conexion() {
    }
  
   public Connection  conectar(){
       
       Connection link=null;
       
       try {
           Class.forName("org.gjt.mm.mysql.Driver");//driver de conexion
      link=DriverManager.getConnection(this.url, this.usuario, this.password);
       System.out.println("Conexion en linea");
       } catch (ClassNotFoundException| SQLException e) {
           JOptionPane.showMessageDialog(null, "No se puede conectar con la base de datos verificar el nombre y la ruta"+e);
           System.out.println("Conexion fallida");
       }
       
   return link;
   
   
}

}