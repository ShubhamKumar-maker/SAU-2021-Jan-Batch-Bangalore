package com.example.au.couchbasedemo.repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.mapping.Collection;

import org.springframework.data.repository.CrudRepository;

import com.example.au.couchbasedemo.model.Cricket;




public interface CricketRepository extends CrudRepository<Cricket, String> {

	Cricket findByRunGreaterThan(int noOfRuns);


	Cricket findByName(String name);

	Cricket findByRuns(int noOfRuns);

	List<Cricket>findAll(int average);

	List<Cricket> findByAverageGreaterThan(int noOfRuns);

}
