package com.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    @Resource(name="jdbc/test")
    private DataSource ds;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Conn
		try {
			Connection connection=ds.getConnection();
			System.out.println("conn is done");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("problem");
			e.printStackTrace();
		}
	}

}
