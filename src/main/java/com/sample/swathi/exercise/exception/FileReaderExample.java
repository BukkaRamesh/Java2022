package com.sample.swathi.exercise.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 1. Reading Input from console
 * 2. Writing the console input into output file
 * 3. Reading the output file 
 * */
public class FileReaderExample {

	private static final Logger LOGGER = LoggerFactory.getLogger(FileReaderExample.class);

	public static void main(String[] args) {

		LOGGER.info("Entering into main method");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Data :");

		try {
			String line = reader.readLine();

			writeFile(line); // writing the data to a file
			
			System.out.println("Enter Interger value:");
			
			int i = Integer.valueOf(reader.readLine());
			
			int j = 1/i;
									

			readFile("file.txt"); // Reading data from file

		} catch (IOException e) {
			LOGGER.error(e.getMessage());
		} catch (ArithmeticException ae) {
			throw new CustomException("Invalid input to perform Arithematic Operation");
		}
		

	}

	public static void writeFile(String data) {

		FileOutputStream fout = null;

		try {
			fout = new FileOutputStream(new File("file.txt"));

			fout.write(data.getBytes());

		} catch (FileNotFoundException e) {

			throw new CustomException(e, "Unable to write to file.");

		} catch (IOException e) {
			
			throw new CustomException(e, "Invalid Operation to write the file");
		
		} finally {
			
			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {

					throw new CustomException(e, "Invalid Operation to close the file");
				}
			}
		}
	}

	public static void readFile(String filePath) {

		try {

			FileInputStream fis = new FileInputStream(new File(filePath));
			StringBuilder sb = new StringBuilder();
			try {
				int i = 0;
				while ((i = fis.read()) != -1) {
					sb.append(((char) i));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Final Response:" + sb.toString());

		} catch (FileNotFoundException e) {

			throw new CustomException("The file does not exist.");
		}

	}

}
