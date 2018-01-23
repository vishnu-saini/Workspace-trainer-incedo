package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.persistance.AccountDao;
import com.example.demo.model.service.AccountService;

@SpringBootApplication

public class SpringjdbcApplication implements CommandLineRunner{

	/*@Autowired
	private JdbcTemplate jdbcTemplate;
	*/
	@Autowired
	private AccountService service;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringjdbcApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		service.transfer(1, 2, 10);
	}
}
