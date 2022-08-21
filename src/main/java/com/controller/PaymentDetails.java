package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.FlightDetailsDAO;
import com.dao.PaymentDetailsDAO;
import com.dao.RegisterDetailsDAO;


@WebServlet("/paymentdetails")
public class PaymentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public PaymentDetails() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd;
		
		
		HttpSession session = request.getSession(); 
		String flight_no = (String)session.getAttribute("flight_no");
		
		
		request.setAttribute("customer_flight_details", new PaymentDetailsDAO().get_flight(flight_no));
		
		rd = request.getRequestDispatcher("/paymentconfirmation.jsp");
		rd.forward(request, response);
		
	}

}
