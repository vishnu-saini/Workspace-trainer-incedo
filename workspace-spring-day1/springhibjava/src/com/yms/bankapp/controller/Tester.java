package com.yms.bankapp.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.yms.bankapp.configuration.AppConfig;
import com.yms.bankapp.service.AccountService;

public class Tester {

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 
	      AccountService as=context.getBean("accountService", AccountService.class);
	      as.transfer(1, 2, 10);
	}
}
