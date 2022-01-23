package com.sample.sboopathy;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		while (i<=10) {
		System.out.println(i);
		i++; //commenting the line create infinite loop
		}
		System.out.println("The following loop will print only odd numbers");					
		for(i=1;i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		char vowels='a';
		switch (vowels) {
			
		case 'a':
			System.out.println("its a vowel");
			break;
		case 'e':
			System.out.println("its a vowel");
			break;
		case 'i':
			System.out.println("its a vowel");
			break;
		case 'o':
			System.out.println("its a vowel");
			break;
		case 'u':
			System.out.println("its a vowel");
			break;	
		default:
			System.out.println("the given value is not vowel");
		}
		
		

	}

}
