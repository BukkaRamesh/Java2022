package com.sample.sboopathy;

public class CustomException {

	public void check(int i) throws Exception {
		
		if(i == 0) {
			throw new Exception ("This is a Custom Exception example.");
		}
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomException C1 = new CustomException();
		
		try {
			C1.check(0);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
