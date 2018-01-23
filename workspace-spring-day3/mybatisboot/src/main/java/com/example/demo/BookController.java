package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.persistance.Book;
import com.example.demo.model.persistance.BookMapper;

@RestController
	public class BookController {
	
		@Autowired
		private BookMapper bookMapper;
	
		@RequestMapping("/")
		public List<Book> home() {
			return bookMapper.findAll();
		}
	
		@RequestMapping("/books")
		public List<Book> books() {
			return home();
		}
	
		@RequestMapping("/books/{author}")
		public List<Book> bookByAuthor(@PathVariable("author") String author) {
			return bookMapper.findByAuthor(author);
		}
	}