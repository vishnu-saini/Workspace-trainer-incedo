package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.persistance.Book;
//Serivce =BL+CCC
public interface BookService {
	public List<Book> getAllBooks();
	public Book getBookById(int bookId);
	public Book addBook(Book book);
	public Book updateBook(Book book);
	public void removeBook(int bookId);
}
