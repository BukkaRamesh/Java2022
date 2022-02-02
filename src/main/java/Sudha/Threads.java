package Sudha;

class As implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(100);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("the state of thread of t1 is invoked after joining :  " + Threads.t1.getState());
		
	}
}

public class Threads implements Runnable {
	public static Thread t1;
	public static Threads obj;

	public static void main(String args[]) {
		obj = new Threads();
		t1 = new Thread(obj);
		System.out.println("the state of thread 1  after spawning  " + t1.getState());
		t1.start();
		System.out.println("the state of thread 1 after the start method  " + t1.getState());
		
		  try {
			  Thread.sleep(200); 
			  } catch (InterruptedException ie) {
		  
		  ie.printStackTrace();
			  }System.out.println("the state of thread 1 after invoking the sleep   " +t1.getState());
			  try
			  { t1.join();
			  } catch (InterruptedException ie) {
			  
		  ie.printStackTrace();
			  }
		 System.out.println("the state of thread t1 is completed  " + t1.getState());
		 

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		As obj1 = new As();
		Thread t2 = new Thread(obj1);
		System.out.println("the state of thread 2 after spawning   " + t2.getState());
		t2.start();
		System.out.println("the state of thread 2 after the start method" + t2.getState());
		try {
			Thread.sleep(200);}catch(InterruptedException ie) {ie.printStackTrace();
			
		}System.out.println("the state of thread 2 after the sleep method  "+t2.getState());
		try {
			t2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}System.out.println("the state of thread 2 has completed execution  " + t2.getState());
		
  As obj2=new As();
  Thread t3=new Thread(obj2);
  System.out.println("the state of thread 3 after spawning   " + t3.getState());
  t3.start();
	System.out.println("the state of thread 3 after the start method" + t3.getState());
	try {
		Thread.sleep(200);
	}catch(InterruptedException ie) {
		ie.printStackTrace();
	}System.out.println("the state of thread 3 after the sleep method  "+t3.getState());
	try{
		t3.join();
	}catch(InterruptedException ie) {
		ie.printStackTrace();
	}System.out.println("the state of thread 3 has completed execution  " + t3.getState());

	

	
	}
	}


