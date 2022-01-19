package com.sample.mahesha;

public class VariableSample {
	
	static int x = 10;

	public static void main(String[] args) {
		
		boolean a = true;
		byte b = 1;
		char c = 'A';
		short d = 23;
		int e = 100100;
		long f= 100000001000100000L;
		float g = 7.83f;
		double h = 7.834567823;
		

		System.out.println(" Addition of 10 + 10 =" +add(x));
		System.out.println(" Subtraction of 10 - 10 =" +sub(x));
		System.out.println(" Multiplication of 10 * 10 =" +mul(x));
		System.out.println(" Division of 10 / 10 =" +div(x));
		System.out.println(" ");
		
		System.out.println("'a' is a 'boolean' variable with value:" +a);
		System.out.println("'b' is a 'byte' variable with value:" +b);
		System.out.println("'c' is a 'char' variable with value:" +c);
		System.out.println("'d' is a 'short' variable with value:" +d);
		System.out.println("'e' is a 'int' variable with value:" +e);
		System.out.println("'f' is a 'long' variable with value:" +f);
		System.out.println("'g' is a 'folat' variable with value:" +g);
		System.out.println("'h' is a 'double' variable with value:" +h);
		
	}

public static int add(int val){
		
		int a = 10;
		return a + val;
		}
	
	public static int sub(int val){
		
		int a = 10;
		return a - val;
		}
	
	public static int mul(int val){
		
		int a = 10;
		return a * val;
		}
	
	public static int div(int val){
		
		int a = 10;
		return a / val;
		}
}
