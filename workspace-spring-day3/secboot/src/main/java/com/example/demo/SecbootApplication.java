package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@EnableGlobalMethodSecurity
@SpringBootApplication
public class SecbootApplication implements CommandLineRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(SecbootApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		/*String plainCreds = "guest:guest123";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + new String(Base64.encode(plainCreds.getBytes())));
		HttpEntity<String> request = new HttpEntity<String>(headers);
		RestTemplate restTemplate = new RestTemplate();
				
		ResponseEntity<Greet> response = restTemplate.exchange("http://localhost:8080/greet", 
				HttpMethod.GET, request, Greet.class);
		System.out.println(response.getBody().getMessage());
*/
		
	}
	
	
}
