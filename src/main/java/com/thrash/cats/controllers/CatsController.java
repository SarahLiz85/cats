package com.thrash.cats.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatsController {
	
	@RequestMapping("/")
	public String index(Model model) {
		
		String[] cats = new String[] {
				"Garfield",
				"Tabby",
				"Siamese"
		};	
		
		model.addAttribute("cats", cats);
		return "index.jsp";
	}
}
