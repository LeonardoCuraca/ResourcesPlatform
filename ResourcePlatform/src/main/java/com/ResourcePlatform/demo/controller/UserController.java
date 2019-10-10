package com.ResourcePlatform.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ResourcePlatform.demo.NegocioService;
import com.ResourcePlatform.demo.UsuarioService;
import com.ResourcePlatform.demo.model.Negocio;
import com.ResourcePlatform.demo.model.Usuario;
import com.ResourcePlatform.demo.repository.UsuarioRepository;

@Controller
public class UserController {
	@Autowired
	private UsuarioService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Usuario>listUsuarios=service.listAll();
		model.addAttribute("listUsuarios",listUsuarios);
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/nuevo")
	public String showNewUsuarioPage(Model model) {
	    Usuario usuario = new Usuario();
	    model.addAttribute("usuario", usuario);
	    return "register";
	}
	
	@RequestMapping("/nuevoPrueba")
	public String showNewUsuario(Model model) {
	    Usuario usuario = new Usuario();
	    model.addAttribute("usuario", usuario);
	    return "register";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUsuario(@ModelAttribute("usuario") Usuario usuario) {
	    service.save(usuario);     
	    return "redirect:/";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditUsuarioPage(@PathVariable(name = "id") long id) {
	    ModelAndView mav = new ModelAndView("edit_usuario");    
	    Usuario usuario = service.get(id);
	    mav.addObject("usuario", usuario);
	    return mav;
	}


	@RequestMapping("/delete/{id}")
	public String deleteUsuario(@PathVariable(name = "id") long id) {
		service.delete(id);
		return "redirect:/";       
	}
	
}
