/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosBaDa;

//import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author Zanahoria Pc
 */
public class ConexionBaDa {
    //public static String url = "jdbc:mysql://localhost/proyecto";
    //public static String usuario ="root";
    //public static String contrasena ="root";
    //public static String clase = "com.mysql.jdbc.driver";
    
    public static Connection conectar (){
       /* Connection conexion = null;
        try{
            Class.forName(clase);
            conexion =(Connection) DriverManager.getConnection(url,usuario,contrasena);
            System.out.print("conexion establecida");
        }catch( Exception e){
            System.out.print("no hay conexion: "+ e);
        }
        return conexion;
    }*/
          
        try{
          Connection cn = DriverManager.getConnection("jdbc:mysql://proyecto", "root", "root");
            return cn;
        } catch(SQLException e){
            System.out.println(" surgio un problema para la conexion" + e);
        }
        return (null);
    }
}
