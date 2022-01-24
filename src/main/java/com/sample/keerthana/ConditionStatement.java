package com.sample.keerthana;

public class ConditionStatement {

	public static void main(String[] args) {
			
		 int arr[] = {2,24,25,30};
			for(int nums: arr) {
				System.out.println("The values in array:" +nums);
				
			}
		
		//do_while 	
			int i =0;
		do {
			
			int res =i + (i+1) ;
			System.out.println(res);
			i++;
				
		}while(i<=10 );

		//infinite for loop 
			for(int j =0;j>=0;j++) {
				System.out.println(j);
			}
		
		//infinite while loop
			while(true) {

				int a = 0; 
				a += 2;
				System.out.println("Hi" +a);

			}
			
		
		
	}}
			