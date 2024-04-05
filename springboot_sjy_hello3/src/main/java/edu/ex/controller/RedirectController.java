package edu.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class RedirectController {
	
	@RequestMapping("/redirect/check")
	public String redirectCheck(@RequestParam("id") String id) {
		
		if(id.equals("abcd")) {
			return "redirect:/studentOK";
		}
		System.out.println("redirectCheck()..");

		return "redirect:studentNG";
	}
	@RequestMapping("/studentOK")
	public String studentOK() {
		return "/student/studentOK";
	}

	
	
	
	
}
