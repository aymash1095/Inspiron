package hit;
import java.util.Scanner;
public class Condition_Statments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //  created two Programs
	  Scanner scan= new Scanner(System.in);
			// == opertor
		System.out.println("Enter value");
		int n=scan.nextInt();
		if(n==0) {
			System.out.println(" u entereed Zero");
		}
		else if(n<0) {
			System.out.println(" Negative Value");
		}
		else if(n>0) {
			System.out.println("Greater than  Zero");
		}
		
		System.out.println((n>100)?"Greater than 100.. "+n:"Less than 100");
		


	}

}
