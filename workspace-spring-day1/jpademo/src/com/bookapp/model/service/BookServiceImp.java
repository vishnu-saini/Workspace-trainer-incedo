package com.bookapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.persistance.BookDao;
import com.bookapp.model.persistance.BookInsertionExcetion;

@Service(value = "bs")
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class BookServiceImp implements BookService {

	@Autowired
	private BookDao dao;

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookId) {
		return dao.getBookById(bookId);
	}

	@Transactional(readOnly = false, 
			propagation = Propagation.REQUIRED, 
			rollbackFor = { BookInsertionExcetion.class },noRollbackFor={NullPointerException.class}, 
			timeout=100,
			isolation=Isolation.REPEATABLE_READ)
	
	@Override
	public Book addBook(Book book) throws BookInsertionExcetion {

		Book bookTemp = dao.addBook(book);

		if (1 == 2)
			throw new BookInsertionExcetion();
		if(1==1)
			throw new NullPointerException();

		return bookTemp;

	}

	@Override
	@Transactional(readOnly = false, 
	propagation = Propagation.REQUIRED, 
	rollbackFor = { BookInsertionExcetion.class }, isolation=Isolation.REPEATABLE_READ)

	public Book updateBook(Book book) {
		return dao.updateBook(book);
	}

	@Override
	@Transactional(readOnly = false, 
	propagation = Propagation.REQUIRED, 
	rollbackFor = { BookInsertionExcetion.class }, isolation=Isolation.REPEATABLE_READ)

	public Book removeBook(int bookId) {
		return dao.removeBook(bookId);
	}

}
