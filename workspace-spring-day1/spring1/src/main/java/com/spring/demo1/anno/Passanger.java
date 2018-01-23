package com.spring.demo1.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
 * 	<bean id="passanger" class="com.spring.demo1.Passanger">
		<property name="name" value="raj"/>
		<property name="vehical" ref="vehical"/>
	</bean>
 */
// @Component= @Reposotry @Service @Controller @restController
@Component(value="p")
public class Passanger {
	
	@Value(value="raja")
	private String name;
	
	@Autowired
	@Qualifier(value="car")
	private Vehical vehical;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	//
	public Vehical getVehical() {
		return vehical;
	}
	
	@Required
	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}
	public void travel(){
		System.out.println("passanger name:"+ name);
		vehical.move();
	}
}
