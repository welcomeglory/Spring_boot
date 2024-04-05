package edu.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.ex.vo.Circle;
import edu.ex.vo.Grade;
import edu.ex.vo.Rectangle;

@Controller 
@RequestMapping("/path")
public class PathController {	
	
	//http://localhost:8282/path/student/10
	@RequestMapping("/student/{studentId}")
	public String getstudent(@PathVariable String studentId, Model model) {
		System.out.println("getstudent()..");

		model.addAttribute("studentId", studentId);

		return "student";
	}
	//http://localhost:8282/path/circle/10
	@RequestMapping("/circle/{radius}")
	public String getcircle(@PathVariable double radius, Model model) {
		System.out.println("getcircle()..");

		model.addAttribute("circle", new Circle(radius));

		return "/shape/circle";
	}
	//http://localhost:8282/path/rectangle/10/10
		@RequestMapping("/rectangle/{width}/{height}")
		public String getrectangle(@PathVariable double width, @PathVariable double height,Model model) {
			System.out.println("getrectangle()..");

			model.addAttribute("rec", new Rectangle(width,height));

			return "/shape/rectangle";
		}
}
