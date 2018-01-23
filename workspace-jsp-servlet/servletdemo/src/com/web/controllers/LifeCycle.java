package com.web.controllers;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LifeCycle() {
		System.out.println("i am ctr of LC");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println(" init method ...");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println(" i am in doget()");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		
		System.out.println("destroy()");
	}

}
