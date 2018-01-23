package com.bookapp.web.listners;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.bookapp.model.persistance.DbUtil;

public class DbInitilizerListner implements ServletContextListener {
	private Connection connection=null;
	public void contextInitialized(ServletContextEvent event) {
		 connection=DbUtil.getConnection();
		 event.getServletContext().setAttribute("connection", connection);
	}

	public void contextDestroyed(ServletContextEvent event) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
