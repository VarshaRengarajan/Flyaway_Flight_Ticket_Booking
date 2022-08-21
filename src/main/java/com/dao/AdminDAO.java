package com.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDAO {
	 public static Connection con = null;
	 public static PreparedStatement pst = null;

	// admin login
	public static boolean adminLogin(String Username , String Password) {
		boolean emailfound=true;
		
		String sql = "select * from Login where Username = ? and Password = ?";
		
		try {
			con = DBConnect.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, Username);
			pst.setString(2, Password);
			ResultSet rs = pst.executeQuery();
			if (rs.next()==false){
		    	emailfound =false;
		    	}
		    else{
		    	emailfound = true;
		    }	
		    	
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return emailfound;
	}
	
	// update admin password
	public String updatePasswordAdmin(String Username , String Password) {
		
		String sql = "update Login set Password=? WHERE Username = ?";
		String status = "";

		try {
			con = DBConnect.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, Password);
			pst.setString(2, Username);

			if (pst.executeUpdate() == 1) {
				status = "SUCCESS";
			} else
				status = "FAIL";
		} catch (Exception e) {
			status = "FAIL";
		}finally {
			try {
				con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}

		}
		return status;
	}

}