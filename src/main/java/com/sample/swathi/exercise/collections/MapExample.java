package com.sample.swathi.exercise.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map<Integer,String> colors = new HashMap();
		colors.put(1, "Red");
		colors.put(2, "Green");
		colors.put(3, "Blue");
		colors.put(4, "Yellow");
		colors.put(5, "White");
		colors.put(6, "Black");
		
		for(Map.Entry m:colors.entrySet()) {
			System.out.println(m.getKey()+", "+m.getValue());			
			
			if(m.getValue().equals("Black")) {
				Integer key=(Integer) m.getKey();
				colors.replace(key, "Black", "Violet");
				System.out.println("Updated Value: "+m.getValue());
			}
		}
		
		System.out.println("without using Stream");
		colors.entrySet().forEach(System.out::println);
		System.out.println("using Stream");
		colors.entrySet().stream().forEach(System.out::println);
		 
		
	}

}
