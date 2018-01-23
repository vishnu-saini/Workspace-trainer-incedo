package com.bookapp.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookapp.model.persistance.User;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		User user=new User(name, password);
		if(user.isValid()){
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("user", user);
			RequestDispatcher dispatcher=request.getRequestDispatcher("addBook.jsp");
			
			dispatcher.forward(request, response);
		}
		else{
			
			request.setAttribute("error", "login failed");
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
	}

}
