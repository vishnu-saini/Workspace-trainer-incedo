package com.bookapp.web.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookapp.model.persistance.User;

public class MyFrontController implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		
		// http://localhost:8080/app8/allCustomers.do
		String uri = req.getRequestURI();
		// /allCustomers.do
		int lastIndex = uri.lastIndexOf("/");
		// allCustomers.do
		String action = uri.substring(lastIndex + 1);
		System.out.println(action);
		// pass the request along the filter chain

		boolean isValid=false;// let assume he is a intr...
		if (action.equalsIgnoreCase("login.do")
				|| action.equalsIgnoreCase("logout.do")) {
			chain.doFilter(request, response);
		} else {
			HttpSession session = req.getSession(false);// look for pre existing
				// session
			if(session!=null){
				User user=(User) session.getAttribute("user");
				if(user!=null)
					isValid=true;
			}
			if(isValid)
				chain.doFilter(request, response);
			else
				res.sendRedirect("login.jsp");
		}

		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
