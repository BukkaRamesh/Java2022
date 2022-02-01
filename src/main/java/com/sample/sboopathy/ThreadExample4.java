package com.sample.sboopathy;

public class ThreadExample4 implements Runnable {
	public static Thread t;
	public static ThreadExample4 EX4;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		ThreadExample3 EX3 = new ThreadExample3();
		Thread T3 = new Thread(EX3);
		System.out.println("T3 State : " + T3.getState());
		T3.start();
		System.out.println("T3 State : " + T3.getState());
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EX4 = new ThreadExample4();
		t = new Thread(EX4);
		System.out.println("T4 State : " + t.getState());
		t.start();
		System.out.println("T4 State : " + t.getState());
		try{
			t.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("T4 State : " + t.getState());
		System.out.println("Thread T4 Completed.");
	}

}
