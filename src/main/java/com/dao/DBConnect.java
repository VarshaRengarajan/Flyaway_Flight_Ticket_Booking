package com.dao;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;

public class DBConnect {
	
	

	public static Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		String jdbcUrl = "jdbc:mysql://localhost:3306/db_world";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String password = "root";


		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(jdbcUrl, user, password);

		}catch(Exception e)
		{

			e.printStackTrace();
		}
		
		return con;
	}
		
		
		
		
		
		
	

	

}

