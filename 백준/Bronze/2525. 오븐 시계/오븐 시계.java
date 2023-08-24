import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    
	    int hour, min, x;
	    
	    hour = in.nextInt();
	    min = in.nextInt();
	    x = in.nextInt();
	    
	   if (min + x < 60)
	        System.out.println(hour + " " + (min+x));
	   else if (min+x >=60) {
	       int i = (min+x)/60;
	       int l = (min+x)%60;
	       
	       if (hour+i >= 24) {
	       System.out.println(((hour+i)%24) + " " + l);
	       
	       } else {
	           System.out.println((hour+i)+" "+ l);
	       }
	   }

    }
}