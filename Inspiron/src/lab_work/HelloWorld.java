package lab_work;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("HelloWorld");
        System.out.println("Hello Program");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Inspiron Reg number");
        int a=scan.nextInt();
        System.out.println("Enter Your Name");
        String b =scan.next();
        System.out.println("your reg No is and name is :"+a+" "+b);
	}

}
