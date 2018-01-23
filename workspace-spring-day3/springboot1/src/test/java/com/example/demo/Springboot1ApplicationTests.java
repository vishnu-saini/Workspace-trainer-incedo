package com.example.demo;

import java.util.Collection;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.persistance.Book;
import com.example.demo.model.service.BookService;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional
public class Springboot1ApplicationTests {
	@Test
	public void contextLoads() {}
	
	@Autowired
	private BookService service;
	
	@Before
	public void setUp(){
		service.evictCache();// clear cache
	}
	
	
	/*@Test
	public void addAnNewAllBooks(){
		service.addBook(new Book("121", "java", "foo", 28));
		//Assert.assertNotNull("failed expected not null" , );
		//Assert.assertNotNull("failed expected not null" , list);
		//Apricessert.assertEquals("failed expected size=", 1, list.size());
	}*/
	
	@Test
	public void testGetAllBooks(){
		Collection<Book> list=service.getAllBooks();
		Assert.assertNotNull("failed expected not null" , list);
		Assert.assertEquals("failed expected size=", 2, list.size());
	}
	@After
	public void tearDown(){
		//
	}
	

}
