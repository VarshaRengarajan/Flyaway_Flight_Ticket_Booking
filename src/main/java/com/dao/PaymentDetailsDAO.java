package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.model.Flight;

public class PaymentDetailsDAO {

	public static Connection con = null;
	public static PreparedStatement pst = null;

	public ArrayList<Flight> get_flight(String flight_no) {
		
		ResultSet rs = null;
		ArrayList<Flight> ResultList = new ArrayList<Flight>(); 
		String status = "";
		
		String sql = "select * from FlightDetails where flight_no = ?";
		
		try {
			con = DBConnect.getConnection();
			pst = con.prepareStatement(sql);  
			pst.setString(1, flight_no);
			
			rs = pst.executeQuery();

			
			while (rs.next()) {          
				Flight flight = new Flight();
				flight.setAirline_name(rs.getString(1));
				flight.setPrice(rs.getString(2));
				flight.setFlight_no(rs.getString(3));
				flight.setSource_city(rs.getString(4));
				flight.setDestination_city(rs.getString(5));
				flight.setDeparture_time(rs.getString(6));
				flight.setArrival_time(rs.getString(7));
				flight.setTotal_seats(rs.getString(8));
				flight.setBooked_seats(rs.getString(9));
				flight.setSeat_availability(rs.getString(10));
				flight.setDate_of_travel(rs.getString(11));
				flight.setClass_type(rs.getString(12));
				ResultList.add(flight);
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
		return ResultList;
	}
}
