package com.thrash.cats.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//	@RequestMapping("/")
//	public String index() {
//		return "Goodbye World";
//	}
	
	@RequestMapping("/cats/list")
	public String[] catsList() {
		return new String[] {
				"Tabby",
				"Garfield",
				"Siamese"
		};
	}
	
	@RequestMapping("/cats/1")
	public HashMap<String, Object> getCat() {
		HashMap<String, Object> cat = new HashMap<String, Object> ();
		cat.put("name:", "Garfield");
		cat.put("type:", "Orange Tabby");
		cat.put("favFoods:", new String[] {"lasagna", "cake", "pie"});
		return cat;
		}
		
	
}
