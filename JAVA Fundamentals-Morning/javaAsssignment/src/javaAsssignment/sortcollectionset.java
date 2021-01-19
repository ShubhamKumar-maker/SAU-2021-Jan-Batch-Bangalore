package javaAsssignment;
import java.util.*;

public class sortcollectionset {

	public static void main(String[] args) {
		 HashSet<Integer> numbers = new HashSet<Integer>(); 
		 numbers.add(10);
		 numbers.add(8);
		 numbers.add(70);
		 numbers.add(1);
		 numbers.add(5);
		
		 System.out.println("Before sorting:-");
		 //we cannot assume on what order data will the shown in hashsset
		 System.out.println(numbers);
		 
		 //to sort the hashsset first we have to convert the hash set into the 
		 //Treeset 
		 TreeSet<Integer> tr=new TreeSet<Integer>(numbers);
		 System.out.println("After sorting:-");
		 System.out.println(tr);
		
		 
		  

	}

}
