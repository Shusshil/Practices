import java.util.*;
public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.print("enter a no.= ");
	    int n=sc.nextInt();
	    int i=0;
	    int j=1;
	    for(int k=0;k<n;k++)
	    {
	    	int sum=i+j;
	    	i=j;
	    	j=sum;
	    	System.out.print(j+" ");
	    }
	}

}
