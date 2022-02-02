package com.sample.mahesha;

public class ThreadSet {
	
public static void main(String[] args) {
		
	Multiplication m = new Multiplication();
	Multiplication m1 = new Multiplication();
	
		MyThread t1 = new MyThread(m);
		MyThread1 t2 = new MyThread1(m);
		MyThread t3 = new MyThread(m1);
		MyThread1 t4 = new MyThread1(m1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//System.out.println(t.result);
	}

}

class Multiplication {
	
	
	//public static int result;
	
	 synchronized static void printMultiplies(int n) {
		for(int i=1; i<=5; i++) {
			//result = n*i;
			System.out.println(i * n);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}

class MyThread extends Thread{
	Multiplication t;

	public MyThread(Multiplication t) {
		
		this.t = t;
	}
	
	public void run() {
		t.printMultiplies(5);
	}
}

class MyThread1 extends Thread{
	Multiplication t;

	public MyThread1(Multiplication t) {
		
		this.t = t;
	}
	
	public void run() {
		t.printMultiplies(10);
	}
	
	
}
