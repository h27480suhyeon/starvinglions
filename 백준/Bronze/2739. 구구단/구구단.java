import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner (System.in);
	    
	    int N = in.nextInt();
	    
	    for (int i=1; i<10; i++) {
	        int j = N * i;
	        System.out.printf("%d * %d = %d\n", N, i, j);
	    }
	    
	}
	
}
