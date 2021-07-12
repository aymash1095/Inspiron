package lab_Works;

import java.util.Scanner;

public class Display_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number till u want to Print Prime");
		int n = scan.nextInt();   
		
		for(int i=1;i<=n;i++) {
			int count =0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)  {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
