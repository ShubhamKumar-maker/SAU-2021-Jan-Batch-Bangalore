package com.hibernate02.hibernate02assignment.repository;

import org.springframework.data.repository.CrudRepository;

import com.hibernate02.hibernate02assignment.entity.Student;

public interface StudentJPARepository extends CrudRepository<Student,Integer> {

}
