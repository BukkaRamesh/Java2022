package com.sample.swathi.exercise.threading;

class Multiples {

   synchronized void fiveMultiples(int no) {
		
    	
    	for(int i=1; i<=5;i++) {
			System.out.println(no+"*"+i+" : "+no*i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
 class MyThread1 extends Thread{
	
	Multiples m1;
	
	public MyThread1(Multiples m) {
		this.m1=m;
	}
	public void run() {
		System.out.println(MyThread1.currentThread().getName() + " has started ");
		m1.fiveMultiples(10);
	}
	
}
 
 class MyThread2 extends Thread{
		
	Multiples m2;
	
	public MyThread2(Multiples m) {
		this.m2=m;
	}
	public void run() {
		System.out.println(MyThread2.currentThread().getName() + " has started");
		m2.fiveMultiples(50);
	}
	
} 
 
 
 
 class SampleSynchronize {
	 
	 public static void main(String[] args) {
		 Multiples m = new Multiples();
		 MyThread1 t1 = new MyThread1(m);
		 t1.start();
		 
		 MyThread2 t2 = new MyThread2(m);
		 t2.start();
		 
		 System.out.println("t1 current state :" + t1.getState());
		 System.out.println("t2 current state :" + t2.getState());
		 
	}
 }
