package lab_Works;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i=80;
        char c=(char)i;
     	System.out.println(c);
     	char s='0';
     	int j=(int)s;
     	System.out.println(j);
     	
     	System.out.println("Small abc_------");
     	for(int x=97;x<=122;x++) {
     		System.out.print((char)x);
     	}
     	
     	System.out.println("\n Caps ABC_------");
     	for(int x=65;x<=90;x++) {
     		System.out.print((char)x);
     	}
     	System.out.println("\n Symbols_------");
     	for(int x=122;x<=200;x++) {
     		System.out.print((char)x);
     	}
	}

}
