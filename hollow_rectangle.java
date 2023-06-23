import java.util.Scanner;
public class hollow_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.print("enter 1st side = ");
	    int m=sc.nextInt();
	    System.out.print("enter 2nd side = ");
	    int n=sc.nextInt();
	    for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==m || j==1 || j==n)
                {
                    System.out.print("*");
                }
                else
                     System.out.print(" ");
            }
            System.out.println();
        }
	}

}
