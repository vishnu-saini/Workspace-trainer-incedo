package com.bookapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.service.BookService;

//@Controller
@RequestMapping(value="/addBook")
public class BookController {

	@Autowired
	private BookService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public String showBookForm(ModelMap map, Book book){
		map.addAttribute("command",book);
		return "bookform";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView submittedBookForm(Book b){
		service.addBook(b);
		System.out.println("book is added");
		return new ModelAndView("booksuccess" ,"book",b);
	}	
	
	@ModelAttribute
	public void foo(){
		System.out.println("hello...");
	}
}
