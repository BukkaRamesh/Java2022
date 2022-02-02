package com.sample.sboopathy;

public class Times3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Times T = new Times();
		Times2 MyObj1 = new Times2(T, 5);
		Times2 MyObj2 = new Times2(T, 6);
		
		MyObj1.start();
		MyObj2.start();

	}

}
