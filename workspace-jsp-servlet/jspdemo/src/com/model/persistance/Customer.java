package com.model.persistance;

import java.io.Serializable;

//POJO vs Bean=POJO+ seriliazable must follow rules of valid getter/setter , must hv default ctr
public class Customer implements Serializable {
	private static final long serialVersionUID = -4073124354911434581L;
	private String name;
	private String address;
	private double salary;
	private Dog dog;
	
	
	
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Customer(String name, String address, double salary, Dog dog) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.dog = dog;
	}
	public Customer() {}
	
	
}
