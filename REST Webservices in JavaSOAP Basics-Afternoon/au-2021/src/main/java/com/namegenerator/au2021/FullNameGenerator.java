package com.namegenerator.au2021;


import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
@RequestMapping(path="/stringoperations")
public class FullNameGenerator {
	
	@GetMapping("/concatenate/{string1}/{string2}")
	public String generate(@PathVariable("string1") String string1,@PathVariable("string2")String string2)
	{
		return string1+string2;
	}
	
	@GetMapping("/split/{firstname}/{lastname}")
	public String split(@PathVariable("firstname")String firstname,@PathVariable("lastname") String lastname )
	  {return firstname.split(lastname)[0];}
	
	@GetMapping("/converToUpperCase")
	@ResponseBody
	public String converToUpperCase(@RequestParam String string1)
	{
		return string1.toUpperCase();
	}
	
	@PostMapping("/replaceCharacter")
	@ResponseBody
	public String addFoo(@RequestParam String mainString,@RequestParam char old, @RequestParam char newc) { 
		return mainString.replace(old, newc);
	}
	
	
	
	@GetMapping("/subString")
	@ResponseBody
	public String getFoos(@RequestParam String main,@RequestParam String start,@RequestParam String len) {
		return main.substring(Integer.parseInt(start),Integer.parseInt(len));
	}
	
	
	

}
