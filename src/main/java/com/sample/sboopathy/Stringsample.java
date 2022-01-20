package com.sample.sboopathy;

public class Stringsample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "sudha", s2 = "SUDHA";
		StringBuffer sbf = new StringBuffer("Training");
		StringBuilder sbd = new StringBuilder("JAVA");
		
		System.out.println("Value of String variable, s    : " + s);
		System.out.println("Value of String variable, s2   : " + s2);
		
		//Compare s and s2
		System.out.println("Is s equal to s2               : " + s.equals(s2));
		System.out.println("Is s equal to lowercase of s2  : " + s.equals(s2.toLowerCase()));
		System.out.println();
		
		//String Buffer - used Append and length methods
		System.out.println("Before:");
		System.out.println("Value of StringBuffer variable, sbf  : " + sbf);
		System.out.println("Length of StringBuffer variable, sbf : " + sbf.length());
		sbf.append(" in JAVA");  
		System.out.println("After:");
		System.out.println("Value of StringBuffer variable, sbf  : " + sbf);
		System.out.println("Length of StringBuffer variable, sbf : " + sbf.length());
		System.out.println("");

		//String Builder - used Append and length methods
		System.out.println("Before:");
		System.out.println("Value of StringBuilder variable, sbd  : " + sbd);
		System.out.println("Length of StringBuilder variable, sbd : " + sbd.length());
		sbd.append(" Training");
		System.out.println("After:");
		System.out.println("Value of StringBuilder variable, sbd  : " + sbd);
		System.out.println("Length of StringBuilder variable, sbd : " + sbd.length());
		
		
	
	}

}
