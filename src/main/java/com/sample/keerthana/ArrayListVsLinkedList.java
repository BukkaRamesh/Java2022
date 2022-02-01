package com.sample.keerthana;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
	
		List <String> arrayList = new ArrayList <String> ();
		List <String> linkedList = new LinkedList <String> (); 
		
		long timeTakenForArrayList = addElementsAndGetTimeTaken(arrayList);
		long timeTakenForLinkedList = addElementsAndGetTimeTaken(linkedList);
		
		System.out.println("Time taken to add elements in Array List "+ timeTakenForArrayList);
		System.out.println("Time taken to add elements in Linked Listr "+ timeTakenForLinkedList);
	}
	
	public static long addElementsAndGetTimeTaken(List<String> l){
		long startTime = System.currentTimeMillis();
		System.out.println("startTime" + startTime);
		
		l.add("Prabhu");
		l.add("Kiki");
		l.add(1, "Test");
		l.add(1, "Test1");
		l.add(1, "Tes2t");
		l.add(1, "Test3");
		
		for (int i = 0; i < 100000; i++) {
			l.add(1, "Test4");
        }
		
		long endTime = System.currentTimeMillis();
		System.out.println("endTime" + endTime);
		return endTime - startTime;
	}

}
