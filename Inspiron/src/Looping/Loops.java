package Looping;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("While Loop Statement");
		int i = 0;
		int j = 10;

		while (i < 10) {
			System.out.println(i);
			++i;
		}
		System.out.println("----------");
		while (j > 0) {
			System.out.println(j);
			--j;
		}
		
		for(int x=0,y=0;x<=10&&y<=10;x++,y++) {
			System.out.println(x +" X "+y+" = "+(x*y));
		}
	}

}


