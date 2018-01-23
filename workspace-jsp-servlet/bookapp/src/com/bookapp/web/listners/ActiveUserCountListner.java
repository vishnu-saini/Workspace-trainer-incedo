package com.bookapp.web.listners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ActiveUserCountListner implements HttpSessionListener {

	public static int counter=0;
	public void sessionCreated(HttpSessionEvent event) {
		counter++;
		System.out.println("counter user is added :"+ counter);
	}

	public void sessionDestroyed(HttpSessionEvent event) {
		counter--;
		System.out.println("counter user has left :"+ counter);
	}
	

}
