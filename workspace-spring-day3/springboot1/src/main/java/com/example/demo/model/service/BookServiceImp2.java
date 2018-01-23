package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.persistance.Book;
import com.example.demo.model.persistance.BookNotFoundException;
import com.example.demo.model.persistance.BookRepo;

@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class BookServiceImp2 implements BookService {
	@Autowired
	private BookRepo bookRepo;

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Cacheable(value="books",key="#bookId" )
	@Override
	public Book getBookById(int bookId) {
		try{
			Thread.currentThread().sleep(10000);
		}
		catch(InterruptedException ex){}
		System.out.println("=========555555555555555==============");
		return bookRepo.getOne(bookId);
		
		
	}

	
	@CachePut(value="books", key="#result.id")
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	@Override
	public Book addBook(Book book) {
		
		Book book1= bookRepo.save(book);
		
		if(1==1)
			throw new NullPointerException();
		return book1;
		
		
	}
	@CachePut(value="books", key="#result.id")
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	@Override
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}

	@CacheEvict(value="books", key="#id")
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = BookNotFoundException.class)
	@Override
	public Book removeBook(int bookId)throws BookNotFoundException {
		Book book = bookRepo.getOne(bookId);
		if(book==null)
			throw new BookNotFoundException();
		else
		bookRepo.delete(bookId);
		return book;
	}
	
	@CacheEvict(value="books", allEntries=true)
	@Override
	public void evictCache() {}

}







