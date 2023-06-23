import java.util.Scanner;
public class kite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.print("enter a no.= ");
	    int n=sc.nextInt();
	    square(n);
	}
	public static void square(int a)
	{
		for(int i=1;i<=2*a-1;i++)
		{
			for(int j=1;j<=2*a-1;j++)
			{
				if(j-i==a-1 || i-j==a-1 || i+j==a+1 || i+j==3*a-1)
				{
					System.out.print("*");
				}
				if((j==a && i!=a && i!=1 && i!=2*a-1) || (i==a && j%2!=0 && j!=1 && j!=2*a-1))
				{
					System.out.print("^");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
