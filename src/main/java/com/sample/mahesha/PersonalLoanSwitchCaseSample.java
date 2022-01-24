package com.sample.mahesha;

import java.util.Scanner;

public class PersonalLoanSwitchCaseSample {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter bank to check current personal loan interest :");
			
			String bank = input.nextLine();

			switch(bank) {
			
			case "chase":
				System.out.println("Chase bank personal loan interest is : 10%");
			break;
			
			case "boa":
				System.out.println("Chase bank personal loan interest is : 13%");
			break;
			
			case "unity":
				System.out.println("Chase bank personal loan interest is : 11%");
			break;
			
			case "prosperity":
				System.out.println("Chase bank personal loan interest is : 14%");
			break;
			
			default:
				System.out.println("Federal goverment current personal load interest is : 12%");
				
			
			}
		}

	}

}
