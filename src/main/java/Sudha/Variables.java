package Sudha;

public class Variables {

	static int num1;
	static double num2,sum;
	static String name;
	
	public static void main(String[] args) {
		 Variable();
	}
	
	static void Variable() {
		num1=30;
		num2=50.9;
		sum=num1+num2;
		name="SANJAY";
		System.out.println("The Sum of two numbers: "+sum);
		System.out.println("Name is: "+name);
	}

}
