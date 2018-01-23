package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DBInitilizer implements CommandLineRunner {

	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... arg0) throws Exception {
		if(jdbcTemplate!=null)
			System.out.println("==========================done====================");
	}

}