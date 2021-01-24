package com.au.spring;

import java.util.Map;

public class UsingMap {
	
	
	Map  nameMap;

	 // a setter method to set Map
	   public void setNameMap(Map nameMap) {
	      this.nameMap = nameMap;
	   }
	   
	   // prints and returns all the elements of the Map.
	   public Map getNameMap() {
	      System.out.println("Map Elements :"  + nameMap);
	      return nameMap;
	   }
		  

}
