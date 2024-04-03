package edu.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		System.out.println("home()..");
		
		return "home";
	}
	
	@GetMapping("/home1")
	public String home1() {
		System.out.println("home1()..");
		
		return "home1";
	}
}
