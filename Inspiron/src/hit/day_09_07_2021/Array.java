package hit.day_09_07_2021;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	int a[]= new int[3];
	a[0]=1;
	a[1]=1;
	a[2]=8;
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
      
	
	
	// User Input Single Dimension Array
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter How Many Names Do You Want to print");
	int n=scan.nextInt();
	String b[]= new String[n];
	
	for(int i=0;i<b.length;i++) {
		System.out.println("Enter Name "+(i+1)+" :");
		b[i]=scan.next();
	}
	for(int i=0;i<b.length;i++) {
		System.out.println("Name "+(i+1)+" is : "+b[i]);
	}
	
}
}
