package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Magician {
	
	@Loggable
	public void doMagic() {
		System.out.println("do magic abra ka dabra!!!");
		
	}
}