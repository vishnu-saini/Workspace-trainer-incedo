package com.yms.bankapp.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yms.bankapp.service.AccountService;


public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		AccountService as=ctx.getBean("accountServiceImp", AccountService.class);
		
	
		as.transfer(1, 2, 10);
	}
}
