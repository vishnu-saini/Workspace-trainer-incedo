package com.bookapp.web.controllers;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.persistance.BookDao;
import com.bookapp.model.persistance.BookDaoImp;
import com.bookapp.model.persistance.DbUtil;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImp;

public class AddBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection = null;

	@Override
	public void init(ServletConfig config) throws ServletException {

		super.init(config);
		connection = (Connection) config.getServletContext().getAttribute("connection");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		BookDao dao=new BookDaoImp(connection);
		
		BookService bookService=new BookServiceImp(dao);
		
		synchronized (getServletContext()) {
			this.getServletConfig().getServletContext().setAttribute("connection", null);
		}
		
		//What is the job of controller 
		String isbn = request.getParameter("isbn");
		String author = request.getParameter("author");
		String title = request.getParameter("title");
		String priceStr = request.getParameter("price");
		// now to clean the data
		
		Double price=Double.parseDouble(priceStr);
		
		Book book=new Book(isbn, title, author, price);
		
		bookService.addBook(book);
		
		request.setAttribute("book", book);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("show.jsp");
		requestDispatcher.forward(request, response);
		
	}

}

















