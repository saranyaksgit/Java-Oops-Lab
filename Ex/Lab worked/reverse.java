import java.util.*;

public class reverse
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
        		System.out.print("Enter a string: ");
        		String input=in.nextLine();
        		String rev="";
        		for(int i=input.length()-1;i>=0;i--)
        		{
            		rev+=input.charAt(i);
        		}
	System.out.println(rev);
    	}
}

