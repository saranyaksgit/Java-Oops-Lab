import java.util.*;
class matrix
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
		for(i=0;i<3;i++)
		for(j=0;j<3;j++)
		{
			sum=sum+a[i][j];
		}
		System.out.println("Sum of all elements in the Matrix :"+sum);
	}
}
				
				
