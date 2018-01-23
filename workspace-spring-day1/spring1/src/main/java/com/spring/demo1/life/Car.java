package com.spring.demo1.life;

public class Car {
	
	public void myAppDestroyMethod(){
		System.out.println("myAppDestroyMethod");
	}
	
	public void myAppInitMethod(){
		System.out.println("myAppInitMethod");
	}

	public void myDestroyMethod(){
		System.out.println("u can write some code that u want to ex just  before bean is gonn to be destroyed");
	}
	
	public void myInitMethod(){
		System.out.println("u can write some code that u want to ex once bean is creadt");
	}
	
	public void move(){
		System.out.println("moving in a car");
	}
}
