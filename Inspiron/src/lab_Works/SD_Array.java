package lab_Works;

import java.util.Scanner;

public class SD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a[] = { 10, 20, 30 };
		String s[] = { "Saalim", "Hussain" };

		System.out.println("Integer Array \n -----");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("\n String Array \n --- ");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		
		//-----------------------------//
		
		System.out.println("\n String Array User Input \n --- ");
		System.out.println("How Many Names Do u Want to Print \n");

		int b = scan.nextInt();
		String y[] = new String[b];

		for (int i = 0; i < y.length; i++) {
			System.out.println("Enter the Name: " + (i + 1));
			y[i] = scan.next();
		}
		
        //------------------------------------------//
		
		
		System.out.println("\n Printing String Array User Input \n  ");

		for (int i = 0; i < y.length; i++) {
			System.out.println((i+1)+": "+y[i]);
		}

		// using For Each Loop

		System.out.println("\n Printing Normal Array using For Each loop \n  ");
		for (int i : a) {
			System.out.println(i);
		}

	}
}
