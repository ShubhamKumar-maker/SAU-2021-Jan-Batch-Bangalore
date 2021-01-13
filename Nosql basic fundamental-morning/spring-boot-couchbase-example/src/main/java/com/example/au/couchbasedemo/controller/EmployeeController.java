package com.example.au.couchbasedemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.au.couchbasedemo.model.Employee;
import com.example.au.couchbasedemo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	 @PostMapping("/employee")
	    public Employee addEmployeePost(@RequestBody Employee newEmployee) {
	        return employeeRepository.save(newEmployee);
	    }
	 
	 //getting employee data by their address and pin 
	 
	 @GetMapping("/employee/address/{address}/pin/{pin}")
	    public Employee getEmployeeByAddressAndPin(@PathVariable String address, @PathVariable int pin) {
	        return employeeRepository.findByaddressAndPin(address,pin);
	    }
	 
	 

}
