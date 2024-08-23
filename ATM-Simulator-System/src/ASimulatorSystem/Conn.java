package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection con;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/BankMS?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Mangesh@27");    
             s =con.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
