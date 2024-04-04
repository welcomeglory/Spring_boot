package edu.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //url 처리 view 결정
public class BoardController {
	@RequestMapping(value="/board", method = RequestMethod.GET)
	public String board() {
		System.out.println("board()..");
		
		return "board";
	}	
	
	
}
