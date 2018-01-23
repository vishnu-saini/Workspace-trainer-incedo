package com.bookapp.web.controllers;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.persistance.BookDao;
import com.bookapp.model.persistance.BookDaoImp;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImp;

public class DisplayAllBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//how to display all books?
		Connection con=(Connection) getServletContext().getAttribute("connection");
		BookDao dao=new BookDaoImp(con);
		BookService bookService=new BookServiceImp(dao);
		
		List<Book> books=bookService.getAllBooks();
		request.setAttribute("books", books);
		RequestDispatcher rd=request.getRequestDispatcher("showall.jsp");
		rd.forward(request, response);
	}

}
