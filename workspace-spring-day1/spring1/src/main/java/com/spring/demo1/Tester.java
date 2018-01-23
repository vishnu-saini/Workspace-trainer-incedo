package com.spring.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// passanger has a vehical
public class Tester {

	private static Logger logger=LoggerFactory.getLogger(Tester.class);
	
	public static void main(String[] args) {

		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		//code should be flexible=> 
		//Car car=new Car();
		//Spring framework: is a ioc container, aka factory of bean
	/*	Vehical cycle=new Bike();
		
		
		
		Passanger passanger=new Passanger();*/
		
		
		Passanger passanger=(Passanger) ctx.getBean("passanger");
		passanger.travel();
	}

}
