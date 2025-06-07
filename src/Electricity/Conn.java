package Electricity;

import java.sql.*;
import io.github.cdimascio.dotenv.Dotenv;

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{
            Dotenv dotenv = Dotenv.load();
            String user = dotenv.get("DB_USER");
            String password = dotenv.get("DB_PASSWORD");
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///ebs",user,password);
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  