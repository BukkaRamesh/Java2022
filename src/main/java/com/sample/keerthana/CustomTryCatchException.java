package com.sample.keerthana;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CustomTryCatchException {
	


	public static void main(String[] args) throws Exception {
		
		Scanner scan = null ;
		PrintWriter pw = null;
		try 
		{
			FileOutputStream fos = new FileOutputStream("input.txt");
			pw = new PrintWriter(fos);
			pw.println("15");
			pw.println("18");
			
		} catch (FileNotFoundException ex) {
			throw new Exception();
		}
		
		try 
		{
			FileInputStream fis = new FileInputStream("input.txt");
			scan = new Scanner(fis);
			
			while(scan.hasNextLine()) 
				{
					String data = scan.nextLine();
					System.out.println(data);
					int age = Integer.parseInt(data);
					if ( age < 18) {
					throw new NotValidAgeException("Person is underage");
					}
			}
			
				
		}catch(NotValidAgeException e) {
			e.printStackTrace();
			
		}finally{
			scan.close();
			pw.close();
		}
			
	}
}	
	
		
				
	


