package net.registration.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.registration.model.User;

public class UserDao {
	public int registerUser(User user)
	{
		Connection con=ConnectionDao.getDBconnection();
		try
		{
		 String query="INSERT INTO onlinevaccinebooking(name,emaild,password,phonenumber)VALUES(?,?,?,?)";
		 PreparedStatement st= con.prepareStatement(query);
		 st.setString(1,user.getName());
			 st.setString(2,user.getEmailId());
			 st.setString(3,user.getPassword());	
			 st.setString(4,user.getPhoneNumber());
			  int rs= st.executeUpdate();
			 
			 return rs;
			 
		}
		catch(SQLException e) {e.printStackTrace();}
		return 0;
	      
	}
}
