import java.util.*;
class sum
{
	public static void main(String arg[])
	{
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter the Numbers :");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of the Numbers :"+sum);
	}
}
				
				
