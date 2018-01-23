package com.spring.demo1.life;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// passanger has a vehical
public class Tester {


	public static void main(String[] args) {

		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("life.xml");
		
		
		
		Employee e=(Employee) ctx.getBean("e");
		
		Car car=(Car) ctx.getBean("c");
		e.show();
		car.move();
	}

}
