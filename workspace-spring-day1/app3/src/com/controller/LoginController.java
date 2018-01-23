package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.UserService;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	public UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String success(ModelMap map) {		
		userService.addUser("ABC", "abc");
		userService.deleteUser("ABC");
		map.addAttribute("msg", "Done Successfully");
		return "success";
 
	}  
	
/*	@RequestMapping(value="/logout")
	public String logout() {
		return "logout";
	}*/

}