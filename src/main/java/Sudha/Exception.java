package Sudha;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception {
	

	public static void main(String[] args) {
		try {
			int div=152/0;
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		FileInputStream doc = null;
		try {
			doc = new FileInputStream("CUsers/tnvsu/sudha");//File Reader
			doc.read();
			//doc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException io) {
			// TODO Auto-generated catch block
			io.printStackTrace();
		} finally{
			try {
			doc.close();
			}catch(IOException io) {
				io.printStackTrace();
			}
			
		}
	}
}
