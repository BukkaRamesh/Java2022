package com.sample.swathi.exercise.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> colors = new HashMap();
		colors.put(1, "Red");
		colors.put(2, "Green");
		colors.put(3, "Blue");
		colors.put(4, "Yellow");
		colors.put(5, "White");
		colors.put(6, "Black");

		for (Map.Entry m : colors.entrySet()) {
			System.out.println(m.getKey() + ", " + m.getValue());

			if (m.getValue().equals("Black")) {
				Integer key = (Integer) m.getKey();
				colors.replace(key, "Black", "Violet");
				System.out.println("Updated Value: " + m.getValue());
			}
		}

		System.out.println("without using Stream");
		colors.entrySet().forEach(System.out::println);
		System.out.println("using Stream");
		colors.entrySet().stream().forEach(System.out::println);

		Map<String, Long> homePrice = new LinkedHashMap();
		homePrice.put("Apartment", 200000L);
		homePrice.put("Condominium", 300000L);
		homePrice.put("Townhome", 400000L);
		homePrice.put("Individual Home within community", 800000L);
		homePrice.put("Individual Home", 600000L);

		homePrice.forEach((key, value) -> System.out.println(key + " Price range starts from : " + value));

		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

		tree_map.put(10, "HI");
		tree_map.put(15, "Namastey");
		tree_map.put(20, "Welcome");
		
		System.out.println("TreeMap: " + tree_map);

	}

}
