package com.sample.swathi;

public class Dealer {

	private String dealerCompanyName;
	private String dealerName;
	private Address address;
	private String phoneNumber;
	private String email;

	public static void main(String[] args) {
		

		Address address1 = new Address("Turnpike Rd", "890", "York", "Maine", "USA", 20107);
		Address address2 = new Address("Louis Rd", "6A", "Lincoln", "MA", "USA",29807);
		Address address3 = new Address("Main Road","5-78-153","Mumbai","Mumbai","INDIA",984590);

		Dealer d1 = new Dealer();
		d1.saveDealer("Company1", "Rama", "8779023456", address1, "Rama@gmail.com");
		System.out.println(d1);
		d1.printAddress(address1);
		
		Dealer d2 = new Dealer();
		d2.saveDealer("Tata Group", "Ratan Tata", "9867432345", address3);
		d2.email = "tata@gmail.com";
		System.out.println(d2);
		d2.printAddress(address3);
				

	}

	public void saveDealer(String dlCompanyName, String dlName, String phNo, Address address, String email) {

		saveDealer(dlCompanyName, dlName, phNo, address);
		this.email = email;

	}

	public void saveDealer(String dlCompanyName, String dlName, String phNo, Address address) {

		this.saveDealer(dlCompanyName, dlName, phNo);
		this.address = address;

	}

	public void saveDealer(String dlCompanyName, String dlName, String phNo) {

		this.saveDealer(dlCompanyName, dlName);
		phoneNumber = phNo;

	}

	public void saveDealer(String dlCompanyName, String dlName) {

		dealerCompanyName = dlCompanyName;
		dealerName = dlName;

	}

	public void saveDealer(String dlCompanyName, String phNo, Address address) {

		dealerCompanyName = dlCompanyName;
		phoneNumber = phNo;
		this.address = address;

	}

	public static void printAddress(Address address) {

		 System.out.println("The dealer address is:\n" + address.getStreet()+","+ address.getApt()+",\n"+
				 						address.getCity()+","+address.getState()+","+address.getCountry()
				 						+","+ address.getZipCode()+"\n");

	}

	@Override
	public String toString() {
		return "Dealer Details:\n [dealerCompanyName = " + dealerCompanyName + ", dealerName = " + dealerName + ", "
				+ ", phoneNumber = " + phoneNumber + ", email = " + email + "]";
	}
}
