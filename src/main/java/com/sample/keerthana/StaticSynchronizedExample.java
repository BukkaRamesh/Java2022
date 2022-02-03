package com.sample.keerthana;

public class StaticSynchronizedExample {

	public synchronized static void displayMultiplication(int n) {
		System.out.println("I am going to print"+ n +"multiplication");
			for (int i=1;i<5;i++) {
		try 
		{
			System.out.println(n + "*" + i + " = " + n * i);
			Thread.sleep(100);
		}catch(InterruptedException Ie) {
			Ie.printStackTrace();
		}
		
	   }
	}			
}
 
 class Mythread3 extends Thread{
	
	 public void run() {
		 StaticSynchronizedExample.displayMultiplication(4);
	 }
 }

 
 class Mythread4 extends Thread{
	
	 public void run() {
		 StaticSynchronizedExample.displayMultiplication(2);
	 }
 }


class SynchronizedEx{  

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Mythread3 t1 = new Mythread3();
	Mythread4 t2 = new Mythread4();
	t1.start();
	t2.start();
	
	

}

}
