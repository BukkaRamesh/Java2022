package com.sample.swathi;

public class StringSample {
	
	static String s="Sri Rama";

	public static void main(String[] args) {
	
	String name1="Prashvitha", name2="prashvitha";
	System.out.println("Comparing \" "+ name1 + "\" and \" "+name2 + "\" with string comparison:" );
	System.out.println("Equals method :"+ name1.equals(name2));
	System.out.println("Double equal Operator result:" + (name1==name2));
	System.out.println("compareTo method result:"+ (name1.compareTo(name2)));
	System.out.println("compareTo method result:"+ (name1.compareToIgnoreCase(name2)));
	
	
	String name3="Advitha", name4 = " ADVITHA";
	System.out.println("Comparing \" "+ name3 + "\" and \" "+name4 + "\" with string comparison:" );
	System.out.println("Equals method :"+ name3.equals(name4));
	System.out.println("Trim :"+ name4.trim());
	System.out.println("Equals method :"+ name4.equals(name4));
	System.out.println("Equals method :"+ name4.equals(name4.trim()));
	System.out.println(name4);
	String temp=name4.trim();
	System.out.println(temp);
	System.out.println("Equals method :"+ name4.equals(temp));
	
	System.out.println();
	System.out.println();
	
	System.out.println("s: "+s);
	String sc= s.concat( " Chandra");
	System.out.println("sc: "+sc);
	System.out.println("String after concat:"+s);
	
	StringBuilder sbd=new StringBuilder("Jai ");
	sbd.append(" Jai");
	System.out.println("StringBuilder adding: " + sbd);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}
