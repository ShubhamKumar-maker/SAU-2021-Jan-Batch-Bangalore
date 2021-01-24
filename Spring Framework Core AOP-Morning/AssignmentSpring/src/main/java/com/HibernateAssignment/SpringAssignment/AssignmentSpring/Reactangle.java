package com.HibernateAssignment.SpringAssignment.AssignmentSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope(value = "prototype")

public class Reactangle {
	
	 @Autowired
	  @Qualifier("PointA")
	  private Point pointA;
	 
	 @Autowired
	  @Qualifier("PointB")
	 private Point pointB;
	 
	 @Autowired
	  @Qualifier("PointC")
	 private Point pointC;
	 
	 @Autowired
	  @Qualifier("PointD")
	 private Point pointD;
	 
	 
	 public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	
	private int height;
	 private int width;
	 
	
	

	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	 public Reactangle(int height,int width) 
	  { 
		 this.height=height;
		 this.width=width;
		
	  } 
	   
	 

	

	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public Point getPointD() {
		return pointD;
	}


	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}


	public void display()
	{
		System.out.println("PointA = "+getPointA().getX()+" " +getPointA().getY());
		System.out.println("PointB = "+getPointB().getX()+" " +getPointB().getY());
		System.out.println("PointC = "+getPointC().getX()+" " +getPointC().getY());
		System.out.println("PointD = "+getPointD().getX()+" " +getPointD().getY());
				
		System.out.println("Height of the Rectangle is "+getHeight());
		System.out.println("Height of the Rectangle is "+getWidth());
				
		
	}
	
	
	
	
}
