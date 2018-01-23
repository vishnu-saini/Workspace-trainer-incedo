package com.bookapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.service.BookService;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		BookService service=(BookService) ctx.getBean("bs");
		
		Book book=new Book("123A", "head first", "katty", 370.5);

		Book book2=service.addBook(book);
	
	}

}
