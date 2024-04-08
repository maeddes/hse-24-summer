package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@SpringBootApplication
@RestController
public class DemoApplication {

	ArrayList<String> list = new ArrayList<String>();

	@GetMapping("/hello")
	public String sayHello(){

		return "Hallo, Esslingen!";

	}

	// Richardson's Maturity Model
	// No nouns
	// Verbs used incorrectly
	// Violation: Read-Only Method changes server state
	
	@GetMapping("/insertStringToList/{string}")
	public String addMoreString(@PathVariable String string){

		list.add(string);
		return string;

	}

	@PostMapping("/strings/{string}")
	public String addString(@PathVariable String string){

		list.add(string);
		return string;

	}

	@DeleteMapping("/strings/{string}")
	public String deleteString(@PathVariable String string){

		list.remove(string);
		return string;

	}

	@GetMapping("/strings/")
	public String listStrings(){

		return list.toString();

	}

	// DON'T DO THIS
	@PutMapping("/strings/{string}")
	public String deleteAlsoString(@PathVariable String string){

		list.remove(string);
		return string;

	}



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
