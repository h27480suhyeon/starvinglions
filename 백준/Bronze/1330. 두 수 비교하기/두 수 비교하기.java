import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    
	    int a, b;
	    
	    a = in.nextInt();
	    b = in.nextInt();
	    
	    if (a>b) {
		    System.out.println(">");
	    } else if (a<b) {
	        System.out.println("<");
	    } else {
	        System.out.println("==");
	    }
	    
	}
}