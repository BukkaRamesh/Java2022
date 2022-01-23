package com.sample.mahesha;

import java.util.Scanner;

public class TryInfiniteLoop {

	public static void main(String[] args) {
		
		//Infinite for loop
//		for(;;) {
//			System.out.println("This is infinite 'for' loop.");
//			break;// Break the infinite loop
//		}
		
		//Infinite while loop
//		while(true) {
//			System.out.println("This is infinite loop 'while' loop.");
//			break;// Break the infinite loop
//		}
		
		//Infinite do-while loop
		
//		do {
//			System.out.println("This is infinite 'do-while' loop.");
//			break;// Break the infinite loop
//		
//		}while(true);
//		

		
		System.out.println("If you not guess correct, you will be in an infinite loop!");
		
		try (Scanner input = new Scanner(System.in)) {
			int guessNumber;
			
			while(true) {
				System.out.println("Enter a number between 0 to 9 and find the breaking point :");
			
				guessNumber = input.nextInt();
				
				if(guessNumber == 7) {
					System.out.println("Awesome!, You are guessed correctly!");
					break;
					
				} 
					
					System.out.println("Your guess is wrong!");
					
					
			}
		}
		
		
	}

}
