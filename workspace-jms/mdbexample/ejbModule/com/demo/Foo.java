package com.demo;

import java.io.Serializable;

public class Foo implements Serializable{
	private static final long serialVersionUID = 1L;
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Foo(String data) {
		super();
		this.data = data;
	}

	public Foo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
