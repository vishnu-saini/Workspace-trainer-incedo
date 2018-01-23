package com.spring.demo1.java;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.spring.demo1.java" })
public class Config {

	@Bean(autowire=Autowire.BY_NAME)
	public Passanger getPassanger() {
		Passanger passanger = new Passanger();
		passanger.setName("raja");
		//passanger.setVehical(getVehical());
		return passanger;
	}

	@Bean(name="vehical")
	public Vehical getVehical() {
		Vehical vehical = new Car();
		return vehical;
	}
}
