import java.util.*;

class Employee
{
	int e_no;
	String e_name;
	float e_salary;

	Employee(int id, String name, float sal)
	{
		e_no = id;
		e_name = name;
		e_salary = sal;
	}
}

public class EmployeeMain
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int id, i, flag = 0;
		String name;
		float sal;

		try
		{
			System.out.print("Enter the number of Employees: ");
			int n = sc.nextInt();
			sc.nextLine();

			Employee[] obj = new Employee[n];

			for (i = 0; i < n; i++)
			{
				System.out.println("Enter the details of Employee " + (i + 1) + ":");
				System.out.print("Employee no: ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.print("Employee name: ");
				name = sc.nextLine();
				System.out.print("Employee salary: ");
				sal = sc.nextFloat();
				obj[i] = new Employee(id, name, sal);
			}

			System.out.print("Enter the Employee ID to be searched: ");
			int temp = sc.nextInt();
			for (i = 0; i < n; i++)
			{
				if (obj[i].e_no == temp)
				{
					System.out.println("Result found!");
					flag = 1;
					System.out.println("Employee name: " + obj[i].e_name);
					System.out.println("Employee salary: " + obj[i].e_salary);
					break;
				}
			}

			if (flag == 0)
			{
				System.out.println("Employee not found.");
			}
		}
		catch (InputMismatchException e)
		{
			System.out.println("Invalid input. Please enter valid data.");
		} 
		catch (NoSuchElementException e)
		{
		System.out.println("Input not provided as expected.");
		}
		catch (Exception e)
		{
			System.out.println("An error occurred: " + e.getMessage());
		}
		finally
		{
			sc.close();
		}
	}
}

