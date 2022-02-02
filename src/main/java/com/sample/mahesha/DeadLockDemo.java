package com.sample.mahesha;

public class DeadLockDemo {
	public static String s1 ="Resource:01";
	public static String s2="Resource:02";
	
	
	
	public static void main(String[] args) {
		//DeadLockDemo obj = new DeadLockDemo();
		
		
		Thread t1 = new Thread(()-> {
				while(true) {
					synchronized (s1) {
						try {
							System.out.println(Thread.currentThread().getName()+" Locked " +s1);
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						synchronized (s2) {
							System.out.println(Thread.currentThread().getName()+" Locked " +s2);
							//System.out.println(s1+s2);
							
						}
					}
					
				}
		});
		
		Thread t2 = new Thread(() -> {
				while(true) {
					synchronized (s2) {
						try {
							System.out.println(Thread.currentThread().getName()+" Locked " +s2);
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						synchronized (s1) {
							System.out.println(Thread.currentThread().getName()+" Locked " +s1);
							
						}
					}
					
				}	
		});
		
		
		
		t1.start();
		t2.start();
		
	}
	

}
