package lab_Works;

import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any to check Whether it is a Prime");
		int n = scan.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i== 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.println("prime");
		} else {
			System.out.println("Not a prime");
		}

	}

}
