package lab_Works;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Single Character ");
	    char c=scan.next().charAt(0);
	    if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u') {
	    	System.out.println(c+" is a vowel");
	    } 
	    else if(c=='A' || c=='E' || c=='I'||c=='O'||c=='U') {
	    	System.out.println(c+" is a vowel");
	    } 
	    else {
	    	System.out.println(c+"  is not  a vowel");
	    }

	}

}
