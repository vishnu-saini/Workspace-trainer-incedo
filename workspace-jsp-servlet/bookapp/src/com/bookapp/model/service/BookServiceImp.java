package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.persistance.BookDao;

public class BookServiceImp implements BookService{

	public BookDao dao;
	
	
	public BookServiceImp(BookDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<Book> getAllBooks() {

		return dao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book addBook(Book book) {
		return dao.addBook(book);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return dao.updateBook(book);
	}

	@Override
	public void removeBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

}
