import java.util.*;
public class odd
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
        		System.out.print("Enter a string : ");
		String s=in.nextLine();
		System.out.println("Odd indices are :");
		for(int i=1;i<s.length();i+=2)
		{
            		System.out.println(s.charAt(i));
            		System.out.println(" ");
        		}
    	}
}

