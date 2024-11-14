package com.sg.leo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class HelloController {
	@GetMapping("/img")
	public String img(){
		System.out.println("이미지 파일이 요청됨");
		return"redirect:image/no1.jpg";
	}
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("jsp파일이 요청됨");
		model.addAttribute("username","장형준");
		return "hellojsp";
	}
	
}
	