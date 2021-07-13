package lab_Works;

import java.util.Scanner;

public class TwoDimension_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(i+""+j +" " );
			}
			System.out.println();
		}
		
		
		int a[][]= {{10,2,2},{3,5,5}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int b[][]= new int[2][4];
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println("Enter num :"+i+""+j);
				b[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

		
	}

}
