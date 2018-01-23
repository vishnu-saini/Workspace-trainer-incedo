package com.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model, Principal principal) {
		String name = principal.getName();
		System.out.println(name);
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return "welcome";
	}

	
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	
/*	@RequestMapping(value = "/logout")
	public String logout() {
		return "logout";
	}*/

}