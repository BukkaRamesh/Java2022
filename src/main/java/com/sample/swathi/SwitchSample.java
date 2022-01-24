package com.sample.swathi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String bankName;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the bank name: ");
		bankName= reader.readLine().toLowerCase();
		
		
		switch(bankName) {
		
		case "boa":
		     
			System.out.println(bankName+ " rate of interest is: 15%");
			break;
		
		case "chase" :
			
			System.out.println(bankName +" rate of interest is : 18%");
			break;
			
		case "tdbank":
		     
			System.out.println(bankName+ " rate of interest is: 16%");
			break;	
		
		default:
			System.out.println(bankName+ " rate of interest is: 10%");
			break;	
					
		}
	}

}
