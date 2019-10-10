package com.ResourcePlatform.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String index() {
		return "login";
	}
	
	@GetMapping("/main")
	public String main() {
		return "main";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/businnesView")
	public String businessView() {
		return "businessView";
	}
	
}
