import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.print("enter a no.= ");
	    int n=sc.nextInt();
	    int a=n;
	    int rev=0;
	    while(n!=0)
	    {
	    	rev=rev*10+(n%10);
	    	n/=10;
	    }
	    if(a==rev)
	    	System.out.print("Palindrome");
	    else
	    	System.out.print("notPalindrome");
	}

}
