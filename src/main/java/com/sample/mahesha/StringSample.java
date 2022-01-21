package com.sample.mahesha;

public class StringSample {
		

	public static void main(String[] args) {
		
		String firstName = new String("Mahesha");
		String middleName = new String("Wishwajith");
		String lastName = new String("Muthukuda");
		String previousCity = new String("           Huntsville");
		String counrtyOfBirth = new String("Sri Lanka");
		String countryOfPresent = new String("USA");

		
		System.out.println("My Full Name is : "+ firstName.toUpperCase() + " " + middleName.toUpperCase() + " " + lastName.toUpperCase() );
		System.out.println("Is My First Name start with 'M' :" + firstName.startsWith("M"));
		System.out.println("Lets replace My First name with :" + firstName.replace(firstName, "Maw"));
		System.out.println("Is My Last Name end with 'm' :" + lastName.endsWith("m"));
		System.out.println("People thinks I do not have a Middle Name and it's : " + middleName.isEmpty() );
		System.out.println("How many letters in my Middle Name : " + middleName.length() );
		System.out.println("What is the 5th letter of my Middle name : " + (middleName.charAt(4)));
		System.out.println("What index letter 'j'stand on my Middle Name : " + middleName.indexOf("j"));
		System.out.println("Do you know where I was previously : " + previousCity );
		System.out.println("oops! Let me remove spaces on above result : " +previousCity.trim() );	
		System.out.println("Am I am presnt in my birth counrty : " + (counrtyOfBirth.equals(countryOfPresent)));
	}
		
	
}



