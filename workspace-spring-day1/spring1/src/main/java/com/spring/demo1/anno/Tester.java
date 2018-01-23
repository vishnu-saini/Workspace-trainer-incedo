package com.spring.demo1.anno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// passanger has a vehical
public class Tester {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans2.xml");

		Passanger passanger = (Passanger) ctx.getBean("p");
		passanger.travel();
	}

}
