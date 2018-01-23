package com.demo;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
@LocalBean
public class Client {

	@EJB
	private AtmVerifyRemote atm;
   
    public Client() { }
    
    @PostConstruct
    public void starter(){
    	System.out.println("------------------------------------");
    	System.out.println(atm.isValid("121"));
    }

}
