package lab_Works;

import java.util.Scanner;

public class Add_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number a");
		int a = scan.nextInt();
		System.out.println("Enter Number b");
		int b = scan.nextInt();
		System.out.println("Addition " + a + "+" + b + " = " + (a + b));

		System.out.println("---------");

		// multiply
		System.out.println("multiply " + a + "x" + b + " = " + (a * b));

		System.out.println("--------");

		// Divide
		System.out.println("Divide gives Quotient " + a + "/" + b + " = " + (a / b));
		

		System.out.println("--------");

		// Modulus
		System.out.println("Modulus  gives Remainder " + a + "%" + b + " = " + (a % b));
	 
		System.out.println("--------");

		// Subtract
		System.out.println("Subtract " + a + "-" + b + " = " + (a - b));
	
		

	}

}
