import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    
	    int a, b, c;
	    
	    a = in.nextInt();
	    b = in.nextInt();
	    c = in.nextInt();
	    
	    // 같은 눈 3개, 10,000원+(같은 눈)×1,000원
        if(a==b && b==c && a==c) {
            System.out.println(10000+a*1000);
        }
        
        // 같은 눈이 2개, 1,000원+(같은 눈)×100원
        if(a==b && a!=c) {
            System.out.println(1000+a*100);
        }else if((b==c && a!=b) || (a==c && b!=c)) {
            System.out.println(1000+c*100);
        
        // 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원
        } else if (a!=b && a!=c && b!=c ){ 
            if (a>b && a>c)
                System.out.println(a*100);
            else if (b>c && b>a)
                System.out.println(b*100);
            else if (c>a && c>b)
                System.out.println(c*100);
        }
	    
    }
}