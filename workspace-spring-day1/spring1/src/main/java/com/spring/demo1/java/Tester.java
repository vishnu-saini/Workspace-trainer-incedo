package com.spring.demo1.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// passanger has a vehical
public class Tester {

	private static Logger logger=LoggerFactory.getLogger(Tester.class);
	
	public static void main(String[] args) {

		
		
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(Config.class);
				
			
		
		Passanger passanger=(Passanger) ctx.getBean("getPassanger");
		
		System.out.println(passanger);
		Passanger passanger2=(Passanger) ctx.getBean("getPassanger");
		System.out.println(passanger2);
		
		passanger.travel();
	}

}
