package com.sample.sboopathy;

import java.util.*;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long stime, etime;
	
		List <String> L1 = new ArrayList <String> ();
		
		L1.add("Sam");
		L1.add("John");
		L1.add("Carter");
		L1.add("Peter");
		L1.add("Sam");
		
		System.out.println("ArrayList: Printed the following using forEach() from Collections.");
		L1.forEach(System.out::println);
		
		System.out.println("ArrayList: Printed the following using Iterator.");
		Iterator <String> Itr = L1.iterator();
		while(Itr.hasNext()) {					//hasnext() if contents exists or not, if exists, true otherwise false
			System.out.println(Itr.next());		//next() will read the contents of the array
 		}
		
		System.out.println("ArrayList: Printed the following using Java8 forloop method.");
		for(String s: L1) {
			System.out.println(s);
		}
		
		List <String> L2 = new LinkedList<String>();
		
		L2.add("Sam");
		L2.add("John");
		L2.add("Carter");
		L2.add("Peter");
		L2.add("Sam");
		
		System.out.println("LinkedList: Printed the following using forEach().");		
		L2.forEach(System.out::println);
		
		List <Integer> LI1 = new ArrayList <Integer>();
		stime = System.currentTimeMillis();
		
		for(Integer i=1;i<=10000;i++) {
			LI1.add(i);
		}
		
		for(Integer i=1; i<=10000;i++) {
			if(i % 1000 == 0) {
				LI1.remove(i);
			}	
		}

		etime = System.currentTimeMillis();
		
		System.out.println("ArrayList  : Time Taken : " + (etime - stime));
		
		
		List<Integer> LI2 = new LinkedList<Integer>();
		stime = System.currentTimeMillis();
		
		for(Integer j=1;j<=10000;j++) {
			LI2.add(j);
		}

		for(Integer j=1; j<=10000;j++) {
			if(j % 1000 == 0) {
				LI2.remove(j);
			}	
		}

		etime = System.currentTimeMillis();
		
		System.out.println("LinkedList : Time Taken : " + (etime - stime));
		
	}

}
