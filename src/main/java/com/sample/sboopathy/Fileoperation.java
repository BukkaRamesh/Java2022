package com.sample.sboopathy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream FIS = null;
		FileOutputStream FOS = null;
		
		try {
			FIS = new FileInputStream("C:\\Sudha\\Exception\\Input.txt");
			FOS = new FileOutputStream("C:\\Sudha\\Exception\\Output.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			int i = FIS.read();
		
			while(i != -1) {
				FOS.write(i);
				i = FIS.read();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				FIS.close();
				FOS.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		}
		
	}

}
