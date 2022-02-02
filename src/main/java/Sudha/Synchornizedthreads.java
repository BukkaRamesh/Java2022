package Sudha;

class test{
	synchronized  void printmultiples(int n){
		for(int i=1;i<6;i++) {
			System.out.println(n*i);
			
		}try {
			Thread.sleep(600);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
	}

}
class MyThreads extends Thread{
	test t;
	public MyThreads(test t) {
		this.t=t;
	}
	public MyThreads() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		t.printmultiples(6);
	}
	
	}
class MyThreads1 extends Thread{
	test t;
	public MyThreads1(test t) {
		this.t=t;
	}
	public void run() {
		t.printmultiples(10);
		
	}
}
class MyThreads2 extends Thread{
	test t;
	public MyThreads2(test t) {
		this.t=t;
	}public void run() {
		t.printmultiples(5);
	}
}
class MyThreads3 extends Thread{
	test t;
	public MyThreads3(test t) {
		this.t=t;
	}public void run() {
		t.printmultiples(2);
	}
}
public class Synchornizedthreads {
	 public static void main(String args[]) {
		 test t=new test();
		 MyThreads t1=new MyThreads(t);
		 t1.start();
		 MyThreads1 t2=new MyThreads1(t);
		 t2.start();
		 MyThreads2 t3=new MyThreads2(t);
		 t3.start();
		 MyThreads3 t4 =new MyThreads3(t);
		 t4.start();
	 }
	 
}