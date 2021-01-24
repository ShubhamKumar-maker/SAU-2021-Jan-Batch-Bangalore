package com.hibernate02.hibernate02assignment;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hibernate02.hibernate02assignment.entity.Laptop;
import com.hibernate02.hibernate02assignment.entity.Student;
import com.hibernate02.hibernate02assignment.repository.StudentJPARepository;
import com.hibernate02.hibernate02assignment.repository.StudentRepository;



@SpringBootApplication
@Transactional

public class Hibernate02assignmentApplication implements CommandLineRunner {

	 @Resource
	StudentRepository studentrepository;
	 
	 @Autowired
	 StudentJPARepository studentjparepositry;
	
	

	

	public static void main(String[] args) {
		SpringApplication.run(Hibernate02assignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Laptop laptop =new Laptop();
		laptop.setName("Acer");
		
		
		List<Laptop>lt=new ArrayList<>();
		lt.add(laptop);
		
		Student st=new Student();
		st.setName("ironman");
		st.setAddress("USA");
		st.setLaptop(lt);
		

		
		
		studentrepository.addStudent(st);
		
		studentjparepositry.save(st);
	
		
		
		/////////////////////////delete the student having id=1////////////////////////////////////////////
//		Student std=studentrepository.getStudentById(1);
//		studentrepository.deleteStudent(std);
		
		
		///////////////////////////////update the student having id=3 set name=abc///////////////////////////////////////////////////
//		Student stdup=studentrepository.getStudentById(3);
//		stdup.setName("abc");
//		studentrepository.updatestudent(stdup);
		
		
		
		
		///////////////////////////////get the detail student detail with all the laptop he/she have/////////////////////////////////////////////////////////
//		List<Student>st=studentrepository.getStudent();
//		
//		for(Student x:st)
//		{
//			System.out.print(x.getName()+" "+x.getAddress()+" ");
//			for(Laptop lp:x.getLaptop())
//			{
//				System.out.print(lp.getName());
//			}
//			
//			System.out.println();
//			
//		}
		
				
		
		
		
		
	}

}
