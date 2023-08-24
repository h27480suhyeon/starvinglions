import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    
	    int hour, min;
	    
	    hour = in.nextInt();
	    min = in.nextInt();
	    
	   if (min < 45 && hour != 0) {
	       hour = hour - 1;
	       min = min + 15;
	   } else if (min >= 45 && hour == 0) {
	       min = min - 45;
	   } else if (min < 45 && hour == 0) {
	       hour = 23;
	       min = min + 15;
	   } else if (hour != 0 && min >= 45) {
	       min = min-45;
	   }
	   
	   System.out.println(hour + " " + min);

    }
}