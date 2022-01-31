package com.sample.swathi.exercise.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListDiffDemo {
	
	private static Random rnd = new Random();
	
	private static long startTime;
	private static long endTime;
	public static final int NO_OF_ELEMENTS=2000000;
		
	public static void main(String[] args) {
		
		ArrayList<String> arr1 = new ArrayList<String>();
		LinkedList<String> link1 = new LinkedList<String>();
		
		startTime = time();
		insertData(arr1);
		endTime = time();		
		System.out.println("Time taken to add "+NO_OF_ELEMENTS+" elements in ArrayList: "+ ((endTime-startTime)/1000));
		
		startTime = time();
		insertData(link1);
		endTime = time();
		System.out.println("Time taken to add "+NO_OF_ELEMENTS+" elements in LinkedList: "+ ((endTime-startTime)/1000));
		
		checkInsertionPerformance(arr1);
		checkInsertionPerformance(link1);
		
		checkSearchPerformane(arr1);
		checkSearchPerformane(link1);
		
//		checkDeletePerformance2(arr1);
//		checkDeletePerformance2(link1);
		
	
		
	}
	
	public static long time() {
		 
		return (System.currentTimeMillis());
		
	}
	
	public static void insertData(List<String> list) {
		
       for(int i=NO_OF_ELEMENTS ; i-- > 0;) {
			
			list.add(new String(""+i));
		}
		
	}
   
	public static void checkInsertionPerformance(List<String> list) {
		
		startTime=time();
		int randomIndex;
        for (int i = 200; i-- > 0; ) {
        	randomIndex = rnd.nextInt(100000);            
            list.add(randomIndex, "test");
        }
        endTime = time();	
        
        System.out.println(String.format("%s taken time for insertion: %d", list.getClass().getSimpleName(), (endTime-startTime)));
		
	}
	public static void checkSearchPerformane(List<String> list) {
        
		startTime=time();
        int rndIndex;
        for (int i = 200; i-- > 0; ) {
            rndIndex = rnd.nextInt(100000);
            list.get(rndIndex);
        }

        endTime = time();
        System.out.println(String.format("%s take time for searching:%d", list.getClass().getSimpleName(), (endTime-startTime)));

	}  
	
	public static void checkDeletePerformance(List<String> list) {
		startTime=time();
        int rndIndex;
        for (int i = 10000; i-- > 0; ) {
        	rndIndex = rnd.nextInt(2000000);
        	list.remove(""+rndIndex);
        }
        endTime = time();
        System.out.println(String.format("%s take time for Deletion:%d", list.getClass().getSimpleName(), (endTime-startTime)));
		
	}
//	public static void checkDeletePerformance2(List<String> list) {
//		startTime=time();
//		for (int i = 200; i-- > 0; ) {
//			list.remove(""+i);
//		}
//		endTime = time();
//		System.out.println(String.format("%s take time for Deletion:%d", list.getClass().getSimpleName(), (endTime-startTime)));
//		
//	}
}
