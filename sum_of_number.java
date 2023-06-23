import java.util.*;
public class sum_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		while(true)
		{
			System.out.print("enter a no.= ");
		    int n=sc.nextInt();
		    sum+=n;
		    if(sum>100)
		    	break;
		}
		System.out.print("now sum is greater than 100");
	}

}
