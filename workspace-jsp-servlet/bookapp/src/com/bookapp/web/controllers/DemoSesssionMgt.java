package com.bookapp.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DemoSesssionMgt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String heading="hello";
		
		synchronized (session) {
			Integer count=(Integer)session.getAttribute("sessioncount");
			if (count==null)
			{
				count=0;
				session.setAttribute("sessioncount", count);
				heading="welcome back first time user";
				
			}
			else
			{
				count=count+1;
				session.setAttribute("sessioncount", count);
				heading="welcome back "+count;
			}
		}
		PrintWriter out=response.getWriter();
		out.print(heading);
		

	}

}
