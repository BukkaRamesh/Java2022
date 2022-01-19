package com.sample.mahesha;

public class Sample {

	public static void main(String[] args) {
		int a = 4;
		int b = 2;
			
		System.out.println("Addition:" +add(a,b));
		System.out.println("Subtraction:" +sub(a,b));
		System.out.println("Multiplication:" +mul(a,b));
		System.out.println("Division:" +div(a,b));
	
		}
	
	public static int add(int val1, int val2){
		
		return val1 + val2;
		}
	
	public static int sub(int val1, int val2){
		
		return val1 - val2;
		}
	
	public static int mul(int val1, int val2){
		
		return val1 * val2;
		}
	
	public static int div(int val1, int val2){
		
		return val1 / val2;
		}

	}


