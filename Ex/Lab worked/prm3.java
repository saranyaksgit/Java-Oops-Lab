import java.util.Scanner;
public class prm3
{
	public static void main(String arg[])
	{
		Double a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number :");
		a=input.nextDouble();
		System.out.println("Enter the second number :");
                b=input.nextDouble();
		c=a+b;
		System.out.println("The sum is :"+c);
	}
}
