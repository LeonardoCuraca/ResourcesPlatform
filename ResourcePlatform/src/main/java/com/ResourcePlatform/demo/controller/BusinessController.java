package com.ResourcePlatform.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ResourcePlatform.demo.NegocioService;
import com.ResourcePlatform.demo.model.Negocio;

@Controller
public class BusinessController {
	
	@Autowired
	private NegocioService negocioService;
	
	@RequestMapping("/listBusiness")
	public String viewBusiness(Model model) {
		List<Negocio> BusinessList = negocioService.listAll();
		model.addAttribute("listBusiness", BusinessList);
		return "BusinessView";
	}
	
}
