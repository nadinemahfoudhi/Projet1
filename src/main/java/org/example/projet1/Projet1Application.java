package org.example.projet1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Projet1Application {

	@GetMapping("/message")
    public String getMessage(){
		return "hello Nadine in Docker It's work ..!";
	}
	public static void main(String[] args)
	{
		SpringApplication.run(Projet1Application.class, args);
	}

}
