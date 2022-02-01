package com.sample.swathi.exercise.threading;

class ABC implements Runnable {
	public void run() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println(
				"The state of thread t1 while it invoked the method join() on thread t2 -" + ThreadState.t1.getState());

	}
}

public class ThreadState implements Runnable {
	public static Thread t1;
	public static ThreadState obj;

	public static void main(String argvs[]) {
		obj = new ThreadState();
		t1 = new Thread(obj);

		System.out.println("The state of thread t1 after spawning it - " + t1.getState());

		t1.start();

		System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());
	}

	public void run() {
		ABC myObj = new ABC();
		Thread t2 = new Thread(myObj);

		System.out.println("The state of thread t2 after spawning it - " + t2.getState());
		t2.start();

		System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("The state of thread t2 after invoking the method sleep() on it - " + t2.getState());

		try {
			t2.join();
			
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());
		System.out.println("t1 state : "+ t1.getState() );
		
		
		ABC newobj = new ABC();
		Thread t3 = new Thread(newobj);
		System.out.println("t3 state before calling start():"+t3.getState());
		try {
			t3.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("t3  current state after sleep: "+t3.getState());
		t3.start();
		System.out.println("t3 state after calling start():"+t3.getState());
		System.out.println("t1 state : "+ t1.getState() );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("t3 state after calling join():"+t3.getState());
			System.out.println("t1 state : "+ t1.getState() );
		}
		
		
	}

}