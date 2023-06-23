import java.util.*;
public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.print("enter a no.= ");
	    int n=sc.nextInt();
	    int sum=0;
	   if(n<0)
		   n=-1*n;
	   while(n>0)
	   {
		   sum=sum+n%10;
		   n/=10;
	   }
	    System.out.print("sum of digits= "+sum);
	}

}
