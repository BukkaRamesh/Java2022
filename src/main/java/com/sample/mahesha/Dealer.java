package com.sample.mahesha;

public class Dealer {
	
	public String name;
	public Address address; //Inheritance - Aggregation(HAS_A)
	public String email;
	public String phoneNumber;
	public Product product;//Inheritance - Aggregation(HAS_A)
	
	
	public Dealer(Address address, String email, String phoneNumber, Product product) {
		super();
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.product = product;
	}

	//Method Overloading
	public Dealer(String name, Address address, String email, Product product) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.product = product;
	}

	//Method Overloading
	public Dealer(String name, Address address, String email, String phoneNumber, Product product) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.product = product;
	}
	
	//Print Dealer Info
	void print() {
		
		System.out.println("Dealer Information");
		System.out.println("Name			:" + name);
		System.out.println("Dealer Address  	:" + address.street + " " + address.city + " " + address.state + " " + address.zipcode);
		System.out.println("Phone Number		:" + phoneNumber );
		System.out.println("Email			:" + email );
		System.out.println("Product			:" + product.productName + " " + product.productColor + " " + product.productSize + " " + product.madeBy);
	}



	public static void main(String[] args) {
		
		Address dealer1address = new Address ("Charing Cross Dr", "Justin", "Texas", 76247);
		Address dealer2address = new Address ("Village Bend Dr", "Dallas", "Texas",75206 );
		Address dealer3address = new Address ("Villa Dr", "Fort Worth", "Texas",75234 );
		Address dealer4address = new Address ("Main Street", "Northlake", "Texas",77345 );
		Address dealer5address = new Address ("10th Street", "Huntsville", "Texas",77340 );
		
		
		Product dealer1product = new Product("Shirt", "White", "Medium", "Sri Lanka");
		Product dealer2product = new Product("Ladies-Pant", "Red", "Small", "India");
		Product dealer3product = new Product("Mens-Tshirt", "Blue", "Medium", "Bangladesh");
		Product dealer4product = new Product("Mens Shirt", "Yellow", "Large", "India");
		Product dealer5product = new Product("Ladies-Tshirt", "Green", "Small", "India");
		
		
		Dealer dealer1 = new Dealer("Maw", dealer1address, "maw@gmail.com", "788-668-1111", dealer1product );
		Dealer dealer2 = new Dealer("Sam", dealer2address, "sam@gmail.com", "567-948-3333", dealer2product );
		Dealer dealer3 = new Dealer(dealer3address, "dan@gmail.com", "868-998-9999", dealer3product );
		Dealer dealer4 = new Dealer("John", dealer4address, "john@gmail.com", "888-998-7777", dealer4product );
		Dealer dealer5 = new Dealer("Mike", dealer5address, "mik@gmail.com", dealer5product );
		
		dealer1.print();
		dealer2.print();
		dealer3.print();
		dealer4.print();
		dealer5.print();

	}

}
