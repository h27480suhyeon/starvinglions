import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    long x;
	    int n, a, b;
	    
	    Scanner in = new Scanner (System.in);
	    
	    x = in.nextLong();
	    n = in.nextInt();
	    
	    int sum = 0;
	    for(int i=0; i<n; i++) {
	        
	        a = in.nextInt();
	        b = in.nextInt();
	        sum+=(a*b);
	    }
	   
	    if(x==sum) {
		    System.out.println("Yes");
	    }else{
	        System.out.println("No");
	    }
    }
}