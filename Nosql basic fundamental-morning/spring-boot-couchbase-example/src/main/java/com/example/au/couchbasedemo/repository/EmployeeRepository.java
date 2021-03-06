package com.example.au.couchbasedemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.au.couchbasedemo.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>{
	
	Employee findByaddressAndPin(String address,int pin);
	Employee findByPin(int pin);
	
	

}
