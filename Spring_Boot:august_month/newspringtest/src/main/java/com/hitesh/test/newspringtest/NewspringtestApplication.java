package com.hitesh.test.newspringtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@SpringBootApplication
@RestController
public class NewspringtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewspringtestApplication.class, args);
	}

	@RequestMapping
	public String test(){
		return "Test SuccessFull";
	}
	@RequestMapping(path="/sum",method = RequestMethod.POST)
	public String sumoftwo(@RequestParam Map<String,String> requestparam){
				int a= Integer.parseInt(requestparam.get("a"));
				int b= Integer.parseInt(requestparam.get("b"));


				return "done";

	}
}
