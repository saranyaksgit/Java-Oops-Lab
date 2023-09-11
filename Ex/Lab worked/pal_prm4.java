
import java.util.Scanner;
public class pal_prm4
{
	public static void main(String arg[])
	{
		String s,rev="";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string :");
		s=input.nextLine();
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
