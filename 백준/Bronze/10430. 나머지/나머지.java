import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    int a, b, c;
	    
	    Scanner in = new Scanner (System.in);
	    
	    
	    a = in.nextInt();
	    b = in.nextInt(); 
	    c = in.nextInt();
	    
		System.out.printf("%d\n", (a+b)%c);
		System.out.printf("%d\n", ((a%c)+(b%c))%c);
		System.out.printf("%d\n", (a*b)%c);
		System.out.printf("%d", ((a%c)*(b%c))%c);
		
	}
}
