package com.au.spring;

import java.util.*;

public class Triangle {
	
	
	//using Set setting the points of the triangle
	private Set<SetOfPoints> spoints;
	
	private SetOfPoints SpointA;
	private SetOfPoints SpointB;
	private SetOfPoints SpointC;
	
	

	public Set<SetOfPoints> getSpoints() {
		return spoints;
	}

	public SetOfPoints getSpointA() {
		return SpointA;
	}

	public void setSpointA(SetOfPoints spointA) {
		SpointA = spointA;
	}

	public SetOfPoints getSpointB() {
		return SpointB;
	}

	public void setSpointB(SetOfPoints spointB) {
		SpointB = spointB;
	}

	public SetOfPoints getSpointC() {
		return SpointC;
	}

	public void setSpointC(SetOfPoints spointC) {
		SpointC = spointC;
	}

	public void setSpoints(Set<SetOfPoints> spoints) {
		this.spoints = spoints;
	}
////////////////////////////////ENd using Set//////////////////////////////////////////////////////////
	
	
	
	
	
	public void draw() {
		
		for(SetOfPoints p:spoints)
		{
			System.out.println("PointA = "+p.getX()+","+p.getY());
		}
		
		
	}

}
