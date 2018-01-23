package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public
    @ResponseBody
    Book dailyStats(@RequestParam Integer id) {
    	if(jdbcTemplate!=null)
    		System.out.println("done");
      return new Book();

    }


}