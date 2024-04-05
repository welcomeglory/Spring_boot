package edu.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * get post의 차이
 * 세션 쿠키의 차이
 * 스코프 메모리 페이지 컨텍스트 리퀘스트 어플리케이션
 * redirect와 forwarding차이

 * jsp/servl
 * 		response.sendRedirect("/"); //redirect
 *
 *
 *
 *
 */






@Controller 
public class RedirectController {
	
	@RequestMapping("/redirect/check")
	public String redirectCheck(@RequestParam("id") String id,Model model) {
		
		if(id.equals("abcd")) {
			return "redirect:/studentOK";
		}
		System.out.println("redirectCheck()..");
		model.addAttribute("id",id);
		return "forward:/studentNG";

//		return "redirect:/studentNG";

	}
	@RequestMapping("/studentOK")
	public String studentOK() {
		return "/student/studentOK";
	}
	
	@RequestMapping("/studentNG")
	public String studentNG() {
		return "/student/studentNG";
	}


	
	
	
	
}
