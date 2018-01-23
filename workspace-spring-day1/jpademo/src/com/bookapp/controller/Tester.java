package com.bookapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.persistance.BookInsertionExcetion;
import com.bookapp.model.service.BookService;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		BookService service=(BookService) ctx.getBean("bs");
		
		Book book=new Book("12SS", "head last", "raja", 370.5);

		try {
			Book book2=service.addBook(book);
		} catch (BookInsertionExcetion e) {
			e.printStackTrace();
		}
	
	}

}
