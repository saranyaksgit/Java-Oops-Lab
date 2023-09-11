import java.util.Scanner;
public class prm2
{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number :");
		a=input.nextInt();
		System.out.println("Enter the second number :");
                b=input.nextInt();
		c=a+b;
		System.out.println("The sum is :"+c);
	}
}
