import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    
	    int score;
	    
	    score = in.nextInt();
	    
	    
	    if (score >= 0) {
	        if (score >= 90) {
	            if (score <= 100 ) System.out.println("A");
	        }
	        if (score >= 80) {
	            if (score <= 89 ) System.out.println("B");
	        }
	        if (score >= 70) {
	            if (score <= 79 ) System.out.println("C");
	        }
	        if (score >= 60) {
	            if (score <= 69 ) System.out.println("D");
	        }
	        if (score < 60) {
	            System.out.println("F");
	        }
	    }
	    
	}
}