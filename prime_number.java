import java.util.*;
public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    System.out.print("enter a no.= ");
		    int n=sc.nextInt();
		    int count=0;
		    for(int i=1;i<=n;i++)
		    {
		        if(n%i==0)
		        count++;
		    }
		    if(count==2)
		    	System.out.print("prime no.");
		    else
		    	System.out.print("nonprime no.");
	}

}
