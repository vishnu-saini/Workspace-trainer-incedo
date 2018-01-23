package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.service.ejb.AtmVerifyRemote;

@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private AtmVerifyRemote atm;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
/*
		try {
			InitialContext ctx = new InitialContext();
			atm = (AtmVerifyRemote) ctx
					.lookup("java:global/app/AtmVerify!com.app.service.ejb.AtmVerifyRemote");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.print(atm.isValid("121"));
	}

}
