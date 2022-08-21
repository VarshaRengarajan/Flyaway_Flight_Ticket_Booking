package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterDetailsDAO {

	public static Connection con = null;
	public static PreparedStatement pst = null;

	public static String register(String full_name, String address,String age,
			String mobile,String email_id,String proof,String country) {
		
		String status = "";
		
		String sql = "insert into Register (Full_Name, Address, Age, Mobile_no, email_id, Details, country)"
				+ " values(?,?,?,?,?,?,?)";
		
		try {
			con = DBConnect.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, full_name);
			pst.setString(2, address);
			pst.setString(3, age);
			pst.setString(4, mobile);
			pst.setString(5, email_id);
			pst.setString(6, proof);
			pst.setString(7, country);
			
			if (pst.executeUpdate() == 1) {
				status = "SUCCESS";
			} else
				status = "FAIL";
		    
		    	
		} catch (SQLException e) {
			e.printStackTrace();
			
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
