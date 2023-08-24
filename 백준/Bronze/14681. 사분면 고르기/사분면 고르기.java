import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    
	    int a, b;
	    
	    a = in.nextInt();
	    b = in.nextInt();
	    
	   if (a>0 && b>0) 
	       System.out.println("1");
	   else if (a<0 && b>0)
	       System.out.println("2");
	   else if (a<0 && b<0)
	       System.out.println("3");
	   else if (a>0 && b<0)
	       System.out.println("4");
	    
    }
}