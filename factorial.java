import java.util.*;
public class factorial
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter a no.= ");
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	        if(n%i==0)
	        System.out.print(i+" ");
	    }
	}
}
