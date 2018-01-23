package com.example.demo;

import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingController {
	@RequestMapping("/greet")
	Greet greet() {
		return new Greet("Hello World!");
	}

	@RequestMapping("/greeting")
	@ResponseBody
	public HttpEntity<Greet> greeting(
			@RequestParam(value = "name", required = false, defaultValue = "HATEOAS") String name) {
		Greet greet = new Greet("Hello " + name);
		greet.add(ControllerLinkBuilder.linkTo(
				ControllerLinkBuilder.methodOn(GreetingController.class)
						.greeting(name)).withSelfRel());
		return new ResponseEntity<Greet>(greet, HttpStatus.OK);
	}
}
