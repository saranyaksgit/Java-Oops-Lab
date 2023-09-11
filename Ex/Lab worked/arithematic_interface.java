import java.util.*;
interface arithematic
{
	public void sun(int a, int b);
	public void diff(int a, int b);
	public void div(int a, int b);
	public void mod(int a, int b);
}

class basic_arithematic implements arithematic
{
	public void sum(int a, int b)
	{
	        int result = a + b;
	        System.out.println("Sum: " + result);
        }

	public void diff(int a, int b)
	{
        	int result = a - b;
        	System.out.println("Difference: " + result);
    	}

        public void div(int a, int b)
        {
        	if (b == 0)
        	{
        		throw new IllegalArgumentException("Division by zero is not allowed.");
        	}
        	int result = a / b;
        	System.out.println("Division: " + result);
	}

    	public void mod(int a, int b)
    	{
        	if (b == 0)
        	{
			throw new IllegalArgumentException("Modulo by zero is not allowed.");
		}
		int result = a % b;
		System.out.println("Modulo: " + result);
	}
}

public class arithematic_interface
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		basic_arithematic operations = new basic_arithematic();
		operations.sum(num1, num2);
		operations.diff(num1, num2);
        
	try
	{
		operations.div(num1, num2);
		operations.mod(num1, num2);
        } 
        catch (IllegalArgumentException e) 
        {
		System.out.println(e.getMessage());
        }
	scanner.close();
	}
}
