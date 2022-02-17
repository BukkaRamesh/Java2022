package com.sample.sboopathy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {
     // count character in String java 8
	public static void main(String[] args) {

		//1. To count characters in string?
		String s = "1. To count characters in String using Java 8 Stream API"; 
		System.out.println("Given String         : " + s);   
		System.out.println("# of Occurrences of o: " + s.chars().filter(ch -> ch == 'o').count());
		System.out.println();
		
		//2. Print a string by length and sort them?
		List<String> s2 = new ArrayList<String>();
		s2.add("Java");
		s2.add("Training");
		s2.add("Batch");
		s2.add("Jan2022");
		
		
		//3. Get top 5 elements using HashMap? 
		Map<Integer, Integer> top5 = new HashMap<Integer, Integer>();
		top5.put(1,40);
		top5.put(2,20);
		top5.put(3,30);
		top5.put(4,10);
		top5.put(5,60);
		top5.put(6,50);
		
		System.out.println("Elements before Sorting for Top 5 : " + top5.values().stream().collect(Collectors.toList()));	
		System.out.println("Top 5 elements : " + top5.values().stream().sorted(Collections.reverseOrder()).limit(5).collect(Collectors.toList()));
		
	}

}
