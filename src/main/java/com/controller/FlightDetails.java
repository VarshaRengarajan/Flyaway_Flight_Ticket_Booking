package com.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FlightDetailsDAO;
import com.model.Flight;



@WebServlet("/flightdetails")
public class FlightDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FlightDetails() {
        super();
        
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String date = request.getParameter("date");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String num_tickets = request.getParameter("num_tickets");
		
		RequestDispatcher rd;
		 
		request.setAttribute("flight_details", new FlightDetailsDAO().getFlightDetails(date));
		
		rd = request.getRequestDispatcher("/flightdetails.jsp");
		rd.forward(request, response);
		
	} 

}
