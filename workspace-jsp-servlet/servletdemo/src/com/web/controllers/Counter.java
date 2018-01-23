package com.web.controllers;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// how many people visited to my app till now...
public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private  AtomicInteger counter=new AtomicInteger(0);

	public Counter() {
		System.out.println("ctr of conter is called");
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println(" init method  of counter.");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println(" u are visiter no:" + counter.getAndIncrement());
	}

}
