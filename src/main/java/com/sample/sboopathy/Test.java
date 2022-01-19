package com.sample.sboopathy;

public class Test {
	public static String global_s ="Training";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		System.out.println("The following output is coming from sub() method:");
		System.out.println(sub(10.5f,9.5f));
		printString();
	}
	
	public static void add() {
		int local_a = 20;
		int local_b = 10;
		System.out.println("The following output is coming from add() method:");
		System.out.println(local_a+local_b);
	}
	
	public static float sub(float a,float b) {
		return a-b;
	}
	
	public static void printString() {
		System.out.println("This statement is coming from printString()");
		System.out.println(global_s);
		
	}
}
