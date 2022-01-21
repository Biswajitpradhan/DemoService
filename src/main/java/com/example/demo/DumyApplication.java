package com.example.demo;
/**
 * @author pradh
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DumyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DumyApplication.class, args);
	}
	
	@RequestMapping("/getValue")
	String value() {
		return "Hii";
	}

}
