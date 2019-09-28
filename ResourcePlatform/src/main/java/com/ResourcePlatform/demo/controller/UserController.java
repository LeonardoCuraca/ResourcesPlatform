package com.ResourcePlatform.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bin.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
}
