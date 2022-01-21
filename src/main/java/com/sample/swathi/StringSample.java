package com.sample.swathi;

public class StringSample {

	static String s = "Sri Rama";

	public static void main(String[] args) {

		String name1 = "Prashvitha", name2 = "prashvitha";
		System.out.println("Comparing \" " + name1 + "\" and \" " + name2 + "\" with string comparison:");
		System.out.println("Equals method :" + name1.equals(name2));
		System.out.println("Double equal Operator result:" + (name1 == name2));
		System.out.println("compareTo method result:" + (name1.compareTo(name2)));
		System.out.println("compareTo method result:" + (name1.compareToIgnoreCase(name2)));

		String name3 = "Advitha", name4 = " ADVITHA";
		System.out.println("Comparing \" " + name3 + "\" and \" " + name4 + "\" with string comparison:");
		System.out.println("Equals method :" + name3.equals(name4));
		System.out.println("Trim :" + name4.trim());
		System.out.println("Equals method :" + name4.equals(name4));
		System.out.println("Equals method :" + name4.equals(name4.trim()));
		System.out.println(name4);
		String temp = name4.trim();
		System.out.println(temp);
		System.out.println("Equals method :" + name4.equals(temp));

		System.out.println();
		System.out.println();

		System.out.println("s: " + s);
		String sc = s.concat(" Chandra");
		System.out.println("sc: " + sc);
		System.out.println("String after concat:" + s);

		StringBuilder sbd = new StringBuilder("Jai ");
		sbd.append(" Jai");
		System.out.println("StringBuilder adding: " + sbd);

		System.out.println(sc+" hashcode: "+sc.hashCode());
		System.out.println(s+ " hashcode: "+s.hashCode());
		sc.compareTo(s);
		System.out.println("compareTo: "+name1.compareTo(name2));
		System.out.println("compareToIgnoreCase: "+ name1.compareToIgnoreCase(name2));
		
		String lw="Incomprehensibilities";
		System.out.println("charAt value: "+lw.charAt(10));
		System.out.println(lw +" contains \'s\': "+lw.contains("s"));
		System.out.println(lw+ " endsWith \'y\': "+lw.endsWith("y"));
		System.out.println(lw+ " startsWith \'I\': "+lw.startsWith("I"));
		System.out.println(lw+" startsWith \'s\' at index 11 : "+lw.startsWith("s", 11));
		System.out.println("getBytes of "+lw +" : "+lw.getBytes());
		System.out.println("getClass of "+lw+" : "+lw.getClass());
		System.out.println(lw +" string length: "+lw.length());
		System.out.println("In "+lw+" replace \'e\' with \'y\': "+lw.replace("e", "y"));
		System.out.println("In "+lw+" replace all \'i\' with \'x\': "+lw.replaceAll("i", "x"));
		System.out.println(lw+" toLowercase: "+lw.toLowerCase());
		System.out.println(lw+" toUppercase: "+lw.toUpperCase());
		//System.out.println(lw+"toLowercase: "+lw.toLowerCase(Locale));		
		System.out.println("Index of letter c in "+lw +" : "+lw.indexOf("c"));
		
		
	}

}
