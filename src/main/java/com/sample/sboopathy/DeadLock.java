package com.sample.sboopathy;

public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String res1 = "Java";
		final String res2 = "Training";
		Thread T1 = new Thread() {
			public void run() {
				synchronized (res1) {   										//Starting of Lock for Thread T1.
					System.out.println(res1 + " - Resource is locked by T1.");

					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
	
					synchronized (res2) {
						System.out.println(res2 + " - Resource is locked by T1.");
						
					}															//Locked within a Lock.
				}																//Ending of Lock for Thread T1.
			}
		};
		
		Thread T2 =	new Thread() {
			public void run() {
				synchronized (res2) {											//Starting of Lock for Thread T2
					System.out.println(res2 + " - Resource is locked by T2.");

					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
	
					synchronized (res1) {
						System.out.println(res1 + " - Resource is locked by T2.");
						
					}															//Locked within a Lock.
				}																//Ending of Lock for Thread T2.
			}
		};
		T1.start();
		T2.start();
	}

}
