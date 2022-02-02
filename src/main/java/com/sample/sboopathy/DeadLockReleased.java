package com.sample.sboopathy;

public class DeadLockReleased extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String res1 = "Java";
		final String res2 = "Training";
		Thread T1 = new Thread() {
			public void run() {
				synchronized (res1) {
					System.out.println(res1 + " - Resource is locked by T1.");
						
				} 									//Locking a resource should be independent.
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
	
				synchronized (res2) {
					System.out.println(res2 + " - Resource is locked by T1.");
					
				}									//Locking a resource should be independent.
			}
		};
		
		Thread T2 =	new Thread() {
			public void run() {
				synchronized (res2) {
					System.out.println(res2 + " - Resource is locked by T2.");
	
				}									//Locking a resource should be independent.
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (res1) {
						System.out.println(res1 + " - Resource is locked by T2.");
						
				}									//Locking a resource should be independent.
			}	
		};
		
		T1.start();
		T2.start();
	}

}
