import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    
	    int t;
	    int a, b;
	     t= in.nextInt();

	       
	        for(int j=1; j<=t; j++) {
	            a = in.nextInt();
	            b = in.nextInt();
	            System.out.println("Case #" + j +": " + a + " + " + b + " = " + (a+b));
	        }

	
	}
}
