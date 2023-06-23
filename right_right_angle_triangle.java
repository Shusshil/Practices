import java.util.Scanner;
public class right_right_angle_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.print("enter a no.= ");
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=i;j<n;j++)
		    {
	    		System.out.print(" ");
		    }
	    	for(int j=1;j<=i;j++)
		    {
	    		System.out.print("*");
		    }
	    	System.out.println(" ");
	    }
	}

}
