package com.sample.keerthana;

	public class SynchornizedMethod {
	
		public synchronized void displayMultiplication(int n) {
			System.out.println("I am going to print"+ n +"multiplication");
				for (int i=1;i<5;i++) {
			try {
				System.out.println(n + "*" + i + " = " + n * i);
				Thread.sleep(100);
			}catch(InterruptedException Ie) {
				Ie.printStackTrace();
			}
			
		}
	}
	}
	 
	 class Mythread1 extends Thread{
		
		 SynchornizedMethod mulNo1;
		 
		 public Mythread1(SynchornizedMethod mulNo1) {
			 this.mulNo1 = mulNo1;
		 }
		 
		 public void run() {
			 mulNo1.displayMultiplication(2);
		 }
	 }
	
	 
	 class Mythread2 extends Thread{
			
		 SynchornizedMethod mulNo2;
		 
		 public Mythread2(SynchornizedMethod mulNo2) {
			 this.mulNo2 = mulNo2;
		 }
		 
		 public void run() {
			 mulNo2.displayMultiplication(10);
		 }
	 }
	
	
 class SynchronizedExample{  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchornizedMethod obj = new SynchornizedMethod();
		Mythread1 t1 = new Mythread1(obj);
		Mythread2 t2 = new Mythread2(obj);
		t1.start();
		t2.start();
		
		

	}

}
