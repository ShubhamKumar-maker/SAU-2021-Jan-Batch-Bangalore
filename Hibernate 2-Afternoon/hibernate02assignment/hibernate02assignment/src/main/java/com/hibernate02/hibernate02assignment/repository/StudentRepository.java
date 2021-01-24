package com.hibernate02.hibernate02assignment.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate02.hibernate02assignment.entity.Student;

@Repository
@Transactional
public class StudentRepository  {
	
	@PersistenceContext
    EntityManager entityManager;
	
	
	public Student getStudentById(int id){
		return entityManager.find(Student.class, id);
	}
	
	public void addStudent(Student student)
	{
		entityManager.persist(student);
	}
	
	public void deleteStudent(Student student)
	{
		entityManager.persist(student);
	}
	
	public void updatestudent(Student student)
	{
		entityManager.persist(student);
	}
	
		  public List<Student> getStudent() {
		  Query query =entityManager.createQuery("from Student");
		  return query.getResultList();
		
		
		 }

}
