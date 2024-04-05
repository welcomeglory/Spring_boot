package edu.ex.controller;

import java.io.InputStream;
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
public class StudentController {
	
	@RequestMapping("/student/view")
	public String view() {
		System.out.println("view()..");

		return "student/student";
	}
	
	
	@RequestMapping(method =  RequestMethod.GET,value = "/student")
	public String student(@RequestParam("id") String id,  Model model) {
		System.out.println("student()..");
//		String radius = request.getParameter("radius");
//		Circle circle = new Circle(radius);

		model.addAttribute("id", id);

		return "/student/student_id";
	}
	
}
