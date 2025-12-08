package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Dev!!";
	}
	
	
	@GetMapping("/welcome")
	public String sayWelcome(Model mm) {
		mm.addAttribute("nm", "Dev, Welcome back!");
		return "sayWelcome" ;
	}
	
	

}
