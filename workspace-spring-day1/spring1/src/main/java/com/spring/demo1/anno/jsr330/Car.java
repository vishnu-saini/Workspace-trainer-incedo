package com.spring.demo1.anno.jsr330;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehical{
	public void move(){
		System.out.println("moving in a car");
	}
}
