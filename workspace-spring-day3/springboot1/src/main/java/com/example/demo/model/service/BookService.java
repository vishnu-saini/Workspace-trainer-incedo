package com.example.demo.model.service;


import java.util.List;

import com.example.demo.model.persistance.Book;
import com.example.demo.model.persistance.BookNotFoundException;

public interface BookService {
	public List<Book> getAllBooks();
	public Book getBookById(int bookId);
	public Book addBook(Book book);
	public Book updateBook(Book book);
	public Book removeBook(int bookId)throws BookNotFoundException;
	public void evictCache() ;
}
