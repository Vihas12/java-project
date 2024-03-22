package ptts.fun;


import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
 
    Connection  con = null;
    
    public Connection conexion(){
       // String bd = "java_admin_database";
        String username = "vihas";
        String password = "Vihas8108@";
        String url = "jdbc:mysql://localhost:3306/java_admin_database";
        
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
           con = (Connection)DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            System.out.print(e);
        }
        return con;
    }
}
