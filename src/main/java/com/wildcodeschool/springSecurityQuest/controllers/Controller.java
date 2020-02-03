package com.wildcodeschool.springSecurityQuest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String helloShield () {
		return "Welcome to the SHIELD";
	}
	
	@GetMapping("/avengers/assemble")
	public String helloAsvengers () {
		return "Avengers ... Assemble";
	}
	
	@GetMapping("/secret-bases")
	public String helloShieldDirector() {
		return "List of Wild Code Schools:" +
				"	 \nFrance:\n" + 
				"    Biarritz\n" + 
				"    Bordeaux\n" + 
				"    La Loupe \n" + 
				"    Lille\n" + 
				"    Lyon\n" + 
				"    Marseille\n" + 
				"    Nantes\n" + 
				"    Orléans\n" + 
				"    Paris\n" + 
				"    Reims\n" + 
				"    Strasbourg\n" + 
				"    Toulouse\n" + 
				"    Tours" +
				"    \n Europe: ...";  
			    
		
	}
	
}