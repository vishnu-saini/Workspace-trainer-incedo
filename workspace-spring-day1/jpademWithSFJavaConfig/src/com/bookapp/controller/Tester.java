package com.bookapp.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bookapp.config.AppConfig;
import com.bookapp.model.persistance.Book;
import com.bookapp.model.service.BookService;

public class Tester {

	public static void main(String[] args) {

		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		 
		
		BookService service=(BookService) ctx.getBean("bs");
		
		Book book=new Book("123A", "foot first", "katty", 370.5);

		Book book2=service.addBook(book);
	
		
	}

}
