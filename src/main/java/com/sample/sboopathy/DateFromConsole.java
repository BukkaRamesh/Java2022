package com.sample.sboopathy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;




public class DateFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LocalDate curr_dt = LocalDate.now();
			
			BufferedReader Buff = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Please enter the Delivery Date (yyyy-mm-dd) :");
			String s = Buff.readLine();
			
			if(s.isEmpty()){
				System.out.println("Deilvery Date cannot be blank");
			}
			else {
				try {
					LocalDate Del_dt = LocalDate.parse(s);
					System.out.println(s);
					System.out.println("Current Date         : " + curr_dt);
					System.out.println("Delivery Date        : " + Del_dt);
					System.out.println("Difference in Days   : " + ChronoUnit.DAYS.between(curr_dt, Del_dt));
					System.out.println("Difference in Months : " + ChronoUnit.MONTHS.between(curr_dt, Del_dt));
				}
				catch(DateTimeException e) {
					System.out.println("Invalid Date Entered!!! Please check and try again.");
					e.printStackTrace();
				}
				catch (Exception e){
					e.printStackTrace();
				}
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
