/**
 * 
 */
package com.sample.keerthana;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author keert
 *
 */
public class StreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> word = Arrays.asList("java");
//		Integer count =  word.stream().map(i -> i.length()).collect(Collectors.summingInt(Integer :: intValue));
		List<Integer> count =  word.stream().map(i -> i.length()).collect(Collectors.toList());
		System.out.println("The number of character in the given string:"+count);

	

		List<String> words = Arrays.asList("java","prabhu","kiki","sam");
		List<Integer> result = words.stream().map(x -> x.length()).sorted().collect(Collectors.toList());
		System.out.println("The length of string after sorted:"+result);
		
		
		Map<Integer, Integer> map = new HashMap<>();
	    map.put(1, 24);
	    map.put(2, 50);
	    map.put(3, 26);
	    map.put(4, 180);
	    map.put(5, 244);
	    map.put(6, 500);
	    map.put(7, 2);
	    map.put(8, 5);
	    
		List<Integer> sortedList = map.values().stream()
		        .sorted(Collections.reverseOrder())
		        .limit(5)
		        .collect(Collectors.toList());

		System.out.println("The top 5 elements in the hashmap:"+sortedList);



	}

}

