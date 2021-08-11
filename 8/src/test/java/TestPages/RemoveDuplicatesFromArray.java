package TestPages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List <String> s=new ArrayList<String>();
		s.add("a");
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("c");
		System.out.println(s);
		
	Set <String> set= new LinkedHashSet<String>(s);
	System.out.println("Using LinkedHashSet :Ordered without duplicated"+set);
	
	 // Set demonstration using HashSet
    Set<String> Set = new HashSet<String>();
      
    // Adding Elements  
    Set.add("one");
    Set.add("two");
    Set.add("three");
    Set.add("four");
    Set.add("five");
      
    // Set follows unordered way. 
    System.out.println(Set);
	
	Set<Integer> s2 = new LinkedHashSet<Integer>();
	s2.add(1);
	s2.add(2);
	s2.add(3);
	s2.add(1);
	System.out.println(s2);
	//System.out.println(s2.iterator().);
	
	
		

	}

}
