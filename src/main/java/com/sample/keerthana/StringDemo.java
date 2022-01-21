package com.sample.keerthana;

public class StringDemo {

	public static void main(String[] args) {
		
		//creating a string literal
		String str1="kiki";
		String str2="kiki";
		String str3="KIKI";
		System.out.println("Using equals function to compare string literal: "+str1.equals(str2));
		System.out.println("Using equality operator to compare string literal: "+ str1 == str2);
		System.out.println(str1.equals(str3));

		//creating a string object
		String s4 = new String("kiki");
		String s5 = new String("prabhu");
		System.out.println("Using equals function to compare string object: "+str1.equals(s4));
		System.out.println("Using equality operator to compare string object: "+str1 == s4);
		System.out.println("Using compareTo function:" +s4.compareTo(s5));
		System.out.println("Location of str1:" +str1.hashCode());
		str1 = str1.concat("velu");
		System.out.println("Location of str1:" +str1.hashCode());
		System.out.println(str1.equals(str2));
		System.out.println("The value of Str1:" +str1);		
		
		//Stringbuilder
		StringBuilder sb = new StringBuilder("test");
		System.out.println("sb before append: " + sb);
		System.out.println("length of sb before append is " + sb.length());
		System.out.println("Memory location of sb before append is " + sb.hashCode());
		
		//append
		sb.append("123");
		System.out.println("sb after append: " + sb);
		System.out.println("length of sb after append is " + sb.length());
		System.out.println("Memory location of sb after append is " + sb.hashCode());
		
		//Stringbuffer
		StringBuffer sbuffer = new StringBuffer("test");
		System.out.println("sbuffer before append: " + sbuffer);
		System.out.println("length of sbuffer before append is " + sbuffer.length());
		System.out.println("Memory location of sb before append is " + sbuffer.hashCode());
		
		//append
		sbuffer.append("123");
		System.out.println("sb after append: " + sbuffer);
		System.out.println("length of sb after append is " + sbuffer.length());
		System.out.println("Memory location of sb after append is " + sbuffer.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
				

}}
