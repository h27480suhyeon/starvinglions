import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    int a, b;
	    
	    Scanner in = new Scanner (System.in);
	    
	    a = in.nextInt();
	    b = in.nextInt(); 
        
		System.out.printf("%d\n", a*((b%100)%10));
		System.out.printf("%d\n", a*((b%100)/10));
        System.out.printf("%d\n", a*(b/100));
        System.out.printf("%d", a*b);

		
	}
}