package com.java.program.RestApiwithMysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestApiwithMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiwithMysqlApplication.class, args);
	}
	@GetMapping
	public String testpage(){
		return "hello";
	}
}
