package com.proyectoconjunto.biblioteca.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class DocumentoController {
	
	@GetMapping(value = "/")
	public RedirectView pruebaSelene(Model model){
	     return new RedirectView("welcome");
	}
}
