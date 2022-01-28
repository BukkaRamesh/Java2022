package com.sample.mahesha;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CheckArrayListVsLinkArrayList {

	public static void main(String[] args) {
		
		int in;
		int input;
		Scanner scan = new Scanner(System.in);
		System.out.println("------Enter Value Between 1000000 - 10000000------"+"\n");			
		in = scan.nextInt();
			
		List<Integer> arrayList = new ArrayList<>();		
		System.out.println("*** Time Taken to Add 1000000 Elements to ArrayList ***");
		addElements(arrayList,in);
		
		
		List<Integer> linkedList = new LinkedList<>();		
		System.out.println("*** Time Taken to Add 1000000 Elements to LInkedList ***");
		addElements(linkedList,in);
		
		
		System.out.println("*** -------------------------------------------------  ***");
		
		System.out.println("*** Time Taken to Remove 100 Element in 1000000 ArrayList  ***");
		removeElemnt(arrayList);
		
		System.out.println("*** Time Taken to Remove 100 Element in 1000000 LinKedList  ***");
		removeElemnt(linkedList);
		
		 
	}
	
	
	private static void addElements(List<Integer> list, int input) {
		
		try {
			long startTime = System.currentTimeMillis();
			for(int i =0 ; i <input; i++) {
				list.add(i);
			}
			print(startTime);
			
			} catch (Exception e) {
				throw new OverFlowMemory("Enter Value is too big to process. Enter less value than entered!");
			}	
		
				
	}
	
	private static void removeElemnt(List<Integer> list) {
		
		long startTime = System.currentTimeMillis();
		list.remove(10);
		print(startTime);
	}
	
	
	private static void print(double startTime) {
		
		System.out.println("In Secounds:"+ (System.currentTimeMillis()-startTime) *1000);
	}
	

}
