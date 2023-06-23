import java.util.Scanner;
public class hollow_right_angle_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.print("enter a no.= ");
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<=n;j++)
	    	{
	    		if(i+j==(n+1)|| i==n || j==n)
	    		{
	    			System.out.print("*");
	    		}
	    		else
	    			System.out.print(" ");
	    	}
	    	System.out.println(" ");
	    }
	}

}
