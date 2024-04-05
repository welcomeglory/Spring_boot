package edu.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.ex.vo.Circle;
import edu.ex.vo.Grade;
import edu.ex.vo.Rectangle;

@Controller 
@RequestMapping("/shape")
public class ShapeController {
	
//	@GetMapping("/rectangle")
//	public String rectangle() {
//		System.out.println("rectangle()..");
//
//	return "home";
//	}
	//http://localhost:8282/shape/circle?radius=10
//	@RequestMapping("/circle")
//	public String circle(HttpServletRequest request,Model model) {
//		System.out.println("circle()..");
//		String radius = request.getParameter("radius");
//		
//		Circle circle = new Circle(Integer.valueOf(radius));
//
//		model.addAttribute("circle", circle);
//
//		return "/shape/circle";
//	}
	//from	
//	@RequestMapping("/circle")
//	public String circle(@RequestParam("radius") double radius, Model model) {
//		System.out.println("circle()..");
////		String radius = request.getParameter("radius");
//		Circle circle = new Circle(radius);
//
//		model.addAttribute("circle", circle);
//
//		return "/shape/circle";
//	}
	@RequestMapping("/circle")
	public String circle(Circle circle, Model model) {
		System.out.println("command객체.. circle()..");
//		String radius = request.getParameter("radius");
//		Circle circle = new Circle(radius);

		model.addAttribute("circle", circle);

		return "/shape/circle";
	}
	@RequestMapping("/rectangle")
	public String circle(Rectangle rec, Model model) {
		System.out.println("command객체.. rectangle()..");
//		String radius = request.getParameter("radius");
//		Circle circle = new Circle(radius);

		model.addAttribute("rec", rec);

		return "/shape/rectangle";
	}
	
	
	
}
