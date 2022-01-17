package com.sample.rameshb;

public class Sample {
	
	
	
	// single line comment
	/*
	 * 
	 * 
	 * 
	 * multi lines comments
	 * 
	 * 
	 * 
	 */
	
	/*
	 *   public is an access specifier 
	 *   static  is the main method in our progeam the JVM it will load this class into memory and runs the main method
	 *   void is a return type the main method doesnot return anything
	 *   the main method is going to acept the single argument of type string array, java command line arguments
	 */
	
	public static void main(String[] args) {
		System.out.println("hello team"); // to print data in a console we need this statments
		int b = add();
		System.out.println("the value of b is: "+b);
	}
	
	//method creation process
	//access specifier, whats the return type, whats the name of method, what is the signiture of method
			//open method  insisde logic and close method
	
	public static int add() {
		int a = 2;  // variable declaration and value assigning
		System.out.println("inside add method");
		return a;
	}

}
