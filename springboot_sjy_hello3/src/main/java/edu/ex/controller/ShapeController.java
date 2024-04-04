package edu.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.ex.vo.Grade;
import edu.ex.vo.Rectangle;

@Controller 
@RequestMapping("/shape")
public class ShapeController {
	
	@GetMapping("/rectangle")
	public String rectangle() {
		System.out.println("rectangle()..");

	return "home";
	}
	@GetMapping("/circle")
	public String circle() {
		System.out.println("circle()..");

	return "home";
	}

}
