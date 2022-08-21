package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminDAO;

@WebServlet("/adminpasswordupdate")
public class AdminPasswordUpdate extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd;
		
		AdminDAO admin = new AdminDAO();
		String status = "";
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String new_password = request.getParameter("new_password");

			
		status = admin.updatePasswordAdmin(username, new_password);
		if(status == "SUCCESS") {
			rd = request.getRequestDispatcher("/adminlogin.jsp");
			rd.forward(request, response);
		}
		
	}
}
