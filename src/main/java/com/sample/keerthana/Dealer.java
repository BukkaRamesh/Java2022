package com.sample.keerthana;

public class Dealer {

		String name;
		String website;
		String phone;
		Address address; //Address is a class  
		
	public Dealer(String name,Address address) {
		this.name 	 = name;
		this.address = address;
	}
	//method overloading	
	public Dealer(String name, String website, String phone, Address address) {
		this.name 		= name;
		this.website 	= website;
		this.phone 		= phone;
		this.address 	= address;
	}

	void display() {
		System.out.println("Dealer's Information");
		System.out.println("Dealer Name:" +name);
		System.out.println("website:" +website);
		System.out.println("Contact :" +phone);
		System.out.println("Location: " +address.street+" " +address.city +" "+address.state+" "+address.zipcode);
		
	}
public static void main(String[] args) {
		Address dealer1_addr	=	new Address("4155 stevens creek blvd","Santa clara","CA", 95051); //aggregation
		Address dealer2_addr	=	new Address("5740 Cushing Pkwy", "Fremont", "CA", 94538);
		
		
		Dealer dealer1	= new Dealer("Porsche stevens creek","porschestevenscreek.com","408-868-5277",dealer1_addr); 
		Dealer dealer2	= new Dealer("Porsche Fremont"," porschefremont.com","508-696-8777",dealer2_addr );
	
		dealer1.display();
		dealer2.display();
		
}
}