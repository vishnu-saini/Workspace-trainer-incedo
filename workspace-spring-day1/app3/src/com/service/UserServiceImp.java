package com.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
	@Secured ({"ROLE_USER", "ROLE_ADMIN"})
	@Override
	public void addUser(String name, String pwd) {
		System.out.println("user added");
	}
	@Secured("ROLE_ADMIN")
	@Override
	public void deleteUser(String name) {
		System.out.println("user deleted");
	}
}