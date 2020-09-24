
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Kiam
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
      System.out.println("Update Value in Mysql Database table!");
      Connection con = null;
      String url="jdbc:mysql://localhost:3306/";
      String db="msrsdb";
      String driver="com.mysql.jdbc.Driver";
      
       try{
           Class.forName(driver);
           con=DriverManager.getConnection(url + db,"root","");
           System.out.println("Successfull Connection");
        return con;
   }
       catch(Exception e){
      
       JOptionPane.showMessageDialog(null, "Connectionprovider connection error");
       return null;
   }
    }
}


