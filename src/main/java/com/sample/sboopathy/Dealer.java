package com.sample.sboopathy;

public class Dealer {
	String name ;															
	Address addr;
	
	public Dealer() {														//Constructor without arguments
		this.name = "Default - Dealer";
		this.addr = new Address();
	}
	public Dealer(String n, Address addr) { 								//Constructor with arguments
		this.name = n;
		this.addr = new Address(addr.st_no, addr.st_nm, addr.city, addr.st,addr.zip);
	}
	public void displaydealer() {											//this method will display members of Dealer Class
		System.out.println("Dealer Information:");
		System.out.println(this.name);
		this.addr.displayaddress();
	}
	public static void main(String[] args) {								//this is where the execution starts
		
		Dealer D1 = new Dealer();
		Address addr2 = new Address(4221, "WalneyRoad #301","Chantilly", "VA", 20151);
		Dealer D2 = new Dealer("Vic Bailey Honda", addr2);

		System.out.println("*********************************************");		
		D1.displaydealer();
		System.out.println("*********************************************");
		D2.displaydealer();
		System.out.println("*********************************************");
	}

}
