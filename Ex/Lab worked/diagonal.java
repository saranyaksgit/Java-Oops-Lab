import java.util.*;
class diagonal
{
	public static void main(String arg[])
	{
		int i,j,sum=0;
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[10][10];
		System.out.println("Enter the Matrix :");
		for(i=0;i<3;i++)
		for(j=0;j<3;j++)
		{
			a[i][j]=sc.nextInt();
		}
		System.out.println("The diagonal elements of the Matrix :");
		for(i=0;i<3;i++)
		for(j=0;j<3;j++)
		{
			if (i==j)
			System.out.println(a[i][j]);
			
		}
		
	}
}
				
				
