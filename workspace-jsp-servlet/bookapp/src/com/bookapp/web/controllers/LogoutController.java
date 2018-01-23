package com.bookapp.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		//code of logout
		//ask for pre existing session if yes invalidate and and go back to login page
		
		HttpSession httpSession=request.getSession(false);
		if(httpSession!=null){
			httpSession.invalidate();
		}

		response.sendRedirect("login.jsp");
	}

}
