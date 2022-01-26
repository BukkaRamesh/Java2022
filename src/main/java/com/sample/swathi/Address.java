package com.sample.swathi;

public class Address {
 
	private String street, apt, city, state, country;
	private int zipCode;
	
	
	
	public Address(String street, String apt, String city) {
		 this.street = street;
		 this.apt = apt;
		 this.city = city;
	}
	
	public Address(String street, String apt, String city, String state,String country, int zipcode) {
		 this(street, apt, city);
		 this.state = state;
		 this.country = country;
		 this.zipCode = zipcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getApt() {
		return apt;
	}

	public void setApt(String apt) {
		this.apt = apt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
}
