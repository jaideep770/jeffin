package net.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDao {
	public static Connection getDBconnection()

	{
		Connection r= null;
		
		  try
		   {
		  Class.forName("com.mysql.cj.jdbc.Driver");
	
		   }
			catch(ClassNotFoundException e) {
				e.printStackTrace();
				
			}
			 
			 
		try
		  {
		  String url="jdbc:mysql://localhost:3306/db2";
		  String uname="root";
		  String pass="jeffin@22";
		   r=DriverManager.getConnection(url,uname,pass);
		  }
		 
		 catch(SQLException e) {
			 e.printStackTrace();
			
			 }
		 return r;
		}
	
}




