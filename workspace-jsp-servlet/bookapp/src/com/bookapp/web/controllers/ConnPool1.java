package com.bookapp.web.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class ConnPool1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//now i hv to fetch connection
	// one is older way: using jndi
	// sec is newer one ie DI
	
	//@Resource(name="jdbc/test")
	//private DataSource ds;
	
	
	DataSource ds=null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		Context initContext=null;
		try {
			initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			 ds = (DataSource)envContext.lookup("jdbc/test");
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection connection=ds.getConnection();
			System.out.println("conn is done!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}












