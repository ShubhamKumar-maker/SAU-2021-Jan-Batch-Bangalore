package com.HibernateAssignment.SpringAssignment.AssignmentSpring;


import org.springframework.context.annotation.Configuration;


import org.springframework.context.annotation.Bean;

@Configuration
public class JavaConfig {
	
	@Bean(name="rectangleObj")
	public Reactangle getReactangle() {
		return new Reactangle(10,30);
	}
	
	
	@Bean(name="PointA")
	public Point getPointA() {
		return new Point(4,1);
	}
	@Bean(name="PointB")
	public Point getPointB() {
		return new Point(3,6);
	}
	@Bean(name="PointC")
	public Point getPointC() {
		return new Point(2,1);
	}
	@Bean(name="PointD")
	public Point getPointD() {
		return new Point(2,5);
	}
	
	
}
