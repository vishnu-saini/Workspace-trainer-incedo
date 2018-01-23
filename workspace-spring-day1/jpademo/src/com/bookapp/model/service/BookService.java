package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.persistance.BookInsertionExcetion;

public interface BookService {
	public List<Book> getAllBooks();
	public Book getBookById(int bookId);
	public Book addBook(Book book)throws BookInsertionExcetion;
	public Book updateBook(Book book);
	public Book removeBook(int bookId);
}
