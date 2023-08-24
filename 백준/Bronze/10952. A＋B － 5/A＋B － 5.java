import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    
	    int a, b;
	    
	    do{
            a = in.nextInt();
            b = in.nextInt();
            
            int sum=0;
            
            if(a>0 && b<10) {
            sum = a+b;
            System.out.printf("%d\n", sum);
            }
	    }while(a!=0 && b!=0);

	}
}