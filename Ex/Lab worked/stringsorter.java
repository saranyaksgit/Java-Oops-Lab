import java.util.Arrays;
import java.util.Scanner;

public class stringsorter
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		String sortedStr = new String(chars);
		System.out.println("Sorted String: " + sortedStr);
	}
}

