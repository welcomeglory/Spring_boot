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
	@RequestMapping("/board/view")
	public String view() {
		System.out.println("view()..");
		
		return "board/view";
	}	
	@RequestMapping("/board/content")
	public void content() {
		System.out.println("content()..");		
	}
//위와 동일
//	@RequestMapping("/board/content")
//	public String content() {
//		System.out.println("content()..");	
//		return "board/content";
//	}
	
	
}
