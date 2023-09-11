import java.util.Scanner;

public class overloaded
{
	public static double calculateArea(double length, double width)
	{
		return length * width;
	}
	
	public static int calculateArea(int length, int width)
	{
		return length * width;
	}
	
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the length of the rectangle (double) : ");
	double lengthDouble = scanner.nextDouble();
	System.out.print("Enter the width of the rectangle (double) : ");
	double widthDouble = scanner.nextDouble();
	double areaDouble = calculateArea(lengthDouble, widthDouble);
	
	System.out.print("Enter the length of the rectangle (int) : ");
	int lengthInt = scanner.nextInt();
	System.out.print("Enter the width of the rectangle (int) : ");
	int widthInt = scanner.nextInt();
	int areaInt = calculateArea(lengthInt, widthInt);
	
	System.out.println("The area of the rectangle is (double) : " + areaDouble);
	System.out.println("The area of the rectangle is (int) : " + areaInt);
	scanner.close();
	}
}
