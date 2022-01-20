package com.sample.swathi;

public class VariableSample {
	
	int instanceVariable=10;
	static int staticVariable=20;
	
	public static void main(String[] args) {
	
		int localVariable=30;
		
		VariableSample vs=new VariableSample();
		System.out.println("Instance Variable:" + vs.instanceVariable);
		System.out.println("Static Variable:"+ staticVariable);
		int x = addInteger(localVariable,staticVariable);
		System.out.println("Add Integer method result:"+ x);
		//Adding Local variable to  x and printing
		x=x+localVariable;
		System.out.println("X after adding local variable:" + x );
		vs.datatypes();
		
	}
	
	public static int addInteger(int i, int j) {
		System.out.println("Inside addInteger method");
		int result=i+j;
		System.out.println("Exiting addInteger");
		return result;		
	}
	
	public void datatypes() {
		
		System.out.println();
		System.out.println("In datatypes method");
		int i=100;
		float f1=90;
		double d1=998d;
		short s1=7;
		long l1=9898998989898L;
		boolean t;
		char ch='s';
		
		System.out.println("Integer i: "+i);
		System.out.println("float f1: "+f1);
		System.out.println("short s1: "+s1);
		System.out.println("long l1: "+l1);
		System.out.println("char ch: "+ch);
		System.out.println("double d1: "+d1);
		
		//typecasting
		float f2=(float)i;
		System.out.println("Type casted integer f2:"+f2);
		
		System.out.println("New Line");
		
		
	}
	
}
