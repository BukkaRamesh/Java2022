package com.sample.keerthana;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceUsagesPractice {

	public static void main(String[] args) {
		

		Map<String, Integer> employeeSalary = new HashMap();
		employeeSalary.put("Prabhu", 1000);
		employeeSalary.put("kiki", 2000);
		employeeSalary.put("Ramesh", 3000);
		System.out.println("Using HashMap".toUpperCase());
		for(Map.Entry eachEmployee:employeeSalary.entrySet()) {
			System.out.println("Employee name: " + eachEmployee.getKey()+ " Salary:  "+eachEmployee.getValue());			
		}
		
		Map<String, Integer> petCount = new LinkedHashMap();
		petCount.put("Cat", 2);
		petCount.put("Dog", 1);
		petCount.put("Fish", 3);
		System.out.println("Using LinkedHashMap".toUpperCase());
		for(Map.Entry eachPet:petCount.entrySet()) {
			System.out.println("Pet type: " + eachPet.getKey()+ " and count:  "+eachPet.getValue());			
		}
		
		Map<String, Integer> petCount2 = new TreeMap();
		petCount2.put("Cat", 2);
		petCount2.put("Dog", 1);
		petCount2.put("Fish", 3);
		System.out.println("Using TreeMap".toUpperCase());
		petCount2.entrySet().forEach(System.out::println);
			

	}

}
