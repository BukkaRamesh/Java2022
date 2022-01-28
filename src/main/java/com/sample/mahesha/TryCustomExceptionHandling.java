package com.sample.mahesha;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryCustomExceptionHandling {

	public static void main(String[] args) {
		
		try {
			FileOutputStream outputFile = new FileOutputStream("C:\\Users\\Mahesha\\Desktop\\Java Testing Files\\test.txt");
			PrintWriter writer = new PrintWriter(outputFile);
			writeData(writer);
		} catch (FileNotFoundException e) {
			throw new NotCreated("File Is Not Created");
		}
		
		
					
		try {
			FileInputStream inputFile = new FileInputStream("C:\\Users\\Mahesha\\Desktop\\Java Testing Files\\test.txt");
			Scanner reader = new Scanner(inputFile);
			readData(reader);
		} catch (IOException e) {
			throw new FileNotFound("Input File Not Found.");
			
		}
		
	
	}

	public static void writeData(PrintWriter writer) {
			
		writer.println("********Writing in created File**********");
		for(int i=1; i<=10; i++) {
			writer.println("Print Line :"+i);		
		}
		writer.close();
	}	
	
	
	public static void readData(Scanner reader) {
		
		while(reader.hasNextLine()) {
			System.out.println(reader.nextLine());
		}
	}
	
	
}
