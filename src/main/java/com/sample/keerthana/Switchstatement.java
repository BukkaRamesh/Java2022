package com.sample.keerthana;

public class Switchstatement {

	public static int DefaultRate = 12;
	public  int GetInterestRate(String BankName) {
		
		switch(BankName) {
		
		case "Bofa":
			return 15;
		
		case "WellsFargo":
			return 14;
		
		case "Chase":
			return 13;
			
		default  :
			return DefaultRate;
		
		}
		
		
	}
	public static void main(String[] args) {
		
		Switchstatement obj1 = new Switchstatement();
		int BofaIR = obj1.GetInterestRate("Bofa");
		System.out.println("The personalised loan Interest rate for Bofa is :" +BofaIR+ "%");
		int WellsFargo = obj1.GetInterestRate("WellsFargo");
		System.out.println("The personalised loan Interest rate for wellsfargo is :" +WellsFargo+ "%");
		int Chase = obj1.GetInterestRate("Chase");
		System.out.println("The Personalised Loan Interest rate for Chase is :"+ Chase+ "%");
		int myBank = obj1.GetInterestRate("Mybank");
		System.out.println("The personalised Loan Interest rate for Mybank is:" +myBank+"%");
		
	}

}
