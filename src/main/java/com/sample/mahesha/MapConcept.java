package com.sample.mahesha;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapConcept {

	public static void main(String[] args) {
		
		Map <Integer,String> employee = new HashMap<>();
		employee.put(1, "Jhon");
		employee.put(2, "john");
		employee.put(3, "scott");
		employee.put(4, "devid");
		employee.put(5, "lauren");
		employee.put(6, "chris");
				
		
		System.out.println("********  HashMap **********"+"\n");
		employee.forEach((key, value) -> System.out.println(key + " " +value.toUpperCase()));
		System.out.println("----Who is Employee id '3': " +employee.get(3).toUpperCase());
		System.out.println("----Is Employee id '7' still there after removed: " +employee.remove(6).isBlank());
								
		Map <String,Integer> marks = new LinkedHashMap<>();		
		marks.put("smith", 87 );
		marks.put("mike", 90 );
		marks.put("jose", 57);
		marks.put("diane", 32);
		marks.put("mackey", 78 );
		marks.put("lisa", 98);
		marks.put("grame", 65 );
		
		System.out.println("******** Using LinkedHashMap **********"+"\n");	
		marks.forEach((key, value) -> System.out.println(key.toUpperCase() + " got " +value +" marks"));
		System.out.println("----Marks for Jose is: " +marks.get("jose"));
		System.out.println("----Is Lisa marks got marks? " +marks.containsValue(98));
		System.out.println("----How many marks mike's got? " +marks.get("mike"));
		System.out.println("----Is mackey got 78 marks ? " +marks.containsValue(78)+"\n");
		
		
		
		Map<String,String> cricket = new TreeMap<>();		
		cricket.put("Sri Lanka", "Jayasooriya");
		cricket.put("India", "Sachin");
		cricket.put("England", "Morgan");
		cricket.put("Australia", "Smith");
		cricket.put("West Indies", "Gale");
		cricket.put("Pakistan", "Waseem");
		
		System.out.println("******** Using TreehMap **********"+"\n");
		cricket.forEach((key, value) -> System.out.println(value +" was a cricket player of " +key));
					
		System.out.println("----***** ----------------- *******-----"+"\n");
		System.out.println("----Is Map 'Cricket' equal to Map 'employee: "+cricket.equals(employee));
			
		
	}

}
