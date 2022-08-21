package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/bookflight")
public class BookFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BookFlight() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd;
		String flight_no = request.getParameter("flight_no");

		HttpSession session = request.getSession(); 
		session.setAttribute("flight_no",flight_no);
		rd = request.getRequestDispatcher("/registerdetails.jsp");
		rd.forward(request, response);    
	}
 
}
