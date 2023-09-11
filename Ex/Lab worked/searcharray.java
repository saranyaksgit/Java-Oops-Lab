import java.util.Scanner;

public class searcharray
{
	public static void main(String[] args)
	{
		int[] array = {3, 6, 9, 12, 15, 18, 21};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the element to search: ");
		int element = input.nextInt();
		int index = linearSearch(array, element);
		if (index == -1)
		{
			System.out.println("Element not found.");
		}
		else
		{
			System.out.println("Element found at index " + index);
		}
	}

	public static int linearSearch(int[] array, int element)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == element)
			{
				return i;
			}
		}
	return -1;
	}
}

