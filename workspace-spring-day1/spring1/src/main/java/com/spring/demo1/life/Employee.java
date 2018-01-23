package com.spring.demo1.life;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean, BeanNameAware{
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	
	//myDestroyMethod
/*	
	public void myAppDestroyMethod(){
		System.out.println("myAppDestroyMethod");
	}
	
	public void myAppInitMethod(){
		System.out.println("myAppInitMethod");
	}*/
	

	@PostConstruct
	public void myPostConstructMethodWithAnno(){
		System.out.println("myPostConstructMethodWithAnno()");
	}
	
	@PreDestroy
	public void myPreDestroyMethodWithAnno(){
		System.out.println("myPreDestroyMethodWithAnno()");
	}
	
	public void myDestroyMethod(){
		System.out.println("myDestroyMethod()");
	}
	
	public void myInitMethod(){
		System.out.println(" myInitMethod()");
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
	}
	
	
	public void show(){
		System.out.println(id);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet is called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()" );
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("its for logging purpose/ monitoring purpose... "+name);
	}
}











