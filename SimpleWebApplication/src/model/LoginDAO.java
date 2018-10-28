package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	
	public  static boolean validate(String username,String password){
		 try{
	            // connecting to the database
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CZ3002", "root", "CZ4031admin");
	            String query="select username,pass from login";
	            PreparedStatement p;
	            p=connection.prepareStatement(query);
	            ResultSet rs =p.executeQuery();
	            rs.next();
	            String db_username=rs.getString("username");
	            String db_password=rs.getString("pass");
	            
	            // validating 
				if ((username.equals(db_username))&&(password.equals(db_password))) return true;
				else return false;
		 
		 }
		 catch(IllegalAccessException iae){
			 
		 }
		 catch(InstantiationException i){
			 
		 }
		 catch(SQLException se){
			 
		 }
		 catch(ClassNotFoundException cnfe){
			 
		 }
		 
		 return false;
	
           
			
		
	}
		
		 


}
