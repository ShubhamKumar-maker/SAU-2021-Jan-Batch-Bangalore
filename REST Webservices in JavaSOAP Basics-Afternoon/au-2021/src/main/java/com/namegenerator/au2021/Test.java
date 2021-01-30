package com.namegenerator.au2021;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@GetMapping("/")
	public String home() {
		return "Its my home page";
	}

	

}
