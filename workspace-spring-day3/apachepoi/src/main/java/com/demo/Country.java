package com.demo;
public class Country {
	private String name;
	private String shortCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	public Country(String name, String shortCode) {
		super();
		this.name = name;
		this.shortCode = shortCode;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", shortCode=" + shortCode + "]";
	}
	
	
	
}