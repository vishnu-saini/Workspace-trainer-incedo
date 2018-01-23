package com.app.model.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.persistance.Book;
import com.app.model.service.BookService;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@Autowired
	private BookService service;

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		List<Book> books=service.getAllBooks();
		System.out.println("=======================================");
		System.out.println(books);
		return "greeting";
	}
}
