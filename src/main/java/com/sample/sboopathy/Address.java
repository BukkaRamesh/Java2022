package com.sample.sboopathy;

public class Address {
	int st_no;															
	String st_nm;
	String city;
	String st;
	int zip;

	public Address() {													//Constructor without arguments
		this.st_no = 1234;
		this.st_nm = "TEST RD";
		this.city = "TEST CITY";
		this.st = "STATE";
		this.zip = 56789;
	}
	public Address(int n, String nm, String c, String st, int zip) {	//Constructor with arguments
		this.st_no = n;
		this.st_nm = nm;
		this.city = c;
		this.st = st;
		this.zip = zip;
	}
	public void displayaddress() {										//this method will display members of Address Class
		System.out.println(this.st_no + " " + this.st_nm + ", " +  this.city + ", " + this.st + " " + this.zip + ".");
	}
}
