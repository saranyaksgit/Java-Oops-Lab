import java.util.*;
class Area1
{
	void area(int x)
	{
		System.out.println("The area of the Square is " + x * x + " sq units");
	}

	void area(int x, int y)
	{
		System.out.println("The area of the Rectangle is " + x * y + " sq units");
	}

	void area(double x)
	{
		double z = 3.14 * x * x;
		System.out.println("The area of the Circle is " + z + " sq units");
	}
}

public class AreaOverload
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Area1 obj = new Area1();

		System.out.println("Enter the side of the Square:");
		int side = sc.nextInt();
		obj.area(side);

		System.out.println("Enter the radius of the Circle:");
		double r = sc.nextDouble();
		obj.area(r);

		System.out.println("Enter the length and breadth of the Rectangle:");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		obj.area(length, breadth);

		sc.close();
	}
}

