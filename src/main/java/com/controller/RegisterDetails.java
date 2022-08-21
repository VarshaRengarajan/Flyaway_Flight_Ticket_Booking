package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdminDAO;
import com.dao.RegisterDetailsDAO;


@WebServlet("/registerdetails")
public class RegisterDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterDetails() {
        super();
   
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd;
		
		RegisterDetailsDAO reg = new RegisterDetailsDAO();
		String status = "";
		
		String full_name = request.getParameter("full_name");
		String address = request.getParameter("address");
		String age = request.getParameter("age");
		String mobile = request.getParameter("mobile");
		String email_id = request.getParameter("email_id");
		String proof = request.getParameter("proof");
		String country = request.getParameter("country");

			
		status = reg.register(full_name, address, age, mobile, email_id, proof, country);
		if(status == "SUCCESS") {
			
			
			request.setAttribute("address",address);
			
			request.setAttribute("email_id",email_id);
			
			request.setAttribute("country",country);
			      
			HttpSession session = request.getSession(); 
			session.setAttribute("full_name",full_name);
			session.setAttribute("age",age);
			session.setAttribute("mobile",mobile);
			session.setAttribute("proof",proof);
			rd = request.getRequestDispatcher("/reviewdetails.jsp");
			rd.forward(request, response);    
		}  
	}

}
