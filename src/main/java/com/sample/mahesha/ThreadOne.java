package com.sample.mahesha;

public class ThreadOne extends  Thread {

	@Override
	public void run() {
		
		for (int i = 1; i<=10; i++) {
			System.out.println("Thread #1: " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Thread #1 completed");
	}
}
