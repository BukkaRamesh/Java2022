package com.sample.keerthana;

public class VariableDemo {
	public static int x = 3; 
	int y = 3;

	public static void main(String[] args) {
		int c = 10;
		VariableDemo obj1 = new VariableDemo();
		System.out.println("The instance variable in this class:" +obj1.y); //accessing instance variable
		System.out.println("The static variable in this class:" +x);
		System.out.println("The local variable in this class:" +c);
		obj1. calculate();
		int m = mul(c,x); //accessing static variable
		System.out.println("Multiplying two integers: "+m); 
		
		//Typecasting 
		
		float f = 11.2f;
		int a = (int)f;
		System.out.println("the value of f is: " +f);
		System.out.println("the value of a is: " +a);
		
		
	}
	public void calculate() {
		int a = 10;
		int b = 20;
		int result = (a+b) / y;
		System.out.println("Calculating two integers:" +result);
	}
	
	public static int mul(int m1,int m2) {
		int res = m1 * m2;
		return res;
	}
}
