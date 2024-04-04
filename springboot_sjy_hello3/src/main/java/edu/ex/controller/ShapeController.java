package edu.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

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
	//http://localhost:8282/shape/circle?radius=10
	@GetMapping("/circle")
	public String circle(HttpServletRequest request,Model model) {
		System.out.println("circle()..");
		String radius = request.getParameter("radius");
		double r = Integer.parseInt(radius);
		double area = r*r*Math.PI;
		
		System.out.println(radius);
		model.addAttribute("radius", radius);
		model.addAttribute("area", area);

		return "/shape/circle";
	}

}