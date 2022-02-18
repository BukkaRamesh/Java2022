package com.sample.sboopathy;

import java.time.LocalTime;

public class CheckTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This program prints time every 5 seconds. And it would exit after 5 iterations.");
		try {
			for(int i=0;i<5;i++) {
				System.out.println(LocalTime.now());
				Thread.sleep(5000); //Replace 5000 with 3600000 for every one hour
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
