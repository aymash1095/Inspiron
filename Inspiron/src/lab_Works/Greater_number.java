package lab_Works;

import java.util.Scanner;

public class Greater_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number a");
		int a = scan.nextInt();

		System.out.println("Enter Number b");
		int b = scan.nextInt();

		System.out.println("Enter Number c");
		int c = scan.nextInt();

		if (a > b && a > b) {
			System.out.println("A is Greater : " + a);
		} else if (c > b && c > a) {
			System.out.println("C is Greater : " + c);
		} else {
			System.out.println("B is Greater : " + b);
		}
	}

}
