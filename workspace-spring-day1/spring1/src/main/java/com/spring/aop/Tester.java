package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("aopdemo.xml");
		
		Magician magician=ctx.getBean("magician",Magician.class);
		magician.doMagic();
		//ball.play();
	}

}
