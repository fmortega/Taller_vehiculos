
package CapaDatos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
   private final String BD="Vehiculo"; 
   private final String user="root";
   private final String password="";
   private final String url="jdbc:mysql://localhost:3306/"+BD;
   private Connection con=null;
   public Connection getConnetion(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con = (Connection) DriverManager.getConnection(this.url,this.user,this.password);
       } catch (Exception e) {
           JOptionPane.showInternalMessageDialog(null, e);
       }
       return con;
   }
}
