package com.sample.sboopathy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceExample {	//MAP Interface example

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <Integer, String> M1 = new HashMap <Integer, String>();
		M1.put(1, "Sam");  
		M1.put(3, "John");
		M1.put(2, "Peter");
		M1.put(4, "Carter");
		System.out.println("M1 Contents - Order by key:");
		M1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		Map <Integer, String> M2 = new LinkedHashMap <Integer, String>();
		M2.put(5, "Sam");  
		M2.put(6, "John");
		M2.put(8, "Peter");
		M2.put(7, "Carter");
		System.out.println();
		System.out.println("M2 Contents - Order by value:");

		M2.entrySet()      
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
		Map <String, Integer> M3 = new TreeMap <String, Integer>();
		M3.put("ScienceStudent", 800);
		M3.put("MathStudent   ", 1200);
		M3.put("HistoryStudent", 600);
		System.out.println();
		System.out.println("M3 Contents - Default Order by Key:");
		M3.forEach((k,v)->System.out.println(k+" "+v));
	}

}
