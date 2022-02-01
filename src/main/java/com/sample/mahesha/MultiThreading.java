package com.sample.mahesha;

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		//Using ThreadOne
		ThreadOne threadOne = new ThreadOne();
		
		//Using ThreadOne
		ThreadTwo obj = new ThreadTwo();
		Thread threadTwo = new Thread(obj);
		System.out.println("Before ThreadOne start: "+threadOne.getState());
		threadOne.start();
		System.out.println("Before ThreadOne start: "+threadOne.getState());
		threadOne.join(4000);// While ThreadOne wait for time- 4S
		System.out.println("While ThreadOne join(4000): "+threadOne.getState());
		threadTwo.start();
		System.out.println("After ThreadTwo start: "+threadTwo.getState());
		System.out.println("After start ThreadTwo, treadOne: "+threadOne.getState());
		
		//System.out.println(1/0); While main exploded with ArithmeticException, threadOne or threadTwo are uninterrupted.		
		
	}

}
