package com.sample.sboopathy;

public class Times2 extends Thread {
	Times t;
	int n;
	public Times2 (Times t, int n) {
		this.t = t;
		this.n = n;
	}
	public void run() {
		t.multiples(n);
	}

}
