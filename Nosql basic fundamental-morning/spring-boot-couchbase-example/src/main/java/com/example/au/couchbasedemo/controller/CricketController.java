package com.example.au.couchbasedemo.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.au.couchbasedemo.model.Blogs;
import com.example.au.couchbasedemo.model.Cricket;

import com.example.au.couchbasedemo.repository.CricketRepository;



@RestController
public class CricketController {
	@Autowired
	CricketRepository cricketRepository;
	
	 @PostMapping("/cricket")
	    public Cricket addCricketPost(@RequestBody Cricket newCricket) {
	        return cricketRepository.save(newCricket);
	    }
	 
	 //getting all the item which is greater then particular value
	 @GetMapping("/cricket/noOfRuns/{noOfRuns}")
	    public List<Cricket> getCricketByAverage(@PathVariable int noOfRuns) {
	        return cricketRepository.findByAverageGreaterThan(noOfRuns);
	    }

	 //getting all the value by name
	    @GetMapping("/cricket/name/{name}")
	    public Cricket getCricketByName(@PathVariable String name) {
	        return cricketRepository.findByName(name);
	    }

}
