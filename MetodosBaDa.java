
package MetodosBaDa;

//import com.mysql.jdbc.Connection;
//import java.sql.ResultSet;
//import java.sql.PreparedStatement;
import java.sql.*;
/**
 *
 * @author Zanahoria Pc
 */
public class MetodosBaDa {
    public static ConexionBaDa conexion = new ConexionBaDa();
    public static PreparedStatement sentencia_preparada ;
    public static ResultSet resultado;
    public static String url;
    public static int resultado_no= 0;
    
    public int guardar(String nombredeusuario, String contrasena,String nombre, String edad ){
        int resultado = 0;
        Connection conexion = null;
        
        String sentencia_guardar = ("INSERT INTO usuarios (nombredeusuario, contrasena, nombre, edad) VALUES(?,?,?,?)");
        
        try{
            conexion = ConexionBaDa.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1,nombredeusuario);
            sentencia_preparada.setString(2,contrasena);
            sentencia_preparada.setString(3,nombre);
            sentencia_preparada.setString(4,edad);
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            
        }catch(Exception e){
            System.out.print(e);
        }
        return resultado;
    }
}
