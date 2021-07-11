package lab_Works;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte to Short
		/*
		 * byte -1 byte -8bit    ---->  256   -128 to +127    2^8
		 * short -2 byte -16bit   ---->   -32,768 to 32,767   2^16
		 * int -  4 byte -32bit   ---->   -2,147,483,648 to 2,147,483,647   2^32
		 * long -8byte -64bit  ---->-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807   2^64
		 * float 4 byte -32bit  Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		 * double - 8byte -64bit
		 * char -2byte -16bit --> 655366  	Stores a single character/letter or ASCII values
		 *
		 * 
		 * */
		
		int a=257;
		byte b=(byte)a;
		System.out.println(b);
		
		float f=123.66f;
		char c=(char)f;
		System.out.println(c);
		double d=(double)f;
		System.out.println(d);
		
		
	
		
		
		
		

	}

}
