package io.novatec.todoui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@Controller
public class TodouiApplication {

	private Logger logger = LoggerFactory.getLogger(TodouiApplication.class);

	@Value("${backend.url}")
	String endpoint;
	RestTemplate template = new RestTemplate();

	@PostConstruct
	public void postConstruct(){

		logger.info(" UI initialized for backend at "+endpoint);
	}

	@GetMapping
	public String getItems(Model model){

		logger.info("GET "+ endpoint + "/todos/");
		ResponseEntity<String[]> response = template.getForEntity(endpoint+"/todos/", String[].class);
		if(response != null) model.addAttribute("items", response.getBody());
		return "items";

	}

	@PostMapping
	public String addItem(String toDo){

		logger.info("POST "+ endpoint + "/todos/"+toDo);
		template.postForEntity(endpoint+"/todos/"+toDo, null, String.class);
		return "redirect:/";

	}

	@PostMapping("{toDo}")
	public String setItemDone(@PathVariable String toDo){

		logger.info("POST "+ endpoint + "/todos/"+toDo);
		template.delete(endpoint+"/todos/"+toDo);
		return "redirect:/";

	}

	public static void main(String[] args) {
		SpringApplication.run(TodouiApplication.class, args);
	}
}
