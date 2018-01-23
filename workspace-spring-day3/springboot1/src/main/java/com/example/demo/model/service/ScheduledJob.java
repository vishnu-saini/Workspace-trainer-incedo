package com.example.demo.model.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.model.persistance.Book;

@Component
public class ScheduledJob {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BookService service;

	@Scheduled(cron = "0,1 * * * * *")
	public void cronJob() {
		logger.info("> cronJob");

		// Add scheduled logic here

		Collection<Book> books = service.getAllBooks();
		logger.info("There are {} books in the data store.", books.size());

		logger.info("< cronJob");
	}

	// after application startup delay of 5 sec, schedule to run each after 15
	// sec.
	@Scheduled(initialDelay = 5000, fixedRate = 15000)
	public void fixedRateJob() {
		logger.info("> fixedRateJob");

		// Add scheduled logic here

		Collection<Book> greetings = service.getAllBooks();
		logger.info("There are {} books in the data store.", greetings.size());

		logger.info("< fixedRateJob");
	}

}
