package edu.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.ex.vo.Grade;

@Controller // url 처리 view 결정
public class BoardController {
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String board() {
		System.out.println("board()..");

		return "board";
	}

	@RequestMapping("/board/view")
	public String view() {
		System.out.println("view()..");

		return "board/view";
	}

//	@RequestMapping("/board/content")
//	public void content() {
//		System.out.println("content()..");		
//	}
//위와 동일
//	@RequestMapping("/board/content")
//	public String content() {
//		System.out.println("content()..");	
//		return "board/content";
//	}
	@RequestMapping("/board/content")
	public void content(Model model, Locale locale) {// Locale객체는
		System.out.println("content()..");
		model.addAttribute("id", 30);
		model.addAttribute("age", 30);
		model.addAttribute("name", "홍길동");

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
	}

	@RequestMapping("/board/reply")
	public ModelAndView reply(ModelAndView mv) {
//		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 30);
		mv.setViewName("board/reply");
		return mv;
	}
	
	@RequestMapping("/board/grade")
	public String grade(Model model) {
		Grade grade = new Grade(80,60,70);
		
		model.addAttribute("grade", grade);

		return "board/grade";
	}

}
