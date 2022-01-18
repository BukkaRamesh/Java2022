/**
 * 
 */
package com.sample.rameshb;

/**
 * @author rameshbukka
 *
 */
public class AboutJvm {
	
	
	// variables
	// datatypes
	
	/*
	 *  we have 3 ways to declare a variable
	 *  1 local
	 *  2 instance 
	 *  3 static  this variable is defined with keyword static
	 *  
	 *  memory allocation 
	 *  the static variables are assigned to specific memory only when the class is loaded in memory
	 *  
	 *  JVM class loader -- main method 
	 * 
	 * 
	 *   data types 
	 *   
	 *   1. primitive data types   --- boolean, char, byte, short, long,integer double, float
	 *   2. non - primitive data types
	 *   
	 *   boolean -- true / false, yes/no, 1/0
	 *   char = 'a'
	 *   byte = 100 -- 8 bit signed component and range of byte -128 to 128
	 *   short = 100000 - 16 bit range - 32k  deafule value is 0
	 *   
	 *   int = 1000 32 bit 
	 *   long = 100000000000L  kkk huge memory allocation then int 
	 *   
	 *   float = 10.23f     
	 *   double = 10.2323 64 bit 
	 *   
	 *   non primitive data type 
	 *   
	 *   array  -- stored at index levels , the index of array always starts with 0 
	 *   strings
	 *  
	 *   char[] name = ['s', 'u', 'd', 'h', 'a'];
	 *    name[5]  // index out of bound exception
	 *    
	 *    String test = "asdhgahjsdkaidhaksdahsdajksdhjkahksjdhjahjksdh asdasdhkajsd asdasdasd";
	 *    
	 *    Strings are immutable 
	 *    
	 *    2 ways to creat a string 
	 *    1. using string literal 
	 *    2. by using new keyword
	 *    
	 *    
	 *    memory allocation is different for strings
	 *    
	 *    JVM we have area called heap memory  -->  string constant pool --> 
	 *    inside string constant pool 
	 *    
	 *     name = x  -- for name it will allocate the value x
	 *     name = name.concat(abc)  -- name will get the old value 
	 *    
	 *    type casting 
	 * 
	 */
	static int m = 100; 
	
	int b = 40; // instance variable
	float f = 40.34f;
	
	int c = (int)f;   // type casting
	
	
	static void createUser() {
		int  a = 20;  // declared varable a and assigned value    local variable 
		//int c = a+b;
	
		
	}
	
	int add() {
		System.out.println("inside add method"+b);
		return 1;
	}
	
	public static void main(String[] args) {
		int d = 23;   // instance variable out side a method inside the class and ouside th body of method
		createUser();  // other variabvles are methods memory allocation is happend at the time of initialiation
		
		String name = "ramesh b";  // String literal
		//name = name.va   concat(" this is no  longer ramesh");  
		
		System.out.println(name);
		
		String s = new String("hello all");    //using new keyword 
	}
	

}
