package edu.ex.controller;

import java.io.InputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.ex.vo.Circle;
import edu.ex.vo.Grade;
import edu.ex.vo.Rectangle;
import edu.ex.vo.StudentInfomation;

@Controller 
public class StudentController {
	
	@RequestMapping("/student/view")
	public String view() {
		System.out.println("view()..");

		return "student/student";
	}
	
//아래 세가지 방식	
//	@RequestMapping(method =  RequestMethod.POST,value = "/student")
//	@RequestMapping("/student")
//	@PostMapping("/student")
//	public String student(@RequestParam("id") String id,  Model model) {
//		System.out.println("student()..");
//
//		model.addAttribute("id", id);
//
//		return "/student/student_id";
//	}
	
//	@PostMapping("/studentView")
//	public String studentView(StudentInfomation studentInfomation,  Model model) {
//		System.out.println("studentView()..");
//
//		model.addAttribute("studentInfomation", studentInfomation);
//
//		return "/student/studentView";
//	}
	
	@PostMapping("/studentView")
	public String studentView(@ModelAttribute("studentInfo") StudentInfomation studentInfomation,  Model model) {
		System.out.println("studentView()..");

//		model.addAttribute("studentInfomation", studentInfomation);

		return "/student/studentView";
	}
	
}
