package com.example.au.couchbasedemo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.au.couchbasedemo.model.Blogs;

public interface BlogRepository extends CrudRepository<Blogs, String> {
	
	Blogs findByAuthor(String author);
	Blogs findBytopicAndAuthor(String title, String author);
	
	List<Blogs>findByTags(List<String>tags);
	Optional<Blogs> findByTags1(List<String>tags1);
	
	Blogs existsByTags(List<String>tags);

	List deleteBytopicAndAuthor(String title, String author);
	List<Blogs> findByTags1AndTags2(List<String> tags1, List<String> tags2);
	Optional<Blogs> findByTags2(List<String> tags2);
	Blogs existsByTags1(List<String> tags1);
	Blogs existsByTags2(List<String> tags2);
	   
}