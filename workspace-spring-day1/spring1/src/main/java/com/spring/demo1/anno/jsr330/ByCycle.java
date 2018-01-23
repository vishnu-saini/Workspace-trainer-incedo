package com.spring.demo1.anno.jsr330;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ByCycle implements Vehical {
	public void move(){
		System.out.println("moving in a ByCycle");
	}
}
