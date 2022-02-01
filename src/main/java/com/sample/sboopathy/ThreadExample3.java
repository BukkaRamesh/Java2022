package com.sample.sboopathy;

public class ThreadExample3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread T3 Completed");
		
	}

}
