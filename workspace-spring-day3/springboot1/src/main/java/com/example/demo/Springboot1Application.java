package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.persistance.Book;
import com.example.demo.model.persistance.BookRepo;

@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@EnableScheduling
public class Springboot1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}

	@Bean
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
		return hemf.getSessionFactory();
	}

	@Autowired
	private BookRepo repo;

	@Override
	public void run(String... arg0) throws Exception {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(121, "ABC111", "head fist", "raj", 300.99));
		books.add(new Book(21, "XXXX111", "head last", "raj", 300.99));

		repo.save(books);
	}
	
	// config : cachemnager: cmcm: chm, Eccache
	/*@Bean
	public CacheManager cacheManager(){
		ConcurrentMapCacheManager cacheManager=new ConcurrentMapCacheManager("books");
		return cacheManager;
		
	}*/
	@Bean
	public CacheManager cacheManager(){
		// ctr accept array of string, tell cache manages by cache manager
		GuavaCacheManager cacheManager=new GuavaCacheManager("books");
		return cacheManager;
		
	}
}











