package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminDAO;

@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		
		RequestDispatcher rd;
		
		AdminDAO admin = new AdminDAO();
		boolean userfound = AdminDAO.adminLogin(Username, Password);
		if (userfound){
			rd = request.getRequestDispatcher("/searchflight.jsp");
			rd.forward(request, response);
		}
		else{
			rd = request.getRequestDispatcher("/adminloginerror.jsp");
			rd.forward(request, response);
			
		}
		
	}
}