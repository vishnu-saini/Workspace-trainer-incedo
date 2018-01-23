package com.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder=
				new BCryptPasswordEncoder(12);
		System.out.println(encoder.encode("foo"));
		// ? how it works
		
		//$2a$12$7IKaVRIKKGX6R3VhVIPz0eLl1DrbiTShcsiGpaALONLhLxI5Dcyvy
		// $2a$12$kGyC6Ce8YZwEtz1ecPFOKOdjmtu0soOWGS5./7TRbDdMeh9QyttPC
		
	}
}