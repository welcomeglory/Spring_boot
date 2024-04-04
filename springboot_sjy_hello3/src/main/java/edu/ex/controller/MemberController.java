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
import edu.ex.vo.MemberVO;
import edu.ex.vo.Rectangle;

@Controller 
@RequestMapping("/member")
public class MemberController {
	//http://localhost:8282/member/register?
	@GetMapping("/view")
	public String view() {
		System.out.println("view()..");

	return "member/register";
	}
	@RequestMapping("/register")
	public String register(@RequestParam("name") String name,
			@RequestParam("id") String id, 
			@RequestParam("pw") String pw,
			@RequestParam("email") String email,
			@RequestParam("age") int age,			
			Model model) {
		System.out.println("register()..");
		MemberVO memberVO = new MemberVO(name, id,pw, email,age);
		
		model.addAttribute("memberVO", memberVO);

	return "member/register";
	}
	
	
}
